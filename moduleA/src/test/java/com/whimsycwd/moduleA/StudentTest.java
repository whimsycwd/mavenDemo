package com.whimsycwd.moduleA;

import org.testng.Assert;
import org.testng.annotations.Test;

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
