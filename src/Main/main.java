package Main;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Films> filmsList = new ArrayList<>();
        filmsList.add(new Films("Test World", 1969));
        filmsList.add(new Films("Hello World", 1975));
        filmsList.add(new Films("Check World", 1984));
        filmsList.add(new Films("One World", 1926));
        filmsList.add(new Films("Poop World", 1956));

        Collections.sort(filmsList);

        try{
            FileOutputStream fos = new FileOutputStream("file.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(filmsList);
            oos.close();
            }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
