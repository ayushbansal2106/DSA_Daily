class Solution {
    public boolean isAnagram(String s, String t) {
        int n=s.length();
        int m=t.length();
        if(n!=m){
            return false;
        }
        char arr[]=new char[n];
        char ar[]=new char[m];
        for(int i=0;i<n;i++){
            arr[i]=s.charAt(i);
        }
        for(int i=0;i<n;i++){
            ar[i]=t.charAt(i);
        }
        Arrays.sort(arr);
        Arrays.sort(ar);
        for(int i=0;i<n;i++){
            if(arr[i]!=ar[i]){
                return false;
            }
        }
        return true;
    }
}