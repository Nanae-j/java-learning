class Ex1001 {
  public static void main(String[] args) {
    System.out.println("1行の整数を入力してください");
    String str = new java.util.Scanner(System.in).nextLine();
    int a = Integer.parseInt(str);

    if (1 < a && a < 100) {
      System.out.println(a + "は1～100の範囲内です。");
    } else {
      System.out.println(a + "は1～100の範囲外です。");
    }
  }
}
