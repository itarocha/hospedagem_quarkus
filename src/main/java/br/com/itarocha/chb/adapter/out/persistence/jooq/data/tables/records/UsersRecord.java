/*
 * This file is generated by jOOQ.
 */
package br.com.itarocha.chb.adapter.out.persistence.jooq.data.tables.records;


import br.com.itarocha.chb.adapter.out.persistence.jooq.data.tables.Users;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UsersRecord extends UpdatableRecordImpl<UsersRecord> implements Record7<Long, LocalDateTime, LocalDateTime, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>users.id</code>.
     */
    public UsersRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>users.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>users.created_at</code>.
     */
    public UsersRecord setCreatedAt(LocalDateTime value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>users.created_at</code>.
     */
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(1);
    }

    /**
     * Setter for <code>users.updated_at</code>.
     */
    public UsersRecord setUpdatedAt(LocalDateTime value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>users.updated_at</code>.
     */
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>users.email</code>.
     */
    public UsersRecord setEmail(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>users.email</code>.
     */
    public String getEmail() {
        return (String) get(3);
    }

    /**
     * Setter for <code>users.name</code>.
     */
    public UsersRecord setName(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>users.name</code>.
     */
    public String getName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>users.password</code>.
     */
    public UsersRecord setPassword(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>users.password</code>.
     */
    public String getPassword() {
        return (String) get(5);
    }

    /**
     * Setter for <code>users.username</code>.
     */
    public UsersRecord setUsername(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>users.username</code>.
     */
    public String getUsername() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<Long, LocalDateTime, LocalDateTime, String, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<Long, LocalDateTime, LocalDateTime, String, String, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Users.USERS.ID;
    }

    @Override
    public Field<LocalDateTime> field2() {
        return Users.USERS.CREATED_AT;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return Users.USERS.UPDATED_AT;
    }

    @Override
    public Field<String> field4() {
        return Users.USERS.EMAIL;
    }

    @Override
    public Field<String> field5() {
        return Users.USERS.NAME;
    }

    @Override
    public Field<String> field6() {
        return Users.USERS.PASSWORD;
    }

    @Override
    public Field<String> field7() {
        return Users.USERS.USERNAME;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public LocalDateTime component2() {
        return getCreatedAt();
    }

    @Override
    public LocalDateTime component3() {
        return getUpdatedAt();
    }

    @Override
    public String component4() {
        return getEmail();
    }

    @Override
    public String component5() {
        return getName();
    }

    @Override
    public String component6() {
        return getPassword();
    }

    @Override
    public String component7() {
        return getUsername();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public LocalDateTime value2() {
        return getCreatedAt();
    }

    @Override
    public LocalDateTime value3() {
        return getUpdatedAt();
    }

    @Override
    public String value4() {
        return getEmail();
    }

    @Override
    public String value5() {
        return getName();
    }

    @Override
    public String value6() {
        return getPassword();
    }

    @Override
    public String value7() {
        return getUsername();
    }

    @Override
    public UsersRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public UsersRecord value2(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public UsersRecord value3(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public UsersRecord value4(String value) {
        setEmail(value);
        return this;
    }

    @Override
    public UsersRecord value5(String value) {
        setName(value);
        return this;
    }

    @Override
    public UsersRecord value6(String value) {
        setPassword(value);
        return this;
    }

    @Override
    public UsersRecord value7(String value) {
        setUsername(value);
        return this;
    }

    @Override
    public UsersRecord values(Long value1, LocalDateTime value2, LocalDateTime value3, String value4, String value5, String value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UsersRecord
     */
    public UsersRecord() {
        super(Users.USERS);
    }

    /**
     * Create a detached, initialised UsersRecord
     */
    public UsersRecord(Long id, LocalDateTime createdAt, LocalDateTime updatedAt, String email, String name, String password, String username) {
        super(Users.USERS);

        setId(id);
        setCreatedAt(createdAt);
        setUpdatedAt(updatedAt);
        setEmail(email);
        setName(name);
        setPassword(password);
        setUsername(username);
    }

    /**
     * Create a detached, initialised UsersRecord
     */
    public UsersRecord(br.com.itarocha.chb.adapter.out.persistence.jooq.data.tables.pojos.Users value) {
        super(Users.USERS);

        if (value != null) {
            setId(value.getId());
            setCreatedAt(value.getCreatedAt());
            setUpdatedAt(value.getUpdatedAt());
            setEmail(value.getEmail());
            setName(value.getName());
            setPassword(value.getPassword());
            setUsername(value.getUsername());
        }
    }
}
