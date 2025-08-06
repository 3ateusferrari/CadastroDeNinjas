package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class MissoesController {

    @GetMapping("/boasvindas1")
    public String boasVindas(){
        return "Seja bem vindo1";
    }

    @PostMapping("/criar")
    public String criarMissao(){
        return "Missão criada";
    }

    @GetMapping("/listar")
    public String listarMissoes(){
        return "Missões Listadas";
    }

    @PutMapping("/alterar")
    public String alterarMissao(){
        return "Missão alterada";
    }

    @DeleteMapping("/deletar")
    public String deletarMissao(){
        return "Missao deletada";
    }



}
