public class Formatter {


    private double number;

    public Formatter(double number) {
        this.number = number;
    }
    @Override
    public String toString() {
        if (number == 0.00f || number >= 10.00f) {
            return "рублей";
        } else if (number == 1.00f) {
            return "рубль";
        } else {
            return "рубля";
        }
    }

}
