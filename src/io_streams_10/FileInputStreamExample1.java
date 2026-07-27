package io_streams_10;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample1 {
    public static void main(String[] args) throws IOException {
        FileInputStream stream = new FileInputStream("resources/log.txt");
        byte[] buffer = new byte[5];
        int count = 0;
        while ((count = stream.read(buffer)) != -1)
        {
            String text = new String(buffer, 0, count);
            System.out.println(text);
        }
    }
}
