// Leetcode: 1
// Problem Statement:
// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// Constrains: Only one solution can exist

// Test Case:
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

// Aproach:
// 1. loop through the array (using nested loop) and find all pair except same pairs
// 2. if two elements add up and equels to the target return the indices

// T.C: O(n^2)
// S.C: O(1)

package arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;

        int[] ans = twoSum(nums, target);
        for(int i: ans) {
            System.out.print(i + " ");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] ans = {-1, -1};

        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                
                if(nums[i] + nums[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }

        return ans;
    }
}

