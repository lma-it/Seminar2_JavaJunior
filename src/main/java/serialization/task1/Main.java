package serialization.task1;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String str = "Всем привет!";
        FileOutputStream fileInputStream = new FileOutputStream("ser.txt");
        ObjectOutputStream objectInputStream = new ObjectOutputStream(fileInputStream);
        objectInputStream.writeObject(str);
        objectInputStream.close();
    }
}