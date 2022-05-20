/*
 * This file is generated by jOOQ.
 */
package br.com.itarocha.chb.adapter.out.persistence.jooq.data.tables;


import br.com.itarocha.chb.adapter.out.persistence.jooq.data.DefaultSchema;
import br.com.itarocha.chb.adapter.out.persistence.jooq.data.Keys;
import br.com.itarocha.chb.adapter.out.persistence.jooq.data.tables.records.TipoServicoRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

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
public class TipoServico extends TableImpl<TipoServicoRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>tipo_servico</code>
     */
    public static final TipoServico TIPO_SERVICO = new TipoServico();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TipoServicoRecord> getRecordType() {
        return TipoServicoRecord.class;
    }

    /**
     * The column <code>tipo_servico.id</code>.
     */
    public final TableField<TipoServicoRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>tipo_servico.ativo</code>.
     */
    public final TableField<TipoServicoRecord, String> ATIVO = createField(DSL.name("ativo"), SQLDataType.VARCHAR(1).nullable(false), this, "");

    /**
     * The column <code>tipo_servico.descricao</code>.
     */
    public final TableField<TipoServicoRecord, String> DESCRICAO = createField(DSL.name("descricao"), SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column <code>tipo_servico.created_at</code>.
     */
    public final TableField<TipoServicoRecord, LocalDateTime> CREATED_AT = createField(DSL.name("created_at"), SQLDataType.LOCALDATETIME(0).defaultValue(DSL.field("NULL", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>tipo_servico.updated_at</code>.
     */
    public final TableField<TipoServicoRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("updated_at"), SQLDataType.LOCALDATETIME(0).defaultValue(DSL.field("NULL", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>tipo_servico.created_by</code>.
     */
    public final TableField<TipoServicoRecord, Long> CREATED_BY = createField(DSL.name("created_by"), SQLDataType.BIGINT.defaultValue(DSL.field("NULL", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>tipo_servico.updated_by</code>.
     */
    public final TableField<TipoServicoRecord, Long> UPDATED_BY = createField(DSL.name("updated_by"), SQLDataType.BIGINT.defaultValue(DSL.field("NULL", SQLDataType.BIGINT)), this, "");

    private TipoServico(Name alias, Table<TipoServicoRecord> aliased) {
        this(alias, aliased, null);
    }

    private TipoServico(Name alias, Table<TipoServicoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>tipo_servico</code> table reference
     */
    public TipoServico(String alias) {
        this(DSL.name(alias), TIPO_SERVICO);
    }

    /**
     * Create an aliased <code>tipo_servico</code> table reference
     */
    public TipoServico(Name alias) {
        this(alias, TIPO_SERVICO);
    }

    /**
     * Create a <code>tipo_servico</code> table reference
     */
    public TipoServico() {
        this(DSL.name("tipo_servico"), null);
    }

    public <O extends Record> TipoServico(Table<O> child, ForeignKey<O, TipoServicoRecord> key) {
        super(child, key, TIPO_SERVICO);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public Identity<TipoServicoRecord, Long> getIdentity() {
        return (Identity<TipoServicoRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<TipoServicoRecord> getPrimaryKey() {
        return Keys.KEY_TIPO_SERVICO_PRIMARY;
    }

    @Override
    public List<UniqueKey<TipoServicoRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_TIPO_SERVICO_TIPO_SERVICO_UN01);
    }

    @Override
    public TipoServico as(String alias) {
        return new TipoServico(DSL.name(alias), this);
    }

    @Override
    public TipoServico as(Name alias) {
        return new TipoServico(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TipoServico rename(String name) {
        return new TipoServico(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TipoServico rename(Name name) {
        return new TipoServico(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Long, String, String, LocalDateTime, LocalDateTime, Long, Long> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}
