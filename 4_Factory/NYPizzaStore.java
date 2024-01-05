public class NYPizzaStore extends PizzaStore
{
    protected Pizza createPizza(String type)
    {
        if(type == "cheese")
        {
            return new NYStyleCheesePizza();
        }
        if(type == "pepperoni")
        {
            return new NYStylePepperoniPIzza();
        }

        return null;
    }
}
