package com.doctor.helper;


public class UserFoundException extends Exception{

   public UserFoundException(){
       super("User with this Username is already there in DataBase !! try with an");
   }
   public UserFoundException(String msg){
       super(msg);
   }


}