package jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class JDBCDemo {
	
	public static void main(String[] args) {
		Connection connection=null;
		PreparedStatement prepareStatement=null;
		ResultSet resultSet =null;
		try {
			//1.��������
			Class.forName("com.mysql.jdbc.Driver");
			//2.��������
			connection=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mycompany?","root","215215");
			//System.out.println(connection);
			//3.����SQL���
			String str ="select * from employees";
			//4.����SQL���
			prepareStatement = (PreparedStatement) connection.prepareStatement(str);
			//5.ִ��SQL���
			resultSet =prepareStatement.executeQuery();
			//6.ȡ�������
			while(resultSet.next()){
				//�õ�һ����¼
				int employee_id=resultSet.getInt("employee_id");
				String first_name=resultSet.getString("first_name");
				System.out.print(employee_id);
				System.out.print(first_name);
				System.out.println();
			}	
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				resultSet.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				prepareStatement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		
	}
	
}
