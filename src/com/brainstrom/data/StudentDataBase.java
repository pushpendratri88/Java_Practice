package com.brainstrom.data;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class StudentDataBase {
    public static Supplier<Student> studentSupplier = () -> {
        return  new Student("Adam",2,4.0,"male", Arrays.asList("swimming", "basketball","volleyball"));
    };

    public static Optional<Student> getOptionalStudent(){

        Student student = new Student("Adam",2,4.0,"male", Arrays.asList("swimming", "basketball","volleyball"));

        Bike bike = new Bike("Client123", "Client123");
        student.setBike(Optional.of(bike));
        return Optional.of(student);
    }


    /**
     * Total of 6 students in the database.
     * @return
     */
    public static List<Student> getAllStudents(){

        /**
         * 2nd grade students
         */
        Student student1 = new Student("Adam",2,3.6, "male",10, Arrays.asList("swimming", "basketball","volleyball"), Arrays.asList(new Bike("Yamaha","fz"), new Bike("Royal","standard"), new Bike("Honda","Activa")),"CSE",5);
        Student student2 = new Student("Jenny",2,3.8,"female", 11,Arrays.asList("swimming", "gymnastics","soccer"),Arrays.asList(new Bike("Royal","Meteor"), new Bike("Royal","interceptor"), new Bike("Honda","Activa")),"ME",3);

        /**
         * 3rd grade students
         */
        Student student3 = new Student("Emily",3,4.0,"female", 12,Arrays.asList("swimming", "gymnastics","aerobics"),Arrays.asList(new Bike("BMW","GS300"), new Bike("Royal","Bullet"), new Bike("Honda","Shine")),"IT",2);
        Student student4 = new Student("Dave",3,4.0,"male", 15,Arrays.asList("swimming", "gymnastics","soccer"),Arrays.asList(new Bike("Royal","Himalyan"), new Bike("Royal","standard"), new Bike("Royal","350 Clasic ")),"CSE",1);

        /**
         * 4th grade students
         */
        Student student5 = new Student("Sophia",4,3.5,"female",10, Arrays.asList("swimming", "dancing","football"),Arrays.asList(new Bike("Yamaha","fzs"), new Bike("Royal","interceptor"), new Bike("TVS","Jupitor")),"ME",4);
        Student student6 = new Student("James",4,3.9,"male", 22,Arrays.asList("swimming", "basketball","baseball","football"),Arrays.asList(new Bike("Yamaha","R15"), new Bike("Royal","Meteor"), new Bike("TVS","Ntorc")),"CSE",6);

        List<Student> students = Arrays.asList(student1,student2,student3,student4,student5,student6);
        return students;
    }
}
