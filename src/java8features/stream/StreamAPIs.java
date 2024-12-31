package java8features.stream;

import java.util.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.LongPredicate;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamAPIs {
    public static void main(String[] args) {
//1.terminal -return type non stream
        //2.intermediate -return type is Stream

        Scanner input=new Scanner(System.in);
        System.out.println("please enter the value of n\n");
        int n=input.nextInt();

      /*  long[] longArray =new long[n];

        for (int i=0;i<longArray.length;i++){
            System.out.println("Enter the value and click enter");
            longArray[i]=input.nextInt();
        }*/

        long[] longArray={12,13,14,15,16};
        LongStream longStream = Arrays.stream(longArray);

        // Predicate<Long> predicate=x->x%2==0;
        LongPredicate predicate = x -> x % 2 == 0;
        longStream.filter(x -> x % 2 == 0).skip(1).forEach(System.out::println);




        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6);
        //System.out.println(integerStream.count());
        // Consumer<Integer> integerConsumer=x -> System.out.println(x*x);
        //  integerStream.forEach(System.out::println);


        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(11);
        list.add(111);
        list.add(1111);
        Stream<Integer> eStream = list.stream();
        eStream.forEach(System.out::println);
    }
}
