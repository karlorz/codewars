class LongestConsecFail {

    public static String longestConsec(String[] strarr, int k) {
        String[] input = strarr;
        java.util.Arrays.sort(strarr, (s1, s2) -> Integer.compare(s2.length(), s1.length()));
        String out = "";
        Integer outcount = 0;
        Integer i = 0;
        Integer n = strarr.length;
        if (n == 0 || k > n || k <= 0) {
            return "";
        }
        while (outcount < k) {
            if (i > 0 && (strarr[i] == strarr[i - 1])) {
                out = out;
            } else {
                out += strarr[i];
                outcount += 1;
            }
            i += 1;
        }

        return out;
    }
}