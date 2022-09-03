class Solution {
     public int[] fullBloomFlowers(int[][] flowers, int[] persons) { 
            TreeMap<Integer, Integer> tm = new TreeMap<>();
            tm.put(0,0);
            for(int[] f : flowers){
                tm.put(f[0], tm.getOrDefault(f[0],0) + 1);
                tm.put(f[1]+1, tm.getOrDefault(f[1]+1,0) - 1);
            }

            List<Integer> al = new ArrayList<>();
            int sum = 0;
            for(int v : tm.values()){
                sum += v;
                al.add(sum);
            }
            List<Integer> keys = new ArrayList<>(tm.keySet());
            int[] ans = new int[persons.length];
            int ptr = 0;
            for(int p: persons){
                int idx = Collections.binarySearch(keys, p);
                if (idx < 0) idx = -idx-2;
                ans[ptr++] = al.get(idx);
            }    
            return ans;
        }
}