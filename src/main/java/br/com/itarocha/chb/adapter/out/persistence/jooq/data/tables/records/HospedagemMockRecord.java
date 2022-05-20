/*
 * This file is generated by jOOQ.
 */
package br.com.itarocha.chb.adapter.out.persistence.jooq.data.tables.records;


import br.com.itarocha.chb.adapter.out.persistence.jooq.data.tables.HospedagemMock;

import java.time.LocalDate;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HospedagemMockRecord extends UpdatableRecordImpl<HospedagemMockRecord> implements Record9<Long, LocalDate, LocalDate, LocalDate, Integer, String, LocalDate, LocalDate, LocalDate> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>hospedagem_mock.id</code>.
     */
    public HospedagemMockRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>hospedagem_mock.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>hospedagem_mock.data_efetiva_saida</code>.
     */
    public HospedagemMockRecord setDataEfetivaSaida(LocalDate value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>hospedagem_mock.data_efetiva_saida</code>.
     */
    public LocalDate getDataEfetivaSaida() {
        return (LocalDate) get(1);
    }

    /**
     * Setter for <code>hospedagem_mock.data_entrada</code>.
     */
    public HospedagemMockRecord setDataEntrada(LocalDate value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>hospedagem_mock.data_entrada</code>.
     */
    public LocalDate getDataEntrada() {
        return (LocalDate) get(2);
    }

    /**
     * Setter for <code>hospedagem_mock.data_prevista_saida</code>.
     */
    public HospedagemMockRecord setDataPrevistaSaida(LocalDate value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>hospedagem_mock.data_prevista_saida</code>.
     */
    public LocalDate getDataPrevistaSaida() {
        return (LocalDate) get(3);
    }

    /**
     * Setter for <code>hospedagem_mock.quarto</code>.
     */
    public HospedagemMockRecord setQuarto(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>hospedagem_mock.quarto</code>.
     */
    public Integer getQuarto() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>hospedagem_mock.situacao</code>.
     */
    public HospedagemMockRecord setSituacao(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>hospedagem_mock.situacao</code>.
     */
    public String getSituacao() {
        return (String) get(5);
    }

    /**
     * Setter for <code>hospedagem_mock.dataEfetivaSaida</code>.
     */
    public HospedagemMockRecord setDataefetivasaida(LocalDate value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>hospedagem_mock.dataEfetivaSaida</code>.
     */
    public LocalDate getDataefetivasaida() {
        return (LocalDate) get(6);
    }

    /**
     * Setter for <code>hospedagem_mock.dataEntrada</code>.
     */
    public HospedagemMockRecord setDataentrada(LocalDate value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>hospedagem_mock.dataEntrada</code>.
     */
    public LocalDate getDataentrada() {
        return (LocalDate) get(7);
    }

    /**
     * Setter for <code>hospedagem_mock.dataPrevistaSaida</code>.
     */
    public HospedagemMockRecord setDataprevistasaida(LocalDate value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>hospedagem_mock.dataPrevistaSaida</code>.
     */
    public LocalDate getDataprevistasaida() {
        return (LocalDate) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, LocalDate, LocalDate, LocalDate, Integer, String, LocalDate, LocalDate, LocalDate> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Long, LocalDate, LocalDate, LocalDate, Integer, String, LocalDate, LocalDate, LocalDate> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return HospedagemMock.HOSPEDAGEM_MOCK.ID;
    }

    @Override
    public Field<LocalDate> field2() {
        return HospedagemMock.HOSPEDAGEM_MOCK.DATA_EFETIVA_SAIDA;
    }

    @Override
    public Field<LocalDate> field3() {
        return HospedagemMock.HOSPEDAGEM_MOCK.DATA_ENTRADA;
    }

    @Override
    public Field<LocalDate> field4() {
        return HospedagemMock.HOSPEDAGEM_MOCK.DATA_PREVISTA_SAIDA;
    }

    @Override
    public Field<Integer> field5() {
        return HospedagemMock.HOSPEDAGEM_MOCK.QUARTO;
    }

    @Override
    public Field<String> field6() {
        return HospedagemMock.HOSPEDAGEM_MOCK.SITUACAO;
    }

    @Override
    public Field<LocalDate> field7() {
        return HospedagemMock.HOSPEDAGEM_MOCK.DATAEFETIVASAIDA;
    }

    @Override
    public Field<LocalDate> field8() {
        return HospedagemMock.HOSPEDAGEM_MOCK.DATAENTRADA;
    }

    @Override
    public Field<LocalDate> field9() {
        return HospedagemMock.HOSPEDAGEM_MOCK.DATAPREVISTASAIDA;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public LocalDate component2() {
        return getDataEfetivaSaida();
    }

    @Override
    public LocalDate component3() {
        return getDataEntrada();
    }

    @Override
    public LocalDate component4() {
        return getDataPrevistaSaida();
    }

    @Override
    public Integer component5() {
        return getQuarto();
    }

    @Override
    public String component6() {
        return getSituacao();
    }

    @Override
    public LocalDate component7() {
        return getDataefetivasaida();
    }

    @Override
    public LocalDate component8() {
        return getDataentrada();
    }

    @Override
    public LocalDate component9() {
        return getDataprevistasaida();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public LocalDate value2() {
        return getDataEfetivaSaida();
    }

    @Override
    public LocalDate value3() {
        return getDataEntrada();
    }

    @Override
    public LocalDate value4() {
        return getDataPrevistaSaida();
    }

    @Override
    public Integer value5() {
        return getQuarto();
    }

    @Override
    public String value6() {
        return getSituacao();
    }

    @Override
    public LocalDate value7() {
        return getDataefetivasaida();
    }

    @Override
    public LocalDate value8() {
        return getDataentrada();
    }

    @Override
    public LocalDate value9() {
        return getDataprevistasaida();
    }

    @Override
    public HospedagemMockRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public HospedagemMockRecord value2(LocalDate value) {
        setDataEfetivaSaida(value);
        return this;
    }

    @Override
    public HospedagemMockRecord value3(LocalDate value) {
        setDataEntrada(value);
        return this;
    }

    @Override
    public HospedagemMockRecord value4(LocalDate value) {
        setDataPrevistaSaida(value);
        return this;
    }

    @Override
    public HospedagemMockRecord value5(Integer value) {
        setQuarto(value);
        return this;
    }

    @Override
    public HospedagemMockRecord value6(String value) {
        setSituacao(value);
        return this;
    }

    @Override
    public HospedagemMockRecord value7(LocalDate value) {
        setDataefetivasaida(value);
        return this;
    }

    @Override
    public HospedagemMockRecord value8(LocalDate value) {
        setDataentrada(value);
        return this;
    }

    @Override
    public HospedagemMockRecord value9(LocalDate value) {
        setDataprevistasaida(value);
        return this;
    }

    @Override
    public HospedagemMockRecord values(Long value1, LocalDate value2, LocalDate value3, LocalDate value4, Integer value5, String value6, LocalDate value7, LocalDate value8, LocalDate value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached HospedagemMockRecord
     */
    public HospedagemMockRecord() {
        super(HospedagemMock.HOSPEDAGEM_MOCK);
    }

    /**
     * Create a detached, initialised HospedagemMockRecord
     */
    public HospedagemMockRecord(Long id, LocalDate dataEfetivaSaida, LocalDate dataEntrada, LocalDate dataPrevistaSaida, Integer quarto, String situacao, LocalDate dataefetivasaida, LocalDate dataentrada, LocalDate dataprevistasaida) {
        super(HospedagemMock.HOSPEDAGEM_MOCK);

        setId(id);
        setDataEfetivaSaida(dataEfetivaSaida);
        setDataEntrada(dataEntrada);
        setDataPrevistaSaida(dataPrevistaSaida);
        setQuarto(quarto);
        setSituacao(situacao);
        setDataefetivasaida(dataefetivasaida);
        setDataentrada(dataentrada);
        setDataprevistasaida(dataprevistasaida);
    }

    /**
     * Create a detached, initialised HospedagemMockRecord
     */
    public HospedagemMockRecord(br.com.itarocha.chb.adapter.out.persistence.jooq.data.tables.pojos.HospedagemMock value) {
        super(HospedagemMock.HOSPEDAGEM_MOCK);

        if (value != null) {
            setId(value.getId());
            setDataEfetivaSaida(value.getDataEfetivaSaida());
            setDataEntrada(value.getDataEntrada());
            setDataPrevistaSaida(value.getDataPrevistaSaida());
            setQuarto(value.getQuarto());
            setSituacao(value.getSituacao());
            setDataefetivasaida(value.getDataefetivasaida());
            setDataentrada(value.getDataentrada());
            setDataprevistasaida(value.getDataprevistasaida());
        }
    }
}
