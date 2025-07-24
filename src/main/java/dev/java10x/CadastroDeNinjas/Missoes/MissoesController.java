package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MissoesController {

    @GetMapping("/boasvindas1")
    public String boasVindas(){
        return "Seja bem vindo1";
    }
}
