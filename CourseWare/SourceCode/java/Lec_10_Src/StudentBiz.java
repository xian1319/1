import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class StudentBiz {
	/**
	 * ��ѯ��������
	 * 
	 * @throws Exception
	 */
	public void readDate() throws Exception {
		ConnectionFactory factory = new ConnectionFactory();
		// �õ�����Դ
		
		// �õ���������
		Connection conn = factory.getConnection();
		// �õ�����
		Statement stmt = conn.createStatement();
		String sqlstr = "select * from stuinfo";
		// �õ������
		ResultSet rs = stmt.executeQuery(sqlstr);
		// ���������,��ʾ���
		while (rs.next()) {
			System.out.print(rs.getString(1) + "\t");
			System.out.print(rs.getString(2) + "\t");
			System.out.print(rs.getString(3) + "\t");
			System.out.print(rs.getString(4) + "\t");
			System.out.println(" ");
		}
		JDBCUtils.close(rs, stmt, conn);
	}

	public void readDateByName(String name) throws Exception {
		ConnectionFactory factory = new ConnectionFactory();
		// �õ���������
		Connection conn = factory.getConnection();
		// �õ�����
		Statement stmt = conn.createStatement();
		String sqlstr = "select * from stuinfo where name='" + name + "'";
		// �õ������
		ResultSet rs = stmt.executeQuery(sqlstr);
		// ���������,��ʾ���
		while (rs.next()) {
			System.out.print(rs.getString(1) + "\t");
			System.out.print(rs.getString(2) + "\t");
			System.out.print(rs.getString(3) + "\t");
			System.out.print(rs.getString(4) + "\t");
			System.out.println(" ");
		}
		JDBCUtils.close(rs, stmt, conn);
	}

	public void insertDateByName(String name,String classes,
			int score) throws Exception {
		ConnectionFactory factory = new ConnectionFactory();
		// �õ���������
		Connection conn = factory.getConnection();
		// ƴдsql���
		String sqlstr = "insert stuinfo(name,classes,score) values(?,?,?)";
		PreparedStatement psmt = conn.prepareStatement(sqlstr);
		psmt.setString(1, name);
		psmt.setString(2, classes);
		psmt.setInt(3, score);
		psmt.executeUpdate();
		JDBCUtils.close(psmt, conn);
		this.readDate();
	}

	public void updateDateByName(String name) throws Exception {
		ConnectionFactory factory = new ConnectionFactory();
		// �õ���������
		Connection conn = factory.getConnection();
		// �õ�����
		Statement stmt = conn.createStatement();
		String sqlstr = "update stuinfo set score=86 where name='" + name
				+ "'";
		stmt.executeUpdate(sqlstr);
		JDBCUtils.close(stmt, conn);
		this.readDateByName(name);
	}

	public void deleDateByName(String name) throws Exception {
		ConnectionFactory factory = new ConnectionFactory();
		// �õ���������
		Connection conn = factory.getConnection();
		// �õ�����
		Statement stmt = conn.createStatement();
		String sqlstr = "delete from stuinfo where name='" + name + "'";
		stmt.executeUpdate(sqlstr);
		JDBCUtils.close(stmt, conn);
		this.readDate();
	}
	
	public static void main(String[] args){
		StudentBiz td = new StudentBiz();
		try {
			td.deleDateByName("zah");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
