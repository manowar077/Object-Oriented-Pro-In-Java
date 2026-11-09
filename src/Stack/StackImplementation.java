package Stack;

public class StackImplementation {
   private int[] arr;
   private int top=-1;

   public StackImplementation(){
       arr=new int[5];
   }
   public StackImplementation(int n){
       arr=new int[n];
   }

   public boolean isEmpty(){
       return top==-1;
   }
   public boolean isfull(){
       return top==arr.length-1;
   }
    public void push(int item) {
        if (isfull()) {
            throw new RuntimeException("Baklol, stack full hogaya hai!");
        }

        top++;
        arr[top] = item;
    }
}
