package samplepractice;

import java.util.*;

class P4 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int n=input.nextInt();

        int[] arr=new int[n];

        for (int i=0; i<arr.length; i+=1)
        {
            arr[i]=input.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        arr[0]=55;

        Arrays.sort(arr);

        for(int element:arr)
        {
            System.out.println(element);
        }


    }
}
