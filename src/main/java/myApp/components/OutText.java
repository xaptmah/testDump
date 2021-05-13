package myApp.components;

import java.io.*;
import java.util.Scanner;

public class OutText {
    String hell = "hello";
    String path = "hello.txt";
    File file = new File(path);
    //Scanner scanner = new Scanner();


    public String hell() throws IOException {
        //System.out.println("qwert");
       // System.out.println(file.exists());
        InputStream in = getClass().getResourceAsStream("/hello.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        String line;

        while ((line = reader.readLine()) !=null){
            System.out.println(line);
        }
        in.close();
        reader.close();

        //System.out.println(in);

        return hell;
    }
    public static void main(String ... args) throws IOException {
        new OutText().hell();
    }
}
