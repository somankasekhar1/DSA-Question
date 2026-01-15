public class LongestSubstringWithoutRepeatingCharacters {
    static int longestUniqueSubstr(String s){
        int n = s.length();
        int res = 0;

        for (int i = 0; i < n ; i++){
            boolean[] vis = new boolean[26];

            for (int j = i; j < n; j++){
                if (vis[s.charAt(j) - 'a'] == true)
                    break;
                else {
                    res = Math.max(res, j - i + 1);
                    vis[s.charAt(j) - 'a'] = true;
                }
            }
        }
        return res;
    }
    public static void main(String[] args){
        String s = "geeksforgeeks";
        System.out.println(longestUniqueSubstr(s));
    }
}
