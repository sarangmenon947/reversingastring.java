public class reversingastring {
    // Recursive Method To Reverse A String
    public static String reverse(String str) {
        if (str.isEmpty()) {
            return str;
        } else {
            return reverse(str.substring(1)) + str.charAt(0);
        }}
    public static void main(String[] args) {
        String original = "Hello";
        String reversed = reverse(original);
        System.out.println("Original String: " + original);
        System.out.println("Reversed String :" + reversed);
    }}
