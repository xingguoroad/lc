/**
 * Created by GelinZHU on 3/22/17.
 */
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        if (height.length < 2|| height == null) {
            return 0;
        }

        int low = 0;
        int high = height.length - 1;

        int max = 0;

        while (low < high) {
            int area = (high - low) * (Math.min(height[low], height[high]));
            if ( max  < area) {
                max = area;
            }
            if (height[low] < height[high]) {
                low++;
            } else {
                high--;
            }
        }
        return max;
    }
}
