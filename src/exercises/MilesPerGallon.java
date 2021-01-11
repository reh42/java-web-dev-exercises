package exercises;
import java.util.Scanner;
public class MilesPerGallon {

    public static void main(String[] args){
        MilesPerGallon milesPerGallon = new MilesPerGallon();
        milesPerGallon.calculateMilesPerGallon();
    }
    public void calculateMilesPerGallon(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How man miles have your driven?");
        Double milesDriven = scanner.nextDouble();

        System.out.println("How much gas have you consumed?");
        Double gasConsumed = scanner.nextDouble();

        //miles per gallon = miles / gallons;
        Double milesPerGallon = milesDriven / gasConsumed;
        System.out.println("Yous miles per gallon is: " + milesPerGallon.toString());

    }

}
