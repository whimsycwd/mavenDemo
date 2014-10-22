package com.whimsycwd.main;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by whimsy on 10/21/14.
 */
@Test
public class MainTest {

    @DataProvider
    public Object[][] validDataProvider() {
        return new Object[][]{
                                 {1, "abc"},
                                 {2, "def"},
                                 {3, "kpi"}
        };
    };

    @Test(dataProvider = "validDataProvider")
    void bla2(int id, String name) {
        Assert.assertEquals(Main.format(id, name),
                               String.format("%d %s\n", id, name));
    }
}
