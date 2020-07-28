package random.program;

import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class LargeFileReading {
    public static void main(String[] args) throws Exception {

        //logic on how ----NOT------
        // to read a large file. this will bring all the data into the memory and will make the server crash.

        String p = "E:\\large file for test.txt";
        Path path = Paths.get(p);
        //List<String> s = Files.readAllLines(path);
        //System.out.println(s.get(0));

        //logic on how to read a large file. this will bring all the data into the memory and will make the server crash.
        FileInputStream fis = new FileInputStream(p);
        Scanner sc = new Scanner(fis, "UTF-8");
        try {
            int i = 0;
            while (sc.hasNext())
                System.out.println(i++ + ". " + sc.nextLine());

        } finally {
            if (fis != null)
                fis.close();

            if (sc != null)
                sc.close();
        }
    }
}
