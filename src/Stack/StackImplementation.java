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
    public int po(int item){
       int rv=arr[top];
       top--;
       return rv;
    }
    public int peek(int item){
       int rv=arr[top];
       return rv;
    }

    public int size(){
       return top+1;
    }
    public void display(){
       for(int i=0;i<=top;i++){
           IO.println(arr[i]+" ");

       }
        IO.println();
    }
}
