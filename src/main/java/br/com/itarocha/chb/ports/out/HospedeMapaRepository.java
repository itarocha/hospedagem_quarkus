package br.com.itarocha.chb.ports.out;


import br.com.itarocha.chb.domain.hospedagem.HospedeMapa;

import java.time.LocalDate;
import java.util.List;

public interface HospedeMapaRepository {
    List<HospedeMapa> buildListaHospedeMapa(LocalDate dataIni, LocalDate dataFim);
}
