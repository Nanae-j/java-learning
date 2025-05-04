class Ex0901 {
  public static void main(String[] args) {
    String[] subName = new String[2];
    subName[0] = "A教科";
    subName[1] = "B教科";

    int[] subScore = new int[2];


    System.out.println("1桁の数字を入力してください");
    String a = new java.util.Scanner(System.in).nextLine();
    subScore[0] = Integer.parseInt(a);

    System.out.println("1桁の数字を入力してください");
    String b = new java.util.Scanner(System.in).nextLine();
    subScore[1] = Integer.parseInt(b);

    System.out.println("A教科:" + subScore[0] + "点");
    System.out.println("B教科:" + subScore[1] + "点");
    System.out.println("----");
    System.out.println("平均:" + ((subScore[0] + subScore[1]) / 2) + "点");
  }
}