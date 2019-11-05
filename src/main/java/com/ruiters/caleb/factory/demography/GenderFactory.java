package com.ruiters.caleb.factory.demography;

import com.ruiters.caleb.Misc;
import com.ruiters.caleb.domain.demography.Gender;

public class GenderFactory {
    public static Gender getGender(String desc) {
        return new Gender.Builder()
                .GenderId(Misc.generateId())
                .GenderDesc(desc)
                .build();
    }
}
