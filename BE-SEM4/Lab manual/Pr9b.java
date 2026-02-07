import java.io.*;

public class Pr9b { //FileReadDemo
    public static void main(String[] args) throws Exception {

        File file = new File("sample.txt");
        file.createNewFile();   // create file

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }
}
