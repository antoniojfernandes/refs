package vetsobrerodas.refs.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class VetController {


    @GetMapping(value="/")
    public String index()
    {
      return "index";
    }


}
