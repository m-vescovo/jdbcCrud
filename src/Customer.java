/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Date;

/**
 *
 * @author luca
 */
public class Customer {

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String First_Name) {
        this.First_Name = First_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String Last_Name) {
        this.Last_Name = Last_Name;
    }

    public String getPhone_Number() {
        return Phone_Number;
    }

    public void setPhone_Number(String Phone_Number) {
        this.Phone_Number = Phone_Number;
    }

    public String getEmail_Address() {
        return Email_Address;
    }

    public void setEmail_Address(String Email_Address) {
        this.Email_Address = Email_Address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public Date getDate_Registered() {
        return Date_Registered;
    }

    public void setDate_Registered(Date Date_Registered) {
        this.Date_Registered = Date_Registered;
    }
    
    //attributi della classe Customer
    private int ID;
    private String First_Name, Last_Name, Phone_Number, Email_Address, City, State;
    private Date Date_Registered;
   
    
    
    @Override
    public String toString(){
        String msg="";
        msg +=getID() + ":" + getFirst_Name() + " - " +getLast_Name()+ " - " +getCity() + " - " +getState();

    return msg;
    }
}
