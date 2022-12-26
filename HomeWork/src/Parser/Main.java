package Parser;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException, ParseException {


        JsonParser parser = new JsonParser();
        Companies companies = parser.parse();

        //System.out.println(companies);

        Date date = new Date();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("dd.MM.yy");

        for (int i = 0; i < companies.getCompanies().size(); i++) {

            System.out.println("Краткое название: " + companies.getCompanies().get(i).getName() +
                    " - Дата основания: " + dateFormat.format(companies.getCompanies().get(i).getFounded()));
        }

        System.out.println("Дейсвтующие ценные бумаги:");
        int count = 0;

        //Определение действующих бумаг через циклы
        /*for (int i = 0; i < companies.getCompanies().size(); i++) {
            for (int k = 0; k < companies.getCompanies().get(i).getSecurities().size() - 1; k++) {
                if (companies.getCompanies().get(i).getSecurities().get(k).getDate().after(date)) {
                    System.out.println("code: " + companies.getCompanies().get(i).getSecurities().get(k).getCode() +
                            " Название бумаги: " + companies.getCompanies().get(i).getSecurities().get(k).getName() +
                            " Дата истечения: " + dateFormat.format(companies.getCompanies().get(i).getSecurities().get(k).getDate()) +
                            " Организация-собственник: " + companies.getCompanies().get(i).getName());
                }
            }
        }*/
        //Определение действующих бумаг через stream()
        companies.getCompanies().stream()
                .forEach(s -> s.getSecurities().stream()
                        .filter(e -> e.getDate().before(date))
                        .forEach(e -> System.out.println("code: " + e.getCode() +
                                " Название бумаги: " + e.getName() +
                                " Дата истечения: " + dateFormat.format(e.getDate()) +
                                " Организация-собственник: " + s.getName())));

        System.out.println("Всего бумаг:");

        //Определение уоличества бумаг
        for (int i = 0; i < companies.getCompanies().size(); i++) {
            for (int k = 0; k < companies.getCompanies().get(i).getSecurities().size() - 1; k++) {
                count ++;
            }
        }
        System.out.println(count);

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите дату: ");
        String insertDate = sc.nextLine();

        Date dateFound;

        if(insertDate.contains("/")){
            dateFound = dateFormat.parse(insertDate);
        } else {
            dateFound = dateFormat2.parse(insertDate);
        }


        System.out.println("Организации основанные после " + insertDate + ":");

        //Выввод организаций основынных после даты через циклы
        /*for (int i = 0; i < companies.getCompanies().size(); i++) {
            if (companies.getCompanies().get(i).getFounded().after(dateFound)) {
                System.out.println(" Название: " + companies.getCompanies().get(i).getName() +
                        " Дата основания: " + dateFormat.format(companies.getCompanies().get(i).getFounded()));
            }
        }*/

        ////Выввод организаций основынных после даты через stream()
        companies.getCompanies().stream()
                .filter(s -> s.getFounded().after(dateFound))
                        .forEach(s -> System.out.println("Название организации: " + s.getName() + " Дата основания: " + dateFormat.format(s.getFounded())));



        //Работает
        System.out.println("Какая валюта интересует?");
        String currency = sc.nextLine();

        System.out.println("Валюта: " + currency);
        System.out.println("Акции:");

        /*for (int i = 0; i < companies.getCompanies().size(); i++) {
            for (int k = 0; k < companies.getCompanies().get(i).getSecurities().size() - 1; k++) {
                for (int n = 0; n < companies.getCompanies().get(i).getSecurities().get(k).getCurrency().size(); n++){
                    if (companies.getCompanies().get(i).getSecurities().get(k).getCurrency().get(n).equalsIgnoreCase(currency)) {
                        System.out.println("id компании: " + companies.getCompanies().get(i).getId() +
                                " Название акции " + companies.getCompanies().get(i).getSecurities().get(k).getName());
                    }
                }
            }
        }*/

        companies.getCompanies().stream()
                        .forEach(e -> e.getSecurities().stream()
                                .forEach(s -> s.getCurrency().stream()
                                        .filter(n -> n.equalsIgnoreCase(currency))
                                        .forEach(n -> System.out.println("id компании: " + e.getId() +
                                                " Название акции:  " + s.getName() +
                                                " Код акции: " + s.getCode()))));



    }


}
