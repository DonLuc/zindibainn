/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonolo.daos;

import com.bonolo.clientclasses.Address;
import com.bonolo.clientclasses.Client;
import com.bonolo.clientclasses.ClientP2;
import com.bonolo.clientclasses.Contact;
import com.bonolo.clientclasses.Login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Don Luc
 */
public class ClientDAO 
{
//    Connection connect;
//    Statement state;
//    
//    public void openConnect() throws ClassNotFoundException, SQLException
//    {
//        Class.forName("com.mysql.jdbc.Driver");
//        connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/zindibadbase", "root", "");
//        state = connect.createStatement();
//    }
    
    ConnectDaos conn= new ConnectDaos();
    
    public void openConnect() throws ClassNotFoundException, SQLException
    {
        conn.openConnect();
    }
    //Adding a client
    public int addClient(Client client) throws SQLException
    {
       // JOptionPane.showMessageDialog(null, client.getGender());
        int added = 0;
        if(checkID(client))
        {
            String sql =    "INSERT INTO tblclient(name,surname,gender,IDNO) " +
                            "VALUES('"+client.getName()+"','"+client.getSurname()+"','"+client.getGender()+"','"+client.getIdNumber()+"')";
            added = conn.getState().executeUpdate(sql);
        }
        return added;
    }
    
    public int addClientAddress(Address address) throws SQLException
    {
        String sql =    "INSERT INTO tblclient_address(fkClientID,houseNumber,city,areaCode) " +
                        "VALUES((SELECT MAX(clientID) FROM tblclient),"+address.getHouseNumber()+",'"+address.getCity()+"',"+address.getAreaCode()+") ";
        return conn.getState().executeUpdate(sql);
    }
    
    public int addClientContact(Contact contact) throws SQLException
    {
        String sql = "INSERT INTO tblclient_contact(fkClientID, contactno, email) " +
                     "VALUES( (SELECT MAX(clientID) FROM tblclient), '"+contact.getContact()+"','"+contact.getEmail()+"')";
        return conn.getState().executeUpdate(sql);
    }
    
    public int addClientLogin(Login login) throws SQLException
    {
        int added = 0;
        if(checkUserAvail(login))
        {
            String sql = "INSERT INTO tbllogin(fkClientID, username, password, type)" +
                     "VALUES((SELECT MAX(clientID) FROM tblclient), '"+login.getUsername()+"', '"+login.getPassword()+"','"+login.getType()+"' )";
                     
            //return 
            added = conn.getState().executeUpdate(sql);
        }
        return added;
    }
    
    public boolean checkID(Client client) throws SQLException
    {
        String sql = "SELECT * FROM tblclient WHERE IDNO = '"+client.getIdNumber()+"'";
        ResultSet rec = conn.getState().executeQuery(sql);
        if(rec.next())
        {
            return false;
        }else
        {
            return true;
        }
    }
    
    
    
    public int getReference(Client client) throws SQLException
    {
        String sql = "SELECT clientID FROM tblclient WHERE IDNO = '"+client.getIdNumber()+"'";
        ResultSet rec = conn.getState().executeQuery(sql);
        int id = 0;
        while(rec.next())
        {
            id = rec.getInt(1);
        }
        return id;
    }
    
    public boolean checkUserAvail(Login login) throws SQLException
    {
        String sql = "SELECT * FROM tbllogin WHERE username = '"+login.getUsername()+"'";
        ResultSet rec = conn.getState().executeQuery(sql);
        if(rec.next())
        {
            return false;
        }else
        {
            return true;
        }
    }
    
    public boolean login(Login login) throws SQLException
    {
        String sql =    "SELECT * FROM tbllogin WHERE username = '"+login.getUsername()+"' " +
                        "AND password = '"+login.getPassword()+"'";
        ResultSet rec = conn.getState().executeQuery(sql);
        if(rec.next())
        {
            return true;
        }else
        {
            return false;
        }
    
    }
    
    public int updateClientPI(String name, String surname, int id) throws SQLException
    {
        String sql =    "UPDATE tblclient " +
                        "SET name = '"+name+"',surname = '"+surname+"' " +
                        "WHERE clientID = "+id+" ";
                        
        return conn.getState().executeUpdate(sql);
    }
    
    public int updateClientAdd(int houseNo, String city, int areaCode, int id) throws SQLException
    {
        String sql =    "UPDATE tblclient_address " +
                        "SET houseNumber = "+houseNo+"," +
                        "city = '"+city+"'," +
                        "areaCode = "+areaCode+" WHERE fkClientID = "+id+" ";
        return conn.getState().executeUpdate(sql);
    }
    
    public int updateLoginDetails(String user, String pass, int id) throws SQLException
    {
       // if(checkUserAvail(new Login(username,password,"Client")))
        //{
            String sql =    "UPDATE tbllogin " +
                            "SET username = '"+user+"', password = '"+pass+"' " +
                            "WHERE fkClientID = "+id+" ";
            return conn.getState().executeUpdate(sql);
//        }else
//        {
//            return 0;
//        }
    }
    
    
    public ArrayList<ClientP2> getClients() throws SQLException
    {
        ArrayList<ClientP2> clients = new ArrayList<ClientP2>();
        String sql = "SELECT * FROM tblclient";
        ResultSet rec = conn.getState().executeQuery(sql);
        
        while(rec.next())
        {
            clients.add(new ClientP2(rec.getInt(1), rec.getString(2), rec.getString(3), rec.getString(4), rec.getString(5)));
        }
        return clients;
    }
    
    public int removeClientPI(int refID) throws SQLException
    {
        String sql = "DELETE FROM tblclient WHERE clientID = "+refID+"";
        return conn.getState().executeUpdate(sql);
    }
    public void closeConnect() throws SQLException
    {
        conn.closeConnect();
    
    }
    
//    public void closeConnect() throws SQLException
//    {
//        state.close();
//        connect.close();
//    }
}
