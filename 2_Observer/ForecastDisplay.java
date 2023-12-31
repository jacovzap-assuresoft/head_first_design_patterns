public class ForecastDisplay implements Observer, DisplayElement
{
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData)
    {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure)
    {
        this.temperature = temperature;
        display();
    }

    public void display()
    {
        System.out.println("TODAY THE TEMPERATURE IS :" + temperature);
    }
}
