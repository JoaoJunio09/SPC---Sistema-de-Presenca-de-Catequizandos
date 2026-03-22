package br.com.joaojuniodev.spc.data.projections;

import br.com.joaojuniodev.spc.models.enums.EtapaEnum;

public interface EtapaResumoProjection {
    Long getId();
    EtapaEnum getEtapa();
}
