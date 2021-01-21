package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

//1. ask user for radius
//2. calculate area
//3. print result (the area) to screen
public class Area {
    // need a main method to create a starting point
    public static void main(String[] args){
        //create a new instance of your class (class can be data type)
        // static means you can't access other parts of the class.??(i think??) i.e. "this" won't work
        Area area = new Area();
        area.calculateArea();
    }
    //declare class variables here

    //create constructor
    public Area(){

    }

    //create all other methods //void means you dont return anything
    public void calculateArea(){
        //Ask for the radius
        Scanner input = new Scanner (System.in);
        Double myUsersRadius = input.nextDouble();

        //calculate the area
        //area is pi * r * r
        Double area = Circle.getArea(myUsersRadius);

        //print result
        System.out.println(area);

        //close the scanner
        input.close();


    }

}
