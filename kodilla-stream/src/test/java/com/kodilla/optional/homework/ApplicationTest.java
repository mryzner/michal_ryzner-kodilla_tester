package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {
    @Test
    public void testTeacherNameEmptyBehaviour() {
        Student student = new Student("Harrison Ford", null);
        String result = Application.getTeacherName(student);
        assertEquals("<undefined>", result);
    }
    @Test
    public void testTeacherNameNotEmptyBehaviour() {
        Student student = new Student("John Smith", new Teacher("Hans Schmidt"));
        String result = Application.getTeacherName(student);
        assertEquals("Hans Schmidt", result);
        assertNotEquals("B", result);
    }
}