/*
 * This file is generated by jOOQ.
 */
package br.com.itarocha.chb.adapter.out.persistence.jooq.data.tables;


import br.com.itarocha.chb.adapter.out.persistence.jooq.data.DefaultSchema;
import br.com.itarocha.chb.adapter.out.persistence.jooq.data.Keys;
import br.com.itarocha.chb.adapter.out.persistence.jooq.data.tables.records.HospedeLeitoRecord;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row10;
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
public class HospedeLeito extends TableImpl<HospedeLeitoRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>hospede_leito</code>
     */
    public static final HospedeLeito HOSPEDE_LEITO = new HospedeLeito();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HospedeLeitoRecord> getRecordType() {
        return HospedeLeitoRecord.class;
    }

    /**
     * The column <code>hospede_leito.id</code>.
     */
    public final TableField<HospedeLeitoRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>hospede_leito.data_entrada</code>.
     */
    public final TableField<HospedeLeitoRecord, LocalDate> DATA_ENTRADA = createField(DSL.name("data_entrada"), SQLDataType.LOCALDATE.nullable(false), this, "");

    /**
     * The column <code>hospede_leito.hospede_id</code>.
     */
    public final TableField<HospedeLeitoRecord, Long> HOSPEDE_ID = createField(DSL.name("hospede_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>hospede_leito.leito_id</code>.
     */
    public final TableField<HospedeLeitoRecord, Long> LEITO_ID = createField(DSL.name("leito_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>hospede_leito.quarto_id</code>.
     */
    public final TableField<HospedeLeitoRecord, Long> QUARTO_ID = createField(DSL.name("quarto_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>hospede_leito.data_saida</code>.
     */
    public final TableField<HospedeLeitoRecord, LocalDate> DATA_SAIDA = createField(DSL.name("data_saida"), SQLDataType.LOCALDATE.defaultValue(DSL.field("NULL", SQLDataType.LOCALDATE)), this, "");

    /**
     * The column <code>hospede_leito.created_at</code>.
     */
    public final TableField<HospedeLeitoRecord, LocalDateTime> CREATED_AT = createField(DSL.name("created_at"), SQLDataType.LOCALDATETIME(0).defaultValue(DSL.field("NULL", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>hospede_leito.updated_at</code>.
     */
    public final TableField<HospedeLeitoRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("updated_at"), SQLDataType.LOCALDATETIME(0).defaultValue(DSL.field("NULL", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>hospede_leito.created_by</code>.
     */
    public final TableField<HospedeLeitoRecord, Long> CREATED_BY = createField(DSL.name("created_by"), SQLDataType.BIGINT.defaultValue(DSL.field("NULL", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>hospede_leito.updated_by</code>.
     */
    public final TableField<HospedeLeitoRecord, Long> UPDATED_BY = createField(DSL.name("updated_by"), SQLDataType.BIGINT.defaultValue(DSL.field("NULL", SQLDataType.BIGINT)), this, "");

    private HospedeLeito(Name alias, Table<HospedeLeitoRecord> aliased) {
        this(alias, aliased, null);
    }

    private HospedeLeito(Name alias, Table<HospedeLeitoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>hospede_leito</code> table reference
     */
    public HospedeLeito(String alias) {
        this(DSL.name(alias), HOSPEDE_LEITO);
    }

    /**
     * Create an aliased <code>hospede_leito</code> table reference
     */
    public HospedeLeito(Name alias) {
        this(alias, HOSPEDE_LEITO);
    }

    /**
     * Create a <code>hospede_leito</code> table reference
     */
    public HospedeLeito() {
        this(DSL.name("hospede_leito"), null);
    }

    public <O extends Record> HospedeLeito(Table<O> child, ForeignKey<O, HospedeLeitoRecord> key) {
        super(child, key, HOSPEDE_LEITO);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public Identity<HospedeLeitoRecord, Long> getIdentity() {
        return (Identity<HospedeLeitoRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<HospedeLeitoRecord> getPrimaryKey() {
        return Keys.KEY_HOSPEDE_LEITO_PRIMARY;
    }

    @Override
    public List<ForeignKey<HospedeLeitoRecord, ?>> getReferences() {
        return Arrays.asList(Keys.HOSPEDE_LEITO_HOSPEDE_FK, Keys.FKMV2DXRYDC0L7H5OMHXVSY60GH, Keys.FK4SQUTFBKQO7AVEVYX8F98TKUY);
    }

    private transient Hospede _hospede;
    private transient Leito _leito;
    private transient Quarto _quarto;

    public Hospede hospede() {
        if (_hospede == null)
            _hospede = new Hospede(this, Keys.HOSPEDE_LEITO_HOSPEDE_FK);

        return _hospede;
    }

    public Leito leito() {
        if (_leito == null)
            _leito = new Leito(this, Keys.FKMV2DXRYDC0L7H5OMHXVSY60GH);

        return _leito;
    }

    public Quarto quarto() {
        if (_quarto == null)
            _quarto = new Quarto(this, Keys.FK4SQUTFBKQO7AVEVYX8F98TKUY);

        return _quarto;
    }

    @Override
    public HospedeLeito as(String alias) {
        return new HospedeLeito(DSL.name(alias), this);
    }

    @Override
    public HospedeLeito as(Name alias) {
        return new HospedeLeito(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public HospedeLeito rename(String name) {
        return new HospedeLeito(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public HospedeLeito rename(Name name) {
        return new HospedeLeito(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<Long, LocalDate, Long, Long, Long, LocalDate, LocalDateTime, LocalDateTime, Long, Long> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
}
