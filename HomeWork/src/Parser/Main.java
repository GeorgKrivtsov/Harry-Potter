package Parser;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {


        JsonParser parser = new JsonParser();
        Companies companies = parser.parse();

        System.out.println(companies);

        companies.getCompanies().stream()







    }
}
