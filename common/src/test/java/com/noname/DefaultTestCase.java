package com.noname;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.noname.collections.*;

public class DefaultTestCase {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test_verifyNewLinkedList() {
        String[] wordArray = { "The", "quick", "brown", "fox", "jumps", "over",
                "the", "lazy", "dog." };

        LinkedList<String> stringList = new LinkedList<String>();

        for (String word : wordArray) {
            stringList.add(word);
        }

        int countResult = 0;

        for (String word1 : stringList) {
            for (String word2 : wordArray) {
                if (word1 == word2) {
                    countResult += 1;
                    break;
                }
            }
        }

        Assert.assertEquals("test_verifyNewLinkedList failed,"
                + "number of matches did not match total expected.",
                wordArray.length, countResult);
    }
}
