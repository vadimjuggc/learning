package io_streams_10;

import java.io.File;
import java.io.IOException;

public class FileExample2 {
    public static void main(String[] args) throws IOException {
        File file = new File("myProject/images");
        file.mkdirs();
        System.out.println(file.isDirectory());
    }
}
