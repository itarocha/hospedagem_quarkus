package br.com.itarocha.chb.adapter.out.persistence.jooq.repository.impl;

import br.com.itarocha.chb.domain.hospedagem.HospedeMapa;
//import br.com.itarocha.chb.adapter.out.persistence.jooq.data.tables.*;
import br.com.itarocha.chb.ports.out.HospedeMapaRepository;
import lombok.RequiredArgsConstructor;
import org.jooq.*;

import javax.enterprise.context.ApplicationScoped;
import java.time.LocalDate;
import java.util.List;

import static br.com.itarocha.chb.adapter.out.persistence.jooq.data.Tables.*;
import static org.jooq.impl.DSL.*;

@ApplicationScoped
@RequiredArgsConstructor
public class HospedeMapaJooqRepository implements HospedeMapaRepository {

    private final DSLContext create;

    @Override
    public List<HospedeMapa> buildListaHospedeMapa(LocalDate dataIni, LocalDate dataFim){
        // PRIMEIRO SELECT - HÓSPEDES COM LEITO
        Field<Integer> tipo0 = val(0);
        Field<String> tipoUtilizacaoT = val("T");

        Condition a1 = HOSPEDE_LEITO.DATA_ENTRADA.between(dataIni, dataFim)
                .or(HOSPEDE_LEITO.DATA_SAIDA.between(dataIni, dataFim));
        Condition a2 = HOSPEDE_LEITO.DATA_ENTRADA.le(dataIni)
                .and(HOSPEDE_LEITO.DATA_SAIDA.ge(dataFim));
        Condition condicaoA = a1.or(a2);

        //, (SELECT MIN(hlx.data_entrada) FROM hospede_leito hlx WHERE hlx.hospede_id = hl.hospede_id) AS data_primeira_entrada
        //, (SELECT MAX(hlx.data_entrada) FROM hospede_leito hlx WHERE hlx.hospede_id = hl.hospede_id) AS data_ultima_entrada

        //dsl.selectFrom(SERIES)
        //        .orderBy(DSL.field(dsl.select(DSL.max(COMPETITION.COMPETITION_DATE)).from(COMPETITION)
        //                .where(COMPETITION.SERIES_ID.eq(SERIES.ID))).desc())
        //        .fetch()

        Select<Record14<Long, Long, Long, Integer, Long, Integer, Integer, LocalDate, LocalDate, LocalDate, LocalDate, String, LocalDate, LocalDate>>
                s1 =
                create.select(HOSPEDE_LEITO.HOSPEDE_ID.as("hospede_id")
                                , HOSPEDE_LEITO.ID.as("identificador")
                                , QUARTO.ID.as("quarto_id")
                                , QUARTO.NUMERO.as("quarto_numero")
                                , LEITO.ID.as("leito_id")
                                , LEITO.NUMERO.as("leito_numero")
                                , tipo0.as("tipo")
                                , HOSPEDE_LEITO.DATA_ENTRADA.as("data_entrada_leito")
                                , HOSPEDE_LEITO.DATA_SAIDA.as("data_saida_leito")
                                , when(HOSPEDE_LEITO.DATA_ENTRADA.lessThan(dataIni), dataIni).otherwise(HOSPEDE_LEITO.DATA_ENTRADA).as("data_ini")
                                , when(HOSPEDE_LEITO.DATA_SAIDA.greaterThan(dataFim), dataFim).otherwise(HOSPEDE_LEITO.DATA_SAIDA).as("data_fim")
                                , tipoUtilizacaoT.as("tipo_utilizacao")
                                , field(select(min(HOSPEDE_LEITO.DATA_ENTRADA)).from(HOSPEDE_LEITO).where(HOSPEDE_LEITO.HOSPEDE_ID.eq(HOSPEDE_LEITO.HOSPEDE_ID))).as("data_primeira_entrada")
                                , field(select(max(HOSPEDE_LEITO.DATA_ENTRADA)).from(HOSPEDE_LEITO).where(HOSPEDE_LEITO.HOSPEDE_ID.eq(HOSPEDE_LEITO.HOSPEDE_ID))).as("data_ultima_entrada")
                        )
                        .from(HOSPEDE_LEITO)
                        .innerJoin(LEITO).on(HOSPEDE_LEITO.LEITO_ID.eq(LEITO.ID))
                        .innerJoin(QUARTO).on(QUARTO.ID.eq(LEITO.QUARTO_ID))
                        .where(condicaoA)
                        .groupBy(HOSPEDE_LEITO.HOSPEDE_ID, HOSPEDE_LEITO.ID, QUARTO.ID, QUARTO.NUMERO, LEITO.ID, LEITO.NUMERO, HOSPEDE_LEITO.DATA_ENTRADA, HOSPEDE_LEITO.DATA_SAIDA);


//        +----------+-------------+---------+-------------+--------+------------+----+------------------+----------------+----------+----------+---------------+---------------------+-------------------+
//        |hospede_id|identificador|quarto_id|quarto_numero|leito_id|leito_numero|tipo|data_entrada_leito|data_saida_leito|data_ini  |data_fim  |tipo_utilizacao|data_primeira_entrada|data_ultima_entrada|
//        +----------+-------------+---------+-------------+--------+------------+----+------------------+----------------+----------+----------+---------------+---------------------+-------------------+
//        |      2804|         1668|        1|            1|       2|           2|   0|2019-12-20        |2019-12-22      |2019-12-20|2019-12-21|T              |2019-12-20           |2019-12-20         |
//        +----------+-------------+---------+-------------+--------+------------+----+------------------+----------------+----------+----------+---------------+---------------------+-------------------+


        // SEGUNDO SQL - HÓSPEDES SEM LEITO

        Field<Long> const99999 = val(99999L);
        Field<Integer> const0 = val(0);
        Field<Integer> tipo1 = val(1);

        Condition b1 = HOSPEDAGEM.DATA_ENTRADA.between(dataIni, dataFim)
                .or(coalesce(HOSPEDAGEM.DATA_EFETIVA_SAIDA, HOSPEDAGEM.DATA_PREVISTA_SAIDA)
                        .between(dataIni, dataFim));
        Condition b2 = HOSPEDAGEM.DATA_ENTRADA.le(dataIni)
                .and(coalesce(HOSPEDAGEM.DATA_EFETIVA_SAIDA, HOSPEDAGEM.DATA_PREVISTA_SAIDA).ge(dataFim));
        Condition b3 = HOSPEDAGEM.TIPO_UTILIZACAO.eq("P");
        Condition condicaoB = b1.or(b2).and(b3);

        Select<Record14<Long, Long, Long, Integer, Long, Integer, Integer, LocalDate, LocalDate, LocalDate, LocalDate, String, LocalDate, LocalDate>>
                s2 =
                create.select(HOSPEDE.ID.as("hospede_id")
                                , HOSPEDE.ID.as("identificador")
                                , const99999.as("quarto_id")
                                , const0.as("quarto_numero")
                                , const99999.as("leito_id")
                                , const0.as("leito_numero")
                                , tipo1.as("tipo")
                                , HOSPEDAGEM.DATA_ENTRADA.as("data_entrada_leito")
                                , coalesce(HOSPEDAGEM.DATA_EFETIVA_SAIDA, HOSPEDAGEM.DATA_PREVISTA_SAIDA).as("data_saida_leito")
                                , when(HOSPEDAGEM.DATA_ENTRADA.lessThan(dataIni), dataIni).otherwise(HOSPEDAGEM.DATA_ENTRADA).as("data_ini").as("data_ini")
                                , when(coalesce(HOSPEDAGEM.DATA_EFETIVA_SAIDA, HOSPEDAGEM.DATA_PREVISTA_SAIDA).greaterThan(dataFim), dataFim)
                                        .otherwise(coalesce(HOSPEDAGEM.DATA_EFETIVA_SAIDA, HOSPEDAGEM.DATA_PREVISTA_SAIDA)).as("data_fim")
                                , HOSPEDAGEM.TIPO_UTILIZACAO
                                , HOSPEDAGEM.DATA_ENTRADA.as("data_primeira_entrada")
                                , HOSPEDAGEM.DATA_ENTRADA.as("data_ultima_entrada")
                        )
                        .from(HOSPEDAGEM)
                        .innerJoin(HOSPEDE)
                        .on(HOSPEDAGEM.ID.eq(HOSPEDE.HOSPEDAGEM_ID))
                        .where(condicaoB);

//        +----------+-------------+---------+-------------+--------+------------+----+------------------+----------------+----------+----------+---------------+---------------------+-------------------+
//        |hospede_id|identificador|quarto_id|quarto_numero|leito_id|leito_numero|tipo|data_entrada_leito|data_saida_leito|data_ini  |data_fim  |tipo_utilizacao|data_primeira_entrada|data_ultima_entrada|
//        +----------+-------------+---------+-------------+--------+------------+----+------------------+----------------+----------+----------+---------------+---------------------+-------------------+
//        |      2802|         2802|    99999|            0|   99999|           0|   1|2019-12-20        |2019-12-20      |2019-12-20|2019-12-20|P              |2019-12-20           |2019-12-20         |
//        +----------+-------------+---------+-------------+--------+------------+----+------------------+----------------+----------+----------+---------------+---------------------+-------------------+

        // TERCEIRO SQL - UNION
        Select<Record14<Long, Long, Long, Integer, Long, Integer, Integer, LocalDate, LocalDate, LocalDate, LocalDate, String, LocalDate, LocalDate>> s3 =
                s1.unionAll(s2);


        // QUARTO SQL - JUNCOES
        return create.select(
                                s3.field("identificador", Long.class).as("id")
                                , HOSPEDAGEM.TIPO_UTILIZACAO.as("tipoUtilizacao")
                                , s3.field("quarto_id", Long.class).as("quartoId")
                                , s3.field("quarto_numero", Integer.class).as("quartoNumero")
                                , s3.field("leito_id", Long.class).as("leitoId")
                                , s3.field("leito_numero", Integer.class).as("leitoNumero")
                                , PESSOA.ID.as("pessoa_id").as("pessoaId")
                                , PESSOA.NOME.as("pessoa_nome").as("pessoaNome")
                                , PESSOA.TELEFONE.as("pessoa_telefone").as("pessoaTelefone")
                                , ENDERECO.CIDADE
                                , ENDERECO.UF
                                , HOSPEDAGEM.DATA_ENTRADA.as("dataEntradaHospedagem")
                                , coalesce(HOSPEDAGEM.DATA_EFETIVA_SAIDA, HOSPEDAGEM.DATA_PREVISTA_SAIDA).as("dataSaidaHospedagem")
                                , s3.field("data_primeira_entrada", LocalDate.class).as("dataPrimeiraEntrada")
                                , s3.field("data_ultima_entrada", LocalDate.class).as("dataUltimaEntrada")
                                , s3.field("data_entrada_leito", LocalDate.class).as("dataEntradaLeito")
                                , s3.field("data_saida_leito", LocalDate.class).as("dataSaidaLeito")
                                , s3.field("data_ini", LocalDate.class).as("dataIniNoPeriodo")
                                , s3.field("data_fim", LocalDate.class).as("dataFimNoPeriodo")
                                , HOSPEDE.HOSPEDAGEM_ID.as("hospedagemId")
                                , s3.field("hospede_id", Long.class).as("hospedeId")
                                , HOSPEDE.TIPO_HOSPEDE_ID.as("tipoHospedeId")
                                , HOSPEDE.BAIXADO.as("baixadoString")
                                , TIPO_HOSPEDE.DESCRICAO.as("tipoHospedeDescricao")
                                , HOSPEDAGEM.DESTINACAO_HOSPEDAGEM_ID.as("destinacaoHospedagemId")
                                , DESTINACAO_HOSPEDAGEM.DESCRICAO.as("destinacaoHospedagemDescricao")
                                , HOSPEDAGEM.DATA_PREVISTA_SAIDA.as("dataPrevistaSaida")
                                , HOSPEDAGEM.DATA_EFETIVA_SAIDA.as("dataEfetivaSaida")
                        )
                        .from(s3)
                        .innerJoin(HOSPEDE).on(HOSPEDE.ID.eq(s3.field("hospede_id", Long.class)))
                        .innerJoin(HOSPEDAGEM).on(HOSPEDAGEM.ID.eq(HOSPEDE.HOSPEDAGEM_ID))
                        .innerJoin(DESTINACAO_HOSPEDAGEM).on(DESTINACAO_HOSPEDAGEM.ID.eq(HOSPEDAGEM.DESTINACAO_HOSPEDAGEM_ID))
                        .innerJoin(TIPO_HOSPEDE).on(TIPO_HOSPEDE.ID.eq(HOSPEDE.TIPO_HOSPEDE_ID))
                        .innerJoin(PESSOA).on(PESSOA.ID.eq(HOSPEDE.PESSOA_ID))
                        .leftJoin(ENDERECO).on(ENDERECO.ID.eq(PESSOA.ENDERECO_ID))
                        .orderBy( s3.field("tipo")
                                , s3.field("quarto_numero")
                                , s3.field("leito_numero")
                                , PESSOA.NOME
                                , PESSOA.ID
                                , HOSPEDE.HOSPEDAGEM_ID
                        ).fetchInto(HospedeMapa.class);
    }
}
