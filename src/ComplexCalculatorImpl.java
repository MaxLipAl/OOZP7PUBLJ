public class ComplexCalculatorImpl implements ComplexCalculator {

    @Override
    public ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        // Вычисляем сумму действительных частей
        double realPart = a.getReal() + b.getReal();
        // Вычисляем сумму мнимых частей
        double imaginaryPart = a.getImaginary() + b.getImaginary();
        // Создаем новый объект ComplexNumber с полученными значениями и возвращаем его
        return new ComplexNumberImpl(realPart, imaginaryPart);
    }

    @Override
    public ComplexNumber subtract(ComplexNumber a, ComplexNumber b) {
        // Вычисляем разность действительных частей
        double realPart = a.getReal() - b.getReal();
        // Вычисляем разность мнимых частей
        double imaginaryPart = a.getImaginary() - b.getImaginary();
        // Создаем новый объект ComplexNumber с полученными значениями и возвращаем его
        return new ComplexNumberImpl(realPart, imaginaryPart);
    }

    @Override
    public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        // Вычисляем действительную часть произведения
        double realPart = a.getReal() * b.getReal() - a.getImaginary() * b.getImaginary();
        // Вычисляем мнимую часть произведения
        double imaginaryPart = a.getReal() * b.getImaginary() + a.getImaginary() * b.getReal();
        // Создаем новый объект ComplexNumber с полученными значениями и возвращаем его
        return new ComplexNumberImpl(realPart, imaginaryPart);
    }

    @Override
    public ComplexNumber divide(ComplexNumber a, ComplexNumber b) {
        // Вычисляем делитель (квадрат модуля знаменателя)
        double divisor = b.getReal() * b.getReal() + b.getImaginary() * b.getImaginary();
        // Вычисляем действительную часть частного
        double realPart = (a.getReal() * b.getReal() + a.getImaginary() * b.getImaginary()) / divisor;
        // Вычисляем мнимую часть частного
        double imaginaryPart = (a.getImaginary() * b.getReal() - a.getReal() * b.getImaginary()) / divisor;
        // Создаем новый объект ComplexNumber с полученными значениями и возвращаем его
        return new ComplexNumberImpl(realPart, imaginaryPart);
    }
}