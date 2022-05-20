package br.com.itarocha.chb.core.service;

import br.com.itarocha.chb.domain.hospedagem.CellStatusHospedagem;

import java.time.LocalDate;

public class MapaHospedagemUtil {

    public static CellStatusHospedagem resolveStatusHospedagemNew(LocalDate hoje, LocalDate dataPrevistaSaida, LocalDate dataEfetivaSaida) {
        CellStatusHospedagem status = CellStatusHospedagem.ABERTA;
        if (dataEfetivaSaida != null) {
            status = CellStatusHospedagem.ENCERRADA;
        } else if (dataPrevistaSaida.isBefore(hoje) ) {
            status = CellStatusHospedagem.VENCIDA;
        } else {
            status = CellStatusHospedagem.ABERTA;
        }
        return status;
    }


}
