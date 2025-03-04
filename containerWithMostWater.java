public int maxArea(int[] height) {
        int maxWater = 0, low = 0, high = height.length - 1;
        
        while (low < high) {
            int waterLength = high - low;
            int waterHeight = Math.min(height[low], height[high]);
            int water = waterLength * waterHeight;
            if (water > maxWater) {
                maxWater = water;
            }
            if (height[low] < height[high]) {
                low++;
            } else {
                high--;
            }
        }

        return maxWater;
    }
