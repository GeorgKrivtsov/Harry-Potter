package Parser;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonParser {

    public Companies parse() throws IOException {


        ObjectMapper objectMapper = new ObjectMapper();

        return objectMapper.readValue(new File("Test.json"), Companies.class);

    }


}
