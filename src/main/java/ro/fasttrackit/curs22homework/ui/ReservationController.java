package ro.fasttrackit.curs22homework.ui;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ro.fasttrackit.curs22homework.service.ReservationService;

@Controller
@RequestMapping("reservations")
public class ReservationController {
    private final ReservationService service;

    public ReservationController(ReservationService service) {
        this.service = service;
    }

    @GetMapping
    String getReservationsPage(Model model){
        model.addAttribute("reservations", service.getAll());
        return "reservations";
    }
}
