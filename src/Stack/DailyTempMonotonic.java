package Stack;

public class DailyTempMonotonic {
    public static void main(String[] args){
      int[] temp= new int[]{73, 74, 75, 71, 69, 72, 76, 73};
      int n=temp.length;

      int[] ans= new int[n];

      for(int i=0;i<n;i++){
        //forindex i we want to find the ans
        //for each index  i move in the right direction and search for a warmer day and we can store 
        //get the number of days and we can store it in an array
        for(int j=i+1;j<n;j++){
            if(temp[j]>temp[i]){
                //warmer day mil gyaa 
                int days=j-i;
                ans[i]=days;
                break;
            }
        }
      }
    }
}
