//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Driverclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int k = sc.nextInt();

            System.out.println(new Solution().countOccurence(arr, n, k));
        }
    }
}

// } Driver Code Ends


class Solution 
{
    //Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int n, int k) 
    
    {
        int m=n/k;
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int ab:arr){
            if(map.containsKey(ab)){
                map.put(ab,map.get(ab)+1);
            }else{
                map.put(ab,1);
            }
        }
        for(Map.Entry<Integer,Integer> entry :map.entrySet()){
            if(entry.getValue()>m){
                ans.add(entry.getKey());
            }
        }
        return ans.size();
    }
}
