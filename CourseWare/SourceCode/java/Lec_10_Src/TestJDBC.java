import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC {
	public static void main(String[] args) throws SQLException,
			ClassNotFoundException {
		String user = "liyi";
		String pwd = "liyi0857";
		// �趨url
		String myjdbc = "jdbc:mysql://localhost:3306/studb";
		// ����mysql����
		Class.forName("com.mysql.jdbc.Driver");
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
					+ record.getString("name") + "," + record.getInt("score"));
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
