package cs520.hw4;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

//Write a class named Cups1 extending the JFrame class with the following specifications.
@SuppressWarnings("serial")
public class Cups1 extends JFrame
{
	// Constructor
	//	d. In the constructor, specify the appropriate window title using your
	//	lastName and assign the above instance variables with the values 100,
	//	300, 25, 40, 7, and 6, respectively.
	// baselength %2 == 0 { color blue } else { red }
	
	public Cups1()
	{
		super("Taliercio Cups_v1"); // Window Title
	}
	@Override
	public void paint(Graphics g)
	{ 
		super.paint(g);

//		a. Declare the integer type instance variables startX, startY, cupWidth,
//		and cupHeight. The first two values represent the top-left coordinates of
//		the first cup block in the bottom row. The next two values are the width
//		and height of each cup.
//		b. Declare another integer instance variable, baseLength. This represents
//		the number of cups in the bottom row.
//		c. Declare another integer instance variable, cupSpacing. This represents
//		the spacing between adjacent cups.

		int startX, startY, cupWidth, cupHeight, baseLength, cupSpacing;
		
		startX = 100; startY = 300;
		cupWidth = 25; cupHeight = 40;
		baseLength = 7; cupSpacing = 6;
		
//		g.setColor(Color.red);
//		g.fillRect(startX, startY, cupWidth, cupHeight);

		for (int j = baseLength -1; j>0; j--) {
		
			if (j%2 == 0) {
				g.setColor(Color.blue); 
			}
			else if (j%2 == 1) {
				g.setColor(Color.red);
			}

			for (int i = baseLength -1; i>=0; i--) {
				g.fillRect((startX + i*(cupWidth + cupSpacing)), (startY - (j * cupHeight)), cupWidth, cupHeight);
			}
		}
//		for (int i = baseLength -2; i>0; i--) {
//			g.setColor(Color.red);
//			g.fillRect((startX + i*(cupWidth + cupSpacing)), (startY - (2 * cupHeight)), cupWidth, cupHeight);
//		}
//
//		for (int i = baseLength -3; i>0; i--) {
//			g.setColor(Color.blue);
//			g.fillRect(((startX + cupWidth - 10) + i*(cupWidth + cupSpacing)), (startY - (3 * cupHeight)), cupWidth, cupHeight);
//		}
//			
//		for (int i = baseLength -4; i>0; i--) {
//			g.setColor(Color.red);
//			g.fillRect(((startX + (2 * cupWidth) - 18) + i*(cupWidth + cupSpacing)), (startY - (4 * cupHeight)), cupWidth, cupHeight);
//		}
//		
//		for (int i = baseLength -5; i>0; i--) {
//			g.setColor(Color.blue);
//			g.fillRect(((startX + (3 * cupWidth) - 28) + i*(cupWidth + cupSpacing)), (startY - (5 * cupHeight)), cupWidth, cupHeight);
//		}
//		
//		for (int i = baseLength -6; i>0; i--) {
//			g.setColor(Color.red);
//			g.fillRect(((startX + (4 * cupWidth) - 38) + i*(cupWidth + cupSpacing)), (startY - (6 * cupHeight)), cupWidth, cupHeight);
//		}

//		for (int i = baseLength; i>0; i--) {
//			int arr[] = new int[10];
//			
//			g.setColor(Color.magenta);
//			g.fillPolygon(193, 20, 25);
//		}

	}

//	public static void main(Strings[] args) {
//		
//		for (int= 0; i<10; i++) {
//			System.out.println(i + " is even");
//		} else {
//			System.out.println(i + " is odd");
//		}
//	}

	
		//The main method
		public static void main(String[] args)
		{
			Cups1 app = new Cups1();
			app.setSize(550, 550);
			app.setVisible(true);
			app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
}
