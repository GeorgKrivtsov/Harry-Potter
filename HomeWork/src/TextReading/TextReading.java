package TextReading;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class TextReading {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите путь к файлу:");

        String path = sc.nextLine();

        File file = new File(path);

        Scanner scanner = new Scanner(file);

        String line = scanner.nextLine();
        String[] words = line.split(" ");

        System.out.println(Arrays.toString(words));




    }
}
