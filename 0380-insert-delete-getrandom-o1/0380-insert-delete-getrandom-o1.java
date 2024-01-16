class RandomizedSet {
    Set<Integer> set;
    public RandomizedSet() {
       set = new HashSet<>();
    }
    
    public boolean insert(int val) {
        return set.add(val);
    }
    
    public boolean remove(int val) {
        return set.remove(val);
    }
    
    public int getRandom() {
        Random rdm = new Random();
        int rdm_number = rdm.nextInt(set.size()), curindx = 0;
        Iterator itr = set.iterator();
        while(itr.hasNext()) {
            Object value = itr.next();
          if (curindx == rdm_number) return (int)value;
          curindx++;
        }
       return -1;

    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */