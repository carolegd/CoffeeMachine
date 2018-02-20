public class Logic {

    public static String translate(Order order) {
        String command = "H:";
        if (order.getDrink().equals("tea"))
            command = "T:";
        if (order.getDrink().equals("coffee"))
            command = "C:";
        if (order.getNumberOfSugars()>0)
            command = command + String.valueOf(order.getNumberOfSugars())+ ":" + 0;
        else
            command = command + ":";
        return command;
    }
}
