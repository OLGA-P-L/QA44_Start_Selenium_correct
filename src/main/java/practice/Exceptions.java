package practice;

public class Exceptions {
    public static void main(String[] args) {
       // method1();
        uncheckableException(1,0);
        System.out.println("++++++++++++++++++++");
    }
    public static void method1(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

            System.out.println("create exception");
        }
        finally {
            System.out.println("====================");
        }
    }
    public static void uncheckableException(int a, int b){
        int result;
        try {
            result = a/b;
        }catch (ArithmeticException exception){
            result = 0;
            System.out.println("create exception");
        }

        System.out.println(result);
    }
}
