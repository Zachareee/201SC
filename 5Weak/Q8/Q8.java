
public class Q8 {
    private String t;

    public void set(String t) { this.t = t; }
    public String get() { return t; }


    public static void main(String[] args) {
        Q8<String> example = new Q8<String>();
        example.set("Ah Seng");

        String value = example.get();
        System.out.println(value);

    }
}
