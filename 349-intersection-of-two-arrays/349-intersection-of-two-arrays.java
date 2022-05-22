class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for (int n: nums1) set.add(n);
        // HashSet<Integer> intersection = new HashSet<>();
        // for (int n: nums2) {
        //     if(set.contains(n)) intersection.add(n);
        // }
        HashSet<Integer> set2 = new HashSet<Integer>();
        for (Integer n : nums2) set2.add(n);

        set.retainAll(set2);
        
        // int[] result = new int[intersection.size()];
        // int idx = 0;
        // for(int i: intersection) result[idx++] = i;
        // return result;
        int [] output = new int[set.size()];
        int idx = 0;
        for (int s : set) output[idx++] = s;
        return output;
    }
}