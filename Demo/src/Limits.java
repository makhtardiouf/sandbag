// Limits of java data types
import java.lang.*;
import java.io.*;

class Limits {

    public static void main(String[] args) {
        short a = 1;

        Integer minInt = Integer.MIN_VALUE;
        Integer maxInt = Integer.MAX_VALUE;

        Float minFl = Float.MIN_VALUE;
        Float maxFl = Float.MAX_VALUE;

        Double minDb = Double.MIN_VALUE;
        Double maxDb = Double.MAX_VALUE;

        System.out.println("Min/Max: " + a + " (" + Short.SIZE + " bits)\n "
        + minInt + "(" + Integer.SIZE + " bits) / " + maxInt);

        System.out.println(minFl + " (" + Float.SIZE + " bits) / " + maxFl);

        System.out.println(minDb + " (" + Double.SIZE + " bits) / " + maxDb);

        System.out.println("Size of byte: " + (Byte.SIZE) + " bits.");
        System.out.println("Size of short: " + (Short.SIZE) + " bits.");
        
        //System.out.println("Size of int: " + (Integer.SIZE) + " bits.");
        System.out.println("Size of long: " + (Long.SIZE) + " bits.");

        System.out.println("Size of char: " + (Character.SIZE) + " bits.");
        System.out.println("Size of float: " + (Float.SIZE) + " bits.");
        System.out.println("Size of double: " + (Double.SIZE) + " bits.");
      
    }

}