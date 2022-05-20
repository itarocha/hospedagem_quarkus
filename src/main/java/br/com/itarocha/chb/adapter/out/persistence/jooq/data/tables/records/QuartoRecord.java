/*
 * This file is generated by jOOQ.
 */
package br.com.itarocha.chb.adapter.out.persistence.jooq.data.tables.records;


import br.com.itarocha.chb.adapter.out.persistence.jooq.data.tables.Quarto;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class QuartoRecord extends UpdatableRecordImpl<QuartoRecord> implements Record8<Long, String, String, Integer, LocalDateTime, LocalDateTime, Long, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>quarto.id</code>.
     */
    public QuartoRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>quarto.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>quarto.ativo</code>.
     */
    public QuartoRecord setAtivo(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>quarto.ativo</code>.
     */
    public String getAtivo() {
        return (String) get(1);
    }

    /**
     * Setter for <code>quarto.descricao</code>.
     */
    public QuartoRecord setDescricao(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>quarto.descricao</code>.
     */
    public String getDescricao() {
        return (String) get(2);
    }

    /**
     * Setter for <code>quarto.numero</code>.
     */
    public QuartoRecord setNumero(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>quarto.numero</code>.
     */
    public Integer getNumero() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>quarto.created_at</code>.
     */
    public QuartoRecord setCreatedAt(LocalDateTime value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>quarto.created_at</code>.
     */
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>quarto.updated_at</code>.
     */
    public QuartoRecord setUpdatedAt(LocalDateTime value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>quarto.updated_at</code>.
     */
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(5);
    }

    /**
     * Setter for <code>quarto.created_by</code>.
     */
    public QuartoRecord setCreatedBy(Long value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>quarto.created_by</code>.
     */
    public Long getCreatedBy() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>quarto.updated_by</code>.
     */
    public QuartoRecord setUpdatedBy(Long value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>quarto.updated_by</code>.
     */
    public Long getUpdatedBy() {
        return (Long) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<Long, String, String, Integer, LocalDateTime, LocalDateTime, Long, Long> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<Long, String, String, Integer, LocalDateTime, LocalDateTime, Long, Long> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Quarto.QUARTO.ID;
    }

    @Override
    public Field<String> field2() {
        return Quarto.QUARTO.ATIVO;
    }

    @Override
    public Field<String> field3() {
        return Quarto.QUARTO.DESCRICAO;
    }

    @Override
    public Field<Integer> field4() {
        return Quarto.QUARTO.NUMERO;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return Quarto.QUARTO.CREATED_AT;
    }

    @Override
    public Field<LocalDateTime> field6() {
        return Quarto.QUARTO.UPDATED_AT;
    }

    @Override
    public Field<Long> field7() {
        return Quarto.QUARTO.CREATED_BY;
    }

    @Override
    public Field<Long> field8() {
        return Quarto.QUARTO.UPDATED_BY;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getAtivo();
    }

    @Override
    public String component3() {
        return getDescricao();
    }

    @Override
    public Integer component4() {
        return getNumero();
    }

    @Override
    public LocalDateTime component5() {
        return getCreatedAt();
    }

    @Override
    public LocalDateTime component6() {
        return getUpdatedAt();
    }

    @Override
    public Long component7() {
        return getCreatedBy();
    }

    @Override
    public Long component8() {
        return getUpdatedBy();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getAtivo();
    }

    @Override
    public String value3() {
        return getDescricao();
    }

    @Override
    public Integer value4() {
        return getNumero();
    }

    @Override
    public LocalDateTime value5() {
        return getCreatedAt();
    }

    @Override
    public LocalDateTime value6() {
        return getUpdatedAt();
    }

    @Override
    public Long value7() {
        return getCreatedBy();
    }

    @Override
    public Long value8() {
        return getUpdatedBy();
    }

    @Override
    public QuartoRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public QuartoRecord value2(String value) {
        setAtivo(value);
        return this;
    }

    @Override
    public QuartoRecord value3(String value) {
        setDescricao(value);
        return this;
    }

    @Override
    public QuartoRecord value4(Integer value) {
        setNumero(value);
        return this;
    }

    @Override
    public QuartoRecord value5(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public QuartoRecord value6(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public QuartoRecord value7(Long value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public QuartoRecord value8(Long value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public QuartoRecord values(Long value1, String value2, String value3, Integer value4, LocalDateTime value5, LocalDateTime value6, Long value7, Long value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached QuartoRecord
     */
    public QuartoRecord() {
        super(Quarto.QUARTO);
    }

    /**
     * Create a detached, initialised QuartoRecord
     */
    public QuartoRecord(Long id, String ativo, String descricao, Integer numero, LocalDateTime createdAt, LocalDateTime updatedAt, Long createdBy, Long updatedBy) {
        super(Quarto.QUARTO);

        setId(id);
        setAtivo(ativo);
        setDescricao(descricao);
        setNumero(numero);
        setCreatedAt(createdAt);
        setUpdatedAt(updatedAt);
        setCreatedBy(createdBy);
        setUpdatedBy(updatedBy);
    }

    /**
     * Create a detached, initialised QuartoRecord
     */
    public QuartoRecord(br.com.itarocha.chb.adapter.out.persistence.jooq.data.tables.pojos.Quarto value) {
        super(Quarto.QUARTO);

        if (value != null) {
            setId(value.getId());
            setAtivo(value.getAtivo());
            setDescricao(value.getDescricao());
            setNumero(value.getNumero());
            setCreatedAt(value.getCreatedAt());
            setUpdatedAt(value.getUpdatedAt());
            setCreatedBy(value.getCreatedBy());
            setUpdatedBy(value.getUpdatedBy());
        }
    }
}
