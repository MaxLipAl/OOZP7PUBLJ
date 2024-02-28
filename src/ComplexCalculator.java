public interface ComplexCalculator {
    // Метод для сложения двух комплексных чисел
    ComplexNumber add(ComplexNumber a, ComplexNumber b);

    // Метод для вычитания одного комплексного числа из другого
    ComplexNumber subtract(ComplexNumber a, ComplexNumber b);

    // Метод для умножения двух комплексных чисел
    ComplexNumber multiply(ComplexNumber a, ComplexNumber b);

    // Метод для деления одного комплексного числа на другое
    ComplexNumber divide(ComplexNumber a, ComplexNumber b);
}
