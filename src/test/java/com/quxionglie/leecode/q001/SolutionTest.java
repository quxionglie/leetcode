package com.quxionglie.leecode.q001;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 2018/7/15.
 *
 * @author qu.xionglie
 */
public class SolutionTest {

    @Test
    public void twoSum() {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] result = new Solution().twoSum(nums, target);
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
    }
}