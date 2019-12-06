import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;

public class Main {
  public static void main(String[] args) {
    //Refer back to your Runestone academy book as needed.
    //Instantiate the world. The world should be 220x220.
    
    //Instantiate a turtle. Name it as you wish.
    World w = new World(220,220);
    
    Turtle t = new Turtle(w);
    t.forward(50);
    t.turnRight();
    t.forward(50);
    t.turnRight();
    t.forward(100);
    t.turnRight();
    t.forward(100);
    t.turnRight();
    t.forward(100);
    t.turnRight();
    t.forward(50);
    t.turnRight();
    t.forward(100);
    t.backward(50);
    t.turnRight();
    t.backward(50);
    t.forward(100);
    /*Have your turtle make 4 boxes in the world. The boxes should be in a 2x2 grid. Similar to this:
     ___ ___ 
    |   |   |
    |___|___|
    |   |   |
    |___|___|

    */


    
    //Finally, set the world to be visible with a boolean. Ex: worldName.setVisible(the proper boolean);
  }
}
