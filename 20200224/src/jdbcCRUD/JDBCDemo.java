package jdbcCRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JDBCDemo {
		
	public static void main(String[] args) {
//		List<Boys> allBoys = new JDBCDemo().getAllBoys();
//		System.out.println(allBoys);
//		Connection connection = getConnection();
//		System.out.println(connection);
		Boys boy = new Boys(5,"л��",3000);
//		int OneBoy = new JDBCDemo().addOneBoy(boy);
//		int OneBoy = new JDBCDemo().updateBoysInfo(boy);
		int OneBoy = new JDBCDemo().deleteBoysInfo(5);
		System.out.println(OneBoy);
	}
	
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
	
	//ɾ��
	public int deleteBoysInfo(int id) {
		Connection connection = getConnection();
		//����sql���
		PreparedStatement prepareStatement = null;
		int executeUpdate = 0;
		try {
			prepareStatement = connection.prepareStatement("DELETE FROM boys WHERE id = ?");
			prepareStatement.setInt(1, id);
			executeUpdate =  prepareStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeResource(null, prepareStatement, connection);
		}
		return executeUpdate;
		
	}
	
	//����
	public int updateBoysInfo(Boys boys) {
		Connection connection = getConnection();
		//����sql���
		PreparedStatement prepareStatement = null;
		int executeUpdate = 0;
		try {
			prepareStatement = connection.prepareStatement("UPDATE boys SET boyName = ?,userCP = ? WHERE id = ?");
			prepareStatement.setString(1, boys.getBoyName());
			prepareStatement.setInt(2, boys.getUserCP());
			prepareStatement.setInt(3, boys.getId());
			executeUpdate =  prepareStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeResource(null, prepareStatement, connection);
		}
		return executeUpdate;
	}

	//����
	public int addOneBoy(Boys boy) {
		Connection connection = getConnection();
		//����sql���
		PreparedStatement prepareStatement = null;
		int executeUpdate = 0;
		try {
			prepareStatement = connection.prepareStatement("INSERT INTO boys(boyName,userCP) VALUES (?,?)");
			prepareStatement.setString(1, boy.getBoyName());
			prepareStatement.setInt(2, boy.getUserCP());
			executeUpdate =  prepareStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeResource(null, prepareStatement, connection);
		}
		return executeUpdate;
	}
	
	// ��ѯ����
	public List<Boys> getAllBoys(){
		Connection connection = null;
		PreparedStatement prepareStatement = null;
		ResultSet resultSet = null;
		ArrayList<Boys> arrayList =  null;
		try {
			// 1.��������
			Class.forName("com.mysql.jdbc.Driver");
			// 2.��������      Connection
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myentertainment?", "root", "215215");
			// 3.����sql���
			String str = "select * from boys";
			// 4.����sql���
			prepareStatement = connection.prepareStatement(str);
			// 5.ִ��sql���
			resultSet = prepareStatement.executeQuery();
			// �������boy��һ������
			arrayList = new ArrayList<Boys>();
			// 6.ȡ�����
			while(resultSet.next()) {
				// �õ�һ����¼
				int id = resultSet.getInt("id");
				String boyName = resultSet.getString("boyName");
				int cp = resultSet.getInt("userCP");
				Boys boys = new Boys(id, boyName, cp);
				arrayList.add(boys);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
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
		return arrayList;
	}
}