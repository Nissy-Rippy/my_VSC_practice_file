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

package exception;

public class Exception03 {
    public static void main(String[] args) {
        try {
            Exception03.division(100, 0);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException例外が発生");
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException例外が発生");
            throw e;
        }
        System.out.println("プログラム終了");
    }

    public static void division(int a, int b) {
        System.out.println(a + " ÷ " + b + " は？");
        if (b == 0) {
            throw new IllegalArgumentException("引数が不正です");
        }
        int result = a / b;
        System.out.println("計算結果" + result);
    }
}




public class Ready01 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
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

package exception;

public class Exception03 {
    public static void main(String[] args) {
        try {
            Exception03.division(100, 0);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException例外が発生");
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException例外が発生");
            throw e;
        }
        System.out.println("プログラム終了");
    }

    public static void division(int a, int b) {
        System.out.println(a + " ÷ " + b + " は？");
        if (b == 0) {
            throw new IllegalArgumentException("引数が不正です");
        }
        int result = a / b;
        System.out.println("計算結果" + result);
    }
}

package extend.human;

public class Human {
    private String name;
    protected int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}


package extend.human;

public class Student extends Human {
    private int score;

    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    public String getStudentProfile() {
        String profile = "年齢は" + super.age + "です。";
        profile += "学生で、テストの点数は" + this.score + "点です。";
        return profile;
    }
}

package extend.human;

public class Employee extends Human {
    private String department;

    public Employee(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public String getEmployeeProfile() {
        String profile = "年齢は" + this.age + "です。";
        profile += "サラリーマンで、部署は" + this.department + "です。";
        return profile;
    }
}


import extend.human.Employee;
import extend.human.Human;
import extend.human.Student;

public class Extend01 {
    public static void main(String[] args) {
        Human sugimoto = new Human("杉本", 16);
        System.out.println("Humanクラスのメソッド：名前は、" + sugimoto.getName());

        Student sato = new Student("佐藤", 17, 70);
        System.out.println("Humanクラスのメソッド：名前は、" + sato.getName());
        System.out.println("Studentクラスのメソッド：プロフィールを紹介します。" + sato.getStudentProfile());

        Human human = new Employee("田中", 28, "システム部");
        System.out.println("Humanクラスのメソッド：名前は、" + human.getName());

        Employee tanaka = (Employee) human;
        System.out.println("Employeeクラスのメソッド：プロフィールを紹介します。" + tanaka.getEmployeeProfile());

        Extend01.printName(sugimoto);
        Extend01.printName(sato);
        Extend01.printName(tanaka);
    }

    public static void printName(Human human) {
        System.out.println("Humanクラスのメソッド：名前は、" + human.getName());
    }
}

package extend.animal;

public abstract class Animal {
    protected String name;

    public void eat() {
        System.out.println(name + "が食事をしました！");
    }

    public abstract void cry();
}


package extend.animal;

public class Dog extends Animal {

    public Dog() {
        this.name = "犬";
    }

    public void cry() {
        System.out.println(this.name + "が吠えました。ワン！ワン！");
    }
}

package extend;

import extend.animal.Dog;

public class Abstract01 {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.eat();
        dog.cry();
    }
}


package extend.animal;

public abstract class Animal {
    protected String name;
    public void eat() {
        System.out.println(name + "が食事をしました！");
    }

    public abstract void cry();
}package extend.phone;

public interface Phone {
    int MAX_NUMBER_DIGITS = 11;

    public void call(String number);
}

package extend.phone;

public interface Camera {

    public void takePicture();
}

package extend.phone;

public class MobilePhone implements Phone, Camera {
    private String number;

    public MobilePhone(String number) {
        this.number = number;
    }

    public void takePicture() {
        System.out.println("写真をとります。");
    }

    public void call(String number) {
        System.out.println(this.number + " から " + number + " に電話をかけます。");
    }
}

package extend;

import extend.phone.Camera;
import extend.phone.MobilePhone;

public class Interface01 {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("000-1111-2222");

        System.out.println("電話番号は最大" + MobilePhone.MAX_NUMBER_DIGITS + "桁です。");
        mobilePhone.call("99-8888-7777");
        Interface01.classTakePicture(mobilePhone);
    }

    public static void classTakePicture(Camera camera) {
        camera.takePicture();
    }
}

package practice;

import extend.phone.MobilePhone;
import extend.phone.Phone;

public class Chapter13 {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("000-1111-2222");
        mobilePhone.takePicture();
        Chapter13.staticCall(mobilePhone, "99-8888-7777");
        mobilePhone.powerOff();

        FlyingPhone flyingPhone = new FlyingPhone(5);
        flyingPhone.fly();
        Chapter13.staticCall(flyingPhone, "000-1111-2222");
        flyingPhone.powerOff();
    }

    public static void staticCall(Phone phone, String number) {
        phone.call(number);
    }
}

package practice;

public interface Flying {

    void fly();

    default void powerOff() {
        System.out.println("飛んでいる場合は落下します。");
    }
}

package practice;

import extend.phone.Phone;

public class FlyingPhone implements Phone, Flying {
}


public class Ready01 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
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

package exception;

public class Exception03 {
    public static void main(String[] args) {
        try {
            Exception03.division(100, 0);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException例外が発生");
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException例外が発生");
            throw e;
        }
        System.out.println("プログラム終了");
    }

