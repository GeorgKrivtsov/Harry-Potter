package Parser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, ParseException {


        JsonParser parser = new JsonParser();
        Companies companies = parser.parse();

        System.out.println(companies);

        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");

        for (int i = 0; i < companies.getCompanies().size(); i++){

            System.out.println("Краткое название: " + companies.getCompanies().get(i).getName() +
            " - Дата основания: " + dateFormat.format(companies.getCompanies().get(i).getFounded()));
        }

        System.out.println("Дейсвтующие ценные бумаги:");
        int count = 0;
        for (int i = 0; i < companies.getCompanies().size(); i++){
            for (int k = 0; k < companies.getCompanies().get(i).getSecurities().size()-1; k++){
                if (companies.getCompanies().get(i).getSecurities().get(k).getDate().after(date) ) {
                    System.out.println("id: " + companies.getCompanies().get(i).getSecurities().get(k).getCode() +
                            " Название бумаги: " +companies.getCompanies().get(i).getSecurities().get(k).getName() +
                            " Дата истечения: " + dateFormat.format(companies.getCompanies().get(i).getSecurities().get(k).getDate()) +
                            " Организация-собственник: " + companies.getCompanies().get(i).getName());
                }
                count += k;
            }
        }
        System.out.println("Всего бумаг:");
        System.out.println(count);


        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дату: ");
        String insertDate = sc.nextLine();

        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String insertDate = reader.readLine();

        Date dateFound = dateFormat.parse(insertDate);
        //sc.close();

        System.out.println("Организации основанные после " + insertDate + ":");

        for ( int i = 0; i < companies.getCompanies().size(); i++) {
            if(companies.getCompanies().get(i).getFounded().after(dateFound)) {
                System.out.println(" Название: " + companies.getCompanies().get(i).getName() +
                        " Дата основания: " + companies.getCompanies().get(i).getFounded());
            }


        }








    }
}
