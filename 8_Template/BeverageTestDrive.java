public class BeverageTestDrive
{
    public static void main(String[] args)
    {
        Tea tea = new Tea();
        Coffe coffe = new Coffe();

        System.out.println("Preparing tea...");
        tea.prepareRecipe();

        System.out.println("Preparing coffee...");
        coffe.prepareRecipe();
    }
}
