
import java.io.*;

class E extends D {
    public E() {
        System.out.println("E constructor");
    }
}

class D {
    public int x;

    public D() {
        x = 3;
        System.out.println("D constructor");
    }

    public D(int a) {
        this();
        x = x + a;
    }

    public D(int a, int b) {
        this(b);
        x = x - a;
    }
}

class Sandbag {
    public static void main(String[] args) {
        D d = new D(5, 6);
        System.out.println(d.x);
        E e = new E();
        // e = (E) d;
        d = e;
    }
}