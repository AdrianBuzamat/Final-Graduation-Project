package ro.fasttrackit.finalGraduationProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fasttrackit.finalGraduationProject.model.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
}
