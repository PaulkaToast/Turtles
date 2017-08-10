package turtleClasses;

import turtleClasses.lib.Turtle;
import turtleClasses.lib.World;

public class DragonCurve
{
  
  public static void main (String[] args) 
  { 
    int forward = 1;
    World w = new World(1200,1200);
    Turtle gabe = new Turtle(600,600,w);
    Turtle paula = new Turtle(600,600,w);
    Turtle bernard = new Turtle(600,600,w);
    Turtle zoltab = new Turtle(600,600,w);
    paula.turn(90);
    bernard.turn(180);
    zoltab.turn(270);
    
    String directions = "R";
    
    
    for (int j = 0; j < 16; j++) {
      String next = directions;
      String inverse = "";
      for (int i = next.length() - 1; i >= 0; i--) {
        inverse += next.charAt(i) == 'R' ? 'L' : 'R';
      }
      directions = next + "R" + inverse;
      System.out.println(directions);
    }
    int count = 0;
    for (count = 0; count < directions.length(); count++) {
      if (directions.charAt(count) == 'R') {
        gabe.turnRight();
        paula.turnRight(); 
        bernard.turnRight();
        zoltab.turnRight();
      }
      else {
        gabe.turnLeft();
        paula.turnLeft();
        bernard.turnLeft();
        zoltab.turnLeft();
      }
      paula.forward(forward);
      gabe.forward(forward);
      zoltab.forward(forward);
      bernard.forward(forward);
    }
    
  }
  
} 

