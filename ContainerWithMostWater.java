import java.util.*;
class GfG {
    static int maxWater(int[] arr) {
        int n = arr.length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
              
                int amount = 
                    Math.min(arr[i], arr[j]) * (j - i);
              
                res = Math.max(amount, res);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 8, 6, 4, 6, 5, 5};
        System.out.println(maxWater(arr));
    }
}