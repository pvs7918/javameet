package samplehw;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Reflection {
    public static void main(String[] args) {
        Class c = String.class;
        System.out.println(c.getName());
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields)
            if ((field.getModifiers() & Modifier.PRIVATE) > 0
                && (field.getModifiers() & Modifier.STATIC) == 0)
                System.out.println(field);

        Class<?>[] interfaces = Student123.class.getInterfaces();
        for (Class<?> _interface : interfaces)
            System.out.println(_interface.getName());

        try {
            Student123 ivan = new Student123("Ivan", 5);
            Student123 clone = (Student123) ivan.clone ();

            System.out.println(ivan);
            System.out.println(clone);
        } 
        catch (CloneNotSupportedException ex) {
            System.err.println(ex);
        }
    }
}

interface Marker {
}

class Student123 implements Marker, Cloneable {
    private String name;
    private float grade;

    public Student123(String name, float grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public String toString() {
        return "Student123 [name=" + name + ", grade=" + grade + "]";
    }
}