/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonolo.daos;

import com.bonolo.clientclasses.Login;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Don Luc
 */
public class AdminDAO 
{
    ConnectDaos conn = new ConnectDaos();
    public void openConnect() throws ClassNotFoundException, SQLException
    {
        conn.openConnect();
    }
    
    public int login(Login login) throws SQLException
    {
        String sql =    "SELECT * FROM tbllogin WHERE " +
                        "username = '"+login.getUsername()+"' AND password = '"+login.getPassword()+"'";
        ResultSet rec = conn.getState().executeQuery(sql);
        if(rec.next())
        {
            return 1;
        }else
        {
            return 0;
        }
    }
    
    public void closeConnect() throws SQLException
    {
        conn.closeConnect();
    }
    
    
}
