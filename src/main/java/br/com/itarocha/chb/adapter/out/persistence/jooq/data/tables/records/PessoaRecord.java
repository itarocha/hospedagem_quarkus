/*
 * This file is generated by jOOQ.
 */
package br.com.itarocha.chb.adapter.out.persistence.jooq.data.tables.records;


import br.com.itarocha.chb.adapter.out.persistence.jooq.data.tables.Pessoa;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record21;
import org.jooq.Row21;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PessoaRecord extends UpdatableRecordImpl<PessoaRecord> implements Record21<Long, String, LocalDate, String, String, String, String, String, String, String, Long, LocalDateTime, LocalDateTime, Long, String, Long, String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pessoa.id</code>.
     */
    public PessoaRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>pessoa.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pessoa.cpf</code>.
     */
    public PessoaRecord setCpf(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>pessoa.cpf</code>.
     */
    public String getCpf() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pessoa.data_nascimento</code>.
     */
    public PessoaRecord setDataNascimento(LocalDate value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>pessoa.data_nascimento</code>.
     */
    public LocalDate getDataNascimento() {
        return (LocalDate) get(2);
    }

    /**
     * Setter for <code>pessoa.email</code>.
     */
    public PessoaRecord setEmail(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>pessoa.email</code>.
     */
    public String getEmail() {
        return (String) get(3);
    }

    /**
     * Setter for <code>pessoa.estado_civil</code>.
     */
    public PessoaRecord setEstadoCivil(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>pessoa.estado_civil</code>.
     */
    public String getEstadoCivil() {
        return (String) get(4);
    }

    /**
     * Setter for <code>pessoa.nome</code>.
     */
    public PessoaRecord setNome(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>pessoa.nome</code>.
     */
    public String getNome() {
        return (String) get(5);
    }

    /**
     * Setter for <code>pessoa.observacoes</code>.
     */
    public PessoaRecord setObservacoes(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>pessoa.observacoes</code>.
     */
    public String getObservacoes() {
        return (String) get(6);
    }

    /**
     * Setter for <code>pessoa.rg</code>.
     */
    public PessoaRecord setRg(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>pessoa.rg</code>.
     */
    public String getRg() {
        return (String) get(7);
    }

    /**
     * Setter for <code>pessoa.sexo</code>.
     */
    public PessoaRecord setSexo(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>pessoa.sexo</code>.
     */
    public String getSexo() {
        return (String) get(8);
    }

    /**
     * Setter for <code>pessoa.telefone</code>.
     */
    public PessoaRecord setTelefone(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>pessoa.telefone</code>.
     */
    public String getTelefone() {
        return (String) get(9);
    }

    /**
     * Setter for <code>pessoa.endereco_id</code>.
     */
    public PessoaRecord setEnderecoId(Long value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>pessoa.endereco_id</code>.
     */
    public Long getEnderecoId() {
        return (Long) get(10);
    }

    /**
     * Setter for <code>pessoa.updated_at</code>.
     */
    public PessoaRecord setUpdatedAt(LocalDateTime value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>pessoa.updated_at</code>.
     */
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(11);
    }

    /**
     * Setter for <code>pessoa.created_at</code>.
     */
    public PessoaRecord setCreatedAt(LocalDateTime value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>pessoa.created_at</code>.
     */
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(12);
    }

    /**
     * Setter for <code>pessoa.updated_by</code>.
     */
    public PessoaRecord setUpdatedBy(Long value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>pessoa.updated_by</code>.
     */
    public Long getUpdatedBy() {
        return (Long) get(13);
    }

    /**
     * Setter for <code>pessoa.cartao_sus</code>.
     */
    public PessoaRecord setCartaoSus(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>pessoa.cartao_sus</code>.
     */
    public String getCartaoSus() {
        return (String) get(14);
    }

    /**
     * Setter for <code>pessoa.created_by</code>.
     */
    public PessoaRecord setCreatedBy(Long value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>pessoa.created_by</code>.
     */
    public Long getCreatedBy() {
        return (Long) get(15);
    }

    /**
     * Setter for <code>pessoa.nacionalidade</code>.
     */
    public PessoaRecord setNacionalidade(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>pessoa.nacionalidade</code>.
     */
    public String getNacionalidade() {
        return (String) get(16);
    }

    /**
     * Setter for <code>pessoa.profissao</code>.
     */
    public PessoaRecord setProfissao(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>pessoa.profissao</code>.
     */
    public String getProfissao() {
        return (String) get(17);
    }

    /**
     * Setter for <code>pessoa.telefone2</code>.
     */
    public PessoaRecord setTelefone2(String value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>pessoa.telefone2</code>.
     */
    public String getTelefone2() {
        return (String) get(18);
    }

    /**
     * Setter for <code>pessoa.naturalidade_cidade</code>.
     */
    public PessoaRecord setNaturalidadeCidade(String value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>pessoa.naturalidade_cidade</code>.
     */
    public String getNaturalidadeCidade() {
        return (String) get(19);
    }

    /**
     * Setter for <code>pessoa.naturalidade_uf</code>.
     */
    public PessoaRecord setNaturalidadeUf(String value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>pessoa.naturalidade_uf</code>.
     */
    public String getNaturalidadeUf() {
        return (String) get(20);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record21 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row21<Long, String, LocalDate, String, String, String, String, String, String, String, Long, LocalDateTime, LocalDateTime, Long, String, Long, String, String, String, String, String> fieldsRow() {
        return (Row21) super.fieldsRow();
    }

    @Override
    public Row21<Long, String, LocalDate, String, String, String, String, String, String, String, Long, LocalDateTime, LocalDateTime, Long, String, Long, String, String, String, String, String> valuesRow() {
        return (Row21) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Pessoa.PESSOA.ID;
    }

    @Override
    public Field<String> field2() {
        return Pessoa.PESSOA.CPF;
    }

    @Override
    public Field<LocalDate> field3() {
        return Pessoa.PESSOA.DATA_NASCIMENTO;
    }

    @Override
    public Field<String> field4() {
        return Pessoa.PESSOA.EMAIL;
    }

    @Override
    public Field<String> field5() {
        return Pessoa.PESSOA.ESTADO_CIVIL;
    }

    @Override
    public Field<String> field6() {
        return Pessoa.PESSOA.NOME;
    }

    @Override
    public Field<String> field7() {
        return Pessoa.PESSOA.OBSERVACOES;
    }

    @Override
    public Field<String> field8() {
        return Pessoa.PESSOA.RG;
    }

    @Override
    public Field<String> field9() {
        return Pessoa.PESSOA.SEXO;
    }

    @Override
    public Field<String> field10() {
        return Pessoa.PESSOA.TELEFONE;
    }

    @Override
    public Field<Long> field11() {
        return Pessoa.PESSOA.ENDERECO_ID;
    }

    @Override
    public Field<LocalDateTime> field12() {
        return Pessoa.PESSOA.UPDATED_AT;
    }

    @Override
    public Field<LocalDateTime> field13() {
        return Pessoa.PESSOA.CREATED_AT;
    }

    @Override
    public Field<Long> field14() {
        return Pessoa.PESSOA.UPDATED_BY;
    }

    @Override
    public Field<String> field15() {
        return Pessoa.PESSOA.CARTAO_SUS;
    }

    @Override
    public Field<Long> field16() {
        return Pessoa.PESSOA.CREATED_BY;
    }

    @Override
    public Field<String> field17() {
        return Pessoa.PESSOA.NACIONALIDADE;
    }

    @Override
    public Field<String> field18() {
        return Pessoa.PESSOA.PROFISSAO;
    }

    @Override
    public Field<String> field19() {
        return Pessoa.PESSOA.TELEFONE2;
    }

    @Override
    public Field<String> field20() {
        return Pessoa.PESSOA.NATURALIDADE_CIDADE;
    }

    @Override
    public Field<String> field21() {
        return Pessoa.PESSOA.NATURALIDADE_UF;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getCpf();
    }

    @Override
    public LocalDate component3() {
        return getDataNascimento();
    }

    @Override
    public String component4() {
        return getEmail();
    }

    @Override
    public String component5() {
        return getEstadoCivil();
    }

    @Override
    public String component6() {
        return getNome();
    }

    @Override
    public String component7() {
        return getObservacoes();
    }

    @Override
    public String component8() {
        return getRg();
    }

    @Override
    public String component9() {
        return getSexo();
    }

    @Override
    public String component10() {
        return getTelefone();
    }

    @Override
    public Long component11() {
        return getEnderecoId();
    }

    @Override
    public LocalDateTime component12() {
        return getUpdatedAt();
    }

    @Override
    public LocalDateTime component13() {
        return getCreatedAt();
    }

    @Override
    public Long component14() {
        return getUpdatedBy();
    }

    @Override
    public String component15() {
        return getCartaoSus();
    }

    @Override
    public Long component16() {
        return getCreatedBy();
    }

    @Override
    public String component17() {
        return getNacionalidade();
    }

    @Override
    public String component18() {
        return getProfissao();
    }

    @Override
    public String component19() {
        return getTelefone2();
    }

    @Override
    public String component20() {
        return getNaturalidadeCidade();
    }

    @Override
    public String component21() {
        return getNaturalidadeUf();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getCpf();
    }

    @Override
    public LocalDate value3() {
        return getDataNascimento();
    }

    @Override
    public String value4() {
        return getEmail();
    }

    @Override
    public String value5() {
        return getEstadoCivil();
    }

    @Override
    public String value6() {
        return getNome();
    }

    @Override
    public String value7() {
        return getObservacoes();
    }

    @Override
    public String value8() {
        return getRg();
    }

    @Override
    public String value9() {
        return getSexo();
    }

    @Override
    public String value10() {
        return getTelefone();
    }

    @Override
    public Long value11() {
        return getEnderecoId();
    }

    @Override
    public LocalDateTime value12() {
        return getUpdatedAt();
    }

    @Override
    public LocalDateTime value13() {
        return getCreatedAt();
    }

    @Override
    public Long value14() {
        return getUpdatedBy();
    }

    @Override
    public String value15() {
        return getCartaoSus();
    }

    @Override
    public Long value16() {
        return getCreatedBy();
    }

    @Override
    public String value17() {
        return getNacionalidade();
    }

    @Override
    public String value18() {
        return getProfissao();
    }

    @Override
    public String value19() {
        return getTelefone2();
    }

    @Override
    public String value20() {
        return getNaturalidadeCidade();
    }

    @Override
    public String value21() {
        return getNaturalidadeUf();
    }

    @Override
    public PessoaRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public PessoaRecord value2(String value) {
        setCpf(value);
        return this;
    }

    @Override
    public PessoaRecord value3(LocalDate value) {
        setDataNascimento(value);
        return this;
    }

    @Override
    public PessoaRecord value4(String value) {
        setEmail(value);
        return this;
    }

    @Override
    public PessoaRecord value5(String value) {
        setEstadoCivil(value);
        return this;
    }

    @Override
    public PessoaRecord value6(String value) {
        setNome(value);
        return this;
    }

    @Override
    public PessoaRecord value7(String value) {
        setObservacoes(value);
        return this;
    }

    @Override
    public PessoaRecord value8(String value) {
        setRg(value);
        return this;
    }

    @Override
    public PessoaRecord value9(String value) {
        setSexo(value);
        return this;
    }

    @Override
    public PessoaRecord value10(String value) {
        setTelefone(value);
        return this;
    }

    @Override
    public PessoaRecord value11(Long value) {
        setEnderecoId(value);
        return this;
    }

    @Override
    public PessoaRecord value12(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public PessoaRecord value13(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public PessoaRecord value14(Long value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public PessoaRecord value15(String value) {
        setCartaoSus(value);
        return this;
    }

    @Override
    public PessoaRecord value16(Long value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public PessoaRecord value17(String value) {
        setNacionalidade(value);
        return this;
    }

    @Override
    public PessoaRecord value18(String value) {
        setProfissao(value);
        return this;
    }

    @Override
    public PessoaRecord value19(String value) {
        setTelefone2(value);
        return this;
    }

    @Override
    public PessoaRecord value20(String value) {
        setNaturalidadeCidade(value);
        return this;
    }

    @Override
    public PessoaRecord value21(String value) {
        setNaturalidadeUf(value);
        return this;
    }

    @Override
    public PessoaRecord values(Long value1, String value2, LocalDate value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, Long value11, LocalDateTime value12, LocalDateTime value13, Long value14, String value15, Long value16, String value17, String value18, String value19, String value20, String value21) {
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
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        value21(value21);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PessoaRecord
     */
    public PessoaRecord() {
        super(Pessoa.PESSOA);
    }

    /**
     * Create a detached, initialised PessoaRecord
     */
    public PessoaRecord(Long id, String cpf, LocalDate dataNascimento, String email, String estadoCivil, String nome, String observacoes, String rg, String sexo, String telefone, Long enderecoId, LocalDateTime updatedAt, LocalDateTime createdAt, Long updatedBy, String cartaoSus, Long createdBy, String nacionalidade, String profissao, String telefone2, String naturalidadeCidade, String naturalidadeUf) {
        super(Pessoa.PESSOA);

        setId(id);
        setCpf(cpf);
        setDataNascimento(dataNascimento);
        setEmail(email);
        setEstadoCivil(estadoCivil);
        setNome(nome);
        setObservacoes(observacoes);
        setRg(rg);
        setSexo(sexo);
        setTelefone(telefone);
        setEnderecoId(enderecoId);
        setUpdatedAt(updatedAt);
        setCreatedAt(createdAt);
        setUpdatedBy(updatedBy);
        setCartaoSus(cartaoSus);
        setCreatedBy(createdBy);
        setNacionalidade(nacionalidade);
        setProfissao(profissao);
        setTelefone2(telefone2);
        setNaturalidadeCidade(naturalidadeCidade);
        setNaturalidadeUf(naturalidadeUf);
    }

    /**
     * Create a detached, initialised PessoaRecord
     */
    public PessoaRecord(br.com.itarocha.chb.adapter.out.persistence.jooq.data.tables.pojos.Pessoa value) {
        super(Pessoa.PESSOA);

        if (value != null) {
            setId(value.getId());
            setCpf(value.getCpf());
            setDataNascimento(value.getDataNascimento());
            setEmail(value.getEmail());
            setEstadoCivil(value.getEstadoCivil());
            setNome(value.getNome());
            setObservacoes(value.getObservacoes());
            setRg(value.getRg());
            setSexo(value.getSexo());
            setTelefone(value.getTelefone());
            setEnderecoId(value.getEnderecoId());
            setUpdatedAt(value.getUpdatedAt());
            setCreatedAt(value.getCreatedAt());
            setUpdatedBy(value.getUpdatedBy());
            setCartaoSus(value.getCartaoSus());
            setCreatedBy(value.getCreatedBy());
            setNacionalidade(value.getNacionalidade());
            setProfissao(value.getProfissao());
            setTelefone2(value.getTelefone2());
            setNaturalidadeCidade(value.getNaturalidadeCidade());
            setNaturalidadeUf(value.getNaturalidadeUf());
        }
    }
}
