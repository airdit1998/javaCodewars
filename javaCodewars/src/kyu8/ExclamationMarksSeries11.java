/*
Replace all vowel to exclamation mark in the sentence. aeiouAEIOU is vowel.


=========BEST PRACTICE=========
public class Solution {
    public static String replace(final String s) {
        return s.replaceAll("[aeiouAEIOU]", "!");
    }
}
 */

package kyu8;

public class ExclamationMarksSeries11 {
    public static void main(String[] args) {
        String ts = "aeiou";
        String t = replace(ts);
        System.out.println(t);
    }

    public static String replace(final String s) {
        String match_sting = "aeiouAEIOU";
        StringBuilder new_string = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (match_sting.contains(String.valueOf(s.charAt(i)))) {
                new_string.append("!");
            } else {
                new_string.append(s.charAt(i));
            }
        }
        return new_string.toString();
    }
}
