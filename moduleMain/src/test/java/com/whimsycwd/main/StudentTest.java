package com.whimsycwd.main;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.whimsycwd.moduleA.Student;

/**
 * Created by whimsy on 10/21/14.
 */

@Test
public class StudentTest {

    @Test
    void bla() {
        Student student = new Student(1, "first");
        Assert.assertEquals(student.getId(), 1);
        Assert.assertEquals(student.getName(), "first");
    }

}
