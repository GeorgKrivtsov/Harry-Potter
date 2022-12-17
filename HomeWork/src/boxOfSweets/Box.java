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

        for (int i = 1; i < countCookies + 1; i++) {
            Cookies cookies = new Cookies("Cookies", 5, 10, i);
            box.addSweets(cookies);
        }

        System.out.println("Сколько положить шоколада?");
        int countChocolate = sc.nextInt();

        for (int i = 1; i < countChocolate + 1; i++) {
            Chocolate chocolate = new Chocolate("Chocolate", 10, 15, i);
            box.addSweets(chocolate);
        }

        System.out.println("Сколько положить конфет?");
        int countCandies = sc.nextInt();

        for (int i = 1; i < countCandies + 1; i++) {
            Candies candies = new Candies("Candies", 3, 5, i);
            box.addSweets(candies);
        }


        System.out.println("Общий вес подарка: " + box.getWeight());
        System.out.println("Общая стоимость подарка: " + box.getPrice());

        System.out.println();
        System.out.println("Общий список:");
        box.getAllInfo();

        box.removeSweets();


    }


    @Override //удалить по индексу (1 вариант)
    public void removeSweets() {
        System.out.println("В списке " + boxOfSweets.size() + " элементов. Какой удалить?");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        boxOfSweets.remove(i);
        System.out.println("В списке соталось " + boxOfSweets.size() + " элементов.");
    }

    @Override //Получить вес коробки
    public int getWeight() {
        int count = 0;
        for (Sweets sweets : boxOfSweets) {
            count += sweets.getWeight();
        }
        return count;

    }

    @Override //получить цену коробки
    public int getPrice() {
        int price = 0;
        for (Sweets sweets : boxOfSweets) {
            price += sweets.getPrice();
        }
        return price;
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

    /*@Override //удалить последний элемент (2 вариант)
    public void removeSweets() {
        System.out.println("В списке " + boxOfSweets.size() + " элементов. Удалить последний? (Y/N)");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        int item = boxOfSweets.size()-1;
        if (answer.equalsIgnoreCase("Y")) {
            boxOfSweets.remove(item);
            System.out.println("Элемент "+ ++item +"удален. Осталось "+ boxOfSweets.size() +"элементов");
        } else if (answer.equalsIgnoreCase("N")) {
            System.out.println("Список остался без изменений. Количество элементов: " + boxOfSweets.size());
        }
    }*/

    @Override
    public void smartSort() {

        System.out.println("Хотите отсортировать по весу(1) или по цене(2)?");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();




    }
}
