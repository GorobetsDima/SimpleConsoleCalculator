package GorobetsDmitriy;

/**
 * @author Gorobets Dmitriy
 *         <p>
 *         At this Class in method "calculate" I put 3 arguments
 *         There is checked an operator and according to the operator chooses,
 *         which way to use for a calculation in the constructor
 *         <p>
 *         First argument is "firstArg"-it have to be a double type
 *         <p>
 *         Second argument is "operator"-it have to be an operator
 *         <p>
 *         Third argument is "secondArg"-it have to be a double type
 */

public class Calculator {

    //    проверка соответствия оператора и выбор операции для рассчета
    public void calculate(double firstArg, char operator, double secondArg) {
        switch (operator) {
            case '+':
                System.out.println("Результат:" + firstArg + "+" + secondArg + "=" + add(firstArg, secondArg));
                break;
            case '-':
                System.out.println("Результат:" + firstArg + "-" + secondArg + "=" + deduct(firstArg, secondArg));
                break;
            case 'x':
            case 'х':
                System.out.println("Результат:" + firstArg + "*" + secondArg + "=" + multiply(firstArg, secondArg));
                break;
            case '/':
                System.out.println("Результат:" + firstArg + "/" + secondArg + "=" + divide(firstArg, secondArg));
                break;
            default:
                System.out.println("Здравствуй мой друг!");
                System.out.println("");
                System.out.println("Оператор задан неправильно!");
                System.out.println("");
                System.out.println("Что бы я посчитал все верно, используй пожалуйста пробелы между аргументами: 15.4 + -7 или -8 х 3!");
                System.out.println("Я поддержываю такие операции: + , - , / , х !");
                System.out.println("Что ты хочешь сосчитать? :)");
                break;

        }
    }


    // сумма чисел
    protected double add(double firstArg, double secondArg) {
        return firstArg + secondArg;
    }

    // разность чисел
    protected double deduct(double firstArg, double secondArg) {
        return firstArg - secondArg;
    }

    // умножение чисел
    protected double multiply(double firstArg, double secondArg) {
        return firstArg * secondArg;
    }

    // разделение чисел
    protected double divide(double firstArg, double secondArg) {
        return firstArg / secondArg;
    }

}


