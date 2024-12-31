package checkedAndUncheckedExceptions;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class CheckedExceptionOrCompileTimeException {



    // COMPILE TIME EXCEPTION

       // if we dont mention(declare) throws IOException/Throwable here we will get errors - those are   COMPILE TIME EXCEPTIONS
        public static void main(String[] args) throws IOException  {
            //when we give wrong path instead this corect path("C:\Users\Chinna\IdeaProjects\Java Practice\src\checkedAndUncheckedExceptions\chinnafile.txt") we will get  error
            FileReader fileReader=new FileReader("C:\\Users\\Chinna\\IdeaProjects\\Java Practice\\src\\checkedAndUncheckedExceptions\\chinnafile.txt");
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            System.out.println(bufferedReader.readLine());
            System.out.println(bufferedReader.readLine());
            System.out.println(bufferedReader.readLine());


        }
}
