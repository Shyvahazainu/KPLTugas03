package com.example.androidunitexample;

import java.util.List;
import java.util.Arrays;

public class LocalUtil {

    static List<String> existingUsers = Arrays.asList("nada", "manda");

    public static boolean registrationValidation(String username, String password, String confirmedPassword) {

        if(username.isEmpty()||password.isEmpty()){
            return false;
        }
        if (existingUsers.contains(username)){
            return false;
        }
        if ((!password.equals(confirmedPassword))){
            return false;
        }
        if (password.length()>5){
            return true;
        }
        return false;
    }

    public int tambahAdd(int x, int y){
        return x + y;
    }

}
