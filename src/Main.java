import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Directory movies = new Directory("movies");
        Directory comedy = new Directory("comedy");
        File housefull = new File("housefull");
        File avataar = new File("Avataar");

        comedy.add(housefull);
        movies.add(avataar);
        movies.add(comedy);

        movies.ls();

    }
}