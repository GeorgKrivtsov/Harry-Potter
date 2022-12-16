package boxOfSweets;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Box implements BoxInterface {

    private List<Sweets> boxOfSweets = new ArrayList<>();


    public static void main(String[] args) {
        Box box = new Box();
        Scanner sc = new Scanner(System.in);

        System.out.println("Время наполнить коробку!");

        System.out.println("Сколько положить печенья?");
        int countCookies = sc.nextInt();

        System.out.println("Сколько положить шоколада?");
        int countChocolate = sc.nextInt();

        System.out.println("Сколько положить конфет?");
        int countCandies = sc.nextInt();

        for (int i = 1; i < countCookies + 1; i++) {
            Cookies cookies = new Cookies("Cookies", 5, 10, i);
            box.addSweets(cookies);
        }

        for (int i = 1; i < countChocolate + 1; i++) {
            Chocolate chocolate = new Chocolate("Chocolate", 10, 15, i);
            box.addSweets(chocolate);
        }

        for (int i = 1; i < countCandies + 1; i++) {
            Candies candies = new Candies("Candies", 3, 5, i);
            box.addSweets(candies);
        }


        box.getWeight();
        box.getPrice();

        System.out.println();
        System.out.println("Общий список:");
        box.getAllInfo();

        box.removeSweets();


    }


    @Override //удалить последний или по индексу
    public void removeSweets() {
        System.out.println("В списке " + boxOfSweets.size() + " элементов. Какой удалить?");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        boxOfSweets.remove(i);

        System.out.println("В списке соталось " + boxOfSweets.size() + " элементов.");

    }

    @Override //Получить вес коробки
    public void getWeight() {
        int count = 0;
        for (Sweets sweets : boxOfSweets) {
            count += sweets.getWeight();
        }
        System.out.println("Общий вес подарка: " + count);

    }

    @Override //получить цену коробки
    public void getPrice() {
        int price = 0;
        for (Sweets sweets : boxOfSweets) {
            price += sweets.getPrice();
        }
        System.out.println("Общая стоимость подарка: " + price);
    }

    @Override //получить информацию о каждом подарке
    public void getAllInfo() {
        for (Object o : boxOfSweets) {
            System.out.println(o);
        }
    }

    @Override //добавить в коробку сладость
    public void addSweets(Object o) {
        boxOfSweets.add((Sweets) o);
    }

}
