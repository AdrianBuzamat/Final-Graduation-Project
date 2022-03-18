package ro.fasttrackit.curs22homework.service;

import org.springframework.stereotype.Service;
import ro.fasttrackit.curs22homework.model.Reservation;
import ro.fasttrackit.curs22homework.repository.ReservationRepository;

import java.util.List;

@Service
public class ReservationService {
    private final ReservationRepository repository;

    public ReservationService(ReservationRepository repository) {
        this.repository = repository;
    }

    public List<Reservation> getAll() {
        return repository.findAll();
    }
}
