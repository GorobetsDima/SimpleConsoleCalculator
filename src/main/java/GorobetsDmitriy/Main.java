package GorobetsDmitriy;

/**
 * @author Gorobets Dmitriy
 *         <p>
 *         In class Main I create a instance of Calculator.class
 *         Before that I check whether a number is a double type or not
 *         And figure out how many arguments  was entered
 *         which way to use for a calculation in  the constructor
 */
public class Main {
    public static void main(String[] args) {
        if (args.length == 3) {
            try {
                if (Double.valueOf(args[0]) instanceof Double & Double.valueOf(args[2]) instanceof Double) {

                    Calculator calc = new Calculator();
                    calc.calculate(Double.valueOf(args[0]), args[1].charAt(0), Double.valueOf(args[2]));

                }
            } catch (Exception e) {
                System.out.println("Здравствуй мой друг!");
                System.out.println("");
                System.out.println("Ты ввел не правильное число!");
                System.out.println("");
                System.out.println("Что бы я посчитал все верно, используй пожалуйста пробелы между аргументами: 15.4 + -7 или -8 х 3!");
                System.out.println("Я поддержываю такие операции: + , - , / , х !");
                System.out.println("Что ты хочешь сосчитать? :)");

            }
        } else {
            System.out.println("Здравствуй мой друг!");
            System.out.println("");
            System.out.println("Выражение введено неправельно!Пример: 5 + 5");
            System.out.println("");
            System.out.println("Что бы я посчитал все верно, используй пожалуйста пробелы между аргументами: 15.4 + -7 или -8 х 3!");
            System.out.println("Я поддержываю такие операции: + , - , / , х !");
            System.out.println("Что ты хочешь сосчитать? :)");

        }

    }
}