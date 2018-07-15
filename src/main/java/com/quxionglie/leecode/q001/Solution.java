package com.quxionglie.leecode.q001;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/two-sum/description/
 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
 * 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
 *
 * 复杂度分析：
 *  时间复杂度：O(n)
 *  空间复杂度：O(n)
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
        throw new IllegalArgumentException("No two sum solution");
    }
}