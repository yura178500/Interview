public class DemoExceptions {
    // Демонстрация обработки исключений,
    // метод, в котором обработано деление на 0,
    // блок try-catch
    double DivNumbers2(int a, int b) {
        double res=0; // переменная res обязательно должна быть инициализирована

        try {
            res = a/b; // если b=0, то генерируется исключение
        }
        catch (ArithmeticException e) {
            System.out.println("Деление на 0.");
        }

        return res;
    }

}
