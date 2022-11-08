package Main;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MainRead {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("file.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            List<Films> filmsList = (ArrayList<Films>) ois.readObject();

            for (Films o: filmsList){
                System.out.println(o);
            }

            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
