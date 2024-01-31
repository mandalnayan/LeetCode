class MedianFinder {
    Queue<Integer> minpq ;
    Queue<Integer> maxpq;
    public MedianFinder() {
      maxpq = new PriorityQueue<>(Collections.reverseOrder());
      minpq = new PriorityQueue<>();
    }
    
    public void addNum(int num) {

      if (maxpq.isEmpty()) maxpq.add(num);
      else if (maxpq.peek() > num){                         minpq.add(maxpq.poll());
          maxpq.add(num);
        }                                         
      else minpq.add(num);
      
      if(minpq.size() > maxpq.size()) maxpq.add(minpq.poll());
    }
    
    public double findMedian() {
      if (maxpq.size() > minpq.size()) return maxpq.peek();
      double a = minpq.peek();
      double b = maxpq.peek();
      double m = (a+b)/2;
      return m;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */