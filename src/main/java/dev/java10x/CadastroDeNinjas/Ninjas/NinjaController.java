package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Seja bem vindo";
    }


    //Adicionar ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja(){
        return "ninja criado";
    }

    // Mostrar ninja por id (READ)
    @GetMapping("/todos")
    public String mostrarTodosOsNinjas(){
        return "Mostrar todos os ninjas";
    }

    // Mostrar todos os ninjas (READ)
    @GetMapping("todosID")
    public String mostrarTodosOsNinjasPorId(){
        return "Mostrar Ninja por Id";
    }

    //Alterar dados dos ninjas (UPDATE)
    @PutMapping("/alterarID")
    public String alterarNinjaPorId(){
        return "Alterar Ninja por Id";
    }

    //Deletar Ninja (DELETE)
    @DeleteMapping("/deletarID")
    public String deletarNinjaPorId(){
        return "Deletar Ninja por Id";
    }

}
