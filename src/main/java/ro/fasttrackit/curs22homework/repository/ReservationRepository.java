package ro.fasttrackit.curs22homework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fasttrackit.curs22homework.model.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
}
