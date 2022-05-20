/*
 * This file is generated by jOOQ.
 */
package br.com.itarocha.chb.adapter.out.persistence.jooq.data.tables.records;


import br.com.itarocha.chb.adapter.out.persistence.jooq.data.tables.Entidade;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EntidadeRecord extends UpdatableRecordImpl<EntidadeRecord> implements Record12<Long, String, String, String, String, Long, LocalDateTime, LocalDateTime, Long, Long, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>entidade.id</code>.
     */
    public EntidadeRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>entidade.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>entidade.cnpj</code>.
     */
    public EntidadeRecord setCnpj(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>entidade.cnpj</code>.
     */
    public String getCnpj() {
        return (String) get(1);
    }

    /**
     * Setter for <code>entidade.email</code>.
     */
    public EntidadeRecord setEmail(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>entidade.email</code>.
     */
    public String getEmail() {
        return (String) get(2);
    }

    /**
     * Setter for <code>entidade.nome</code>.
     */
    public EntidadeRecord setNome(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>entidade.nome</code>.
     */
    public String getNome() {
        return (String) get(3);
    }

    /**
     * Setter for <code>entidade.telefone</code>.
     */
    public EntidadeRecord setTelefone(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>entidade.telefone</code>.
     */
    public String getTelefone() {
        return (String) get(4);
    }

    /**
     * Setter for <code>entidade.endereco_id</code>.
     */
    public EntidadeRecord setEnderecoId(Long value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>entidade.endereco_id</code>.
     */
    public Long getEnderecoId() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>entidade.created_at</code>.
     */
    public EntidadeRecord setCreatedAt(LocalDateTime value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>entidade.created_at</code>.
     */
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>entidade.updated_at</code>.
     */
    public EntidadeRecord setUpdatedAt(LocalDateTime value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>entidade.updated_at</code>.
     */
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>entidade.created_by</code>.
     */
    public EntidadeRecord setCreatedBy(Long value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>entidade.created_by</code>.
     */
    public Long getCreatedBy() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>entidade.updated_by</code>.
     */
    public EntidadeRecord setUpdatedBy(Long value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>entidade.updated_by</code>.
     */
    public Long getUpdatedBy() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>entidade.observacoes</code>.
     */
    public EntidadeRecord setObservacoes(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>entidade.observacoes</code>.
     */
    public String getObservacoes() {
        return (String) get(10);
    }

    /**
     * Setter for <code>entidade.telefone2</code>.
     */
    public EntidadeRecord setTelefone2(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>entidade.telefone2</code>.
     */
    public String getTelefone2() {
        return (String) get(11);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row12<Long, String, String, String, String, Long, LocalDateTime, LocalDateTime, Long, Long, String, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    public Row12<Long, String, String, String, String, Long, LocalDateTime, LocalDateTime, Long, Long, String, String> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Entidade.ENTIDADE.ID;
    }

    @Override
    public Field<String> field2() {
        return Entidade.ENTIDADE.CNPJ;
    }

    @Override
    public Field<String> field3() {
        return Entidade.ENTIDADE.EMAIL;
    }

    @Override
    public Field<String> field4() {
        return Entidade.ENTIDADE.NOME;
    }

    @Override
    public Field<String> field5() {
        return Entidade.ENTIDADE.TELEFONE;
    }

    @Override
    public Field<Long> field6() {
        return Entidade.ENTIDADE.ENDERECO_ID;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return Entidade.ENTIDADE.CREATED_AT;
    }

    @Override
    public Field<LocalDateTime> field8() {
        return Entidade.ENTIDADE.UPDATED_AT;
    }

    @Override
    public Field<Long> field9() {
        return Entidade.ENTIDADE.CREATED_BY;
    }

    @Override
    public Field<Long> field10() {
        return Entidade.ENTIDADE.UPDATED_BY;
    }

    @Override
    public Field<String> field11() {
        return Entidade.ENTIDADE.OBSERVACOES;
    }

    @Override
    public Field<String> field12() {
        return Entidade.ENTIDADE.TELEFONE2;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getCnpj();
    }

    @Override
    public String component3() {
        return getEmail();
    }

    @Override
    public String component4() {
        return getNome();
    }

    @Override
    public String component5() {
        return getTelefone();
    }

    @Override
    public Long component6() {
        return getEnderecoId();
    }

    @Override
    public LocalDateTime component7() {
        return getCreatedAt();
    }

    @Override
    public LocalDateTime component8() {
        return getUpdatedAt();
    }

    @Override
    public Long component9() {
        return getCreatedBy();
    }

    @Override
    public Long component10() {
        return getUpdatedBy();
    }

    @Override
    public String component11() {
        return getObservacoes();
    }

    @Override
    public String component12() {
        return getTelefone2();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getCnpj();
    }

    @Override
    public String value3() {
        return getEmail();
    }

    @Override
    public String value4() {
        return getNome();
    }

    @Override
    public String value5() {
        return getTelefone();
    }

    @Override
    public Long value6() {
        return getEnderecoId();
    }

    @Override
    public LocalDateTime value7() {
        return getCreatedAt();
    }

    @Override
    public LocalDateTime value8() {
        return getUpdatedAt();
    }

    @Override
    public Long value9() {
        return getCreatedBy();
    }

    @Override
    public Long value10() {
        return getUpdatedBy();
    }

    @Override
    public String value11() {
        return getObservacoes();
    }

    @Override
    public String value12() {
        return getTelefone2();
    }

    @Override
    public EntidadeRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public EntidadeRecord value2(String value) {
        setCnpj(value);
        return this;
    }

    @Override
    public EntidadeRecord value3(String value) {
        setEmail(value);
        return this;
    }

    @Override
    public EntidadeRecord value4(String value) {
        setNome(value);
        return this;
    }

    @Override
    public EntidadeRecord value5(String value) {
        setTelefone(value);
        return this;
    }

    @Override
    public EntidadeRecord value6(Long value) {
        setEnderecoId(value);
        return this;
    }

    @Override
    public EntidadeRecord value7(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public EntidadeRecord value8(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public EntidadeRecord value9(Long value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public EntidadeRecord value10(Long value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public EntidadeRecord value11(String value) {
        setObservacoes(value);
        return this;
    }

    @Override
    public EntidadeRecord value12(String value) {
        setTelefone2(value);
        return this;
    }

    @Override
    public EntidadeRecord values(Long value1, String value2, String value3, String value4, String value5, Long value6, LocalDateTime value7, LocalDateTime value8, Long value9, Long value10, String value11, String value12) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EntidadeRecord
     */
    public EntidadeRecord() {
        super(Entidade.ENTIDADE);
    }

    /**
     * Create a detached, initialised EntidadeRecord
     */
    public EntidadeRecord(Long id, String cnpj, String email, String nome, String telefone, Long enderecoId, LocalDateTime createdAt, LocalDateTime updatedAt, Long createdBy, Long updatedBy, String observacoes, String telefone2) {
        super(Entidade.ENTIDADE);

        setId(id);
        setCnpj(cnpj);
        setEmail(email);
        setNome(nome);
        setTelefone(telefone);
        setEnderecoId(enderecoId);
        setCreatedAt(createdAt);
        setUpdatedAt(updatedAt);
        setCreatedBy(createdBy);
        setUpdatedBy(updatedBy);
        setObservacoes(observacoes);
        setTelefone2(telefone2);
    }

    /**
     * Create a detached, initialised EntidadeRecord
     */
    public EntidadeRecord(br.com.itarocha.chb.adapter.out.persistence.jooq.data.tables.pojos.Entidade value) {
        super(Entidade.ENTIDADE);

        if (value != null) {
            setId(value.getId());
            setCnpj(value.getCnpj());
            setEmail(value.getEmail());
            setNome(value.getNome());
            setTelefone(value.getTelefone());
            setEnderecoId(value.getEnderecoId());
            setCreatedAt(value.getCreatedAt());
            setUpdatedAt(value.getUpdatedAt());
            setCreatedBy(value.getCreatedBy());
            setUpdatedBy(value.getUpdatedBy());
            setObservacoes(value.getObservacoes());
            setTelefone2(value.getTelefone2());
        }
    }
}