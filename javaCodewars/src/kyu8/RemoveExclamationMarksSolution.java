package kyu8;

public class RemoveExclamationMarksSolution {
    public static void main(String[] args) {
        String s = "Hello World!";

        System.out.println(removeExclamationMarks(s));
    }

    static String removeExclamationMarks(String s) {
        return s.replaceAll("!", "");
    }
}
