package dev.java10x.CadastroDeNinjas.Missoes;

import dev.java10x.CadastroDeNinjas.Ninjas.NinjaDTO;
import org.springframework.stereotype.Component;

@Component
public class MissoesMapper {
    public MissoesDTO map(MissoesModel missoesModel){
        MissoesDTO missoesDTO = new MissoesDTO();
        missoesDTO.setId(missoesModel.getId());
        missoesDTO.setDificuldade(missoesModel.getDificuldade());
        missoesDTO.setNome(missoesModel.getNome());

        return missoesDTO;
    }

    public MissoesModel map(MissoesDTO missoesDTO){
        MissoesModel missoesModel = new MissoesModel();
        missoesModel.setId(missoesDTO.getId());
        missoesModel.setDificuldade(missoesDTO.getDificuldade());
        missoesModel.setNome(missoesDTO.getNome());

        return missoesModel;
    }

}
