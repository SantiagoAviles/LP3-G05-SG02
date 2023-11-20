public class Main {
    public static <T> boolean esIgualA(T arg1, T arg2) {
        if (arg1 == null || arg2 == null) {
            return arg1 == arg2;
        } else {
            return arg1.equals(arg2);
        }
    }


    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println(esIgualA(obj1, obj1)); // true
        System.out.println(esIgualA(obj1, obj2)); // false
        System.out.println(esIgualA(obj1, null)); // false
        System.out.println(esIgualA(null, null)); // true


        Integer int1 = 5;
        Integer int2 = 5;
        System.out.println(esIgualA(int1, int2)); // true


        Double dbl1 = 5.0;
        Double dbl2 = 5.0;
        System.out.println(esIgualA(dbl1, dbl2)); // true


        String str1 = "Hola";
        String str2 = "Hola";
        System.out.println(esIgualA(str1, str2)); // true
    }
}

