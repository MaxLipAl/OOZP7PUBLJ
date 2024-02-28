public static int sumArray() {

        import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ComplexNumber a, b; // Объявляем переменные для комплексных чисел
        ComplexCalculator calculator = new ComplexCalculatorImpl(); // Создаем экземпляр калькулятора

        while (true) {
            // Выводим меню
            System.out.println("Меню:");
            System.out.println("1. Сложение");
            System.out.println("2. Вычитание");
            System.out.println("3. Произведение");
            System.out.println("4. Деление");
            System.out.println("5. Выход");

            int choice = scanner.nextInt(); // Получаем выбор пользователя
            if (choice == 5) { // Если выбран выход
                System.out.println("Выход из программы.");
                break; // Завершаем цикл
            }

            // Запрос первого комплексного числа
            System.out.println("Введите первое комплексное число (a + bi): ");
            a = readComplexNumber(scanner);

            // Запрос второго комплексного числа
            System.out.println("Введите второе комплексное число (a + bi): ");
            b = readComplexNumber(scanner);

            switch (choice) {
                case 1:
                    System.out.println("Сумма: " + calculator.add(a, b));
                    break;
                case 2:
                    System.out.println("Разность: " + calculator.subtract(a, b));
                    break;
                case 3:
                    System.out.println("Произведение: " + calculator.multiply(a, b));
                    break;
                case 4:
                    System.out.println("Частное: " + calculator.divide(a, b));
                    break;
                default:
                    System.out.println("Некорректный выбор. Попробуйте снова.");
            }
        }
    }

    // Метод для чтения комплексного числа с консоли
    private static ComplexNumber readComplexNumber(Scanner scanner) {
        System.out.print("Действительная часть: ");
        double real = scanner.nextDouble();

        System.out.print("Мнимая часть: ");
        double imaginary = scanner.nextDouble();

        return new ComplexNumberImpl(real, imaginary); // Возвращаем созданное комплексное число
    }
}