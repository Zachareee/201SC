public class CaloriesCalculatorTest {
    public static void main(String[] args) {
        NewYearGoodie tart = new NewYearGoodie("Pineapple Tarts", 82.5, 20);
        NewYearGoodie bakKwa = new NewYearGoodie("Bak Kwa", 115, 28);
        NewYearGoodie loveLetters = new NewYearGoodie("Love Letters", 56.5, 13);

        System.out.printf("Pineapple Tarts more sinful than Bak Kwa:%b%n",
                tart.isMoreSinful(bakKwa));

        printCaloriesPerGram(tart);
        printCaloriesPerGram(bakKwa);
        printCaloriesPerGram(loveLetters);

        CaloriesCalculator calc = new CaloriesCalculator();
        calc.addNewYearGoodie(tart, 2);
        calc.addNewYearGoodie(bakKwa, 3);
        calc.addNewYearGoodie(loveLetters, 5);

        System.out.printf("%nTotal Calories :%.2f%n", calc.getTotalCalories());

        System.out.println("Most sinful goodie :" + calc.getMostSinfulGoodie().getName());
    }

    public static void printCaloriesPerGram(NewYearGoodie goodie) {
        System.out.printf("%s (calories per gram) :%.2f%n",
                goodie.getName(),
                goodie.getCaloriesPerGram());
    }
}
