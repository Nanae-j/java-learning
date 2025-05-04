class Ex0802 {
  public static void main(String[] args) {
    String aStr = new java.util.Scanner(System.in).nextLine();
    int a = Integer.parseInt(aStr);

    String bStr = new java.util.Scanner(System.in).nextLine();
    int b = Integer.parseInt(bStr);

    System.out.println("商:" + (a / b));
    System.out.println("余り:" + (a % b));
  }
}