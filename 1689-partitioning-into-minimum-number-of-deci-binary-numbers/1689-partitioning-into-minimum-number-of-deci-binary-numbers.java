class Solution {
    public int minPartitions(String n) {
        /*
        String chars() method returns an IntStream
        max() to return the max interger value
        getAsInt() to return the int value 
        - '0' to sub the intval of the string zero from the value of the string of the number
        */
        return n.chars().max().getAsInt() -'0';
    }
}