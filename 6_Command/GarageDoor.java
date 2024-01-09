public class GarageDoor {
    private String location = "";

    public GarageDoor (String location) {
        this.location = location;
    }

    public void up() {
        System.out.println(location + " garage door is up");
    }

    public void down() {
        System.out.println(location + " garage door is down");
    }

    public void stop() {
        System.out.println(location + " garage door is stopped");
    }
}
