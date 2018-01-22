package examples;

import personalised.library.GraphDB.SimpleGraph;
import java.util.*;

public class Example1 {

    public static void main(String args[]){
        SimpleGraph g = new SimpleGraph("Database.db");

        // creating a sample database
        g.add("John", "wrote", "A");
        g.add("Mike", "wrote", "A");
        g.add("Mike", "wrote", "B");
        g.add("Ram", "bought", "A");
        g.add("Shyam", "bought", "B");

        // lets save it
        try {
            g.commit();
            SimpleGraph g2 = new SimpleGraph("Database.db");
            g2.load();
            System.out.println(g2.map(null, "wrote", null));
            System.out.println(g2.list("Mike", null, "A"));
        } catch (Exception e){
            System.out.println(e.toString());
        }

    }
}