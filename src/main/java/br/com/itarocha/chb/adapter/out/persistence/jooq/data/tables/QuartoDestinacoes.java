/*
 * This file is generated by jOOQ.
 */
package br.com.itarocha.chb.adapter.out.persistence.jooq.data.tables;


import br.com.itarocha.chb.adapter.out.persistence.jooq.data.DefaultSchema;
import br.com.itarocha.chb.adapter.out.persistence.jooq.data.Keys;
import br.com.itarocha.chb.adapter.out.persistence.jooq.data.tables.records.QuartoDestinacoesRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
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
public class QuartoDestinacoes extends TableImpl<QuartoDestinacoesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>quarto_destinacoes</code>
     */
    public static final QuartoDestinacoes QUARTO_DESTINACOES = new QuartoDestinacoes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<QuartoDestinacoesRecord> getRecordType() {
        return QuartoDestinacoesRecord.class;
    }

    /**
     * The column <code>quarto_destinacoes.quarto_id</code>.
     */
    public final TableField<QuartoDestinacoesRecord, Long> QUARTO_ID = createField(DSL.name("quarto_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>quarto_destinacoes.destinacao_hospedagem_id</code>.
     */
    public final TableField<QuartoDestinacoesRecord, Long> DESTINACAO_HOSPEDAGEM_ID = createField(DSL.name("destinacao_hospedagem_id"), SQLDataType.BIGINT.nullable(false), this, "");

    private QuartoDestinacoes(Name alias, Table<QuartoDestinacoesRecord> aliased) {
        this(alias, aliased, null);
    }

    private QuartoDestinacoes(Name alias, Table<QuartoDestinacoesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>quarto_destinacoes</code> table reference
     */
    public QuartoDestinacoes(String alias) {
        this(DSL.name(alias), QUARTO_DESTINACOES);
    }

    /**
     * Create an aliased <code>quarto_destinacoes</code> table reference
     */
    public QuartoDestinacoes(Name alias) {
        this(alias, QUARTO_DESTINACOES);
    }

    /**
     * Create a <code>quarto_destinacoes</code> table reference
     */
    public QuartoDestinacoes() {
        this(DSL.name("quarto_destinacoes"), null);
    }

    public <O extends Record> QuartoDestinacoes(Table<O> child, ForeignKey<O, QuartoDestinacoesRecord> key) {
        super(child, key, QUARTO_DESTINACOES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public UniqueKey<QuartoDestinacoesRecord> getPrimaryKey() {
        return Keys.KEY_QUARTO_DESTINACOES_PRIMARY;
    }

    @Override
    public List<ForeignKey<QuartoDestinacoesRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FK3VSG76TGHPFN2ELXPJOGDGKSV, Keys.FKH8JUP3N5F9KH454RDC9MYD4R);
    }

    private transient Quarto _quarto;
    private transient DestinacaoHospedagem _destinacaoHospedagem;

    public Quarto quarto() {
        if (_quarto == null)
            _quarto = new Quarto(this, Keys.FK3VSG76TGHPFN2ELXPJOGDGKSV);

        return _quarto;
    }

    public DestinacaoHospedagem destinacaoHospedagem() {
        if (_destinacaoHospedagem == null)
            _destinacaoHospedagem = new DestinacaoHospedagem(this, Keys.FKH8JUP3N5F9KH454RDC9MYD4R);

        return _destinacaoHospedagem;
    }

    @Override
    public QuartoDestinacoes as(String alias) {
        return new QuartoDestinacoes(DSL.name(alias), this);
    }

    @Override
    public QuartoDestinacoes as(Name alias) {
        return new QuartoDestinacoes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public QuartoDestinacoes rename(String name) {
        return new QuartoDestinacoes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public QuartoDestinacoes rename(Name name) {
        return new QuartoDestinacoes(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Long, Long> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
