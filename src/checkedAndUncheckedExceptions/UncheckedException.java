package checkedAndUncheckedExceptions;

import java.util.*;

public class UncheckedException {
    //Run time exception
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            if (name == null || name.equals("")) {
                throw new CustomException("name is null or empty");
            }
            System.out.println(name);
        } catch (CustomException throwable) {
            System.out.println(throwable);
        } catch (Throwable throwable) {
            System.out.println(throwable);
        }

    }
}
