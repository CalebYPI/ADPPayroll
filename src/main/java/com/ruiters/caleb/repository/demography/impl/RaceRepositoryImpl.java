package com.ruiters.caleb.repository.demography.impl;

import com.ruiters.caleb.domain.demography.Race;
import com.ruiters.caleb.repository.demography.RaceRepository;

import java.util.HashSet;
import java.util.Set;

public class RaceRepositoryImpl implements RaceRepository {
    private static RaceRepositoryImpl repository = null;
    private Set<Race> races;

    private RaceRepositoryImpl() {
        this.races = new HashSet<>();
    }

    private Race findRace(String raceId) {
        return this.races.stream()
                .filter(race -> race.getRaceId().trim().equals(raceId))
                .findAny()
                .orElse(null);
    }

    private static RaceRepositoryImpl raceRepositoryImpl = null;

    public static RaceRepositoryImpl getRaceRepositoryImpl() {
        if (raceRepositoryImpl == null) {
            raceRepositoryImpl = new RaceRepositoryImpl();
        }
        return raceRepositoryImpl;
    }


    public Race create(Race race) {
        this.races.add(race);
        return race;
    }

    public Race read(final String raceId) {
        Race race = findRace(raceId);
        return race;
    }

    public void delete(String raceId) {
        Race race = findRace(raceId);
        if (race != null) this.races.remove(race);
    }

    public Race update(Race race) {
        Race toDelete = findRace(race.getRaceId());
        if (toDelete != null) {
            this.races.remove(toDelete);
            return create(race);
        }
        return null;
    }


    public Set<Race> getAll() {
        return this.races;
    }
}
