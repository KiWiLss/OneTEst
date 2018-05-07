import com.kiwi.kotlin.demo_local.User;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaOne {
    public static void main(String[] args) {
       /* System.out.println("javatest");
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
        System.out.println(i);*/

        System.out.println(containSpace("jfieije"));
        System.out.println(containSpace("jfieije "));
        System.out.println(containSpace("jfi eije"));
        System.out.println(containSpace("jfi    eije"));

        System.out.println(checkBlank("jfeifi"));
        System.out.println(checkBlank("jfeifi "));
        System.out.println(checkBlank("jfe ifi "));
        System.out.println(checkBlank("jfe ifi"));

    }

    /**检测是否含有空格
     * @param str
     * @return 含有空格返回true
     */
    private static boolean checkBlank(String str){
        Pattern pattern = Pattern.compile("[\\s]+");
        Matcher matcher = pattern.matcher(str);
        boolean flag = false;
        while (matcher.find()) {
            flag = true;
        }
            return flag;
    }

    /**检测是否含有空格
     * @param phone
     * @return true不含false含有空格
     */
    public static boolean containSpace(String phone) {
        Pattern pattern = Pattern.compile("[0-9a-zA-Z\u4E00-\u9FA5]+");
        Matcher matcher = pattern.matcher(phone);
        return matcher.matches();
    }

    /**
     * @param a
     * @param b
     */
    public static void fun(int a,int b){
        System.out.println(a+b);
    }

}


