package Questions_in_to_advance.FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class File {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the filename ");
        String filename = sc.next();


        try(FileReader fr = new FileReader(filename)){
            int read = 0;
            while((read = fr.read()) != -1){
                System.out.println((char)read);
            }
        }catch (FileNotFoundException exc){
            System.out.println(filename+" not found..");
        }
        catch (IOException e){
            System.out.println("Exception occurred.."+e.getMessage());
        }

    }
}
