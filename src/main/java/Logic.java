public class Logic {

    public static String orderTranslation(Order order) {
        if (order.getNumberOfSugars()==2)
            return "H:2:0";
        if (order.getNumberOfSugars()>0)
            return "H:1:0";
        return "H::";
    }
}
