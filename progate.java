package aaa;

public class progate {
  class Main {
    public static void main(String[] args) {
      String[] names = { "にんじゃわんこ", "ひつじ仙人", "ベイビーわんこ" };

      for (String name : names) {
        System.out.println("私の名前は" + name + "です");
      }

    }
  }
  
  class Main {
    public static void main(String[] args) {
      printData();
    }

    public static void printDate() {
      System.out.println("私の名前はKate Jonesです");
    }

    class Main {
      public static void main(String[] args) {
        printData("Kate Jones", 27);
        printData("John Christopher Smith", 65);
      }

      public static void printData(String name, int age) {
        System.out.println("私の名前は" + name + "です");
        System.out.println("年齢は" + age + "歳です");

      }
    }

    class Main {
      public static void main(String[] args) {
        String name = fullName("Kate", "Jones");

        printData(name, 27);

        printData("John Christopher Smith", 65);

      }

      public static void printData(String name, int age) {
        System.out.println("私の名前は" + name + "です");
        System.out.println("年齢は" + age + "歳です");
      }

      public static String fullName(String firstName, String lastName) {
        return firstName + " " + lastName;
      }

    }

    class Main {
      public static void main(String[] args) {
        printData(fullName("Kate", "Jones"), 27, 1.6, 50.0);
        printData(fullName("John", "Christopher", "Smith"), 65, 1.75, 80.0);
      }

      public static void printData(String name, int age, double height, double weight) {
        System.out.println("私の名前は" + name + "です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長は" + height + "mです");
        System.out.println("体重は" + weight + "kgです");
        double bmi = bmi(height, weight);
        System.out.println("BMIは" + bmi + "です");
        if (isHealthy(bmi)) {
          System.out.println("健康です");
        } else {
          System.out.println("健康ではありません");
        }

      }

      public static String fullName(String firstName, String lastName) {
        return firstName + " " + lastName;
      }

      public static String fullName(String firstName, String middleName, String lastName) {
        return firstName + " " + middleName + " " + lastName;
      }

      public static double bmi(double height, double weight) {
        return weight / height / height;
      }

      // isHealthyメソッドを定義してください
      public static boolean isHealthy(double bmi) {
        return 18.5 <= bmi && 25.0 > bmi;
      }
      
    }

  }
}

// java.lang.Mathを読み込んでください
import java.lang.Math;

class Person {
  public static void printData(String name, int age, double height, double weight) {
    System.out.println("私の名前は" + name + "です");
    System.out.println("年齢は" + age + "歳です");
    System.out.println("身長は" + height + "mです");
    System.out.println("体重は" + weight + "kgです");
    double bmi = bmi(height, weight);
    // Mathクラスのroundメソッドを用いて、BMIを四捨五入して出力するようにしてください
    System.out.println("BMIは" + Math.round(bmi) + "です");

    if (isHealthy(bmi)) {
      System.out.println("標準値です");
    } else {
      System.out.println("標準値の範囲外です");
    }
  }

  public static String fullName(String firstName, String lastName) {
    return firstName + " " + lastName;
  }

  public static String fullName(String firstName, String middleName, String lastName) {
    return firstName + " " + middleName + " " + lastName;
  }

  public static double bmi(double height, double weight) {
    return weight / height / height;
  }

  public static boolean isHealthy(double bmi) {
    return bmi >= 18.5 && bmi < 25.0;
  }
}
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("名前： ");

    // 変数nameを定義し、コンソールから文字列を受け取って代入してください
    String name = scanner.next();

    // 「こんにちは◯◯さん」と出力してください
    System.out.println("こんにちは" + name + "さん");
  }
}




import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("名前：");
    String firstName = scanner.next();
    System.out.print("名字: ");
    String lastName = scanner.next();
    System.out.print("年齢：");
    int age = scanner.nextInt();
    System.out.print("身長(m)：");
    double height = scanner.nextDouble();
    System.out.print("体重(kg)：");
    double weight = scanner.nextDouble();

    System.out.println("名前は" + firstName + " " + lastName + "です");
    System.out.println("年齢は" + age + "歳です");

    if (age >= 20) {
      System.out.println("成年者です");
    } else {
      System.out.println("未成年者です");
    }
    System.out.println("身長" + height + "mです");
    System.out.println("体重は" + weight + "kgです");
  }

}
