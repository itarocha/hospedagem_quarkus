/*
 * This file is generated by jOOQ.
 */
package br.com.itarocha.chb.adapter.out.persistence.jooq.data.tables;


import br.com.itarocha.chb.adapter.out.persistence.jooq.data.DefaultSchema;
import br.com.itarocha.chb.adapter.out.persistence.jooq.data.Keys;
import br.com.itarocha.chb.adapter.out.persistence.jooq.data.tables.records.UsersRecord;

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
public class Users extends TableImpl<UsersRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>users</code>
     */
    public static final Users USERS = new Users();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UsersRecord> getRecordType() {
        return UsersRecord.class;
    }

    /**
     * The column <code>users.id</code>.
     */
    public final TableField<UsersRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>users.created_at</code>.
     */
    public final TableField<UsersRecord, LocalDateTime> CREATED_AT = createField(DSL.name("created_at"), SQLDataType.LOCALDATETIME(0).defaultValue(DSL.field("NULL", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>users.updated_at</code>.
     */
    public final TableField<UsersRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("updated_at"), SQLDataType.LOCALDATETIME(0).defaultValue(DSL.field("NULL", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>users.email</code>.
     */
    public final TableField<UsersRecord, String> EMAIL = createField(DSL.name("email"), SQLDataType.VARCHAR(64).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>users.name</code>.
     */
    public final TableField<UsersRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(64).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>users.password</code>.
     */
    public final TableField<UsersRecord, String> PASSWORD = createField(DSL.name("password"), SQLDataType.VARCHAR(128).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>users.username</code>.
     */
    public final TableField<UsersRecord, String> USERNAME = createField(DSL.name("username"), SQLDataType.VARCHAR(32).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    private Users(Name alias, Table<UsersRecord> aliased) {
        this(alias, aliased, null);
    }

    private Users(Name alias, Table<UsersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>users</code> table reference
     */
    public Users(String alias) {
        this(DSL.name(alias), USERS);
    }

    /**
     * Create an aliased <code>users</code> table reference
     */
    public Users(Name alias) {
        this(alias, USERS);
    }

    /**
     * Create a <code>users</code> table reference
     */
    public Users() {
        this(DSL.name("users"), null);
    }

    public <O extends Record> Users(Table<O> child, ForeignKey<O, UsersRecord> key) {
        super(child, key, USERS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public Identity<UsersRecord, Long> getIdentity() {
        return (Identity<UsersRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<UsersRecord> getPrimaryKey() {
        return Keys.KEY_USERS_PRIMARY;
    }

    @Override
    public List<UniqueKey<UsersRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_USERS_UK6DOTKOTT2KJSP8VW4D0M25FB7, Keys.KEY_USERS_UKR43AF9AP4EDM43MMTQ01ODDJ6);
    }

    @Override
    public Users as(String alias) {
        return new Users(DSL.name(alias), this);
    }

    @Override
    public Users as(Name alias) {
        return new Users(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Users rename(String name) {
        return new Users(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Users rename(Name name) {
        return new Users(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Long, LocalDateTime, LocalDateTime, String, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}
