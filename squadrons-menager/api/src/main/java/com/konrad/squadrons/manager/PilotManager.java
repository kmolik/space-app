package com.konrad.squadrons.manager;

import com.konrad.squadrons.dao.SquadronsRepo;
import com.konrad.squadrons.dao.entity.Pilots;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PilotManager {
    private SquadronsRepo squadronsRepo;

    @Autowired
    public PilotManager(SquadronsRepo squadronsRepo) {
        this.squadronsRepo = squadronsRepo;
    }

    public Optional<Pilots> findById(Long id) {
        return squadronsRepo.findById(id);
    }

    public Iterable<Pilots> findAll() {
        return squadronsRepo.findAll();
    }

    public Pilots save(Pilots pilots) {
        return squadronsRepo.save(pilots);
    }

    public void deleteById(Long id) {
        squadronsRepo.deleteById(id);
    }
}
