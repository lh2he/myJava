package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtils {

	// ��װ��ȡ���ӵķ���
	public static Connection getConnection() {
		Connection connection = null;
		// 1.��������
		try {
			Class.forName("com.mysql.jdbc.Driver");
			// 2.��������      Connection
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myentertainment?", "root", "215215");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(null != connection) {
			return connection;
		}
		return null;
	} 

	// ��װ�ر���Դ�ķ���
	public static void closeResource(ResultSet rs,PreparedStatement preparedStatement,Connection connection) {
		if(null != rs) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(null != preparedStatement) {
			try {
				preparedStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(null != connection) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
//	public static void main(String[] args) {
//		System.out.print(DBUtils.getConnection()); 
//		}
	
} 