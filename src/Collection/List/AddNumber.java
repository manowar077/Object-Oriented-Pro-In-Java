package Collection.List;

import java.util.ArrayList;

public class AddNumber {
    static void main() {
        int[] arr1={2,3,4,5,6};
        int[] arr2={8,3,5,6,7,8,9,};
        AddNum(arr1,arr2);


    }
    public static void AddNum(int[] arr1,int[] arr2){
        ArrayList<Integer> list=new ArrayList<>();
        int i=arr1.length-1;
        int j=arr2.length-1;
        int carry=0;

        while(i>=0 && j>=0){
            int sum=arr1[i]+arr2[i]+carry;
            list.add(sum%10);
            carry=sum/10;
            i--;
            j--;

        }
        while(i>=0){
            int sum=arr1[i]+carry;
            list.add(sum%10);
            carry=sum/10;
            i--;
        }
        while(j>=0){
            int sum=arr1[j]+carry;
            list.add(sum%10);
            carry=sum/10;
            j--;
        }
        if(carry>0){
            list.add(carry);
        }
        for(int k=list.size()-1;k>=0;k--){
            IO.println(list.get(k)+" ");
        }
    }
}
