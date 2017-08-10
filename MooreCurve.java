package turtleClasses;

import java.awt.Color;

import turtleClasses.lib.Turtle;
import turtleClasses.lib.World;

public class MooreCurve {
	
	public static Turtle t;
	public static final int MAX = 7;
	public static final int F = 5;
	
	public static int color = 0;
	
	/*public static final Color[] colors = {
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
		};*/
	
	public static void LMoores(int depth) {
		if (depth >= MAX) {
			return;
		}
		t.setColor(Color.BLUE);
		t.turnLeft(); 		//-
		RMoores(depth + 1); //R
		t.forward(F); 		//F
		t.turnRight(); 		//+
		LMoores(depth + 1); //L
		t.forward(F); 		//F
		LMoores(depth + 1); //L
		t.turnRight(); 		//+
		t.forward(F);		//F
		RMoores(depth + 1);	//R
		t.turnLeft(); 		//-
		//t.setColor(colors[color++ % colors.length]);
	}
	public static void RMoores(int depth) {
		if (depth >= MAX) {
			return;
		}
		t.setColor(Color.RED);
		t.turnRight(); 		//+
		LMoores(depth + 1); //L
		t.forward(F);  		//F
		t.turnLeft(); 		//-
		RMoores(depth + 1); //R
		t.forward(F); 		//F
		RMoores(depth + 1); //R
		t.turnLeft(); 		//-
		t.forward(F);		//F
		LMoores(depth + 1); //L
		t.turnRight(); 		//+
		//t.setColor(colors[depth % colors.length]);
	}
	public static void main (String[] args) { 
	    World w = new World(1000,1000);
	    
	    t = new Turtle(1000,1000,w);
	    LMoores(0);
    }
}  
