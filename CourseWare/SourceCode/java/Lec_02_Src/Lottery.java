import java.util.*;

public class Lottery{
	public static void main( String[] args ){
		int lotnum = ( int )( Math.random() * 100 );
		int lot1 = lotnum / 10;
		int lot2 = lotnum % 10;
		int guess;
		
		Scanner input = new Scanner( System.in );
		System.out.print( "����������ѡ��(0-99): " );
		guess = input.nextInt();
		
		if( guess >= 0 && guess <= 99)
			System.out.println( "������Ч" );
		
		int gue1 = guess / 10;
		int gue2 = guess % 10;
		
		System.out.println( "�н�����Ϊ: " + lotnum );
		
		if( guess == lotnum )
			System.out.println( "��ϲ��ȫ���У���ý���10000!" );
		else if( gue1 == lot2 && gue2 == lot1 )
			System.out.println( "��ϲ��������ȫ�����֣���λ�ò��ԣ���ý���3000!" );
		else if( gue1 == lot1 || gue1 == lot2 || gue2 == lot1 || gue2 == lot2 )
			System.out.println( "��ϲ�������˲������֣���ý���1000!" );
		else
			System.out.println( "������˼����û�в��У���ӭ�´�����!" );
		
		return;
	}
}