
public class Chapter08_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
/**
 * 問題1
 **/
		
	//距離を表すint型の変数を定義し、任意の値で初期化する
		int kyori = 20;
	//距離が5以下の場合は "とても近いです" を出力する
	//距離が5より大きく10以下の場合は "近いです" を出力する
	//距離が10より大きく15以下の場合は "遠いです" を出力する
	//距離が15より大きい場合は "とても遠いです" を出力する
		if(kyori <= 5) {
			System.out.println("とても近いです");
		}
		else if((5 < kyori) && (kyori <= 10)) {
			System.out.println("近いです");
		}
		else if((10 < kyori) && (kyori <= 15)) {
			System.out.println("遠いです");
		}
		else;
		System.out.println("とても遠いです");
	
	}

}
