/*
 * This file is generated by jOOQ.
 */
package br.com.itarocha.chb.adapter.out.persistence.jooq.data.tables;


import br.com.itarocha.chb.adapter.out.persistence.jooq.data.DefaultSchema;
import br.com.itarocha.chb.adapter.out.persistence.jooq.data.Keys;
import br.com.itarocha.chb.adapter.out.persistence.jooq.data.tables.records.PessoaRecord;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row21;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Pessoa extends TableImpl<PessoaRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pessoa</code>
     */
    public static final Pessoa PESSOA = new Pessoa();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PessoaRecord> getRecordType() {
        return PessoaRecord.class;
    }

    /**
     * The column <code>pessoa.id</code>.
     */
    public final TableField<PessoaRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>pessoa.cpf</code>.
     */
    public final TableField<PessoaRecord, String> CPF = createField(DSL.name("cpf"), SQLDataType.VARCHAR(11).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>pessoa.data_nascimento</code>.
     */
    public final TableField<PessoaRecord, LocalDate> DATA_NASCIMENTO = createField(DSL.name("data_nascimento"), SQLDataType.LOCALDATE.nullable(false), this, "");

    /**
     * The column <code>pessoa.email</code>.
     */
    public final TableField<PessoaRecord, String> EMAIL = createField(DSL.name("email"), SQLDataType.VARCHAR(64).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>pessoa.estado_civil</code>.
     */
    public final TableField<PessoaRecord, String> ESTADO_CIVIL = createField(DSL.name("estado_civil"), SQLDataType.VARCHAR(1).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>pessoa.nome</code>.
     */
    public final TableField<PessoaRecord, String> NOME = createField(DSL.name("nome"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>pessoa.observacoes</code>.
     */
    public final TableField<PessoaRecord, String> OBSERVACOES = createField(DSL.name("observacoes"), SQLDataType.CLOB.defaultValue(DSL.field("NULL", SQLDataType.CLOB)), this, "");

    /**
     * The column <code>pessoa.rg</code>.
     */
    public final TableField<PessoaRecord, String> RG = createField(DSL.name("rg"), SQLDataType.VARCHAR(32).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>pessoa.sexo</code>.
     */
    public final TableField<PessoaRecord, String> SEXO = createField(DSL.name("sexo"), SQLDataType.VARCHAR(1).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>pessoa.telefone</code>.
     */
    public final TableField<PessoaRecord, String> TELEFONE = createField(DSL.name("telefone"), SQLDataType.VARCHAR(16).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>pessoa.endereco_id</code>.
     */
    public final TableField<PessoaRecord, Long> ENDERECO_ID = createField(DSL.name("endereco_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pessoa.updated_at</code>.
     */
    public final TableField<PessoaRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("updated_at"), SQLDataType.LOCALDATETIME(0).defaultValue(DSL.field("NULL", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>pessoa.created_at</code>.
     */
    public final TableField<PessoaRecord, LocalDateTime> CREATED_AT = createField(DSL.name("created_at"), SQLDataType.LOCALDATETIME(0).defaultValue(DSL.field("NULL", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>pessoa.updated_by</code>.
     */
    public final TableField<PessoaRecord, Long> UPDATED_BY = createField(DSL.name("updated_by"), SQLDataType.BIGINT.defaultValue(DSL.field("NULL", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>pessoa.cartao_sus</code>.
     */
    public final TableField<PessoaRecord, String> CARTAO_SUS = createField(DSL.name("cartao_sus"), SQLDataType.VARCHAR(16).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>pessoa.created_by</code>.
     */
    public final TableField<PessoaRecord, Long> CREATED_BY = createField(DSL.name("created_by"), SQLDataType.BIGINT.defaultValue(DSL.field("NULL", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>pessoa.nacionalidade</code>.
     */
    public final TableField<PessoaRecord, String> NACIONALIDADE = createField(DSL.name("nacionalidade"), SQLDataType.VARCHAR(64).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>pessoa.profissao</code>.
     */
    public final TableField<PessoaRecord, String> PROFISSAO = createField(DSL.name("profissao"), SQLDataType.VARCHAR(64).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>pessoa.telefone2</code>.
     */
    public final TableField<PessoaRecord, String> TELEFONE2 = createField(DSL.name("telefone2"), SQLDataType.VARCHAR(16).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>pessoa.naturalidade_cidade</code>.
     */
    public final TableField<PessoaRecord, String> NATURALIDADE_CIDADE = createField(DSL.name("naturalidade_cidade"), SQLDataType.VARCHAR(64).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>pessoa.naturalidade_uf</code>.
     */
    public final TableField<PessoaRecord, String> NATURALIDADE_UF = createField(DSL.name("naturalidade_uf"), SQLDataType.VARCHAR(2).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    private Pessoa(Name alias, Table<PessoaRecord> aliased) {
        this(alias, aliased, null);
    }

    private Pessoa(Name alias, Table<PessoaRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>pessoa</code> table reference
     */
    public Pessoa(String alias) {
        this(DSL.name(alias), PESSOA);
    }

    /**
     * Create an aliased <code>pessoa</code> table reference
     */
    public Pessoa(Name alias) {
        this(alias, PESSOA);
    }

    /**
     * Create a <code>pessoa</code> table reference
     */
    public Pessoa() {
        this(DSL.name("pessoa"), null);
    }

    public <O extends Record> Pessoa(Table<O> child, ForeignKey<O, PessoaRecord> key) {
        super(child, key, PESSOA);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public Identity<PessoaRecord, Long> getIdentity() {
        return (Identity<PessoaRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<PessoaRecord> getPrimaryKey() {
        return Keys.KEY_PESSOA_PRIMARY;
    }

    @Override
    public List<ForeignKey<PessoaRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FKEI4ABNSW085KX27J89RP796NY);
    }

    private transient Endereco _endereco;

    public Endereco endereco() {
        if (_endereco == null)
            _endereco = new Endereco(this, Keys.FKEI4ABNSW085KX27J89RP796NY);

        return _endereco;
    }

    @Override
    public Pessoa as(String alias) {
        return new Pessoa(DSL.name(alias), this);
    }

    @Override
    public Pessoa as(Name alias) {
        return new Pessoa(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Pessoa rename(String name) {
        return new Pessoa(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Pessoa rename(Name name) {
        return new Pessoa(name, null);
    }

    // -------------------------------------------------------------------------
    // Row21 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row21<Long, String, LocalDate, String, String, String, String, String, String, String, Long, LocalDateTime, LocalDateTime, Long, String, Long, String, String, String, String, String> fieldsRow() {
        return (Row21) super.fieldsRow();
    }
}
