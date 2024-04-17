import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = Calculator.getInstance();

        int numberOfPeople;
        while (true) {
            System.out.println("На скольких человек необходимо разделить счёт?");
            numberOfPeople = scanner.nextInt();
            if (numberOfPeople == 1) {
                System.out.println("Разделить счёт на одного человека невозможно.");
            } else if (numberOfPeople < 1) {
                System.out.println("Некорректное количество человек. Введите число больше 1.");
            } else {
                break;
            }
        }


        while (true) {
            System.out.println("Введите названия товара: ");
            String itemName = scanner.nextLine();
            System.out.println("Введите стоимость товара в формате рубли.копейки :");
            double itemPrice = scanner.nextDouble();

            calculator.addItem(new Item(itemName, itemPrice));
            System.out.println("Хотите ли добавить еще один товар?[Если нет - завершить]");
            String answer = scanner.nextLine();

            if (answer.equals("завершить")) {
                String itemList = calculator.toString();
                System.out.println(itemList);
                Double pricePerson = calculator.calculate(numberOfPeople);
                Formatter formatter = new Formatter(pricePerson);
                System.out.println("Каждый должен заплатить " + pricePerson + " " + formatter.toString());
                break;
            }
        }
    }
}

