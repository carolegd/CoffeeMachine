import org.junit.Assert;
import org.junit.Test;

public class LogicShould {
    @Test
    public void translateOrderForChocolateWithNoSugar() {
        Order order = new Order("Chocolate", 0);
        Assert.assertTrue(Logic.translate(order).equals("H::"));
    }

    @Test
    public void translateOrderForChocolateWithSugar() {
        Order order = new Order("Chocolate", 1);
        Assert.assertTrue(Logic.translate(order).equals("H:1:0"));
    }

    @Test
    public void translateOrderForChocolateWithTwoSugars() {
        Order order = new Order("Chocolate", 2);
        Assert.assertTrue(Logic.translate(order).equals("H:2:0"));
    }

    @Test
    public void translateOrderForOneTeaWithOneSugar() {
        Order order = new Order("tea", 1);
        Assert.assertTrue(Logic.translate(order).equals("T:1:0"));
    }

    @Test
    public void translateOrderForOneCoffeeWithTwoSugars() {
        Order order = new Order("coffee", 2);
        Assert.assertTrue(Logic.translate(order).equals("C:2:0"));
    }

}


