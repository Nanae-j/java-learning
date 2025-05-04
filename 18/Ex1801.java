public class Ex1801 {
  public static void main(String[] args) {
    String[] items = {"ボールペン", "ノート", "付箋紙", "テープ", "ホチキス"};
    String[] shops = { "Ａ店舗", "Ｂ店舗", "Ｃ店舗" };
    int[][] prices = {
      {90, 80, 98, 95, 87},
      {110, 120, 130, 140, 150},
      {210, 220, 230, 240, 250}
    };

    for (int i = 0; i < shops.length; i++) {
      System.out.println("-------");
      for (int j = 0; j < items.length; j++) {
        System.out.println(shops[i]);
        System.out.println(items[j] + ":" + prices[i][j] + "円");
      }
      System.out.println("-------");
    }
  }
}
