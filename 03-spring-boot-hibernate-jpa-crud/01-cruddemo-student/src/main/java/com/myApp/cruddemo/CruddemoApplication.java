package com.myApp.cruddemo;

import com.myApp.cruddemo.dao.StudentDao;
import com.myApp.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

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
            createStudent(studentDao);
        };
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
