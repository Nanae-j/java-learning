public class Ex1601 {
  public static void main(String[] args) {
    String[] items = { "ボールペン", "ノート", "付箋紙", "テープ", "ホチキス" };

    int[] prices = { 90, 80, 110, 95, 200 };
    
    for (int i = 0; i < items.length; i++) {
      if (prices[i] <= 100) {
        System.out.println(items[i] + ":" + prices[i] + "円");
      } else {
        System.out.println(items[i] + ":" + prices[i] + "円(*)");
      }
    }

  }
}
