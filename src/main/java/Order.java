public class Order {
    private String drink;
    private int numberOfSugars;

    public Order(String drink, int numberOfSugars) {
        this.drink = drink;
        this.numberOfSugars = numberOfSugars;
    }

    public int getNumberOfSugars() {
        return numberOfSugars;
    }

    public String getDrink() {
        return drink;
    }
}
