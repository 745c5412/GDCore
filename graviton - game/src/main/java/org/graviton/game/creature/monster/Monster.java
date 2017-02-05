package org.graviton.game.creature.monster;

import lombok.Data;
import org.graviton.api.Creature;
import org.graviton.database.entity.EntityFactory;
import org.graviton.game.fight.Fighter;
import org.graviton.game.intelligence.ArtificialIntelligence;
import org.graviton.game.intelligence.common.IntelligenceType;
import org.graviton.game.look.AbstractLook;
import org.graviton.game.position.Location;
import org.graviton.game.statistics.common.Characteristic;
import org.graviton.game.statistics.common.CharacteristicType;
import org.graviton.game.statistics.common.Statistics;
import org.graviton.game.statistics.type.MonsterStatistics;
import org.graviton.network.game.protocol.MonsterPacketFormatter;

import java.util.Map;

/**
 * Created by Botan on 02/12/2016. 21:34
 */
@Data
public class Monster extends Fighter implements Creature {
    private final MonsterTemplate template;
    private final MonsterStatistics statistics;
    private final byte size;
    private final byte grade;
    private final int baseExperience;
    private int id;
    private Location location;

    public Monster(MonsterTemplate template, byte grade, short level, int baseExperience, String resistance, String life, String statistics, Map<CharacteristicType, Characteristic> characteristics) {
        this.template = template;
        this.size = (byte) (100 + (2 * (grade - 1)));
        this.grade = grade;
        this.baseExperience = baseExperience != 0 ? baseExperience : 10;
        this.statistics = new MonsterStatistics(level, life, resistance.split("@")[1].split(";"), statistics.split(","), characteristics);
    }

    private Monster(Monster monster) {
        this.template = monster.getTemplate();
        this.size = monster.getSize();
        this.grade = monster.getGrade();
        this.baseExperience = monster.getBaseExperience();
        this.statistics = (MonsterStatistics) monster.getStatistics().copy();
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getGm() {
        return MonsterPacketFormatter.fighterGmMessage(this);
    }

    @Override
    public String getName() {
        return String.valueOf(getTemplate().getId());
    }

    @Override
    public Statistics getStatistics() {
        return this.statistics;
    }

    public short getLevel() {
        return this.statistics.getLevel();
    }

    @Override
    public Creature getCreature() {
        return this;
    }

    @Override
    public void send(String data) {

    }

    @Override
    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public int getColor(byte color) {
        return 0;
    }

    @Override
    public EntityFactory entityFactory() {
        return null;
    }

    @Override
    public AbstractLook look() {
        return null;
    }

    @Override
    public String getFightGM() {
        return MonsterPacketFormatter.fighterGmMessage(this);
    }

    @Override
    public ArtificialIntelligence artificialIntelligence() {
        return IntelligenceType.get(template.getArtificialIntelligence()).create(this);
    }

    public Monster copy() {
        return new Monster(this);
    }

    public void applyFighterStatistics(Fighter fighter) {
        float coefficient = (1.0F + (fighter.getLevel()) / 100.0F);

        getStatistics().getLife().addMaximum((int) (getStatistics().getLife().getMaximum() * coefficient));
        getStatistics().getLife().set(getStatistics().getLife().getMaximum());

        getStatistics().get(CharacteristicType.Strength).addCoefficientBase(coefficient);
        getStatistics().get(CharacteristicType.Intelligence).addCoefficientBase(coefficient);
        getStatistics().get(CharacteristicType.Agility).addCoefficientBase(coefficient);
        getStatistics().get(CharacteristicType.Wisdom).addCoefficientBase(coefficient);
        getStatistics().get(CharacteristicType.Chance).addCoefficientBase(coefficient);
    }
}
