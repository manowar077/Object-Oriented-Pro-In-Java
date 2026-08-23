package Array;

import java.util.Arrays;
import java.util.Scanner;

public class AggressiveCows {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int nos=sc.nextInt();
        int noc=sc.nextInt();
        int[] stall = new int[nos];
        for(int i = 0; i<stall.length; i++){
            stall[i]=sc.nextInt();
        }
        Arrays.sort(stall);
    }
    public static void Mindistance(int[] stall ,int noc){
        int low=stall[0];
        int high=stall[stall.length-1];
        while(low<=high){
            int mid=(low+high)/2;
            int ans=0;
            if(isitPossible(stall,noc,mid)==true){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
        
    }
}
