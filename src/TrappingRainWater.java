/**
 * Created by GelinZHU on 4/1/17.
 */
public class TrappingRainWater {
    public int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }

        // from left to right
        int max = height[0];

        int[] left = new int[height.length];
        int[] right = new int[height.length];

        for (int i = 0; i < height.length; i++) {
            left[i] = Math.max(max, height[i]);
            max = Math.max(max, height[i]);
        }

        right[height.length - 1] = height[height.length - 1];
        max = right[height.length - 1];
        for (int i = height.length - 2; i >=0; i--) {
            right[i] = Math.max(max, height[i]);
            max = Math.max(max, height[i]);
        }

        // get result
        int total = 0;
        for (int i = 0; i < height.length; i++) {
            if (Math.min(left[i], right[i]) - height[i] > 0) {
                total += (Math.min(left[i], right[i]) - height[i]) * 1;
            }
        }
        return total;
    }
}
