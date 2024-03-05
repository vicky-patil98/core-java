package com.learning.core.day3;
import java.util.*;

public class D03P05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] nums = {1, 2, 3};
        int k = 2;
        List<List<Integer>> result = findCombinations(nums, k);
        System.out.println("Distinct combinations of " + k + " numbers:");
        for (List<Integer> combination : result) {
            System.out.println(combination);
        }
    }

    public static List<List<Integer>> findCombinations(int[] nums, int k) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // Sort the array to handle duplicates properly
        backtrack(result, new ArrayList<>(), nums, k, 0);
        return result;
    }

    private static void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums, int k, int start) {
        if (tempList.size() == k) {
            result.add(new ArrayList<>(tempList));
            return;
        }
        for (int i = start; i < nums.length; i++) {
            // Skip duplicates
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }
            tempList.add(nums[i]);
            backtrack(result, tempList, nums, k, i + 1);
            tempList.remove(tempList.size() - 1);
        }

	}

}
