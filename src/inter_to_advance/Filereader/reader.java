package inter_to_advance.Filereader;

import java.io.FileReader;
import java.io.IOException;

public class reader {
    public static void main(String[] args) throws IOException {
        String filename = "C:\\Users\\swaya\\IdeaProjects\\JAVA\\src\\inter_to_advance\\Filewriter\\java.txt";
        try(FileReader read  = new FileReader(filename)){
            int reader = 0;
            do{
                reader = read.read();
                System.out.print((char)reader);
            } while(reader != -1);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
