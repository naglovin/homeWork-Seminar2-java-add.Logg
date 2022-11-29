// К калькулятору из предыдущего дз добавить логирование.

package homeWork;

import java.util.Scanner;

public class task2 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		// получение входных данных от пользователя с помощью сканера
		System.out.print(
			"Введите первое и второе число - ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		// выбор операнда для вычислений
		System.out.print(
			"Выберите и введите тип операции, которую вы хотите выполнить (+, -, *, /, %) - ");
		char op = sc.next().charAt(0);
		solve(a, b, op);
	}
	public static int solve(int a, int b, char op)
	{
		int ans = 0;
		// дополнение
		if (op == '+') {
			ans = a + b;
			// вычитание
		}
		else if (op == '-') {
			ans = a - b;
			//умножение
		}
		else if (op == '*') {
			ans = a * b;
			// по модулю
		}
		else if (op == '%') {
			ans = a % b;
			// деление
		}
		else if (op == '/') {
			ans = a / b;
		}
        logger("вывод");
		// печать конечного результата
		System.out.println("ответ - " + ans);
		return ans;
	}
    public static void logger(String text) {                                             // логгер
        try{
            FileWriter log = new FileWriter("log2.txt", true);
            log.write(LocalDateTime.now() + " " + text + "\n");
            log.flush();
            }
            catch (Exception ex) {
                System.out.println(ex);
        }

    }
}
