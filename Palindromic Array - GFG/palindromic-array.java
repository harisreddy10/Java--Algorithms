//{ Driver Code Starts
import java.util.*;
class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.palinArray(a , n));
		}
	}
}
// } Driver Code Ends


/*Complete the Function below*/
class GfG
{
	public static int palinArray(int[] a, int n)
           {
                 for(int b:a){
                     String num=String.valueOf(b);
                     if(!ispalin(num)){
                         return 0;
                     }
                 }
                 return 1;
           }
         public static boolean ispalin(String str){
             int start=0;
             int end =str.length()-1;
             while(start<end){
                 if(str.charAt(start)!=str.charAt(end)){
                     return false;
                 }
                 start++;
                 end--;
             }
             return true;
         }
}