package au.com.telstra.simcardactivator.controller;

import au.com.telstra.simcardactivator.ActivateResponse;
import au.com.telstra.simcardactivator.model.Sim;
import au.com.telstra.simcardactivator.repository.SimRepository;
import au.com.telstra.simcardactivator.service.SimService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sim")
@RequiredArgsConstructor
public class SimController {
    private final SimService simService;

    @PostMapping(value = "/activateSim")
    ActivateResponse activateSim(@RequestBody Sim sim){
       return simService.activateSim(sim.getIccid(), sim.getCostumerEmail());

    }


}
