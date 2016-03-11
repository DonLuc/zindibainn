/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonolo.daos;

import com.bonolo.department.Department;
import com.bonolo.department.DepartmentP2;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Don Luc
 */
public class DepartmentDAO 
{
    ConnectDaos conn = new ConnectDaos();
	
    public void openConnect() throws ClassNotFoundException, SQLException
    {
        conn.openConnect();
    }
    
    
    //Add dept
    public int addDepartment(Department dep) throws SQLException
    {
        
        if(checkDeptAvail(dep.getDescription()))
        {
                        String sql =    "INSERT INTO tbldepartment(dept_description, salary) " +
                        "VALUES('"+dep.getDescription()+"',"+dep.getPrice()+")";
                        return conn.getState().executeUpdate(sql);
        
        }else
        {
            return 0;
        }
        
    }
    
    public boolean checkDeptAvail(String depName) throws SQLException
    {
        String sql = "SELECT * FROM tbldepartment WHERE dept_description = '"+depName+"'";
        ResultSet rec = conn.getState().executeQuery(sql);
        if(rec.next())
        {
            return false;
        }else
        {
            return true;
        }
    
    }
    
    public int deleteDept(int depID) throws SQLException
    {
        String sql = "DELETE FROM tbldepartment WHERE depID= "+depID+" ";
        return conn.getState().executeUpdate(sql);
    
    }
    
    public ArrayList<DepartmentP2> viewDepartments() throws SQLException
    {
        ArrayList<DepartmentP2> depts = new ArrayList<DepartmentP2>();
        String sql = "SELECT * FROM tbldepartment";
        ResultSet rec = conn.getState().executeQuery(sql);
        
        while(rec.next())
        {
            depts.add(new DepartmentP2(rec.getInt(1),rec.getString(2),rec.getDouble(3)));
        }
        return depts;
        
    }
    
    public int updateDepartment(Department depart) throws SQLException
    {
        String sql =    "UPDATE tbldepartment " +
                        "SET salary = "+depart.getPrice()+" " +
                        "WHERE dept_description = '"+depart.getDescription()+"'";
        
        return conn.getState().executeUpdate(sql);
    }
    
    public void closeConnect() throws SQLException
    {
        conn.closeConnect();
    
    }
    
    
}
