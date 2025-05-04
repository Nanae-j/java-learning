class Ex1101 {
  public static void main(String[] args) {
    System.out.println(" 点数を入力してください");
    String pointStr = new java.util.Scanner(System.in).nextLine();
    int point = Integer.parseInt(pointStr);

    if (point >= 80) {
      System.out.println("評価: A評価");
    } else if (point >= 60 && point < 80) {
      System.out.println("評価: B評価");
    } else {
      System.out.println("補修受講の有無をyes/noで入力してください");
      String hosyuStr = new java.util.Scanner(System.in).nextLine();

      if(hosyuStr.equals("yes")) {
        System.out.println("評価: C評価");
      } else if(hosyuStr.equals("no")) {
        System.out.println("評価: D評価");
      }
    }
  }
}
