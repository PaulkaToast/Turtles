package turtleClasses;

public class MooreCurve {
	
	public static Turtle t;
	public static final int MAX = 6;
	public static final int F = 10;
	
	public static void LMoores(int depth) {
		if (depth >= MAX) {
			return;
		}
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
	}
	public static void RMoores(int depth) {
		if (depth >= MAX) {
			return;
		}
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
	}
	public static void main (String[] args) { 
	    World w = new World(1000,1000);
	    
	    t = new Turtle(1000,1000,w);
	    
	    LMoores(0);
    }
}  
