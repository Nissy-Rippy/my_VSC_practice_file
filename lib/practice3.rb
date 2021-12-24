package lib;

public class practice3 {
  public static void main(String[] args) {
    String[] languages = { "Ruby", "PHP", "Python" };

    System.out.println(languages[1]);

    languages[1] = "Java";

    System.out.println(languages[1]);

  }
}

class Main {
  public static void main(String[] args) {
    printData("Kate Jones");

    printData("John Christopher Smith");

  }

  public static void printData(String name) {
    System.out.println("私の名前は" + name + "です");

  }
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
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("名前：");
    String firstName = scanner.next();
    System.out.println("名前は" + firstName + "です");
  }
 
}

class Main {
  public static void main(String[] args) {
    Person person1 = new Person();
    person1.hello();
    
    person1.name = "Kate Jones";
    System.out.println(person1.name);
    

    Person person2 = new Person();
    person2.hello();
    
    person2.name = "John Christopher Smith";
    System.out.println(person2.name);
    
    
  }