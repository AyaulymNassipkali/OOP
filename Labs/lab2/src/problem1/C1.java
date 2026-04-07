package problem1;

import java.util.HashMap;
import java.util.HashSet;

public class C1 {
    public static void main(String[] args){
        Film f1 = new Film("Harry Potter", 152,  2001);
        Film f2 = new Film("Academy Umbrella", 540, 2019);
        Film f3 = new Film("Harry Potter", 152,  2001);

        System.out.println(f1.equals(f3));
        System.out.println(f2.equals(f3));

        HashSet<Film> film = new HashSet<>();
        film.add(f1);
        film.add(f2);
        film.add(f3);

        System.out.println("uni films:" + film.size());


    }
}
