/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonolo.daos;

import com.bonolo.service.Service;
import com.bonolo.service.ServiceP2;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Don Luc
 */
public class ServiceDAO 
{
    ConnectDaos conn = new ConnectDaos();
    public void openConnect() throws ClassNotFoundException, SQLException
    {
        conn.openConnect();
    }
    
    public int addService(Service service) throws SQLException
    {
        String sql =    "INSERT INTO tblservice(service_name,price) " +
                        "VALUES('"+service.getServiceName()+"',"+service.getPrice()+")";
        return conn.getState().executeUpdate(sql);
    }
    
    public int updateServicePrice(Service service) throws SQLException
    {
        String sql =    "UPDATE tblservice " +
                        "SET price = '"+service.getPrice()+"' " +
                        "where service_name = '"+service.getServiceName()+"'";
        return conn.getState().executeUpdate(sql);
    }
    
    public ArrayList<String> getServiceNames() throws SQLException
    {
        ArrayList<String> names = new ArrayList<>();
        String sql =    "SELECT service_name " +
                        "FROM tblservice";
        ResultSet rec = conn.getState().executeQuery(sql);
        
        while(rec.next())
        {
            names.add(rec.getString(1));
        }
        return names;
    }
    
    public int deleteService(int serviceID) throws SQLException
    {
        String sql = "DELETE FROM tblservice WHERE serviceID = "+serviceID+"";
        return conn.getState().executeUpdate(sql);
    }
    
    public ArrayList<ServiceP2> viewServices() throws SQLException
    {
        ArrayList<ServiceP2> services = new ArrayList<>();
        String sql = "SELECT * FROM tblservice";
        ResultSet rec = conn.getState().executeQuery(sql);
        
        while(rec.next())
        {
            services.add(new ServiceP2(rec.getInt(1), rec.getString(2), rec.getDouble(3)));
        }
        return services;
    }
    
    public void closeConnect() throws SQLException
    {
        conn.closeConnect();
        
    }
    
}
