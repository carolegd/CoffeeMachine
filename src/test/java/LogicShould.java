import org.junit.Assert;
import org.junit.Test;

public class LogicShould {
    @Test
    public void translateOrderForChocolateWithNoSugar() {
        Order order = new Order("Chocolate", 0);
        Assert.assertTrue(Logic.orderTranslation(order).equals("H::"));
    }

    public void translateOrderForChocolateWithNoSugar() {
        Order order = new Order("Chocolate", 0);
        Assert.assertTrue(Logic.orderTranslation(order).equals("H::"));
    }
}


