class Ex0801 {
  public static void main(String[] args) {
    double tax = 1.1;
    int price = 123;
    int addTaxPrice = (int) (price * tax);

    System.out.println("税込み価格:" + addTaxPrice + "円");
  }
}