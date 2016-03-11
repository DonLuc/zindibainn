/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonolo.daos;

import com.bonolo.rooms.Room;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Don Luc
 */
public class RoomDAO 
{
    
    ConnectDaos conn = new ConnectDaos();
    
    public void openConnect() throws ClassNotFoundException, SQLException
    {
        conn.openConnect();
    }
    
    
    //Add a room
    public int addRoom(Room room) throws SQLException
    {
        String sql =    "INSERT INTO tblroom(roomNo,roomType,rate,reservation_status) " +
                        "VALUES("+room.getRoomNum()+",'"+room.getRoomType()+"',"+room.getRate()+",'"+room.getReserveStatus()+"')";
        return conn.getState().executeUpdate(sql);
    }
    
    public int updateRoomInfo(String type, double rate, String status, int roomNum) throws SQLException
    {
        String sql =    "UPDATE tblroom " +
                        "SET roomType = '"+type+"', " +
                        "rate = "+rate+", " +
                        "reservation_status = '"+status+"' " +
                        "roomNo = "+roomNum+"";
        return conn.getState().executeUpdate(sql);    
    }
    
    
    public ArrayList<Room> viewRooms() throws SQLException
    {
        ArrayList<Room> rooms = new ArrayList<>();
        String sql = "SELECT * FROM tblroom";
        ResultSet rec = conn.getState().executeQuery(sql);
        
        
        while(rec.next())
        {
            rooms.add(new Room(rec.getInt(1),rec.getString(2),rec.getDouble(3),rec.getString(2)));
        }
        return rooms;
    }
    
    public int deleteRoom(int roomNum) throws SQLException
    {
        String sql = "DELETE FROM tblroom WHERE roomNo = "+roomNum+" ";
        return conn.getState().executeUpdate(sql);
    
    }
    
    public void closeConnect() throws SQLException
    {
        conn.closeConnect();
    
    }
    
    
}
