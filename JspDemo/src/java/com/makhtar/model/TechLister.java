package com.makhtar.model;

import java.util.*;

/**
 *
 * @author Makhtar Diouf
 */
public class TechLister {

    public List getTrends(String tech) {
        List trends = new ArrayList();
        if (tech.equals("c") || tech.equals("cpp")) {
            trends.add("C++");
            trends.add("C#");
        } else {
            trends.add("PHP");
            trends.add("JSP");
            trends.add("ASP");
        }

        return trends;
    }
}
