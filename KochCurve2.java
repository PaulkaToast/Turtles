package turtleClasses;

import java.awt.Color;

import turtleClasses.lib.Turtle;
import turtleClasses.lib.World;

public class KochCurve2 {
		public static Turtle kevin;
		public static Turtle ammar;
		public static Turtle paula;
		public static Turtle spencer;
		public static final int MAX = 4;
		public static final int F = 1;
		public static int n = 0;

		public static void expand(String num, int depth) {
			if (depth > MAX) {
				return;
			}
			
			StringBuilder builder = new StringBuilder();
			for (char c : num.toCharArray()) {
				if (c == 'F') {
					builder.append("F-F+F+FFF-F-F+F");
				} else {
					builder.append(c);
				}
			}
			String newNum = builder.toString();
			System.out.println(newNum);
			//if (depth == MAX) {
				for (int i = 0; i < newNum.length(); i++) {
					char c = newNum.charAt(i);
					if (c == 'F') {
						ammar.forward(F);
						paula.forward(F);
						kevin.forward(F);
						spencer.forward(F);
					}else if (c == '+') {
						ammar.turn(90);
						paula.turn(90);
						kevin.turn(90);
						spencer.turn(90);
					}else if ( c == '-') {
						ammar.turn(-90);
						paula.turn(-90);
						kevin.turn(-90);
						spencer.turn(-90);
					}
				}
			//}
			
			expand(newNum, depth + 1);
		}
		
		public static void main (String[] args) { 
		    World w = new World(1000,1000);
		    
		    ammar = new Turtle(500,500,w);
		    paula = new Turtle(500,500,w);
		    kevin = new Turtle(500,500,w);
		    spencer = new Turtle(500,500,w);
		    
		    ammar.setColor(Color.RED);
		    paula.setColor(Color.ORANGE);
		    kevin.setColor(Color.YELLOW);
		    spencer.setColor(Color.CYAN);
		    
		    paula.turn(90);
		    kevin.turn(180);
		    spencer.turn(270);
		    expand("F", 0);
	    }
}
