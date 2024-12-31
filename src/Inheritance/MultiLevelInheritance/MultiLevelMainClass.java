package Inheritance.MultiLevelInheritance;

public class MultiLevelMainClass {

        public static void main(String[] args)
        {
            ArabianHorseSubClass arabianHorse = new ArabianHorseSubClass();
            System.out.println(arabianHorse.eat());
            System.out.println(arabianHorse.run());
            System.out.println(arabianHorse.displaySkill());
        }
}
