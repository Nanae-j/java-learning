public class Ex1401 {
  public static void main(String[] args) {
    System.out.println("３づつ増やして表示します。");

    System.out.println("最小値を入力してください >");
    String minNumberStr = new java.util.Scanner(System.in).nextLine();
    int minNumber = Integer.parseInt(minNumberStr);

    System.out.println("最大値を入力してください >");
    String maxNumberStr = new java.util.Scanner(System.in).nextLine();
    int maxNumber = Integer.parseInt(maxNumberStr);

    int totalCnt = 0;

    for (int i = minNumber; i < maxNumber; i+= 3) {
      System.out.println(i);
      totalCnt++;
    }

    System.out.println("---");
    System.out.println("個数:" + totalCnt);

  }
}
