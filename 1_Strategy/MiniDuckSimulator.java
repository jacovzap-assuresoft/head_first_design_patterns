public class MiniDuckSimulator {
    public static void main (String[] args) { 
        System.out.println("----- Mallard Duck -----");
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        System.out.println("----- Model Duck ------");
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
