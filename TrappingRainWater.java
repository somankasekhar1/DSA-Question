public class TrappingRainWater {
    static int maxWater(int[] arr){
        int res = 0;
 
        for (int i = 1; i < arr.length - 1; i++){
            int left = arr[i];
            for (int j = 0; j < i; j++)
                left = Math.max(left, arr[j]);

            int right = arr[i];
            for (int j = i + 1; j < arr.length; j++)
                right = Math.max(right, arr[j]);

            res += Math.min(left, right) - arr[i];
        }
        return res;
    }
    public static void main(String[] args){
        int[] arr = {2,1,5,3,1,0,4};
        System.out.println(maxWater(arr));
    }
}
