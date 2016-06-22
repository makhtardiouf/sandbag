
import java.lang.*;
import java.io.*;
import java.util.*;

/**
 * $Id$
 *
 * @author makhtar
 */
public class Demo {

    // Reverse a string
    static String reverse(String s) {
        char tmp;
        char[] ch = s.toCharArray();
        for (int i = 0, j = s.length() - 1; i < s.length() && j > i; i++, j--) {
            tmp = Character.toLowerCase(ch[i]);
            ch[i] = Character.toLowerCase(ch[j]);
            ch[j] = tmp;
        }
        return new String(ch);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String msg = "Hello World!";
        System.out.println(msg + " -> " + reverse(msg));

       // Map<Interger, String> m;
        StringBuilder sb = new StringBuilder();

        // (Obsolete) Vector is synchronized on every method, which means there's a 
        // (possible) performance penalty on every call for synchronization
        Vector<Integer> v = new Vector<Integer>();

        // Replacement for Vector
        ArrayList v2 = new ArrayList();

        for (int i = 0; i < 10; i++) {
            v.addElement(i * 10);
            v2.add(i * 10);
            sb.append("Idx" + i + ": " + i * 10 + ": ");
        }

        for (int i = 0; i < v2.size(); i++) {
            System.out.print(v2.get(i) + " ");
        }
        System.out.println();
        System.out.println(sb.toString());
    }

}
