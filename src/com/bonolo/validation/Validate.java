/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonolo.validation;

/**
 *
 * @author Don Luc
 */
public class Validate 
{
    public boolean validEmail(String email)
    {
        boolean isVaild = false;
        CharSequence cs1 = "@";
        CharSequence cs2 = ".";
        if(email.contains(cs1) && email.contains(cs2))
        {
            isVaild = true;
        }
        return isVaild;
    }
    
    public boolean validID(String id)
    {
        boolean isValid = false;
        Character c;
        
        if(id.length() == 13)
        {
            for(int x = 0;x < id.length() - 1; x++ )
            {
                if(Character.isDigit(id.charAt(x)))
                {
                    isValid = true;
                }else
                {
                    isValid = false;
                }
            }   
        }
        return isValid;
    }
    
    public boolean validContact(String contact)
    {
         boolean isValid = false;
         if( contact.length() == 10)
         {
             if(contact.charAt(0) == 0)
             {
                 for(int x = 0; x < contact.length() - 1; x++)
                 {
                     if(Character.isDigit(contact.charAt(x)))
                     {
                         isValid = true;
                     }
                 
                 }
             }
         
         }
         return isValid;
    }
    
    public boolean validNameSurname(String name)
    {
        boolean isValid = false;
        
        for(int x = 0; x < name.length() - 1; x++)
        {
            if(Character.isLetter(name.charAt(x)))
            {
               isValid = true;
            }else
            {
                isValid = false;
            }
    
        }
        return isValid;
    }
    
    public boolean validNumbers(String strNumber)
    {
        boolean isValid = false;
        
        for(int x = 0; x < strNumber.length() - 1; x++)
        {
            if(Character.isDigit(strNumber.charAt(x)))
            {
                isValid = true;
            }else
            {
                isValid = false;
            }
        
        }
        return isValid;
    }
    
    public boolean confirmPassword(String pass1, String pass2)
    {
        boolean isValid = false;
        
        if(pass1.equals(pass2))
        {
            isValid = true;
        }
        return isValid;
    }
    
    public String getPassword(char[] pass)
    {
        String strPass = "";
        for(int x = 0; x < pass.length; x++)
        {
            strPass += pass[x];
        }
        return strPass;
    }
    
    public char getGender(int index)
    {
        char gen;
        if(index == 0)
        {
            gen = 'M';
        }else
        {
            gen = 'F';
        }
        return gen;
    
    }
    
}




