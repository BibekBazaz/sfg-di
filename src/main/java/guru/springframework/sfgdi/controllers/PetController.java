package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.PetService;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/28/19.
 */

/*
Fixes done:
- added the @Service annotation, so Spring context can load the bean
- added the constructor to autowire the PetService Bean
 */
@Service
public class PetController {

    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    public String whichPetIsTheBest(){
        return petService.getPetType();
    }
}
