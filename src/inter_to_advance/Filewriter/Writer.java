package inter_to_advance.Filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void main(String[] args) throws IOException{
        String filename = "C:\\Users\\swaya\\IdeaProjects\\JAVA\\src\\inter_to_advance\\Filewriter\\java.txt";
        try (FileWriter fw = new FileWriter(filename)){
            try {
                fw.write("this is the file.. HELLO");
                fw.flush();
            } catch (IOException exception) {
                System.out.println("IO Found" + exception.getMessage());
                exception.getStackTrace();
            }
        }
    }
}
