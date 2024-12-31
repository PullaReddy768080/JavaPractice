package Polymorphism.MethodOverloading.CompileTimePolymorphism;

public class ShapeClass

{
        public String area(int radius) {
            float x= (float) (3.14 * radius * radius);
            return "area is " + x;
        }

        public String area(double base, double height) {
            float x= (float)(0.5 * base * height);
            return "area is " + x;
        }

        public String area(int length, int breadth) {
            int x=(length* breadth);
            return "area is "+ x;
        }



}
