package pro.sky.java.course1;

public class Main {

    public static void main(String[] args) {

        /*Task 1*/
        byte valueOne = 127;
        short valueTwo = -10;
        int valueThree = 1000;
        long valueFour = 1_000_000L;
        float valueFive = 3.14f;
        double valueSix = -3.14;

        System.out.println("Переменная типа byte равна " + valueOne + "\n"
                + "Переменная типа short равна" + valueTwo + "\n"
                + "Переменная типа int равна " + valueThree + "\n"
                + "Переменная типа long равна " + valueFour + "\n"
                + "Переменная типа float равна " + valueFive + "\n"
                + "Переменная типа double равна " + valueSix);
        System.out.println("---------------------------------------------------");

        /*Task 2*/
        double weightOfTheFirstBoxer = 78.2;
        double weightOfTheSecondBoxer = 82.7;

        double total = weightOfTheFirstBoxer + weightOfTheSecondBoxer;

        System.out.println("Общий вес боксеров равен " + total);

        double difference = Math.abs(weightOfTheFirstBoxer - weightOfTheSecondBoxer);

        System.out.println("Разница между весами боксеров равна " + difference);
        System.out.println("---------------------------------------------------");

        /*Task 3*/
        int banana = 5 * 80;
        int milk = 2 * 105;
        int iceCream = 2 * 100;
        int eggs = 4 * 70;

        int breakfastWeightInGrams = banana + milk + iceCream + eggs;

        double breakfastWeightInKilograms = (double) breakfastWeightInGrams / 1000;

        System.out.println("Вес спорт-завтрака в граммах равен " + breakfastWeightInGrams + "\n"
                + "Вес спорт-завтрака в килограммах равен " + breakfastWeightInKilograms);
        System.out.println("---------------------------------------------------");

        /*Task 4*/
        int excessWeight = 7 * 1000;
        int countOfDays250 = excessWeight / 250;
        int countOfDays500 = excessWeight / 500;

        System.out.println("Количество дней при потере 250 грамм в день равно " + countOfDays250);
        System.out.println("Количество дней при потере 500 грамм в день равно " + countOfDays500);

        int averageWeightInDay = (250 + 500) / 2;
        int numberOfFullDays = excessWeight / averageWeightInDay;
        int remainingWeight = excessWeight % averageWeightInDay;

        System.out.println("Количество полных дней в среднем равно " + numberOfFullDays);
        System.out.println("Количество оставшихся грамм равно " + remainingWeight);

        double averageCountOfDays = Math.ceil(excessWeight / (double) (averageWeightInDay));

        System.out.println("Количество дней в среднем равно " + averageCountOfDays);
        System.out.println("---------------------------------------------------");

        /*Task 5*/
        int mariaSalaryBefore = 67_760;
        int denisSalaryBefore = 83_690;
        int kristinaSalaryBefore = 76_230;

        int mariaSalarAfter = mariaSalaryBefore + mariaSalaryBefore * 10 / 100;
        int denisSalaryAfter = denisSalaryBefore + denisSalaryBefore * 10 / 100;
        int kristinaSalaryAfter = kristinaSalaryBefore + kristinaSalaryBefore * 10 / 100;

        int annualIncomeMaria = 12 * (mariaSalarAfter - mariaSalaryBefore);
        int annualIncomeDenis = 12 * (denisSalaryAfter - denisSalaryBefore);
        int annualIncomeKristina = 12 * (kristinaSalaryAfter - kristinaSalaryBefore);

        System.out.println("Маша после повышения зарплаты получает " + mariaSalarAfter
                + " рублей. Годовой доход вырос на " + annualIncomeMaria + " рублей.\n"
        + "Денис после повышения зарплаты получает " + denisSalaryAfter
                + " рублей. Годовой доход вырос на " + annualIncomeDenis + " рублей.\n"
        + "Кристина после повышения зарплаты получает " + kristinaSalaryAfter
                + " рублей. Годовой доход вырос на " + annualIncomeKristina + " рублей.\n");

    }
}
