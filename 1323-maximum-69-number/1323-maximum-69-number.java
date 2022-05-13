class Solution {
    public int maximum69Number (int num) {
        return Integer.parseInt(
            // convert int to string and replace the first 6 left by 9 
            String.valueOf(num).replaceFirst("6", "9")
        );
    }
}