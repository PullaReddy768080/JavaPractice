package checkedAndUncheckedExceptions;
import java.io.*;

public class CheckedExceptions
{

        //compile time exceptions
        public static void main(String[] args) {
            try {

                FileReader fileReader = new FileReader("C:\\Users\\Chinna\\IdeaProjects\\Java Practice\\src\\checkedAndUncheckedExceptions\\chinnafile.txt");
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                System.out.println(bufferedReader.readLine());

            } catch (FileNotFoundException throwable) {
                System.out.println(throwable);
            } catch (IOException throwable) {
                System.out.println(throwable);
            } catch (Throwable throwable) {
                System.out.println(throwable);
            } finally {
                 // it will print everything in this block irrespective of the condition/exception.
            }


        }

        public void throwsException(String[] args) throws Throwable {
            FileReader fileReader = new FileReader("src/exceptions/test.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            System.out.println(bufferedReader.readLine());

        }
}


