package com.axac.ApplicationUser.Models;

//import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationUserTest {

    @Test
    void tsetGetSetFirstName() {
        ApplicationUser applicationUser = new ApplicationUser();
applicationUser.setFirstName("mansoor");

        assertEquals("mansoor",applicationUser.getFirstName());
    }

    @Test
    void tsetGetSetLastName() {
        ApplicationUser applicationUser = new ApplicationUser();
        applicationUser.setLastName("mansoor");

        assertEquals("mansoor",applicationUser.getLastName());
    }


    @Test
    void testGetSetDateOfBirth() {
        ApplicationUser applicationUser = new ApplicationUser();
        applicationUser.setDateOfBirth("3/7/2021");

        assertEquals("3/7/2021",applicationUser.getDateOfBirth());
    }


    @Test
    void testGetSetBio() {
        ApplicationUser applicationUser = new ApplicationUser();
        applicationUser.setBio("hello");

        assertEquals("hello",applicationUser.getBio());
    }


}