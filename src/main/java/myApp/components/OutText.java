package myApp.components;

import java.io.File;

public class OutText {
    String hell = "hello";
    String path = "hello.txt";
    File file = new File(path);


    public String hell(){
        System.out.println("qwert");
        System.out.println(file.exists());
        return hell;
    }
}
