


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.table.DefaultTableModel;


/**
 * Class for handling interaction with the MySQL database
 * @author Casey Scarborough
 * @since 2013-05-15
 * @see GUI
 */
public class Database {
	
	/**
	 * Object array used to hold the results retrieved from the database.
	 */
	private Object[][] databaseResults;//attributo dell'oggetto
	/**
	 * ResultSet that holds the information retrieved from database.
	 */
	public ResultSet rows;//attributo dell'oggetto-riga
	/**
	 * String array used to hold the column names for the table.
	 */
	public Object[] columns;//attributo dell'oggetto-colonna
	/**
	 * The table model used for manipulation of the JTable.
	 */
	public DefaultTableModel defaultTableModel;//attributo dell'oggetto
	/**
	 * Connection object used to interact with the database.
	 */
	private Connection conn = null;//conn è attributo della classe
	
	/**
	 * Database constructor
	 */
	public Database() {
		columns = new Object[]{"ID", "First_Name", "Last_Name", "Phone_Number", "Email_Address", "City", "State", "Date_Registered"};
		defaultTableModel = new DefaultTableModel(databaseResults, columns) {
			public Class getColumnClass(int column) { // Override the getColumnClass method to get the 
				Class classToReturn;		// class types of the data retrieved from the database
				
				if((column >= 0) && column < getColumnCount()) {
					classToReturn = getValueAt(0, column).getClass();
				} else {
					classToReturn = Object.class;
				}
				return classToReturn;
			}
		};
		
		try {
			// Set the driver, MySQL JDBC--seleziona il driver
			Class.forName("com.mysql.jdbc.Driver");
			// Connect to the database and execute a select statement on the customer table
                        //conn è la connessione ed è un attributo di questa classe
			conn = DriverManager.getConnection("jdbc:mysql://localhost/feedback", "root", "mysql");//root è nome utente e mysql è password. feddback è il database con dentro la tabella
			Statement sqlStatement = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			String select = "SELECT id, first_name, last_name, phone_number, email_address, city, state, date_registered FROM customer";
			rows = sqlStatement.executeQuery(select); // Esegue la query-Execute the query inserisce una riga vuota
			Object[] tempRow;
			
			while(rows.next()) { // Add the information to the JTable
				tempRow = new Object[]{rows.getInt(1), rows.getString(2), rows.getString(3), rows.getString(4), 
						rows.getString(5), rows.getString(6), rows.getString(7), rows.getDate(8)};
				defaultTableModel.addRow(tempRow);
			}
		} catch (SQLException e) { // scrivi l'errore se ci sono delle eccezzioni-Print errors if exceptions occur
			System.out.println(e.getMessage()); 
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage()); 
		}
	}
}
