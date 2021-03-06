package ro.fasttrackit.finalGraduationProject.ui;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ro.fasttrackit.finalGraduationProject.service.ReservationService;

@Controller
//@RequestMapping()
public class ReservationController {
    private final ReservationService service;

    public ReservationController(ReservationService service) {
        this.service = service;
    }

    @GetMapping("reservations")
    String getReservationsPage(Model model, @RequestParam(required = false) Integer showReservation){
        model.addAttribute("reservations", service.getAll());
        if (showReservation!= null) {
            model.addAttribute("reservationDetails", service.getReservation(showReservation)
                    .orElse(null));
        }
        return "reservations";
    }
}
