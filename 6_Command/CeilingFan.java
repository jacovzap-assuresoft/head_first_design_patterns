public class CeilingFan {
    private String location = "";

    public CeilingFan (String location) {
        this.location = location;
    }

    public void high() {
        System.out.println(location + " ceiling fan is on high");
    }

    public void medium() {
        System.out.println(location + " ceiling fan is on medium");
    }

    public void low() {
        System.out.println(location + " ceiling fan is on low");
    }

    public void off() {
        System.out.println(location + " ceiling fan is off");
    }

    public String toString() {
        return location + " ceiling fan";
    }
}
