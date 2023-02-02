public class Soldier {
    protected String name;
    protected double baseAllowance;

    public Soldier (String name, double baseAllowance) {
        this.name = name;
        this.baseAllowance = baseAllowance;
    }

    public String getName() {
        return name;
    }
    public double getBaseAllowance() {
        return baseAllowance;
    }

    public double getGrossAllowance() {
        return baseAllowance;
    }

    public String toString() {
        return "Soldier{name='" + name + "', baseAllowance=" + baseAllowance + "}";
    }
}
