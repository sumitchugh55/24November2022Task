import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
 
/**
 * This program demonstrates how to write characters to a text file
 * using a BufferedReader for efficiency.
 * @author www.codejava.net
 *
 */
public class Writing_Text_File{
 
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("MyFile.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
 
            bufferedWriter.write("Hello My name is Sumit chugh. I am seeking training from Anudip Foundation");
            bufferedWriter.newLine();
            bufferedWriter.write("See You Later");
 
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
 
    }
 
}