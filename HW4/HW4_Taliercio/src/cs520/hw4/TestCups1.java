package cs520.hw4;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

//Part 1 (75 points)
//Create a Swing GUI application that displays the following graphics of red and blue
//cups. The structure is always built from bottom row to top row, left to right in each row.
//Write a class named Cups1 extending the JFrame class with the following specifications.
//a. Declare the integer type instance variables startX, startY, cupWidth,
//and cupHeight. The first two values represent the top-left coordinates of
//the first cup block in the bottom row. The next two values are the width
//and height of each cup.
//b. Declate another integer instance variable, baseLength. This represents
//the number of cups in the bottom row.
//c. Declate another integer instance variable, cupSpacing. This represents
//the spacing between adjacent cups.
//d. In the constructor, specify the appropriate window title using your
//lastName and assign the above instance variables with the values 100,
//300, 25, 40, 7, and 6, respectively.
//e. In the paint method, using nested loops, fill the pattern from the bottom
//row all the way to the top. Notice, that the number of cups decreases by
//one for each row. Use the baseLength variable to control the loops.
//f. In the main method, create the application object, set its size to 550 by
//550 and its visibility to true to test the above graphics.
//Part 2 (25 points)
//Modify part1 so that the cups look like real cups. Write a newclass Cups2 in the same
//package for this part.
//For drawing each cup, use the fillPolygon(int[], int[], int) method from
//java.awt.Graphics. You can reduce the width of the cup on the top by 5 units on the
//left and 5 units on the right.
//http://docs.oracle.com/javase/8/docs/api/java/awt/Graphics.html#fillPolygonint:
//A-int:A-int


//Write a class named Cups1 extending the JFrame class with the following specifications.
@SuppressWarnings("serial")
public class TestCups1 extends JFrame
{
	// Constructor
	//	d. In the constructor, specify the appropriate window title using your
	//	lastName and assign the above instance variables with the values 100,
	//	300, 25, 40, 7, and 6, respectively.
	// baselength %2 == 0 { color blue } else { red }
	
	public TestCups1()
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
		
		g.setColor(Color.red);
		g.fillRect(startX, startY, cupWidth, cupHeight);

		for (int i = baseLength -1; i>0; i--) {
			g.setColor(Color.red);
			g.fillRect((startX + i*(cupWidth + cupSpacing)), startY, cupWidth, cupHeight);
		}
		
		for (int i = baseLength -1; i>0; i--) {
			g.setColor(Color.blue);
			g.fillRect(((startX - 14) + i*(cupWidth + cupSpacing)), startY - cupHeight, cupWidth, cupHeight);
		}
		
		for (int i = baseLength -2; i>0; i--) {
			g.setColor(Color.red);
			g.fillRect((startX + i*(cupWidth + cupSpacing)), (startY - (2 * cupHeight)), cupWidth, cupHeight);
		}

		for (int i = baseLength -3; i>0; i--) {
			g.setColor(Color.blue);
			g.fillRect(((startX + cupWidth - 10) + i*(cupWidth + cupSpacing)), (startY - (3 * cupHeight)), cupWidth, cupHeight);
		}
			
		for (int i = baseLength -4; i>0; i--) {
			g.setColor(Color.red);
			g.fillRect(((startX + (2 * cupWidth) - 18) + i*(cupWidth + cupSpacing)), (startY - (4 * cupHeight)), cupWidth, cupHeight);
		}
		
		for (int i = baseLength -5; i>0; i--) {
			g.setColor(Color.blue);
			g.fillRect(((startX + (3 * cupWidth) - 28) + i*(cupWidth + cupSpacing)), (startY - (5 * cupHeight)), cupWidth, cupHeight);
		}
		
		for (int i = baseLength -6; i>0; i--) {
			g.setColor(Color.red);
			g.fillRect(((startX + (4 * cupWidth) - 38) + i*(cupWidth + cupSpacing)), (startY - (6 * cupHeight)), cupWidth, cupHeight);
		}

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
			TestCups1 app = new TestCups1();
			app.setSize(550, 550);
			app.setVisible(true);
			app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
}
