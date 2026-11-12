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

    public void Enque(int item) throws Exception {
        if(isFull()){
            throw new Exception("Baklol queue full hai");
        }
        int idx=(front+size)%arr.length;
        arr[size]=item;
        size++;
    }
    public int Dequeue() throws Exception{
        if(isEmpty()){
            throw new Exception("Baklol queue full hai");
        }
        int rv=arr[front];
        front=(front+1)%arr.length;
        size--;
        return rv;
    }
    public int getFront() throws Exception{
        if(isEmpty()){
            throw new Exception("Baklol queue full hai");
        }
        int rv=arr[front];
        return rv;
    }




}
