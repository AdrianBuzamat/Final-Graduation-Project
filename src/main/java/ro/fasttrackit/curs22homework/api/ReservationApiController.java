package ro.fasttrackit.curs22homework.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ro.fasttrackit.curs22homework.model.Reservation;
import ro.fasttrackit.curs22homework.service.ReservationService;

@Controller
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

    @DeleteMapping("{id}")
    Reservation deleteReservation(@PathVariable int id) {
        return service.delete(id)
                .orElse(null);
    }
}
