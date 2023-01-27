import java.util.Scanner;

/**
 * Skill Builder 1
 *
 * @author (You)
 * @version (2.1, 2.2)
 */
public class SkillBuilder1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("You're Jane's friend!");
        System.out.println("\"What's your name?\"");
        String userName = input.nextLine();

        System.out.println("Enter a floating-point number:");
        double spice = input.nextDouble();
        //PY:2**3
        //Java: Math.pow(2,3)
        double nom = Math.pow(spice,3);
        double num = Math.sqrt(5);
        double noom = (4.0/3)*Math.pow(2,(num/nom));

        System.out.println("Well " + userName +", the spice value resulted in " + noom);

        System.out.println("And the converted value is ");
        double runds = Math.round(noom * 100.0)/100.0;
        System.out.println(runds);


    }
    public static void calcWallPaint() {
        Scanner input = new Scanner(System.in);
        double wallHeight;
        double wallWidth;
        double wallArea;
        double gallonsPaintNeeded;
        int cansNeeded;

        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;

        // Prompt user to input wall's width
        System.out.println("Enter wall height (feet):");
        wallHeight = input.nextDouble();
        //System.out.println(wallHeight);

        // Prompt user to input wall's width
        System.out.println("Enter wall width (feet):");
        wallWidth = input.nextDouble();
        //System.out.println(wallWidth);

        // TODO: Calculate and output the wall's area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: "+ wallArea + " square feet");

        // TODO: Calculate and output the amount of paint in gallons needed to paint the wall
        gallonsPaintNeeded = wallArea/squareFeetPerGallons;
        System.out.printf("Paint needed: "+ String.format("%,.2f", gallonsPaintNeeded) + "gallons");
        //System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");


        // TODO: Calculate and output the number of 1 gallon cans needed to paint the wall, rounded up to nearest integer
        cansNeeded = (int)(Math.ceil(gallonsPaintNeeded/gallonsPerCan));
        System.out.println("Cans needed: " + cansNeeded + " can(s)");
    }
}
