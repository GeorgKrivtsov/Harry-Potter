package Parser;

import java.io.FileNotFoundException;
import java.io.IOException;
import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.FileReader;
import java.util.List;

public class GsonParser {


    public Companies parse() {

        Gson gson = new Gson();

        try(FileReader reader = new FileReader("Test.json")) {

            Companies companies = gson.fromJson(reader, Companies.class);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");;
        } catch (IOException e) {
            System.out.println("Другая ошибка");;
        }

        return null;
    }


}
