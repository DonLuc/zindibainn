/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonolo.clientclasses;

/**
 *
 * @author Don Luc
 */
public class Client 
{
    
    private String name;
    private String surname;
    private String idNumber;
    private String gender;

    

  

  

    public Client(String name, String surname, String idNumber, String gender) {
        this.name = name;
        this.surname = surname;
        this.idNumber = idNumber;
        this.gender = gender;
    }
    
    /**
     * Get the value of gender
     *
     * @return the value of gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * Set the value of gender
     *
     * @param gender new value of gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Get the value of idNumber
     *
     * @return the value of idNumber
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * Set the value of idNumber
     *
     * @param idNumber new value of idNumber
     */
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    /**
     * Get the value of surname
     *
     * @return the value of surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Set the value of surname
     *
     * @param surname new value of surname
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }

}
