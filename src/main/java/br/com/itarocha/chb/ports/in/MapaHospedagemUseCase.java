package br.com.itarocha.chb.ports.in;

import br.com.itarocha.chb.domain.hospedagem.MapaRetorno;

import java.time.LocalDate;

public interface MapaHospedagemUseCase {
    MapaRetorno buildMapaRetorno(LocalDate dataBase);
}