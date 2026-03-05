package br.com.joaojuniodev.spc.controllers;

import br.com.joaojuniodev.spc.models.*;
import br.com.joaojuniodev.spc.models.enums.EtapaEnum;
import br.com.joaojuniodev.spc.models.enums.PresencaStatusEnum;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public Presenca test() {

        Missa missa = new Missa(1L, "Quarto Domingo da Quaresma", LocalDateTime.now(), 19);

        Catequista joao_junio = new Catequista(1L, "João Junio Trindade Castro");

        Etapa eucaristia = new Etapa(1L, EtapaEnum.PRIMEIRA_EUCARISTIA, joao_junio);

        Catequizando maria = new Catequizando(1L, "Maria de Souza", LocalDate.now(), eucaristia);
        eucaristia.addCatequizando(maria);

        Presenca presencaDaMissa = new Presenca(1L, maria, missa, PresencaStatusEnum.PRESENTE, null);

        return presencaDaMissa;
    }
}