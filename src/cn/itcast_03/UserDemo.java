package cn.itcast_03;
/*
 * �ӿڡ���ʵ����
 * �ӿڡ����������ࣨʵ�ֽӿڣ�������ʵ��  ������ʵ���ࣨ���ĸ���д�ĸ���
*/
public class UserDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDao ud = new UserDaoImpl();
		ud.add();
		
		UserDao ud2 = new UserDaoImpl2();
		ud2.add();
	}

}
