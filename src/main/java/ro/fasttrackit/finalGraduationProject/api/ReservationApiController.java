package ro.fasttrackit.finalGraduationProject.api;

import org.springframework.web.bind.annotation.*;
import ro.fasttrackit.finalGraduationProject.model.Reservation;
import ro.fasttrackit.finalGraduationProject.service.ReservationService;

@RestController
@RequestMapping("api/reservations")
public class ReservationApiController {
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
        return service.replace(id, reservation);
    }

    @DeleteMapping("{id}")
    Reservation deleteReservation(@PathVariable int id) {
        return service.delete(id)
                .orElse(null);
    }
}
