package com.doctor.helper;

public class UserNotFoundExeception extends Exception{
    public UserNotFoundExeception(){
        super("User with this Username is not there in DataBase !! try with an");
    }
    public UserNotFoundExeception(String msg){
        super(msg);
    }

}