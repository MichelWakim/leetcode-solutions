class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for (int n: nums1) set.add(n);
        HashSet<Integer> intersection = new HashSet<>();
        for (int n: nums2) {
            if(set.contains(n)) intersection.add(n);
        }
        
        int[] result = new int[intersection.size()];
        int idx = 0;
        for(int i: intersection) result[idx++] = i;
        return result;
    }
}