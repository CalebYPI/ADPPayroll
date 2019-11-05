package com.ruiters.caleb.service.demography;

import com.ruiters.caleb.domain.demography.Gender;
import com.ruiters.caleb.service.IService;

import java.util.Set;

public interface GenderService extends IService<Gender, String> {
    Set<Gender> getAll();
}
