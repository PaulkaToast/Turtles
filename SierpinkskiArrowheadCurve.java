package turtleClasses;

import java.awt.Color;

import turtleClasses.lib.Turtle;
import turtleClasses.lib.World;

public class SierpinkskiArrowheadCurve {
	public static Turtle t;
	public static final int MAX = 7;
	public static final int F = 5;
	
	public static void XArrow(int depth) {
		if (depth >= MAX) {
			return;
		}
		YArrow(depth + 1);	//Y
		t.forward(F);		//F
		t.turn(-60); 		//+
		XArrow(depth + 1); 	//X
		t.forward(F); 		//F
		t.turn(-60); 		//+
		YArrow(depth + 1);  //Y
 	}
	public static void YArrow(int depth) {
		if (depth >= MAX) {
			return;
		}
		XArrow(depth + 1);	//X
		t.forward(F);		//F
		t.turn(60); 		//-
		YArrow(depth + 1); 	//Y
		t.forward(F);		//F
		t.turn(60);  		//-
		XArrow(depth + 1);	//X

	}
	public static void main (String[] args) { 
	    World w = new World(1000,1000);
	    
	    t = new Turtle(900,900,w);
	    t.setColor(Color.RED);
	    XArrow(0);
    }
}
