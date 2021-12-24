public class Chapter07 {
  public static void main(String[] args){
    int distance = 0;
    if (distance <= 5){
      System.out.println("とても近いです");
    } else if (5 <= distance && distance <= 10) {
      System.out.println("近いです");
    } else {
      System.out.println("遠いです");
    }

    String color = "yellow"; // 例としてyellowで初期化。他の色でも良い
    switch (color) {
      case "red":
        System.out.println("赤信号です");
        break;
      case "yellow":
        System.out.println("黄信号です");
        break;
      case "blue":
        System.out.println("青信号です");
        break;
      default:
        System.out.println("信号の色ではありません");
    }
  }
}
