import java.util.Objects;

//Реализуйте класс Person с приватными полями name (имя) и age (возраст)
//Переопределите методы equals() и hashCode() в классе Person таким образом, чтобы два объекта Person считались "двойниками", если у них совпадает имя и возраст
public class PersonIdentifier {
    private String name;
    private int age;
    //Реализуйте конструктор класса PersonIdentifier


    public PersonIdentifier(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonIdentifier that = (PersonIdentifier) o;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

