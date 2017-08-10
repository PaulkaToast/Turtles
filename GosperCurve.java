package turtleClasses;

import java.awt.Color;

import turtleClasses.lib.Turtle;
import turtleClasses.lib.World;

public class GosperCurve {
	public static Turtle t;
	public static final int MAX = 4;
	public static final int F = 5;
	public static int n = 0;

	public static void expand(String num, int depth) {
		if (depth > MAX) {
			return;
		}
		
		StringBuilder builder = new StringBuilder();
		for (char c : num.toCharArray()) {
			if (c == 'A') {
				builder.append("A-B--B+A++AA+B-");
			} else if (c == 'B') {
				builder.append("+A-BB--B-A++A+B");
			} else {
				builder.append(c);
			}
		}
		String newNum = builder.toString();
		//System.out.println(newNum);
		if (depth == MAX) {
			for (int i = 0; i < newNum.length(); i++) {
				char c = newNum.charAt(i);
				if (c == 'A' || c == 'B') {
					t.forward(F);
				}else if (c == '+') {
					t.turn(60);
				}else if ( c == '-') {
					t.turn(-60);
				}
			}
		}
		
		expand(newNum, depth + 1);
	}
	
	public static void main (String[] args) { 
	    World w = new World(1200,1000);
	    
	    t = new Turtle(1000,300,w);
	    expand("A", 0);
    }
}
