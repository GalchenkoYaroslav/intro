package com.gojava6;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Ярослав on 29.09.2015.
 */
public class OneSwipeArrayTest {

    private OneSwipeArray oneSwipeArray;
    private int[] falseArray;
    private int[] trueArray;

    @Before
    public void setUp(){
        oneSwipeArray = new OneSwipeArray();
        trueArray = new int[]{1, 5, 3, 3, 7};
        falseArray = new int[]{1, 3, 5, 3, 4};
    }

    @Test
    public void testSolution() {
        assertTrue(oneSwipeArray.solution(trueArray));
    }

    @Test
    public void testSolutionTwo() {
        assertFalse(oneSwipeArray.solution(falseArray));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolutionNull() {
        oneSwipeArray.solution(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolutionLessThanTwo() {
        oneSwipeArray.solution(new int[1]);
    }
}
