package Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Films> filmsList = new ArrayList<>();
        filmsList.add(new Films("Test World", 1969));
        filmsList.add(new Films("Hello World", 1975));
        filmsList.add(new Films("Check World", 1984));
        filmsList.add(new Films("Poop World", 1956));

        Collections.sort(filmsList);

        for(Films a: filmsList){
            System.out.println(a);
        }
    }
}
