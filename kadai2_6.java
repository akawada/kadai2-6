import java.util.Scanner;

class kadai2_6 {
    public static void main( String[] args ) {
		Scanner scan = new Scanner(System.in);
		String strin;

		while (true) {
			System.out.println("�������͂��Ă��������@�����邩�킩��Ȃ�����5000�N�܂�");
			strin = scan.next();
			// ���l�`�F�b�N
			if (!chknum(strin)){
				System.err.println("�s���Ȑ��l�ł��B������x���͂��Ă�������");				
			}
			else {
				break;
			}
		}
        int year = Integer.parseInt(strin);
        
        if( year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ) {
            System.out.println( year + "�N�͂��邤�N�ł�" );
        } else {
            System.out.println( year + "�N�͂��邤�N�ł͂���܂���" );
        }
        scan.close();
    }
    
	// ���l�`�F�b�N
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
