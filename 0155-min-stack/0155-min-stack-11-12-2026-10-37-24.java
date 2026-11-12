class MinStack {
    int[] arr;
    int[] minArr;
    int i = 0;

    public MinStack() {
        arr = new int[30000];
        minArr = new int[30000];
    }
    
    public void push(int value) {
        arr[i] = value;
        if (i == 0) {
            minArr[i] = value;
        } else {
            minArr[i] = Math.min(value, minArr[i - 1]);
        }
        i++;
    }
    
    public void pop() {
        i--;
    }
    
    public int top() {
        return arr[i - 1];
    }
    
    public int getMin() {
        return minArr[i - 1];
    }
}
