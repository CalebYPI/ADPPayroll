package com.ruiters.caleb.service.demography.impl;

import com.ruiters.caleb.domain.demography.Race;
import com.ruiters.caleb.repository.demography.RaceRepository;
import com.ruiters.caleb.repository.demography.impl.RaceRepositoryImpl;
import com.ruiters.caleb.service.demography.RaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service("ServiceImpl")
public class RaceServiceImpl implements RaceService {
    @Autowired
    @Qualifier("InMemory")
    private static RaceServiceImpl service = null;
    private RaceRepository repository;

    private RaceServiceImpl() {
        this.repository = RaceRepositoryImpl.getRaceRepositoryImpl();
    }

    public static RaceServiceImpl getService(){
        if (service == null) service = new RaceServiceImpl();
        return service;
    }

    @Override
    public Race create(Race race) {
        return this.repository.create(race);
    }

    @Override
    public Race update(Race race) {
        return this.repository.update(race);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Race read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Race> getAll() {
        return this.repository.getAll();
    }
}
