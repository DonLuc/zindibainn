/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonolo.department;

/**
 *
 * @author Don Luc
 */
public class DepartmentP2 extends Department
{
    
            private int depID;



    public DepartmentP2(int depID,String description, double price) {
        super(description,price);
        this.depID = depID;
    }
        /**
     * Get the value of depID
     *
     * @return the value of depID
     */
    public int getDepID() {
        return depID;
    }

    /**
     * Set the value of depID
     *
     * @param depID new value of depID
     */
    public void setDepID(int depID) {
        this.depID = depID;
    }

    
}
