package cn.itcast_02;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("����رջ���");
		
		//���ô�������
		f.setBounds(400, 200, 400, 300);
		
		//�ô���ر�
		//�¼�Դ������
		//�¼����ر�
		//�¼������رմ���
		//�¼�������
//		f.addWindowListener(new WindowListener(){
//
//			@Override
//			public void windowActivated(WindowEvent arg0) {
//				// TODO Auto-generated method stub
//				
//			}
//
//			@Override
//			public void windowClosed(WindowEvent arg0) {
//				// TODO Auto-generated method stub
//				
//			}
//
//			@Override
//			public void windowClosing(WindowEvent arg0) {
//				// TODO Auto-generated method stub
//				System.exit(0);
//			}
//
//			@Override
//			public void windowDeactivated(WindowEvent arg0) {
//				// TODO Auto-generated method stub
//				
//			}
//
//			@Override
//			public void windowDeiconified(WindowEvent arg0) {
//				// TODO Auto-generated method stub
//				
//			}
//
//			@Override
//			public void windowIconified(WindowEvent arg0) {
//				// TODO Auto-generated method stub
//				
//			}
//
//			@Override
//			public void windowOpened(WindowEvent arg0) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//		});
		
		//����������Ľ�
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}

		});
		
		
		
		//���ô���ɼ�
		f.setVisible(true);
		
	}

}
