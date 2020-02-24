package cn.itcast_03;
/*
 * 接口——实现类
 * 接口——适配器类（实现接口，仅仅空实现  ）——实现类（用哪个重写哪个）
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