    public static void division(int a, int b) {
        System.out.println(a + " ÷ " + b + " は？");
        if (b == 0) {
            throw new IllegalArgumentException("引数が不正です");
        }
        int result = a / b;
        System.out.println("計算結果" + result);
    }
}

package extend.human;

public class Human {
    private String name;
    protected int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}


package extend.human;

public class Student extends Human {
    private int score;

    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    public String getStudentProfile() {
        String profile = "年齢は" + super.age + "です。";
        profile += "学生で、テストの点数は" + this.score + "点です。";
        return profile;
    }
}

package extend.human;

public class Employee extends Human {
    private String department;

    public Employee(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public String getEmployeeProfile() {
        String profile = "年齢は" + this.age + "です。";
        profile += "サラリーマンで、部署は" + this.department + "です。";
        return profile;
    }
}


import extend.human.Employee;
import extend.human.Human;
import extend.human.Student;

public class Extend01 {
    public static void main(String[] args) {
        Human sugimoto = new Human("杉本", 16);
        System.out.println("Humanクラスのメソッド：名前は、" + sugimoto.getName());

        Student sato = new Student("佐藤", 17, 70);
        System.out.println("Humanクラスのメソッド：名前は、" + sato.getName());
        System.out.println("Studentクラスのメソッド：プロフィールを紹介します。" + sato.getStudentProfile());

        Human human = new Employee("田中", 28, "システム部");
        System.out.println("Humanクラスのメソッド：名前は、" + human.getName());

        Employee tanaka = (Employee) human;
        System.out.println("Employeeクラスのメソッド：プロフィールを紹介します。" + tanaka.getEmployeeProfile());

        Extend01.printName(sugimoto);
        Extend01.printName(sato);
        Extend01.printName(tanaka);
    }

    public static void printName(Human human) {
        System.out.println("Humanクラスのメソッド：名前は、" + human.getName());
    }
}

package extend.animal;

public abstract class Animal {
    protected String name;

    public void eat() {
        System.out.println(name + "が食事をしました！");
    }

    public abstract void cry();
}


package extend.animal;

public class Dog extends Animal {

    public Dog() {
        this.name = "犬";
    }

    public void cry() {
        System.out.println(this.name + "が吠えました。ワン！ワン！");
    }
}

package extend;

import extend.animal.Dog;

public class Abstract01 {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.eat();
        dog.cry();
    }
}


package extend.animal;

public abstract class Animal {
    protected String name;
    public void eat() {
        System.out.println(name + "が食事をしました！");
    }

    public abstract void cry();
}package extend.phone;

public interface Phone {
    int MAX_NUMBER_DIGITS = 11;

    public void call(String number);
}

package extend.phone;

public interface Camera {

    public void takePicture();
}

package extend.phone;

public class MobilePhone implements Phone, Camera {
    private String number;

    public MobilePhone(String number) {
        this.number = number;
    }

    public void takePicture() {
        System.out.println("写真をとります。");
    }

    public void call(String number) {
        System.out.println(this.number + " から " + number + " に電話をかけます。");
    }
}

package extend;

import extend.phone.Camera;
import extend.phone.MobilePhone;

public class Interface01 {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("000-1111-2222");

        System.out.println("電話番号は最大" + MobilePhone.MAX_NUMBER_DIGITS + "桁です。");
        mobilePhone.call("99-8888-7777");
        Interface01.classTakePicture(mobilePhone);
    }

    public static void classTakePicture(Camera camera) {
        camera.takePicture();
    }
}

package practice;

import extend.phone.MobilePhone;
import extend.phone.Phone;

public class Chapter13 {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("000-1111-2222");
        mobilePhone.takePicture();
        Chapter13.staticCall(mobilePhone, "99-8888-7777");
        mobilePhone.powerOff();

        FlyingPhone flyingPhone = new FlyingPhone(5);
        flyingPhone.fly();
        Chapter13.staticCall(flyingPhone, "000-1111-2222");
        flyingPhone.powerOff();
    }

    public static void staticCall(Phone phone, String number) {
        phone.call(number);
    }
}

package practice;

public interface Flying {

    void fly();

    default void powerOff() {
        System.out.println("飛んでいる場合は落下します。");
    }
}

package practice;

import extend.phone.Phone;

public class FlyingPhone implements Phone, Flying {
}


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

package capsule.human;

public class HumanNoCapsule {
    public String name;
    public int age;

    public HumanNoCapsule(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
・HumanCapsule.java

package capsule.human;

public class HumanCapsule {
    private String name;
    private int age;

    public HumanCapsule(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }
}


package capsule;

import capsule.human.HumanCapsule;
import capsule.human.HumanNoCapsule;

public class Capsule01 {
    public static void main(String[] args) {
        HumanNoCapsule human1 = new HumanNoCapsule("田中", 28);
        human1.name = "今田";
        human1.age = 70;
        System.out.println("名前は" + human1.name + ", 年齢は" + human1.age + "です。");

        HumanCapsule human2 = new HumanCapsule("小林", 32);
        System.out.println("名前は" + human2.getName() + ", 年齢は" + human2.getAge() + "です。");
        human2.setName("佐々木");
        System.out.println("変更した名前は" + human2.getName() + "です。");
    }
}

package capsule.human;

public class HumanCapsule {
    private String name;
    private int age;

    public HumanCapsule(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }
}

package capsule.human;

public class HumanCapsule {
    private String name;
    private int age;

    public HumanCapsule(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }
}
