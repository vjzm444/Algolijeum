
package AlgolijeumTest.test1;

public class Foo {

    public static void main(String[] args) {

        A a = new A();
        System.out.println(a.m(1.2, 2));

    }
}

class A{
        float m (float x, float y){
        return x + y + 1;
    }

    double m (double x, double y){
        return x + y + 2;
    }

    int m (int x , int y){
            return  x + y + 3;
    }

}


