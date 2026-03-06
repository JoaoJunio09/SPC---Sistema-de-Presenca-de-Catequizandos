package br.com.joaojuniodev.spc.data.dtos.response;

import br.com.joaojuniodev.spc.models.enums.EtapaEnum;

import java.util.Objects;

public class EtapaByCatequizandoResponseDTO {

    private Long id;
    private EtapaEnum etapa;
    private CatequistaResponseDTO catequista;

    public EtapaByCatequizandoResponseDTO(Long id, EtapaEnum etapa, CatequistaResponseDTO catequista) {
        this.id = id;
        this.etapa = etapa;
        this.catequista = catequista;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EtapaEnum getEtapa() {
        return etapa;
    }

    public void setEtapa(EtapaEnum etapa) {
        this.etapa = etapa;
    }

    public CatequistaResponseDTO getCatequista() {
        return catequista;
    }

    public void setCatequista(CatequistaResponseDTO catequista) {
        this.catequista = catequista;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        EtapaByCatequizandoResponseDTO that = (EtapaByCatequizandoResponseDTO) o;
        return Objects.equals(getId(), that.getId()) && getEtapa() == that.getEtapa() && Objects.equals(getCatequista(), that.getCatequista());
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(getId());
        result = 31 * result + Objects.hashCode(getEtapa());
        result = 31 * result + Objects.hashCode(getCatequista());
        return result;
    }
}
