package serialization_11.Practice1;

import java.io.*;
import java.nio.file.Path;

public class SerExample {
    static void main(String[] args) throws IOException, ClassNotFoundException{
        Player john = new Player(12, "john", 12.5);
        Path path = Path.of("src/serialization_11/Practice1/file.out");
        write(path, john);
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path.toFile())))
        {
            objectInputStream.readObject();
        }
    }

    private static void write(Path path, Player player) throws IOException {
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path.toFile())))
        {
            objectOutputStream.writeObject(player);
        }
    }
}


