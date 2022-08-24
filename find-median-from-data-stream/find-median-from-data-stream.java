class MedianFinder {
    // using inseertion sort
    private List<Integer> nums;

    public MedianFinder() {
        nums = new ArrayList<Integer>();
    }
    
    public void addNum(int num) {
        int index = Collections.binarySearch(nums, num);         
        // if not found it return  (-(insertion point) - 1)
        if(index < 0) index = - (index + 1);
        nums.add(index, num);
    }
    
    public double findMedian() {
        int middle = nums.size() / 2;
        if (nums.size() % 2 == 0) {
            return (nums.get(middle) + nums.get(middle - 1)) / 2.0;
        } else return (double) nums.get(middle);
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */