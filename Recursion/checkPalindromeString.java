public class checkPalindromeString {
    static boolean checkString(String str, int low, int high) {
        char[] arr = str.toCharArray();
        if (low >= high)
            return true;
        else if (arr[low] != arr[high])
            return false;
        else
            return checkString(str, low + 1, high - 1);
    }

    public static void main(String[] args) {
        String str = "civic";
        System.out.println(checkString(str, 0, str.length() - 1));
    }
}
