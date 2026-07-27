package io_streams_10;

import java.io.File;
import java.util.Arrays;

public class FileExample3 {
    public static void main(String[] args) {
        File file = new File(".");
        Arrays.stream(file.listFiles()).filter(File::isFile).filter(f -> f.getName().endsWith(".txt")).forEach(System.out::println);
    }
}
