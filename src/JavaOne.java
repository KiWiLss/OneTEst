import java.util.HashMap;
import java.util.LinkedList;

public class JavaOne {
    public static void main(String[] args) {
        System.out.println("javatest");
        fun(3,5);


        int a;
        a=4;
        final int b = 5;

        LinkedList<String> linkedList = new LinkedList<>();

        HashMap<String, String> map = new HashMap<>();

        String test="Android";
        int d = test.lastIndexOf("d");
        System.out.println(d);
        int i = test.lastIndexOf(2);
        System.out.println(i);


    }


    /**
     * @param a
     * @param b
     */
    public static void fun(int a,int b){
        System.out.println(a+b);
    }

}


