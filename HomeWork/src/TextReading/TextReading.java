package TextReading;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class TextReading {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите путь к файлу:");
        //пример пути: /Users/georgijkrivcov/Desktop/текст для примера.txt

        String path = sc.nextLine();

        String[] arrayString = getArrays(path);
        Arrays.sort(arrayString);

        int arraysSize = arrayString.length;
        System.out.println("В тексте " + arraysSize + " слов");

        HashMap<String, Integer> map = new HashMap<String,Integer>();

        //Заполняем мапу
        for (String s : arrayString) {
            if (map.containsKey(s)) {
                int i = map.get(s);
                map.put(s, i+1);

            } else {
                map.put(s,1);
            }
        }

        //выводим список всех слов
        for (String key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println("Слово " + key + " -> " + value + " (" + (double)(value * 100) / arraysSize + " %)");
        }


        List<String> keys = new ArrayList<>();
        int maxValue = 0;

        for (String key : map.keySet()) {
            if(map.get(key) > maxValue) {
                maxValue = map.get(key);
            }
        }

        for ( String key : map.keySet()) {
            if (map.get(key) == maxValue){
                keys.add(key);
            }
        }


        System.out.println("Самое частое слово или слова:");
        for (String str : keys) {
            System.out.println(str + "-->" + map.get(str) + "раз");
        }


    }


    public static String[] getArrays (String path) {

        try {
            String lines = Files.readString(Path.of(path).toAbsolutePath());
            String[] array = lines.split("[ ,.\\n]+");
            return array;
        }
        catch (IOException e) {
            System.out.println("не верно указан адрес документа");
        }

        return new String[0];
    }


}
