import java.util.Scanner;

public class Main {

    public static String calc(String input) throws Exception{
        ArabCalc calc;

        /* Проверка входных данных*/
        if (input.matches("[0-9]{1,2}\\s*[-+*/]\\s*[0-9]{1,2}")){
            String[] equation = input.split("((?<=[-+*/])|(?=[-+*/]))");
            int operand1 = Integer.parseInt(equation[0].trim());
            int operand2 = Integer.parseInt(equation[2].trim());
            if (operand1 == 0 | operand1 > 10 | operand2 == 0 | operand2 > 10)
                throw new Exception("неверный диапазон чисел");
            else
                calc = new ArabCalc(operand1, operand2, equation[1].trim());
        }
        else if (input.matches("[IVX]{1,3}\\s*[-+*/]\\s*[IVX]{1,3}")) {
            String[] equation = input.split("((?<=[-+*/])|(?=[-+*/]))");
            RomeNum operand1, operand2;

            try {
                operand1 = RomeNum.valueOf(equation[0].trim());
            }
            catch (IllegalArgumentException e){
                throw new Exception("неверный диапазон римских чисел");
            }

            try {
                operand2 = RomeNum.valueOf(equation[2].trim());
            }
            catch (IllegalArgumentException e){
                throw new Exception("неверный диапазон римских чисел");
            }
            calc = new RomeCalc(operand1, operand2, equation[1].trim());

        }
        else
            throw new Exception("неверный ввод выражения");

        return calc.print_result();
    }

    public static void main(String args[]) throws Exception {
    //Ввод данных
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        //Вывод результата
        System.out.println(calc(input));
        in.close();
    }

}
