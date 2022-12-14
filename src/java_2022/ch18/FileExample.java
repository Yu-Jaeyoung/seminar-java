package java_2022.ch18;

import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;

public class FileExample {
    public static void main(String[] args) throws Exception {
        File dir = new File("src/java_2022.ch4.ch18/Dir");
        File file1 = new File("src/java_2022.ch4.ch18/file1.txt");
        File file2 = new File("src/java_2022.ch4.ch18/file2.txt");
        //File file3 = new File(new URI("file:/src/java_2022.ch4.ch18/file3.txt"));


        if (dir.exists() == false) {
            dir.mkdir();
        }

        if (file1.exists() == false) {
            file1.createNewFile();
        }

        if (file2.exists() == false) {
            file2.createNewFile();
        }

        /*if (file3.exists() == false) {
            file3.createNewFile();
        }*/

        File temp = new File("src/java_2022.ch4.ch18");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd    a    HH:mm");
        File[] contents = temp.listFiles();
        System.out.println("날짜            시간          형태      크기      이름");
        System.out.println("------------------------------------------------");
        for (File file : contents) {
            System.out.print(sdf.format(new Date(file.lastModified())));
            if (file.isDirectory()) {
                System.out.println("\t<DIR>\t\t\t" + file.getName());
            } else {
                System.out.println("\t\t\t" + file.length() + "\t" + file.getName());
            }
            System.out.println();
        }
    }
}
