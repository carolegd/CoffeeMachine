public class Logic {

    private final static String SEPARATION = ":";

    public static String translate(Order order) {
        String command="";
        for (Drink drink: Drink.values()){
            if (order.getDrink().equals(drink.getDrinkName()))
                command=drink.getCode();
        }
        command = command + SEPARATION;
        if (order.getNumberOfSugars() > 0)
            command = command + String.valueOf(order.getNumberOfSugars()) + SEPARATION + 0;
        else
            command = command + SEPARATION;
        return command;
    }
}
