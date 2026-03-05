package br.com.joaojuniodev.spc.mapper;

import br.com.joaojuniodev.spc.data.dtos.request.CatequistaRequestDTO;
import br.com.joaojuniodev.spc.data.dtos.response.CatequistaResponseDTO;
import br.com.joaojuniodev.spc.models.Catequista;

public class ObjectMapperManually {

    public static Catequista convertCatequistaRequestToEntity(CatequistaRequestDTO catequista) {
        return new Catequista(catequista.getId(), catequista.getFullName());
    }

    public static CatequistaResponseDTO convertCatequistaEntityToResponseDTO(Catequista entity) {
        return new CatequistaResponseDTO(entity.getId(), entity.getFullName());
    }
}
