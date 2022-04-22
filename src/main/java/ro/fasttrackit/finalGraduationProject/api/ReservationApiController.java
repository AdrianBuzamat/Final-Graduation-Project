package ro.fasttrackit.finalGraduationProject.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import ro.fasttrackit.finalGraduationProject.model.Reservation;
import ro.fasttrackit.finalGraduationProject.service.ReservationService;

@RestController
@RequestMapping("api/reservations")
public class ReservationApiController {
    private static final Logger log = LoggerFactory.getLogger(ReservationApiController.class);
    private final ReservationService service;

    public ReservationApiController(ReservationService service) {
        this.service = service;
    }

    @PostMapping
    Reservation addReservation(@RequestBody Reservation reservation){
        return service.add(reservation);
    }

    @PutMapping("{id}")
    Reservation replaceReservation(@PathVariable int id, @RequestBody Reservation reservation){
        log.info("Updating reservation{}", reservation);
        return service.replace(id, reservation);
    }

    @DeleteMapping("{id}")
    Reservation deleteReservation(@PathVariable int id) {
        return service.delete(id)
                .orElse(null);
    }
}
