public class BackTracking {
    static void main() {
        int n=4;
        int tq=2; //total queen
        boolean [] board=new boolean[];
        permutation(board,tq,0,"");
    }
    public static void permutation(boolean [] board,int tq,int qpsf,String ans){
        //base case
        if(tq==qpsf){
            IO.println(ans);
            return;
        }
          //recursive call should be equal to board length
        for(int i=0;i< board.length;i++){
            if(board[i]==false){
                board[i]=true;
                permutation(board,tq,qpsf+1,ans+);
            }
        }
    }

}
