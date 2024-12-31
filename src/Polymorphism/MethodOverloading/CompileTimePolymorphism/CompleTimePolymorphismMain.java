package Polymorphism.MethodOverloading.CompileTimePolymorphism;

public class CompleTimePolymorphismMain

{
    public static void main(String[] args)
    {
        ShapeClass areaValue = new ShapeClass();
//        ShapeClass triangle = new ShapeClass();
//        ShapeClass rectangle = new ShapeClass();

        System.out.println(areaValue.area(5, 3));
        System.out.println(areaValue.area(10));
        System.out.println(areaValue.area(8.5, 10.23));

    }

}
