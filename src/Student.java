import java.util.Objects;

public class Student {

    private String name;
    private int age;

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || !(o instanceof Student)) {
            return false;
        }
        Student student = (Student) o;
        return name.equals(student.name) && age == student.age;
    }

    public int hashCode(){
        return Objects.hash(name,age);
    }

}

