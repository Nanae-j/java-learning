public class Ex1501 {
  public static void main(String[] args) {
    
    String input;
    int total = 0;

    System.out.println("入力した数値を足し算していきます。");
    do {
      input = new java.util.Scanner(System.in).nextLine();
      if (!input.equals("exit")) {
        total += Integer.parseInt(input);
      }
    } while (!input.equals("exit"));
    
    System.out.println("合計:" + total);
  }
}
