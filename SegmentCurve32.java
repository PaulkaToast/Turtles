package turtleClasses;

import java.awt.Color;

public class SegmentCurve32 {
	public static Turtle t;
	public static final int MAX = 1;
	public static final int F = 10;
	public static int n = 0;
	public static final Color[] colors = {
	Color.RED, 
	Color.ORANGE,
	Color.YELLOW,
	Color.GREEN,
	Color.CYAN,
	Color.BLUE,
	Color.MAGENTA,
	Color.PINK,
	Color.GRAY,
	Color.BLACK
	};
	public static void expand(String num, int depth) {
		if (depth > MAX) {
			return;
		}
		
		StringBuilder builder = new StringBuilder();
		for (char c : num.toCharArray()) {
			if (c == 'F') {
				builder.append("-F+F-F-F+F+FF-F+F+FF+F-F-FF+FF-FF+F+F-FF-F-F+FF-F-F+F+F-F+");
			} else {
				builder.append(c);
			}
		}
		String newNum = builder.toString();
		System.out.println(newNum);
		if (depth == MAX) {
			for (int i = 0; i < newNum.length(); i++) {
				char c = newNum.charAt(i);
				if (c == 'F') {
					t.setColor(colors[n++ % colors.length]);
					t.forward(F);
				}else if (c == '+') {
					t.turn(90);
				}else if ( c == '-') {
					t.turn(-90);
				}
			}
		}
		
		expand(newNum, depth + 1);
	}
	
	public static void main (String[] args) { 
	    World w = new World(1200,1000);
	    
	    t = new Turtle(600,900,w);
	    t.setColor(Color.ORANGE);
	    expand("F", 0);
    }
}
