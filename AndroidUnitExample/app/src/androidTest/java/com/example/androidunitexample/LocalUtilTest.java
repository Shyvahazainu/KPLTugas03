package com.example.androidunitexample;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class LocalUtilTest {

    @Test
    public void testRegistrationValidation() {
        assertTrue(LocalUtil.registrationValidation("user1", "password123", "password123"));
        assertFalse(LocalUtil.registrationValidation("", "password123", "password123"));
        assertFalse(LocalUtil.registrationValidation("nada", "password123", "password123"));
        assertFalse(LocalUtil.registrationValidation("user1", "password123", "password456"));
        assertFalse(LocalUtil.registrationValidation("user1", "123", "123"));
    }

    @Test
    public void testTambahAdd() {
        LocalUtil localUtil = new LocalUtil();
        assertEquals(5, localUtil.tambahAdd(2, 3));
        assertEquals(10, localUtil.tambahAdd(5, 5));
        assertEquals(-2, localUtil.tambahAdd(0, -2));
    }
}
