class Ex0702 {
  public static void main(String[] args) {
    int baseNumber = 5;

    System.out.println("初期値:" + baseNumber);

    baseNumber = ++baseNumber;
    System.out.println("1足すと:" + baseNumber);

    baseNumber -= 4;
    System.out.println("4引くと:" + baseNumber);
  }
}