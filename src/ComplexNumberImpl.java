// ComplexNumberImpl.java
public class ComplexNumberImpl implements ComplexNumber {
    private double real; // Действительная часть комплексного числа
    private double imaginary; // Мнимая часть комплексного числа

    // Конструктор для инициализации действительной и мнимой частей
    public ComplexNumberImpl(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    @Override
    public double getReal() {
        return real; // Возвращаем действительную часть
    }

    @Override
    public double getImaginary() {
        return imaginary; // Возвращаем мнимую часть
    }

    @Override
    public ComplexNumber add(ComplexNumber other) {
        // Сложение комплексных чисел
        double realPart = this.real + other.getReal();
        double imaginaryPart = this.imaginary + other.getImaginary();
        return new ComplexNumberImpl(realPart, imaginaryPart); // Возвращаем новое комплексное число
    }

    @Override
    public ComplexNumber subtract(ComplexNumber other) {
        // Вычитание комплексных чисел
        double realPart = this.real - other.getReal();
        double imaginaryPart = this.imaginary - other.getImaginary();
        return new ComplexNumberImpl(realPart, imaginaryPart); // Возвращаем новое комплексное число
    }

    @Override
    public ComplexNumber multiply(ComplexNumber other) {
        // Умножение комплексных чисел
        double realPart = this.real * other.getReal() - this.imaginary * other.getImaginary();
        double imaginaryPart = this.real * other.getImaginary() + this.imaginary * other.getReal();
        return new ComplexNumberImpl(realPart, imaginaryPart); // Возвращаем новое комплексное число
    }

    @Override
    public ComplexNumber divide(ComplexNumber other) {
        // Деление комплексных чисел
        double divisor = other.getReal() * other.getReal() + other.getImaginary() * other.getImaginary();
        double realPart = (this.real * other.getReal() + this.imaginary * other.getImaginary()) / divisor;
        double imaginaryPart = (this.imaginary * other.getReal() - this.real * other.getImaginary()) / divisor;
        return new ComplexNumberImpl(realPart, imaginaryPart); // Возвращаем новое комплексное число
    }

    @Override
    public String toString() {
        return real + " + " + imaginary + "i"; // Возвращаем строковое представление комплексного числа
    }
}