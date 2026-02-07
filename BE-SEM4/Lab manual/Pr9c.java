import java.io.*;

public class Pr9c { //FileWriteDemo
    public static void main(String[] args) throws Exception {

        FileWriter fw = new FileWriter("sample.txt");
        fw.write("Hello, this is file handling in Java.\n");
        fw.write("Second line added.");
        fw.close();

        System.out.println("Data written successfully.");
    }
}
