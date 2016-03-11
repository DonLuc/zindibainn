/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonolo.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Don Luc
 */
public class ConnectDaos
{
    
    private Connection connect;
    private Statement State;
    
    
    public ConnectDaos()
    {
    
    }
    
    public void openConnect() throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.jdbc.Driver");
        connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/zindibadbase", "root", "");
        State = connect.createStatement();
    }

    public void closeConnect() throws SQLException
    {
        State.close();
        connect.close();
    }
    /**
     * Get the value of State
     *
     * @return the value of State
     */
    public Statement getState() {
        return State;
    }

    /**
     * Set the value of State
     *
     * @param State new value of State
     */
    public void setState(Statement State) {
        this.State = State;
    }

    /**
     * Get the value of connect
     *
     * @return the value of connect
     */
    public Connection getConnect() {
        return connect;
    }

    /**
     * Set the value of connect
     *
     * @param connect new value of connect
     */
    public void setConnect(Connection connect) {
        this.connect = connect;
    }
    
    

    
}
