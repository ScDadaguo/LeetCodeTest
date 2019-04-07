/** 
* @Description: 给定一个数组arr，返回数组的最大累加和
 * 例如
 * arr[1,-2,3,5,-2,6,-1]
 * 所有子数组中，[3,5,-2.6]可以累加出的最大和为12，所以返回12

* @Author: 文兆杰
* @Date: 2019/4/4
*/ 
public class Solution12 {
    public static int maxSum(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int cur=0;
        for (int i = 0; i < arr.length; i++) {
            cur += arr[i];
            max = Math.max(cur, max);
            cur = cur < 0 ? 0 : cur;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 3, 5, -2, 6, -1};
        System.out.println(maxSum(arr));
//
    }

}
