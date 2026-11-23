class ProductOfNumbers {
    ArrayList<Integer> arr;
    public ProductOfNumbers() {
        arr = new ArrayList<>();
        arr.add(1);
    }
    
    public void add(int num) {
        if(num==0)
        {
            arr.clear();
            arr.add(1);
        }else{
            arr.add(arr.get(arr.size()-1)*num); // multiply with the last element of the array
        }
    }
    
    public int getProduct(int k) {
        int n = arr.size();
        if(k>=n) return 0;
    return arr.get(n-1)/arr.get(n-1-k);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */