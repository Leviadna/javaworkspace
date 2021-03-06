package app0512.gallery;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

//갤러리의 큰 이미지 나올 패널
public class GalleryDetail extends JPanel{
	private Image image;
	//누군가에 의해 image를 넘겨받으려면
	//메서드를 준미해놓아야 한다
	public void setImage(Image image) {
		this.image = image;
		this.image = image.getScaledInstance(500, 340, Image.SCALE_SMOOTH);
	}
	
	public void paint(Graphics g) {
		//그림 그릴 이미지
		g.drawImage(image, 0, 0, this);
	}
}
