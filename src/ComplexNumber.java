public interface ComplexNumber {
    // Метод для получения действительной части комплексного числа
    double getReal();

    // Метод для получения мнимой части комплексного числа
    double getImaginary();

    // Метод для сложения комплексных чисел
    ComplexNumber add(ComplexNumber other);

    // Метод для вычитания комплексных чисел
    ComplexNumber subtract(ComplexNumber other);

    // Метод для умножения комплексных чисел
    ComplexNumber multiply(ComplexNumber other);

    // Метод для деления комплексных чисел
    ComplexNumber divide(ComplexNumber other);

    // Метод для получения строкового представления комплексного числа
    String toString();
}