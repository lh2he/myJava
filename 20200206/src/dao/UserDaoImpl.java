package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.User;
import util.DBUtils;

/**
 * �û�dao��ʵ����
 * @author Neuedu
 * @Date 2020/02/24
 */
public class UserDaoImpl implements UserDao {

	@Override
	public int addOneUser(User user) {
		Connection connection = DBUtils.getConnection();
		String sql = "INSERT INTO user(username,password,regdate) VALUES (?,?,NOW())";
		PreparedStatement prepareStatement = null;
		try {
			//  Ԥ����sql���
		   prepareStatement = connection.prepareStatement(sql);
		    // ��ռλ����ֵ
		   prepareStatement.setString(1, user.getUserName());
		   prepareStatement.setString(2, user.getPassWord());
		    // ִ��sql
		   int executeUpdate = prepareStatement.executeUpdate();
		   return executeUpdate;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtils.closeResource(null, prepareStatement, connection);
		}
		return 0;
	}
	
	@Override
	public boolean checkUserIsExists(User user) {
		Connection connection = DBUtils.getConnection();
		String sql = "SELECT * FROM user WHERE username = ? AND password = ?";
		PreparedStatement prepareStatement = null;
		try {
			//  Ԥ����sql���
		   prepareStatement = connection.prepareStatement(sql);
		    // ��ռλ����ֵ
		   prepareStatement.setString(1, user.getUserName());
		   prepareStatement.setString(2, user.getPassWord());
		    // ִ��sql
		   ResultSet rs = prepareStatement.executeQuery();
		   if(rs.next()) {
			   return true;
		   }
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtils.closeResource(null, prepareStatement, connection);
		}
		return false;
	}

	@Override
	public List<User> queryAllUser() {
		Connection connection = DBUtils.getConnection();
		String sql = "SELECT * FROM user";
		PreparedStatement prepareStatement = null;
		ArrayList<User> arrayList = new ArrayList<User>();
		try {
			//  Ԥ����sql���
		   prepareStatement = connection.prepareStatement(sql);
		    // ִ��sql
		   ResultSet rs = prepareStatement.executeQuery();
		   while(rs.next()) {
			   int id = rs.getInt("id");
			   String userName = rs.getString("username");
			   String psw = rs.getString("password");
			   Date date = rs.getDate("regdate");
			   User user = new User(id, userName, psw, date);
			   arrayList.add(user);
		   }
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtils.closeResource(null, prepareStatement, connection);
		}
		return arrayList;
	}

	@Override
	public int deleteUserById(int id) {
		Connection connection = DBUtils.getConnection();
		String sql = "DELETE FROM user WHERE id = ?";
		PreparedStatement prepareStatement = null;
		try {
			//  Ԥ����sql���
		   prepareStatement = connection.prepareStatement(sql);
		    // ��ռλ����ֵ
		   prepareStatement.setInt(1, id);
		    // ִ��sql
		   int executeUpdate = prepareStatement.executeUpdate();
		   return executeUpdate;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtils.closeResource(null, prepareStatement, connection);
		}
		return 0;
	}

	
	
	
} 