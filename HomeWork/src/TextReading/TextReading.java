package TextReading;

import org.w3c.dom.Text;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class TextReading {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<String,Integer>();

        System.out.println("Введите путь к файлу:");
        // /Users/georgijkrivcov/Desktop/текст для примера.txt

        String path = sc.nextLine();
        String[] arrayString = getArrays(path);
        Arrays.sort(arrayString);

        int arraysSize = arrayString.length;
        System.out.println("В тексте " + arraysSize + " слов");

        for (String s : arrayString) {
            if (map.containsKey(s)) {
                int i = map.get(s);
                map.put(s, i+1);

            } else {
                map.put(s,1);
            }
        }

        for (String key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println(key + " -> " + value);
        }




        //System.out.println(Arrays.toString(arrayString));








    }


    public static String[] getArrays (String path) {
        try {
            String lines = Files.readString(Path.of(path));
            String[] array = lines.split("[ ,.\\n]+");
            return array;
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return new String[0];
    }
}
