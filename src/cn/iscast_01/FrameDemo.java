package cn.iscast_01;

import java.awt.Frame;

public class FrameDemo {
	public static void main(String[] args){
		//�����������
		Frame f = new Frame();
		
		//���ô������
		f.setTitle("HelloWorld");
		
		//���ô����С
		f.setSize(400,300); //��λ�����أ�������
		
		//���ô���λ��
		f.setLocation(400, 200);
		
		//����һ�������������ô���ɼ�
		//f.show();
		f.setVisible(true);
	}
}
