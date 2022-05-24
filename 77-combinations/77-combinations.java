class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<Integer>(), k, 1, n - k + 1);
        return list;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int k, int start, int end) {
       if (tempList.size() == k) list.add(new ArrayList<>(tempList)); 
       else{
          for (int i = start; i <= end; i++) {
             tempList.add(i);
             backtrack(list, tempList, k, i + 1, end + 1);
             tempList.remove(tempList.size() - 1);
          }
       }
    }
}