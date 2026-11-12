package Queue;

import java.util.Queue;

public class Implementation {
    private int[] arr;
    private int front=0;
    private int size=0;
    public Implementation(){
        arr=new int[5];

    }
    public Implementation(int n){
        arr=new int[n];
    }
    public boolean isEmpty(){
        return size==0;
    }
    public boolean isFull(){
        return size==arr.length;
    }

    public void Enque(int item){

    }

}
