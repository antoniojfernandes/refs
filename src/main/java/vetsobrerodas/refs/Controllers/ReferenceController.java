package vetsobrerodas.refs.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import vetsobrerodas.refs.Entities.Reference;
import vetsobrerodas.refs.Repositories.ReferenceRepository;


@Controller
public class ReferenceController {


    @Autowired
    ReferenceRepository referenceRepository;

    @GetMapping(value="/reference")
    public String reference()
    {
        return "reference";
    }


    @PostMapping(value = "/reference")
    public String genNewReference(Model model,@RequestParam String clientName,@RequestParam String clientEmail,@RequestParam String clientPhone, @RequestParam String clientPetName,@RequestParam boolean isMember) {
        Reference reference = new Reference(clientName,clientPhone,clientPetName,isMember, clientEmail);
        referenceRepository.save(reference);
        model.addAttribute("referenceId", reference.getId());
        return "referenceSuccess";
    }
}
