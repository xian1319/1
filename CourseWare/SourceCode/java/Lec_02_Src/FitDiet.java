import java.util.*;

public class FitDiet{
	public static void main( String[] args ){
		int day;
		Scanner input = new Scanner( System.in );
		System.out.println( "��������������ڼ���" );
		day = input.nextInt();
		
		switch( day ){
			case 1:
				System.out.println( "С�ײ�" );
				break;
			case 2:
				System.out.println( "������" );
				break;
			case 3:
				System.out.println( "��ײ�" );
				break;
			case 4:
				System.out.println( "����" );
				break;
			case 5:
				System.out.println( "ţ��" );
				break;
			case 6:
				System.out.println( "����" );
				break;
			default:
				System.out.println( "ʲô������!" );
				break;
		}

		return;
	}
}