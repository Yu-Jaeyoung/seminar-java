package ch18;

import java.io.*;

public class SerializableWriter {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        ClassA classA = new ClassA();
        classA.field1 = 1;
        classA.field2.field1 = 2;
        classA.field3 = 3;
        classA.field4 = 4;
        oos.writeObject(classA);
        oos.flush();
        oos.close();
        fos.close();

    }
}
