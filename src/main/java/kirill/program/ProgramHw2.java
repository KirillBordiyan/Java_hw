package kirill.program;
import kirill.helper.HelperHw2;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.nio.file.Path;

public class ProgramHw2 {
    public static void main(String[] args) {
        int[] arr = new int[] {9, 4, 8, 3, 1,11,2,13,25,6};
        HelperHw2 bubble = new HelperHw2();
        bubble.sort(arr);

        String path = "D:\\repositories\\YAP\\JAVA\\java_Hw\\file.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }

        }catch (IOException e){
            System.out.println("invalid file");
        }

    }
}
