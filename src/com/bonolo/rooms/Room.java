/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonolo.rooms;

/**
 *
 * @author Don Luc
 */
public class Room 
{
    
    private int roomNum;
    private String roomType;
    private double rate;
    private String reserveStatus;

    public Room()
    {
    
    }

    public Room(int roomNum, String roomType, double rate, String reserveStatus) {
        this.roomNum = roomNum;
        this.roomType = roomType;
        this.rate = rate;
        this.reserveStatus = reserveStatus;
    }
    
    
    
    /**
     * Get the value of reserveStatus
     *
     * @return the value of reserveStatus
     */
    public String getReserveStatus() {
        return reserveStatus;
    }

    /**
     * Set the value of reserveStatus
     *
     * @param reserveStatus new value of reserveStatus
     */
    public void setReserveStatus(String reserveStatus) {
        this.reserveStatus = reserveStatus;
    }

    /**
     * Get the value of rate
     *
     * @return the value of rate
     */
    public double getRate() {
        return rate;
    }

    /**
     * Set the value of rate
     *
     * @param rate new value of rate
     */
    public void setRate(double rate) {
        this.rate = rate;
    }

    /**
     * Get the value of roomType
     *
     * @return the value of roomType
     */
    public String getRoomType() {
        return roomType;
    }

    /**
     * Set the value of roomType
     *
     * @param roomType new value of roomType
     */
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    /**
     * Get the value of roomNum
     *
     * @return the value of roomNum
     */
    public int getRoomNum() {
        return roomNum;
    }

    /**
     * Set the value of roomNum
     *
     * @param roomNum new value of roomNum
     */
    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    
    
}
