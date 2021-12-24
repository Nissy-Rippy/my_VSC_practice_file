
package classMethod;

import classMethod.human.Human02;

public class ClassMethod02 {
  public static void main(String[] args) {
    Human02 yamada = new Human02();
    System.out.println("私の名前は" + yamada.name + "です.年は" +  yamada.age + "です");

    Human02 sate = new Human02("佐藤", 33);
    System.out.println("私の名前は" + sate.name + "です" + "年は" +  sate.age + "です");
  }
}
