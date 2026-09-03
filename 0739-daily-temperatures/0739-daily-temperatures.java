class Solution {
    public int[] dailyTemperatures(int[] t) {
        int[] a=new int[t.length];
        Stack<Integer> st = new Stack<>();
        for(int x=0;x<t.length;x++){
            while(!st.isEmpty()&&t[st.peek()]<t[x])
             a[st.peek()]=x-st.pop();
            st.push(x);
        }
        return a;
    }
}