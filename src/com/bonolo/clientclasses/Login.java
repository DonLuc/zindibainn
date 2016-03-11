/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonolo.clientclasses;

/**
 *
 * @author Don Luc
 */
public class Login
{
    
    private String username;
    private String password;

    private String type;

    /**
     * Get the value of type
     *
     * @return the value of type
     */
    public String getType() {
        return type;
    }

    /**
     * Set the value of type
     *
     * @param type new value of type
     */
    public void setType(String type) 
    {
        this.type = type;
    }

    public Login(String username, String password, String type) {
        this.username = username;
        this.password = password;
        this.type = type;
    }

    /**
     * Get the value of password
     *
     * @return the value of password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Set the value of password
     *
     * @param password new value of password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Get the value of username
     *
     * @return the value of username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Set the value of username
     *
     * @param username new value of username
     */
    public void setUsername(String username) {
        this.username = username;
    }

}
