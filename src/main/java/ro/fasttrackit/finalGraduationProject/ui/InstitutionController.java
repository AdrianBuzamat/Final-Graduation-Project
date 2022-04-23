package ro.fasttrackit.finalGraduationProject.ui;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ro.fasttrackit.finalGraduationProject.service.InstitutionService;

@Controller
//@RequestMapping()
public class InstitutionController {
    private final InstitutionService service;

    public InstitutionController(InstitutionService service) {
        this.service = service;
    }

    @GetMapping("institutions")
    String getInstitutionsPage(Model model, @RequestParam(required = false) Integer showInstitution){
        model.addAttribute("showInstitution", service.getAll());
        if (showInstitution!= null) {
            model.addAttribute("institutionDetails", service.getInstitution(showInstitution)
                    .orElse(null));
        }
        return "institutions";
    }
}
