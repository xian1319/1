import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBCSQL {
	public static void main(String[] args) throws SQLException,
			ClassNotFoundException {
		String user = "lymanager";
		String pwd = "12345678";
		// �趨url
		String myjdbc = "jdbc:sqlserver://127.0.0.1:1433;databaseName=Studb;user=lymanager;password=12345678";
		// ����mysql����
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		// �������ӻỰ
		Connection myConnection = DriverManager
				.getConnection(myjdbc, user, pwd);
		// �����������
		Statement Myoperation = myConnection.createStatement();
		// ��ȡ���������
		ResultSet record = Myoperation.executeQuery("SELECT  *  FROM  stuinfo");
		while (record.next()) {
			// ������������
			System.out.println(record.getInt("id") + ","
					+ record.getString("name") + "," + record.getString("class")+","+record.getInt("score"));
		}
		// �رս����
		try {
			if (record != null)
				record.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (myConnection != null)
					myConnection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
