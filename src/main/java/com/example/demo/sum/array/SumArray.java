package com.example.demo.sum.array;

public class SumArray implements ISumArray{
    public ISumArrayResponse calculate(Integer[] nums, Integer target) {
        int left = nums[0];
        int right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new ISumArrayResponse() {
                    @Override
                    public Integer[] getSumArrayResponse() {
                        return new Integer[]{nums[left], nums[right]};
                    }
                };
            }else{
                return null;
            }
        }
        return null;
}
}
