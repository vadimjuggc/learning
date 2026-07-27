package io_streams_10;

import java.io.File;
import java.io.IOException;

public class FileExample1 {
    public static void main(String[] args) throws IOException {
        File file = new File("resources/log.txt");
        if(file.exists())
        System.out.println("файл существует, размер: " + file.length());
        else
        file.createNewFile();
    }
}
