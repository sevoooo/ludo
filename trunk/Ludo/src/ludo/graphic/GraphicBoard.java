package ludo.graphic;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicBoard extends JFrame {

	private static final long serialVersionUID = 1L;

	public GraphicBoard() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		JPanel panel = new JPanel() {

			private static final long serialVersionUID = 1L;

			@Override
			protected void paintComponent(Graphics g) {
//				super.paintComponent(g);
				Graphics2D g2D = (Graphics2D) g.create();
				g2D.setColor(Color.BLUE);
				g2D.fillRect(10, 10, 50, 50);
				g2D.setColor(Color.BLACK);
				g2D.drawRect(10, 10, 50, 50);
			}
		};
		
		JButton button = new JButton("1"){
			
			private static final long serialVersionUID = 1L;

			@Override
			protected void paintComponent(Graphics g) {
				this.setPreferredSize(new Dimension(300,300));
				// TODO Auto-generated method stub
//				super.paintComponent(g);
				Graphics2D g2D = (Graphics2D) g.create();
				g2D.setColor(Color.RED);
				g2D.fillRect(0, 0, 1000, 1000);
				g2D.setColor(Color.BLACK);
				g2D.drawRect(0, 0, 50, 50);
			}
		};

		JButton button2 = new JButton("2"){
			
			private static final long serialVersionUID = 1L;

			@Override
			protected void paintComponent(Graphics g) {
				this.setPreferredSize(new Dimension(300,300));
				// TODO Auto-generated method stub
//				super.paintComponent(g);
				Graphics2D g2D = (Graphics2D) g.create();
				g2D.setColor(Color.RED);
				g2D.fillRect(0, 0, 1000, 1000);
				g2D.setColor(Color.BLACK);
				g2D.drawRect(0, 0, 50, 50);
			}
		};
		
		panel.add(button);
		panel.add(button2);
		
		System.out.println(panel.getComponentZOrder(button));
		System.out.println(panel.getComponentZOrder(button2));
		
		this.getContentPane().add(panel);
		this.getContentPane().add(new JPanel().add(new JButton("Test 2 3 4 5")));
//		this.getLayeredPane().add(new JButton("Hallo"));
//		this.getContentPane().add(new JButton("Hallo"));
		this.setPreferredSize(new Dimension(200,200));
		this.pack();
		this.setVisible(true);
		
	}
	
}
