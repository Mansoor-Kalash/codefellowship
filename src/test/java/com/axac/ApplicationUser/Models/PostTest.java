package com.axac.ApplicationUser.Models;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PostTest {

    @Test
    void testGetSetBody() {
        Post post = new Post();
        post.setBody("hi");
        assertEquals("hi",post.getBody());
    }

    @Test
    void testGetSetCreatedAt() {
        Post post = new Post();
        post.setCreatedAt(LocalDate.now());

        assertEquals(LocalDate.now(),post.getCreatedAt());
    }
}