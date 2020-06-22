import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class RunoffRainfall {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


//        GETTING INPUT
        System.out.println("Length of the roof?");
        int roofLength = input.nextInt();
        roofLength = roofLength * 12;               //convert roofLength to inches

        System.out.println("Width of the roof?");
        int roofWidth = input.nextInt();
        roofWidth = roofWidth * 12;                 //convert roofWidth to inches

        System.out.println("How many inches of rain?");
        double rainFall = input.nextInt();

//        CALCULATING THE RESULT
        double cubicWater = roofLength * roofWidth * rainFall;

        double gallonWater = cubicWater / 231;      //convert cubic inches of water to gallons

//        DISPLAYING OUTPUT
        System.out.println("The runoff is " + gallonWater + " gallons of water." );


    }
}
