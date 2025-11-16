package com.myApp.cruddemo;

import com.myApp.cruddemo.dao.StudentDao;
import com.myApp.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}


    //for creating command line application
    //executed after the Spring Beans has been loaded
    @Bean
    public CommandLineRunner commandLineRunner(StudentDao studentDao){
        return runner -> {
//            createStudent(studentDao);
//            createMultipleStudents(studentDao);
//            readStudent(studentDao);
//            queryForStudents(studentDao);
            queryForStudentByLastName(studentDao);

        };
    }

    private void queryForStudentByLastName(StudentDao studentDao){
        List<Student> theStudent = studentDao.findByLastName("bharti");

        for(Student tempStudent : theStudent){
            System.out.println(tempStudent);
        }
    }

    private void queryForStudents(StudentDao studentDao){
        //get list of students
        List<Student> theStudents = studentDao.findAll();

        //display list of students
        for(Student tempStudents : theStudents){
            System.out.println(tempStudents);
        }
    }

    private void readStudent(StudentDao studentDao){

        //create a student object;
        System.out.println("creating a new student object");
        Student tempStudent = new Student("Rakesh", "Kumar", "rakesh.gmail.com");

        //save the student
        System.out.println("saving the student ...");
        studentDao.save(tempStudent);

        //display id of the save student;
        int id = tempStudent.getId();
        System.out.println("Save student. Generated id: " + id);

        //retrieve student based on the id: primary key
        System.out.println("Retrieving student with id : " + id);
        Student myStudent = studentDao.findById(id);

        //display student
        System.out.println("Found the student: " + myStudent);
    }

    private void createMultipleStudents(StudentDao studentDao){

        //create multiple students
        System.out.println("Creating 3 Student object....");
        Student tempStudent = new Student("Aman", "Singh", "aman@gmail.com");
        Student tempStudent2 = new Student("Mahi", "Bharti", "mahi@gmail.com");
        Student tempStudent3 = new Student("Sparsh", "Kumar", "sparsh@gmail.com");

        //save the student objects

        System.out.println("Saving the Students ...");
        studentDao.save(tempStudent);
        studentDao.save(tempStudent2);
        studentDao.save(tempStudent3);
    }

    private void createStudent(StudentDao studentDao){

        //create student object
        System.out.println("Creating new Student object....");
        Student tempStudent = new Student("Sakshi", "Bharti", "sakshi@gmail.com");

        //save the student object
        System.out.println("Saving the student....");
        studentDao.save(tempStudent);

        //display id of the saved student
        System.out.println("Saved student. Generated id : " + tempStudent.getId());
    }

}
