package samplepractice;

import java.util.*;

class P5 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int[] arr=new int[3];

        System.out.println("Enter the first array inputs");

        for(int i=0;i<3;i++)
        {
            arr[i]=input.nextInt();
        }
        int[] arr1=new int[4];
        System.out.println("Enter the second array inputs");
        for(int i=0;i<4;i++)
        {
            arr1[i]=input.nextInt();
        }

        int[] concatArr=new int[arr.length+arr1.length];
        System.arraycopy(arr, 0, concatArr,0, arr.length);
        System.out.println(Arrays.toString(concatArr));
        System.arraycopy(arr1,0,concatArr,arr.length,arr1.length);
        System.out.println(Arrays.toString(concatArr));

           //substring
        int[] slicedString=Arrays.copyOfRange(arr,0,arr.length);
        System.out.println(Arrays.toString(slicedString));

    }
}
