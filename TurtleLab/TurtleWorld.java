import java.awt.Color;
import java.net.URL;

public class TurtleWorld
{
    public static void main(String args[])throws InterruptedException

    {
        int width = 1;
        int count = 0;
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        Turtle turtle2 = new Turtle(turtleWorld);
        turtle.penUp();
        turtle.turnLeft();
        turtle.forward(275);
        turtle.turnRight();
        turtle.penDown();
        turtle2.penUp();
        turtle2.turnRight();
        turtle2.forward(250);
        turtle2.turnLeft();
        turtle2.penDown();
        turtle.setPenColor(Color.RED);
        turtle2.setPenColor(Color.BLUE);        
        Picture shrek = new Picture("sshrek.jpg");
        turtleWorld.setPicture(shrek);
        while (width < 12)
        {
        Thread.sleep(100);
        turtle.setPenWidth(width);
        turtle2.setPenWidth(width);
        turtle.forward();
        turtle.turnRight();
        turtle.forward(50);
        Thread.sleep(100);
        turtleWorld.setPicture(shrek);
        turtle.turnRight();
        turtle.forward();
        turtle.turnLeft();
        turtle.forward(50);
        Thread.sleep(100);
        turtle.turnLeft();
        turtle2.forward();
        turtle2.turnLeft();
        turtle2.forward(50);
        Thread.sleep(100);
        turtle2.turnLeft();
        turtleWorld.clearBackground();
        turtle2.forward();
        turtle2.turnRight();
        turtle2.forward(50);
        Thread.sleep(100);
        turtle2.turnRight();
        width = width + 1;
    }
    turtleWorld.setPicture(shrek);
    turtle.setHeight(500);
    turtle2.setHeight(500);
    turtle2.setWidth(100);
    turtle.setWidth(100);
    turtle2.setColor(Color.RED);
    turtle.setColor(Color.BLUE);
}
}
