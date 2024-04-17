class Item {
    private String name;
    private double price;

    private Formatter f;

    public Item(String name, double price) {
        this.name = name;
        this.price = Math.round(price * 100.0) / 100.0;
        this.f = new Formatter(price);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return name + " " + String.format("%.2f", price) + " " + f.toString() + "/n";
    }
}

