// https://practice.geeksforgeeks.org/problems/reverse-a-string/1
class Reverse {
    public static String reverseWord(String str) {
        if (str.isEmpty()) {
            return "";
        }
        return reverseWord(str.substring(1)) + str.charAt(0);
    }
}