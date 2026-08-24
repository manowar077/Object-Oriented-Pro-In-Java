package Array;

public class Book_Allocation {
    static void main() {
        int[] page={10,20,30,40};
        int nos=2; //no of student
        IO.println(Mainpage(page,nos));
    }
    public static int Mainpage(int[] page , int nos){
        int low=0;
        int high=0;
        for(int i=0;i<page.length;i++){
            high+=page[i];
        }
        int ans=0;
        while(low<=high){
            int mid=(high+low)/2;
            if(itisposible(page,nos,mid)==true){
                ans=mid;
                high=mid-1;

            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }

    private static boolean itisposible(int[] page, int nos, int mid) {
        return false;
    }
}
