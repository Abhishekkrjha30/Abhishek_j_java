package operators;

public class Uniary {
    public static void main(String args[]){
        int a=3;
        float b=1.2f;
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a);
        System.out.println(++b);
        System.out.println(b);
        System.out.println(a++ - ++a);
        System.out.println(--a - b++);
        System.out.println(b+" " + a);


    }
}
