package reflect;

import java.lang.reflect.Constructor;

public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
//        Class<?> aClass = Class.forName("reflect.Student");
//
//        System.out.println(aClass);
//
//        Class clazz = Student.class;
//
//        System.out.println(clazz);
//
//        Student student = new Student();
//        System.out.println(student.getClass());

        Class<?> aClass = Class.forName("reflect.Student");

        Constructor<?>[] constructors = aClass.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }

        System.out.println(aClass.getDeclaredConstructor());

        System.out.println(aClass.getDeclaredConstructor(String.class, int.class));
    }
}
