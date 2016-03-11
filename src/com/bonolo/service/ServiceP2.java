/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonolo.service;

/**
 *
 * @author Don Luc
 */
public class ServiceP2 extends Service 
{
    
        private int serviceID;

    public ServiceP2(int serviceID, String serviceName, double price) {
        super(serviceName, price);
        this.serviceID = serviceID;
    }

    /**
     * Get the value of serviceID
     *
     * @return the value of serviceID
     */
    public int getServiceID() {
        return serviceID;
    }

    /**
     * Set the value of serviceID
     *
     * @param serviceID new value of serviceID
     */
    public void setServiceID(int serviceID) {
        this.serviceID = serviceID;
    }

}
