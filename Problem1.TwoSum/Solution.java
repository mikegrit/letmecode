import java.util.HashMap;
import java.util.Map;

class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();

            for(int i = 0; i < nums.length; i++) {
                int n = target - nums[i];
                //
                if(map.containsValue(n)) {
                    return new int[]{i, map.get(n)};
                }
                //将数值的位置存入map
                map.put(nums[i], i);
            }
            System.out.println("Sorry! No solution!");
            return null;
        }


        }