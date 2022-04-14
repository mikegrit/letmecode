import java.util.HashMap;
import java.util.Map;

class Solution {
        public static int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();

            for(int i = 0; i < nums.length; i++) {
                int n = target - nums[i];
                //
                if(map.containsKey(n)) {
                    System.out.println("solve! [" + i + ","+ map.get(n) + "]");
                    return  new int[]{map.get(n), i};
                }
                //将数值的位置存入map:key, value
                map.put(nums[i], i);
            }
            System.out.println("Sorry! No solution!");
            return null;
        }
}