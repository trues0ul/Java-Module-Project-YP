import java.util.ArrayList;

class Calculator {
    private static Calculator calculator;
    private ArrayList<Item> items = new ArrayList<>();
    private Calculator() {

    }
    public static Calculator getInstance() {
        if(calculator == null) {
            calculator = new Calculator();
        }

        return calculator;
    }
    public  void addItem(Item itemtoadd) {
        items.add(itemtoadd);
        System.out.println("Товар успешно добавлен.");
    }
    public ArrayList<Item> getItems() {
        return items;
    }
    @Override
    public String toString() {
        String str = "";
        if(items.isEmpty())
            return str;
        for (Item item : items) {
            str = str + item.toString();
        }
        return str;
    }

    public double calculate(int numberOfPeople) {
       double totalBill = 0;
        for (Item item : items) {
            totalBill = totalBill + item.getPrice();
        }
        return totalBill / numberOfPeople;
    }
}