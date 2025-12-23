import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t){
        if (s.length() != t.length()) {
            return false;
        }

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        return Arrays.equals(sChars, tChars);
    }
    public static void main(String[] args){
        ValidAnagram solver = new ValidAnagram();
        System.out.println(solver.isAnagram("anagram", "nagaram"));
        System.out.println(solver.isAnagram("rat", "car"));
    }
}