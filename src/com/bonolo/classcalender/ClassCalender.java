/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonolo.classcalender;

import java.util.Vector;

/**
 *
 * @author Don Luc
 */
public class ClassCalender 
{
    
    private String time;
    
    public ClassCalender(String time)
    {
        super();
        this.time = time;
    }
    
    public Vector<String> getTD()
    {
        Vector<String> arrayTime = new Vector<String>();
        
        String[] info = time.split(" ");
        for(int x =0; x < info.length -1; x++)
        {
            arrayTime.add(info[x]);
        }
        return arrayTime;
    }
    
    public String getDayOfTheWeek(Vector<String> time)
    {
        String day = "";
        switch(time.get(1))
        {
            case "Sat":
                day = "Saturday";
                break;
            case "Sun":
                day = "Sunday";
                break;
            case "Mon":
                day = "Monday";
                break;
            case "Tue":
                day = "Tuesday";
                break;
            case "Wed":
                day = "Wednesday";
                break;
            case "Thu":
                day = "Thursday";
                break;
            case "Fri":
                day = "Friday";
                break;
        }
        return day;
    }
   
    
    public String getMonth(Vector<String> time)
    {
        String month = "";
        
        switch(time.get(1))
        {
            case "Jan":
                month = "January";
                break;
            case "Feb":
                month = "February";
                break;
            case "Mar":
                month = "March";
                break;
            case "Apr":
                month = "April";
                break;
            case "Jun":
                month = "June";
                break;
            case "Jul":
                month = "July";
                break;
            case "Aug":
                month = "August";
                break;
            case "Sep":
                month = "September";
                break;
            case "Oct":
                month = "October";
                break;
            case "Nov":
                month = "November";
                break;
            case "Dec":
                month = "December";
                break;
        }
        
        return month;
    }
    
    public String getDay(Vector<String> time)
    {
        return time.get(2);
    }
    
    public String getTime(Vector<String> time)
    {
        return time.get(3);
    }
    
    public String getTimeZone(Vector<String> time)
    {
        return time.get(4);
    }
    
    public String getYear(Vector<String> time)
    {
        return time.get(5);
    }
    
}
