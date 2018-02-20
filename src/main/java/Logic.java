public class Logic {

    private final static String SEPARATION = ":";

    public static String translate(Order order) {
        String command = "H";
        if (order.getDrink().equals("tea"))
            command = "T";
        if (order.getDrink().equals("coffee"))
            command = "C";
        command = command + SEPARATION;
        if (order.getNumberOfSugars() > 0)
            command = command + String.valueOf(order.getNumberOfSugars()) + SEPARATION + 0;
        else
            command = command + SEPARATION;
        return command;
    }
}
