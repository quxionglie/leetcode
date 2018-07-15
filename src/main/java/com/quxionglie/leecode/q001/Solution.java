package com.quxionglie.leecode.q001;

import java.util.HashMap;
import java.util.Map;

/**
 * Created on 2018/7/15.
 *
 * @author qu.xionglie
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int v = target - nums[i];
            if (map.containsKey(v)) {
                return new int[]{map.get(v), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}