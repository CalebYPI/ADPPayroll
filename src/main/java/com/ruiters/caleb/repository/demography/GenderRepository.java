package com.ruiters.caleb.repository.demography;

import com.ruiters.caleb.domain.demography.Gender;
import com.ruiters.caleb.repository.IRepository;

import java.util.Set;

public interface GenderRepository extends IRepository<Gender, String> {
    Set<Gender> getAll();
}
