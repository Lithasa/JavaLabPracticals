public class Main{

    public static void main(String[] args) {

        System.out.println(add(5,7));
        System.out.println(subtract(10,5));
        System.out.println(multiply(10,5));
        System.out.println(divide(10,5));


    }
    public static int add(int a , int b) {
        int sum;
        sum = a + b;
        return sum;
    }
        public static int subtract(int x , int y) {
            int difference;
            difference = x - y;
            return difference;
        }

    public static int multiply(int x , int y) {
        int mul;
        mul = x * y;
        return mul;
    }
    public static int divide(int x , int y) {
        int div;
        div = x / y;
        return div;
    }

    }



