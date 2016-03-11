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
public class Service 
{
    
    private String serviceName;
    private double price;

    public Service(String serviceName, double price) {
        this.serviceName = serviceName;
        this.price = price;
    }

    
    /**
     * Get the value of price
     *
     * @return the value of price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Set the value of price
     *
     * @param price new value of price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Get the value of serviceName
     *
     * @return the value of serviceName
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Set the value of serviceName
     *
     * @param serviceName new value of serviceName
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    
}
