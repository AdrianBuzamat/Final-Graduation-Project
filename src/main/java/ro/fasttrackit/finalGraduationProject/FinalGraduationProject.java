package ro.fasttrackit.finalGraduationProject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ro.fasttrackit.finalGraduationProject.model.*;
import ro.fasttrackit.finalGraduationProject.repository.ReservationRepository;

import java.util.List;

@SpringBootApplication
public class FinalGraduationProject {

    public static void main(String[] args) {
        SpringApplication.run(FinalGraduationProject.class, args);
    }

    @Bean
    CommandLineRunner atStartup(ReservationRepository reservationRepository) {
        return args -> {
            reservationRepository.saveAll(List.of(
                    new Reservation(
                              new Person("Adrian Buzamat", "0723212212")
                            , new Institution("Hiperdia", "Oradea", "Medical Clinique")
                            , "03/12/2020 10:00:00")
                    , new Reservation(
                              new Person("Dragos Axinte", "0723232124")
                            , new Institution("Carol", "Cluj", "Restaurant")
                            , "03/12/2020 10:00:00")
                    , new Reservation(
                              new Person("Ciprian Baciu", "0723255524")
                            , new Institution("Unirea", "Cluj", "Hotel")
                            , "03/12/2020 10:00:00")
            ));
        };
    }
}
