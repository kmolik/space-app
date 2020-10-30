package com.konrad.squadrons.api;

import com.konrad.squadrons.dao.entity.Pilots;
import com.konrad.squadrons.manager.PilotManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/squadrons")
public class SquadronsApi {
    private PilotManager pilotManager;

    @Autowired
    public SquadronsApi(PilotManager pilotManager) {
        this.pilotManager = pilotManager;
    }

    @GetMapping("/all")
    public Iterable<Pilots> getAll() {
        return pilotManager.findAll();
    }

    @GetMapping()
    public Optional<Pilots> getById(@RequestParam Long index) {
        return pilotManager.findById(index);
    }

    @PostMapping
    public Pilots addPilot(@RequestBody Pilots pilots) {
        return pilotManager.save(pilots);
    }

    @PutMapping
    public Pilots updatePilots(@RequestBody Pilots pilots) {
        return pilotManager.save(pilots);
    }

    @DeleteMapping
    public void deletePilots(@RequestParam Long index) {
        pilotManager.deleteById(index);
    }
}
