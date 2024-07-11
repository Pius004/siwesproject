package com.example.siwes;

import com.example.siwes.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SiwesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SiwesApplication.class, args);
	}

@Bean
	CommandLineRunner commandLineRunner(StudentRepository studentRepository){
		return args -> {
			Student pius = new Student(210115021l, "Pius", "Ifamuyiwa", "male", 2021, "UTME", 300,    "21-04-2004", 26, "Sciences","Ogun", 9026517938l, "dammyslim004@gmail.com" );
			Student bryant = new Student(210115022l, "Bryant", "Ayodeji", "female", 2022, "DE", 200,    "21-04-2004", 13, "Sciences","Lagos", 8026517978l, "biola@gmail.com" );
			Student lola = new Student(210115023l, "Lola", "Babalola", "male", 2023, "UTME", 100,    "21-04-2004", 26, "Sciences","Osun", 7020513938l, "lola@gmail.com" );
			Student ahmed = new Student(210115024l, "Ahmed", "Praise", "male", 2021, "UTME", 300,    "21-04-2004", 16, "Sciences","Ogun", 8026217938l, "ahmed@gmail.com" );
			studentRepository.save(pius);
			studentRepository.save(bryant);
			studentRepository.save(lola);
			studentRepository.save(ahmed);
		};
	}
}
