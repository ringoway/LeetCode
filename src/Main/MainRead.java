package Main;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainRead {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("file.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            List<Films> filmsList = (ArrayList<Films>) ois.readObject();
            System.out.println(Arrays.toString(new List[]{filmsList}));

            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
