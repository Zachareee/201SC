public class BubbleTeaTest {

    public static void displayHasPearlsTest(BubbleTea cup) {
        System.out.printf("%s has %spearls in it%n",
                cup.getBrand(),
                (cup.hasPearls() ? "" : "no "));
    }

    public static void displaySweetnessTest(BubbleTea cup) {
        System.out.print(cup.getBrand());
        System.out.println(cup.isTooSweet() ? " is too sweet"
                : " is low in sugar");
    }

    public static void displaySweetnessComparison(BubbleTea cup1, BubbleTea cup2) {
        if (cup2.isSweeterThan(cup1)) {
            BubbleTea sweeter = cup1;
            cup1 = cup2;
            cup2 = sweeter;
        }

        System.out.println(cup1.getBrand() + " is sweeter than " + cup2.getBrand());
    }

    public static void main(String[] args) {
        // CLASSPATH
        // (A) Declare the 3 cups of bubble tea
        BubbleTea cup1 = new BubbleTea("Kong Cha", 100, true);
        BubbleTea cup2 = new BubbleTea("COIL", 80, true);
        BubbleTea cup3 = new BubbleTea("Ho Lai Ho Kee", 50, false);

        System.out.println("1. Pearl Test");
        displayHasPearlsTest(cup1);
        displayHasPearlsTest(cup2);
        displayHasPearlsTest(cup3);
        System.out.println();

        System.out.println("2. Sweetness Test");
        displaySweetnessTest(cup1);
        displaySweetnessTest(cup2);
        displaySweetnessTest(cup3);
        System.out.println();

        System.out.println("3. Sweetness Comparison Test");
        displaySweetnessComparison(cup1, cup2);
        displaySweetnessComparison(cup1, cup3);
        displaySweetnessComparison(cup2, cup3);
        System.out.println();

        cup3.increaseSugarLevel(70);
        System.out.println("3. Sweetness Comparison Test after increase in cup3 sugar level");
        displaySweetnessComparison(cup1, cup2);
        displaySweetnessComparison(cup1, cup3);
        displaySweetnessComparison(cup2, cup3);
        System.out.println();
    }
}
