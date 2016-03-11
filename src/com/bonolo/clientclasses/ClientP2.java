/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonolo.clientclasses;

/**
 *
 * @author Don Luc
 */
public class ClientP2 extends Client
{

        private int refID;

    public ClientP2(int refID,String name, String surname, String idNumber, String gender) {
        super(name, surname, idNumber, gender);
        this.refID = refID;
    }
    
    
    /**
     * Get the value of refID
     *
     * @return the value of refID
     */
    public int getRefID() {
        return refID;
    }

    /**
     * Set the value of refID
     *
     * @param refID new value of refID
     */
    public void setRefID(int refID) {
        this.refID = refID;
    }

    
}
