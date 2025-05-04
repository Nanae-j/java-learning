/*
 * 算術演算子のサンプル
 * 作成：M.Takahashi
 */
class Sample0702 {
	public static void main(String[] args) {
		// 変数の宣言・初期化
		int a = 5;
		int b = 2;

		//【+】
		int result1 = a + b;
		System.out.println("result1：" + result1);
		
		//【-】
		int result2 = a - b;
		System.out.println("result2：" + result2);

		//【*】
		int result3 = a * b;
		System.out.println("result3：" + result3);

		//【/】商
		int result4 = a / b;
		System.out.println("result4：" + result4);

		//【%】剰余
		int result5 = a % b;
		System.out.println("result5：" + result5);
	}
}
