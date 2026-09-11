package other.practice3;

import java.io.*;

public class Runner {
    static void main(String[] args) throws IOException {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("resources/notes.txt", true))) {
            bufferedWriter.write("ASDFFFGFDS\n");
            bufferedWriter.write("weqytew\n");
            bufferedWriter.write("asgadshe5");
        }
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("resources/notes.txt"));) {
            System.out.println(bufferedReader.readLine());
            System.out.println(bufferedReader.readLine());
            System.out.println(bufferedReader.readLine());

        }
    }
}
