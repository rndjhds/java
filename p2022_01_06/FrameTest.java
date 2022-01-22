package p2022_01_06;

import java.awt.*;
import java.awt.event.*;

public class FrameTest {

	private Frame f; // 필드

	public FrameTest() { // 생성자
		f = new Frame("Frame Test"); // Frame f = new Frame("Frame Test");
		f.setSize(400, 300); // 부모클래스에서 메소드 상속
		f.setLocation(100, 100); // 부모클래스에서 메소드 상속
		f.setBackground(Color.green);
		f.setVisible(true);
		f.setResizable(false);

		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}// 생성자 end

	public static void main(String[] args) {
		FrameTest ft = new FrameTest();
	}
}