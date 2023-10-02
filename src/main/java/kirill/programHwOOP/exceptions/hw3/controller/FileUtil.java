package kirill.programHwOOP.exceptions.hw3.controller;

import java.io.*;
import java.nio.file.Paths;
import java.util.List;

public class FileUtil {
    public static void writeToFile(List<String> input){
        String directory = "src/main/java/kirill/programHwOOP/exceptions/hw3/data";
        String filePath = Paths.get(directory, input.get(0) + ".txt").toString();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(input.toString().replaceAll("[\\[\\],]", ""));
            writer.newLine();
            System.out.println("Удачно записано!");
        } catch (IOException e) {
            System.out.println("Ошибка, связанная с файлом:");
            e.printStackTrace();
        }
    }
}
