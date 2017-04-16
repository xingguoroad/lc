import java.util.Arrays;

/**
 * Created by GelinZHU on 4/16/17.
 */
public class ThreeSumSmaller {
    public int threeSumSmaller(int[] nums, int target) {
        Arrays.sort(nums);
        int cnt = 0;
        for(int i = 0; i < nums.length - 2; i++){
            int left = i + 1, right = nums.length - 1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                // 如果三个数的和大于等于目标数，那将尾指针向左移
                if(sum >= target){
                    right--;
                    // 如果三个数的和小于目标数，那将头指针向右移
                } else {
                    // right - left个组合都是小于目标数的
                    cnt += right - left;
                    left++;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 1, 0, -2};
        ThreeSumSmaller tss = new ThreeSumSmaller();
        System.out.println(tss.threeSumSmaller(nums, 4));
    }
}
