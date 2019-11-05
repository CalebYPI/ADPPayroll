package com.ruiters.caleb.factory.demography;

import com.ruiters.caleb.Misc;
import com.ruiters.caleb.domain.demography.Race;

public class RaceFactory {

    public static Race buildRace (String raceName){
        return new Race.Builder().raceId(Misc.generateId())
                .raceName(raceName)
                .build();
    }
}
