import java.util.Scanner;

class kadai2_6 {
    public static void main( String[] args ) {
		Scanner scan = new Scanner(System.in);
		String strin;

		while (true) {
			System.out.println("西暦を入力してください　※来るかわからないけど5000年まで");				
			strin = scan.next();
			// 数値チェック
			if (chknum(strin) == false){
				System.err.println("不正な数値です。もう一度入力してください");				
			}
			else {
				break;
			}
		}
        int year = Integer.parseInt(strin);
        
        if( year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ) {
            System.out.println( year + "年はうるう年です" );
        } else {
            System.out.println( year + "年はうるう年ではありません" );
        }
        scan.close();
    }
    
	// 数値チェック
	static boolean chknum(String numchk) {
		try {
			Integer.parseInt(numchk);
			if (Integer.parseInt(numchk) < 0){
				return false;
			}
			else if (Integer.parseInt(numchk) > 5000){
				return false;
			}
			else{
					return true;
			}
		} catch (NumberFormatException e) {
			return false;
		}
	}
    
}
