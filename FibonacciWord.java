package turtleClasses;

import java.awt.Color;

import turtleClasses.lib.Turtle;
import turtleClasses.lib.World;

public class FibonacciWord {
	public static Turtle t;
	public static final int MAX = 21;
	public static final int F = 2;
	public static int n = 0;

	public static void expand(String num, int depth) {
		if (depth > MAX) {
			return;
		}
		
		StringBuilder builder = new StringBuilder();
		for (char c : num.toCharArray()) {
			if (c == '1') {
				builder.append('0');
			} else if (c == '0') {
				builder.append("01");
			}
		}
		String newNum = builder.toString();
		//System.out.println(newNum);
		if (depth == MAX) {
		for (int i = 0; i < newNum.length(); i++) {
			t.forward(F);
			t.setColor(Color.RED);
			char c = newNum.charAt(i);
			if (c == '0') {
				t.setColor(Color.BLUE);
				if ((i + 1) % 2 == 0) {
					t.turnLeft();
				} else {
					t.turnRight();
				}
			}
		}
		}
		
		expand(newNum, depth + 1);
	}
	
	public static void main (String[] args) { 
	    World w = new World(1200,1000);
	    
	    t = new Turtle(0,1000,w);
	    expand("1", 0);
    }
}
