//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            int n = Integer.parseInt(stt.nextToken());
            int m = Integer.parseInt(stt.nextToken());
            // int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.smallestSubWithSum(a, n, m));
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Solution {

    public static int smallestSubWithSum(int a[], int n, int x) {
         int start=0;
       
         int minLen=Integer.MAX_VALUE;
         int sum=0;
         for(int end=0;end<a.length;end++){
             sum+=a[end];
             while(sum>x){
                 minLen=Math.min(minLen,end-start+1);
                 sum-=a[start];
                 start++;
             }
         }
         return (minLen==Integer.MAX_VALUE)?0:minLen;
    }
}

