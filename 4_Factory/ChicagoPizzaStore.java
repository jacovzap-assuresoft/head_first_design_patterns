public class ChicagoPizzaStore extends PizzaStore
{
    protected Pizza createPizza(String type)
    {
        if(type == "cheese")
        {
            return new ChicagoStyleCheesePizza();
        }

        return null;
    }
}
