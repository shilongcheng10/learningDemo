package com.fengjunzi.learning.scala.difference.writing;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @version 1.0
 * @author: Shi, LongCheng
 * @createTime: 3/12/2022$ PM8:17$
 * @description
 */
public class simpleDemoWithJavaTest {

    @Test
    public void testContainsUpperCaseShouldGetFalseIfNotContainsUpperCase() {
        simpleDemoWithJava simpleDemoWithJava = new simpleDemoWithJava();
        Assert.assertFalse(simpleDemoWithJava.containsUpperCase("test"));
    }

    @Test
    public void testContainsUpperCaseShouldGetTrueIfContainsUpperCase() {
        simpleDemoWithJava simpleDemoWithJava = new simpleDemoWithJava();
        Assert.assertTrue(simpleDemoWithJava.containsUpperCase("Test"));
    }

    @Test
    public void testContainsUpperCaseWithStreamShouldGetTrueIfContainsUpperCase() {
        simpleDemoWithJava simpleDemoWithJava = new simpleDemoWithJava();
        Assert.assertTrue(simpleDemoWithJava.containsUpperCaseWithStream("Test"));
    }

    @Test
    public void testContainsUpperCaseWithStreamShouldGetFalseIfNotContainsUpperCase() {
        simpleDemoWithJava simpleDemoWithJava = new simpleDemoWithJava();
        Assert.assertFalse(simpleDemoWithJava.containsUpperCaseWithStream("test"));
    }


}
