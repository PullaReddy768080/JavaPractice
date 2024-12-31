package samplepractice;
import java.util.Scanner;

public class P3

{




        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("please enter the no. of values");
            int n=input.nextInt();
            for (int i=0; i<=n; i++)
            {
                int id = input.nextInt();
                System.out.println(id);
            }



            input.close();  // closing Scanner object
        }




}
