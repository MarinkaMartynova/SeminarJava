import java.util.Arrays;
import java.util.Random;
import java.util.HashSet;

/**
 * Учитывая два целочисленных массива nums1 и nums2, nums1 = [1,2,3,2,1], nums2 = [3,2,1,4,7]
 * верните максимальную длину подмассива, который появляется в обоих массивах.
 * 
 * Example 1:
 * Input: nums1 = [1,2,3,2,1], nums2 = [3,2,1,4,7]
 * Output: 3
 * Explanation: Повторяющийся подмассив с максимальной длиной равен [3,2,1].
 * 
 * Example 2:
 * Input: nums1 = [0,0,0,0,0], nums2 = [0,0,0,0,0]
 * Output: 5
 * Explanation: Повторяющийся подмассив с максимальной длиной равен [0,0,0,0,0]. * 
 */

public class homeworkByLesson5 {
    public static void main(String[] args) {
        // для примера Input: nums1 = [1,2,3,2,1], nums2 = [3,2,1,4,7]
        // int[] nums1 = {1,2,3,2,1};
        // int[] nums2 = {3,2,1,4,7};

        // для примера Input: nums1 = [0,0,0,0,0], nums2 = [0,0,0,0,0]
        // int[] nums1 = {0,0,0,0,0};
        // int[] nums2 = {0,0,0,0,0};

        Random random = new Random();
            int[] num1 = new int[5];
    
            for (int i = 0; i < num1.length; i++) {
                num1[i] = random.nextInt(10);
            }
    
            for (int i = 0; i < num1.length; i++) {                
                //System.out.print(num1[i] + ",");
            }
            int[] num2 = new int[5];

            for (int i = 0; i < num2.length; i++) {
                num2[i] = random.nextInt(10);
            }
            for (int i = 0; i < num2.length; i++) {                
                //System.out.print(num2[i] + ",");
            }
        
        int result = findLength(num1, num2);
        System.out.println(Arrays.toString(num1));
        System.out.println(Arrays.toString(num2));       
        System.out.println(result);
               
    }
    public static int findLength(int[] nums1, int[] nums2){
        HashSet<Integer> set1 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }
        int maxLen = 0;
        int len = 0;
        for (int i = 0; i < nums2.length; i++) {
          if (set1.contains(nums2[i])) {
            len++;
            maxLen = Math.max(maxLen, len);
          } 
          else {
            len = 0;
          }
        }
        
        return maxLen;
    }

    //второе решение 
    // public static int findLength(int[] nums1, int[] nums2) {
        // int m = nums1.length;
        // int n = nums2.length;
        // int[][] dp = new int[m+1][n+1];
        // int maxLength = 0;
        // for (int i = 1; i <= m; i++) {
            // for (int j = 1; j <= n; j++) {
                // if (nums1[i-1] == nums2[j-1]) {
                    // dp[i][j] = dp[i-1][j-1] + 1;
                    // maxLength = Math.max(maxLength, dp[i][j]);
                // } else {
                    // dp[i][j] = 0;
                // }
            // }
        // }
        // return maxLength;
    // }

    
}

   