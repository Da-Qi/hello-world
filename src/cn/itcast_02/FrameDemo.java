package cn.itcast_02;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("窗体关闭机制");
		
		//设置窗体属性
		f.setBounds(400, 200, 400, 300);
		
		//让窗体关闭
		//事件源：窗体
		//事件：关闭
		//事件处理：关闭窗口
		//事件监听：
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
		
		//用适配器类改进
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}

		});
		
		
		
		//设置窗体可见
		f.setVisible(true);
		
	}

}
