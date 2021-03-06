/*
 * This file is generated by jOOQ.
 */
package br.com.itarocha.chb.adapter.out.persistence.jooq.data.tables.records;


import br.com.itarocha.chb.adapter.out.persistence.jooq.data.tables.UserRoles;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserRolesRecord extends UpdatableRecordImpl<UserRolesRecord> implements Record2<Long, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>user_roles.user_id</code>.
     */
    public UserRolesRecord setUserId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>user_roles.user_id</code>.
     */
    public Long getUserId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>user_roles.role_id</code>.
     */
    public UserRolesRecord setRoleId(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>user_roles.role_id</code>.
     */
    public Long getRoleId() {
        return (Long) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<Long, Long> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<Long, Long> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Long, Long> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return UserRoles.USER_ROLES.USER_ID;
    }

    @Override
    public Field<Long> field2() {
        return UserRoles.USER_ROLES.ROLE_ID;
    }

    @Override
    public Long component1() {
        return getUserId();
    }

    @Override
    public Long component2() {
        return getRoleId();
    }

    @Override
    public Long value1() {
        return getUserId();
    }

    @Override
    public Long value2() {
        return getRoleId();
    }

    @Override
    public UserRolesRecord value1(Long value) {
        setUserId(value);
        return this;
    }

    @Override
    public UserRolesRecord value2(Long value) {
        setRoleId(value);
        return this;
    }

    @Override
    public UserRolesRecord values(Long value1, Long value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserRolesRecord
     */
    public UserRolesRecord() {
        super(UserRoles.USER_ROLES);
    }

    /**
     * Create a detached, initialised UserRolesRecord
     */
    public UserRolesRecord(Long userId, Long roleId) {
        super(UserRoles.USER_ROLES);

        setUserId(userId);
        setRoleId(roleId);
    }

    /**
     * Create a detached, initialised UserRolesRecord
     */
    public UserRolesRecord(br.com.itarocha.chb.adapter.out.persistence.jooq.data.tables.pojos.UserRoles value) {
        super(UserRoles.USER_ROLES);

        if (value != null) {
            setUserId(value.getUserId());
            setRoleId(value.getRoleId());
        }
    }
}
