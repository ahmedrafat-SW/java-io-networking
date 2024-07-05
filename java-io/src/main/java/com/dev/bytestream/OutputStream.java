package com.dev.bytestream;

import java.io.FileOutputStream;

public class OutputStream {

    public static void main(String[] args) {
        try(FileOutputStream fileOutputStream = new FileOutputStream("java-io/test.txt")){
            String str = "this is a new string added to the text file using output stream";
            for (char c: str.toCharArray()){
                fileOutputStream.write(c);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
