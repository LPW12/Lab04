// Lab04Bst.java
// The Expo Graphics Program
// This is the student, starting version, of Lab 04B.


import java.awt.*;
import java.applet.*;


public class Lab04Bst extends Applet
{

    public void paint(Graphics g)
    {
        // DRAW CUBE
        Expo.drawRectangle(g,50,50,200,200);
        Expo.drawRectangle(g,100,100,250,250);
        Expo.drawLine(g,50,50,100,100);
        Expo.drawLine(g,200,200,250,250);
        Expo.drawLine(g,50,200,100,250);
        Expo.drawLine(g,200,50,250,100);
        // DRAW TARGET
        //Expo.drawCircle(g,550,175,20);
        //Expo.drawCircle(g,550,175,40);
        //Expo.drawCircle(g,550,175,60);
        //Expo.drawCircle(g,550,175,80);
        //Expo.drawCircle(g,550,175,100);
        Expo.setColor(g,Expo.black);
        Expo.fillCircle(g,550,175,100);
        Expo.setColor(g,Expo.white);
        Expo.fillCircle(g,550,175,80);
        Expo.setColor(g,Expo.blue);
        Expo.fillCircle(g,550,175,60);
        Expo.setColor(g,Expo.red);
        Expo.fillCircle(g,550,175,40);
        Expo.setColor(g,Expo.yellow);
        Expo.fillCircle(g,550,175,20);
        Expo.setColor(g,Expo.black);
        // DRAW TRIANGLE
        Expo.drawLine(g,550,375,600,500);
        Expo.drawLine(g,550,375,500,500);
        Expo.drawLine(g,600,500,500,500);
        Expo.drawLine(g,575,437,500,500);
        Expo.drawLine(g,525,437,600,500);
        Expo.drawLine(g,550,375,550,500);
        // DRAW SMILEY FACE
        Expo.drawOval(g,350,450,100,150);
        Expo.drawCircle(g,300,400,25);
        Expo.drawCircle(g,400,400,25);
        Expo.drawPoint(g,400,400);
        Expo.drawPoint(g,300,400);
        Expo.drawArc(g,300,385,30,25,270,90);
        Expo.drawArc(g,400,385,30,25,270,90);
        Expo.drawArc(g,350,450,75,100,90,270);
        // DRAW JPII
        Expo.drawLine(g,50,650,100,650); // start of L
        Expo.drawLine(g,50,650,50,800);
        Expo.drawLine(g,50,800,150,800);
        Expo.drawLine(g,150,800,150,760);
        Expo.drawLine(g,150,760,100,760);
        Expo.drawLine(g,100,760,100,650);
        Expo.drawLine(g,175,650,175,800); //start of P
        Expo.drawLine(g,175,650,250,650); //top of P (might need revision)
        Expo.drawLine(g,175,800,225,800);
        Expo.drawLine(g,225,800,225,725);
        Expo.drawLine(g,225,725,250,725); //bottom of arc
        Expo.drawArc(g,250,687,25,37,0,180);
        Expo.drawArc(g,245,687,10,20,0,180);
        Expo.drawLine(g,245,667,225,667); //top of inside arc
        Expo.drawLine(g,245,707,225,707); //bottom of arc
        Expo.drawLine(g,225,707,225,667); 
        Expo.drawLine(g,300,650,350,800); //start of W
        Expo.drawLine(g,300,650,325,650);
        Expo.drawLine(g,325,650,370,775);
        Expo.drawLine(g,350,800,380,800);
        Expo.drawLine(g,380,800,420,675);
        Expo.drawLine(g,370,775,410,650);
        Expo.drawLine(g,410,650,435,650);
        Expo.drawLine(g,435,650,465,775); 
        Expo.drawLine(g,420,675,450,800);
        Expo.drawLine(g,450,800,475,800);
        Expo.drawLine(g,475,800,525,650);
        Expo.drawLine(g,500,650,525,650);
        Expo.drawLine(g,465,775,500,650);
    }
}


