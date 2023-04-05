package com.example.androidunitexample;

import static org.junit.Assert.*;
//import com.google.common.truth.Truth.*;
import org.junit.Test;

public class RegistrationUtilTest {
//    tdd=test driven development


    @Test //nama kosong
    public void emptyUname(){
       assertFalse(LocalUtil.registrationValidation(
               "",
               "12345",
               "12345"));
    }

    @Test//benar semua
    public void testRight() {
        assertTrue(LocalUtil.registrationValidation(
                "manda",
                "12345678",
                "12345678"));
    }

    @Test//nama sama
    public void sameUname(){
        assertFalse(LocalUtil.registrationValidation(
                "manda",
                "12345",
                "12345"));
    }

    @Test//beda pass dan cnfrm
    public void diffPass(){
        assertFalse(LocalUtil.registrationValidation(
                "Shyva",
                "12345",
                "12445"));
    }

    @Test//jumpah pass kurang return false
    public void minPass(){
        assertTrue(LocalUtil.registrationValidation(
                "manda",
                "1234",
                "1234"));
    }

    @Test
    public void calculator(){
        LocalUtil localUtil = new LocalUtil();
        int result = localUtil.tambahAdd(2, 5);
        assertEquals(7, result);
    }

}