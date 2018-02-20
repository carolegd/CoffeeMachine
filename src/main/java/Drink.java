public enum Drink {
    CHOCOLATE("chocolate", "H"),
    TEA("tea", "T"),
    COFFEE("coffee", "C");

    private final String drinkName; //for user interface
    private final String code; //for Drink maker

    Drink(String DrinkName, String code) {
        this.drinkName = DrinkName;
        this.code = code;
    }

    public String getDrinkName() {
        return this.drinkName;
    }

    public String getCode() {
        return this.code;
    }

}
