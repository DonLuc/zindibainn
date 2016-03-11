/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonolo.clientclasses;

/**
 *
 * @author Don Luc
 */
public class Contact 
{
    
    private String contact;
    private String email;

    public Contact(String contact, String email) 
    {
        this.contact = contact;
        this.email = email;
    }

    
    /**
     * Get the value of email
     *
     * @return the value of email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set the value of email
     *
     * @param email new value of email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Get the value of contact
     *
     * @return the value of contact
     */
    public String getContact() {
        return contact;
    }

    /**
     * Set the value of contact
     *
     * @param contact new value of contact
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    
}
