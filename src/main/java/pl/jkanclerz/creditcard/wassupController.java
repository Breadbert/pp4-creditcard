package pl.jkanclerz.creditcard;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class wassupController {
    NameProvider nameProvider;

    public wassupController(NameProvider nameProvider){
        this.nameProvider = nameProvider;
    }

    @GetMapping("/names")
    List<String> names(){
        return nameProvider.allNames();
    }

    @GetMapping("/wassup")
    String wassup() {
        return "Wassup widdit vanilla-face. Me and my homie Azamat just parked our slab outside. We're looking to post up our black asses for the night, so uh, bang bang and skeet skeet, ni**a.";
    }
}
