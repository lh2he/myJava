package dao;

import java.util.List;
import entity.User;

public interface UserDao {
	//�������
	int addOneUser(User user);
	// �ж��û��Ƿ����
	boolean checkUserIsExists(User user);
	// ��ѯ�����û�
	List<User> queryAllUser();
	// ɾ���û�
	int deleteUserById(int id);
	
}
