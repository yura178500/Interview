public class Student {
    // Напишите методы Equals and HashCode для класса Student,
    // который состоит из полей String name и int age.
    int age;
    String name;

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }

        final Student student = (Student) o;

        if (this.age != student.age) {
            return false;
        }
        return this.name != null ? this.name.equals(student.name) : student.name == null;
    }

    @Override
    public int hashCode() {
        int result = this.age;
        result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
        return result;
    }
    //Сперва мы сравниваем непосредственно ссылки, ведь если ссылки на один и тот же объект, какой смысл продолжать проверку? Все и так будет true.

   // Проверка на null и на совпадение типов классов, ведь если объект — аргумент null или другого типа, то это значит, что объекты не равны — false.

   // Приведение объекта аргумента к одному типу (вдруг это был объект родительского типа).

   // Сравнение примитивного поля класса (ведь для него достаточно сравнения через =!), если поле не равно — false.

   // Проверка непримитивного поля на null и на equals (в String метод переопределен и будет корректно сравнивать), если же оба поля null, либо equals, то проверка заканчивается и метод возвращает true.
}
