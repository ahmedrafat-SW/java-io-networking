package com.dev.bytestream;

import java.io.FileInputStream;

public class InputStream {

    public static void main(String[] args) {

        /**
         * used file input stream which is a byte stream
        * */
        try (FileInputStream fileInputStream = new FileInputStream("java-io/test.txt")){

            int data = fileInputStream.read();
            while (data != -1){
                System.out.printf("%s", (char) data);
                data = fileInputStream.read();
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
