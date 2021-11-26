public class Human01 {
    public String name;
    public int age;

    public Human01() {
        name = "山田";
        age = 20;
    }
    public Human01(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

package exception;

public class Exception01 {
    public static void main(String[] args) {
        System.out.println("100 ÷ 0 は？");
        int result = 100 / 0;
        System.out.println("計算結果" + result);
        System.out.println("プログラム終了");
    }
}

100 ÷ 0 は？
Exception in thread "main" java.lang.ArithmeticException: / by zero
    at Exception01.main(Exception01.java:5)


    package exception;

public class Exception01 {
    public static void main(String[] args) {
        System.out.println("100 ÷ 0 は？");
        int result = 100 / 0;
        System.out.println("計算結果" + result);
        System.out.println("プログラム終了");
    }
}

package exception;

public class Exception02 {
    public static void main(String[] args) {
        try {
            System.out.println("100 ÷ 0 は？");
            int result = 100 / 0;
            System.out.println("計算結果" + result);
        } catch (ArithmeticException e) {
            System.out.println("例外が発生");
        } finally {
            System.out.println("プログラム終了");
        }
    }
}