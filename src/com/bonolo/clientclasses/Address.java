/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonolo.clientclasses;

/**
 *
 * @author Don Luc
 */
public class Address 
{
    
    private int houseNumber;
    private String city;
    private int areaCode;

    /**
     * Get the value of city
     *
     * @return the value of city
     */
    public String getCity() {
        return city;
    }

    /**
     * Set the value of city
     *
     * @param city new value of city
     */
    public void setCity(String city) {
        this.city = city;
    }
    

    public Address(int houseNumber, String city, int areaCode) {
        this.houseNumber = houseNumber;
        this.city = city;
        this.areaCode = areaCode;
    }

    /**
     * Get the value of areaCode
     *
     * @return the value of areaCode
     */
    public int getAreaCode() {
        return areaCode;
    }

    /**
     * Set the value of areaCode
     *
     * @param areaCode new value of areaCode
     */
    public void setAreaCode(int areaCode) {
        this.areaCode = areaCode;
    }



    /**
     * Get the value of houseNumber
     *
     * @return the value of houseNumber
     */
    public int getHouseNumber() {
        return houseNumber;
    }

    /**
     * Set the value of houseNumber
     *
     * @param houseNumber new value of houseNumber
     */
    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

}
