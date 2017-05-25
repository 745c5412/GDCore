/*
 * This file is generated by jOOQ.
*/
package org.graviton.database.jooq.game.tables.records;


import javax.annotation.Generated;

import org.graviton.database.jooq.game.tables.GuildMembers;
import org.jooq.Field;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GuildMembersRecord extends TableRecordImpl<GuildMembersRecord> implements Record11<Integer, Integer, String, Short, Short, Byte, Long, Byte, Integer, Byte, String> {

    private static final long serialVersionUID = 401172020;

    /**
     * Setter for <code>game.guild_members.id</code>.
     */
    public GuildMembersRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>game.guild_members.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>game.guild_members.guild</code>.
     */
    public GuildMembersRecord setGuild(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>game.guild_members.guild</code>.
     */
    public Integer getGuild() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>game.guild_members.name</code>.
     */
    public GuildMembersRecord setName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>game.guild_members.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>game.guild_members.level</code>.
     */
    public GuildMembersRecord setLevel(Short value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>game.guild_members.level</code>.
     */
    public Short getLevel() {
        return (Short) get(3);
    }

    /**
     * Setter for <code>game.guild_members.skin</code>.
     */
    public GuildMembersRecord setSkin(Short value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>game.guild_members.skin</code>.
     */
    public Short getSkin() {
        return (Short) get(4);
    }

    /**
     * Setter for <code>game.guild_members.rank</code>.
     */
    public GuildMembersRecord setRank(Byte value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>game.guild_members.rank</code>.
     */
    public Byte getRank() {
        return (Byte) get(5);
    }

    /**
     * Setter for <code>game.guild_members.experience_gived</code>.
     */
    public GuildMembersRecord setExperienceGived(Long value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>game.guild_members.experience_gived</code>.
     */
    public Long getExperienceGived() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>game.guild_members.percent_gived</code>.
     */
    public GuildMembersRecord setPercentGived(Byte value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>game.guild_members.percent_gived</code>.
     */
    public Byte getPercentGived() {
        return (Byte) get(7);
    }

    /**
     * Setter for <code>game.guild_members.rights</code>.
     */
    public GuildMembersRecord setRights(Integer value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>game.guild_members.rights</code>.
     */
    public Integer getRights() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>game.guild_members.alignment</code>.
     */
    public GuildMembersRecord setAlignment(Byte value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>game.guild_members.alignment</code>.
     */
    public Byte getAlignment() {
        return (Byte) get(9);
    }

    /**
     * Setter for <code>game.guild_members.lastConnection</code>.
     */
    public GuildMembersRecord setLastconnection(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>game.guild_members.lastConnection</code>.
     */
    public String getLastconnection() {
        return (String) get(10);
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, Integer, String, Short, Short, Byte, Long, Byte, Integer, Byte, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, Integer, String, Short, Short, Byte, Long, Byte, Integer, Byte, String> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return GuildMembers.GUILD_MEMBERS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return GuildMembers.GUILD_MEMBERS.GUILD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return GuildMembers.GUILD_MEMBERS.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field4() {
        return GuildMembers.GUILD_MEMBERS.LEVEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field5() {
        return GuildMembers.GUILD_MEMBERS.SKIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field6() {
        return GuildMembers.GUILD_MEMBERS.RANK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field7() {
        return GuildMembers.GUILD_MEMBERS.EXPERIENCE_GIVED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field8() {
        return GuildMembers.GUILD_MEMBERS.PERCENT_GIVED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return GuildMembers.GUILD_MEMBERS.RIGHTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field10() {
        return GuildMembers.GUILD_MEMBERS.ALIGNMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return GuildMembers.GUILD_MEMBERS.LASTCONNECTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getGuild();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value4() {
        return getLevel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value5() {
        return getSkin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value6() {
        return getRank();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value7() {
        return getExperienceGived();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value8() {
        return getPercentGived();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getRights();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value10() {
        return getAlignment();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getLastconnection();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GuildMembersRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GuildMembersRecord value2(Integer value) {
        setGuild(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GuildMembersRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GuildMembersRecord value4(Short value) {
        setLevel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GuildMembersRecord value5(Short value) {
        setSkin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GuildMembersRecord value6(Byte value) {
        setRank(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GuildMembersRecord value7(Long value) {
        setExperienceGived(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GuildMembersRecord value8(Byte value) {
        setPercentGived(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GuildMembersRecord value9(Integer value) {
        setRights(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GuildMembersRecord value10(Byte value) {
        setAlignment(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GuildMembersRecord value11(String value) {
        setLastconnection(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GuildMembersRecord values(Integer value1, Integer value2, String value3, Short value4, Short value5, Byte value6, Long value7, Byte value8, Integer value9, Byte value10, String value11) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GuildMembersRecord
     */
    public GuildMembersRecord() {
        super(GuildMembers.GUILD_MEMBERS);
    }

    /**
     * Create a detached, initialised GuildMembersRecord
     */
    public GuildMembersRecord(Integer id, Integer guild, String name, Short level, Short skin, Byte rank, Long experienceGived, Byte percentGived, Integer rights, Byte alignment, String lastconnection) {
        super(GuildMembers.GUILD_MEMBERS);

        set(0, id);
        set(1, guild);
        set(2, name);
        set(3, level);
        set(4, skin);
        set(5, rank);
        set(6, experienceGived);
        set(7, percentGived);
        set(8, rights);
        set(9, alignment);
        set(10, lastconnection);
    }
}