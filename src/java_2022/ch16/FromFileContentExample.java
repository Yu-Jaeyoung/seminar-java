package java_2022.ch16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromFileContentExample {
    public static void main(String[] args) throws IOException{
        Path path = Paths.get("src/java_2022.ch4.ch16/linedata.txt"); // 파일 경로 정보를 가지고 있는 Path 생성
        Stream<String> stream;

        // Files.lines() 메소드 이용
        stream = Files.lines(path, Charset.defaultCharset()); // 운영체제의 기본 문자 셋
        stream.forEach( System.out :: println); // s-> System.out.println(s)와 동일
        System.out.println();

        //BufferedReader의 lines() 메소드 이용
        File file = path.toFile();
        FileReader fileReader = new FileReader(file);
        BufferedReader br = new BufferedReader(fileReader);
        stream = br.lines();
        stream.forEach(System.out :: println);
    }
}
