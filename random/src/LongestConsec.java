import java.util.Arrays;

public class LongestConsec {

    public static String longestConsec(String[] strarr, int k) {
        int n = strarr.length;
        if (n == 0 || k > n || k <= 0) {
            return "";
        }

        String out = "";
        int maxLength = 0;

        for (int i = 0; i <= n - k; i++) {
            StringBuilder concat = new StringBuilder();
            for (int j = i; j < i + k; j++) {
                concat.append(strarr[j]);
            }
            if (concat.length() > maxLength) {
                maxLength = concat.length();
                out = concat.toString();
            }
        }

        return out;
    }

    public static void main(String[] args) {
        // Example usage:
        String[] strarr1 = {"tree", "foling", "trashy", "blue", "abcdef", "uvwxyz"};
        int k1 = 2;
        System.out.println(longestConsec(strarr1, k1)); // Output: "folingtrashy"

        String[] strarr2 = {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"};
        int k2 = 2;
        System.out.println(longestConsec(strarr2, k2)); // Output: "abigailtheta"
    }
}