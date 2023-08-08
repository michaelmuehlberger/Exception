/*
 * Exceptions
 * Project handeling and creating exceptions
 * Author:       Michael Muehlberger
 * Last Change:  27.03.2023
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import static java.lang.Double.parseDouble;

public class Application {

    static void printLine(){

        System.out.println("");

        for(int i=0; i < 19; i++){
            System.out.print("#");
        }

        System.out.println("#");
    }

    static boolean checkZero(int x) throws MuehlbergerException {

        if(x != 0){
            return true;
        }
        else{
            throw new MuehlbergerException("Muehlberger's custom message", new ArithmeticException("/ by zero"));
        }

    }

    public static void main(String[] args) throws MuehlbergerException {

        final int ARRAY_BOUND = 4;
        int[] excArray = new int[ARRAY_BOUND];


        //Exception1
        System.out.println("Exception 1: ArrayIndexOutOfBoundsException");

        for(int i = 0; i <= ARRAY_BOUND; i++){
            try{
                excArray[i] = i;
            }
            catch (ArrayIndexOutOfBoundsException e){
                e.printStackTrace();
                System.out.println("\nException handling of ArrayIndexOutOfBoundsException completed (Exception1)");
            }
        }

        printLine();
        System.out.println("");

        //Exception2
        System.out.println("Exception 2: ClassNotFoundException");

        try{
            Class newInstance = Class.forName("NoClass");
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
            System.out.println("\nException handling of ClassNotFoundException completed (Exception2)");
        }

        printLine();
        System.out.println("");

        //Exception3
        System.out.println("Exception 3: FileNotFoundException");

        String filePath = "C:\\Users\\micha\\IdeaProjects\\Exceptions\\src\\testFile.txt";

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("\nException handling of FileNotFoundException completed (Exception3)");
        }

        printLine();
        System.out.println("");

        //Exception4
        System.out.println("Exception 4: NumberFormatException");

        String stringToDouble = "iAmAStringAndNotADouble";
        double doubleString = 0.0;

        try {
            doubleString = parseDouble(stringToDouble);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("\nException handling of NumberFormatException completed (Exception4)");
        }

        printLine();
        System.out.println("");

        //Exception5
        System.out.println("Exception 5: MuehlbergerException");

        int x,z = 1;
        int y = 0;

        try{
            boolean b = checkZero(y);
        }
        catch (MuehlbergerException e){
            e.printStackTrace();
            System.out.println("\nException handling of MuehlbergerException completed (Exception5)");
        }

        printLine();
        System.out.println("Program execution finished :-)");

    }
}
