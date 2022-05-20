/*
 * This file is generated by jOOQ.
 */
package br.com.itarocha.chb.adapter.out.persistence.jooq.data.tables;


import br.com.itarocha.chb.adapter.out.persistence.jooq.data.DefaultSchema;
import br.com.itarocha.chb.adapter.out.persistence.jooq.data.Keys;
import br.com.itarocha.chb.adapter.out.persistence.jooq.data.tables.records.EstadoLeitoRecord;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row7;
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
public class EstadoLeito extends TableImpl<EstadoLeitoRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>estado_leito</code>
     */
    public static final EstadoLeito ESTADO_LEITO = new EstadoLeito();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EstadoLeitoRecord> getRecordType() {
        return EstadoLeitoRecord.class;
    }

    /**
     * The column <code>estado_leito.id</code>.
     */
    public final TableField<EstadoLeitoRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>estado_leito.descricao</code>.
     */
    public final TableField<EstadoLeitoRecord, String> DESCRICAO = createField(DSL.name("descricao"), SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column <code>estado_leito.disponivel</code>.
     */
    public final TableField<EstadoLeitoRecord, String> DISPONIVEL = createField(DSL.name("disponivel"), SQLDataType.VARCHAR(1).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>estado_leito.created_at</code>.
     */
    public final TableField<EstadoLeitoRecord, LocalDateTime> CREATED_AT = createField(DSL.name("created_at"), SQLDataType.LOCALDATETIME(0).defaultValue(DSL.field("NULL", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>estado_leito.updated_at</code>.
     */
    public final TableField<EstadoLeitoRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("updated_at"), SQLDataType.LOCALDATETIME(0).defaultValue(DSL.field("NULL", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>estado_leito.created_by</code>.
     */
    public final TableField<EstadoLeitoRecord, Long> CREATED_BY = createField(DSL.name("created_by"), SQLDataType.BIGINT.defaultValue(DSL.field("NULL", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>estado_leito.updated_by</code>.
     */
    public final TableField<EstadoLeitoRecord, Long> UPDATED_BY = createField(DSL.name("updated_by"), SQLDataType.BIGINT.defaultValue(DSL.field("NULL", SQLDataType.BIGINT)), this, "");

    private EstadoLeito(Name alias, Table<EstadoLeitoRecord> aliased) {
        this(alias, aliased, null);
    }

    private EstadoLeito(Name alias, Table<EstadoLeitoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>estado_leito</code> table reference
     */
    public EstadoLeito(String alias) {
        this(DSL.name(alias), ESTADO_LEITO);
    }

    /**
     * Create an aliased <code>estado_leito</code> table reference
     */
    public EstadoLeito(Name alias) {
        this(alias, ESTADO_LEITO);
    }

    /**
     * Create a <code>estado_leito</code> table reference
     */
    public EstadoLeito() {
        this(DSL.name("estado_leito"), null);
    }

    public <O extends Record> EstadoLeito(Table<O> child, ForeignKey<O, EstadoLeitoRecord> key) {
        super(child, key, ESTADO_LEITO);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public Identity<EstadoLeitoRecord, Long> getIdentity() {
        return (Identity<EstadoLeitoRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<EstadoLeitoRecord> getPrimaryKey() {
        return Keys.KEY_ESTADO_LEITO_PRIMARY;
    }

    @Override
    public EstadoLeito as(String alias) {
        return new EstadoLeito(DSL.name(alias), this);
    }

    @Override
    public EstadoLeito as(Name alias) {
        return new EstadoLeito(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EstadoLeito rename(String name) {
        return new EstadoLeito(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EstadoLeito rename(Name name) {
        return new EstadoLeito(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Long, String, String, LocalDateTime, LocalDateTime, Long, Long> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}
