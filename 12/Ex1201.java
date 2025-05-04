public class Ex1201 {
  public static void main(String[] args) {
    System.out.println("1~13のいずれかを入力してください >");
    String printStr = new java.util.Scanner(System.in).nextLine();
    int print = Integer.parseInt(printStr);

    switch (print) {
      case 1:
        System.out.println("カードは、Aです。");
        break;
      case 11:
        System.out.println("カードは、Jです。");
        break;
      case 12:
        System.out.println("カードは、Qです。");
        break;
      case 13:
        System.out.println("カードは、Kです。");
        break;
      default:
        System.out.println("カードは、" + print + "です。");
    }
  }
}
