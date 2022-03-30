package ro.fasttrackit.curs22homework;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ro.fasttrackit.curs22homework.model.*;
import ro.fasttrackit.curs22homework.repository.ReservationRepository;

import java.util.List;

import static ro.fasttrackit.curs22homework.model.InstitutionType.*;

@SpringBootApplication
public class Curs22HomeworkApplication {

    public static void main(String[] args) {
        SpringApplication.run(Curs22HomeworkApplication.class, args);
    }

    @Bean
    CommandLineRunner atStartup(ReservationRepository reservationRepository) {
        return args -> {
            reservationRepository.saveAll(List.of(
                    new Reservation(new Person("Adrian Buzamat", "0723212212")
                            , new City("Oradea")
                            , new Institution("Hiperdia", MEDICAL_CLINIQUE)
                            , "03/12/2020 10:00:00")
                    , new Reservation(new Person("Dragos Axinte", "0723232124")
                            , new City("Cluj")
                            , new Institution("Carol", RESTAURANT)
                            , "03/12/2020 10:00:00")
                    , new Reservation(new Person("Ciprian Baciu", "0723255524")
                            , new City("Cluj")
                            , new Institution("Unirea", HOTEL)
                            , "03/12/2020 10:00:00")
            ));
        };
    }
}
