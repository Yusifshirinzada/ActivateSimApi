package au.com.telstra.simcardactivator.service;

import au.com.telstra.simcardactivator.ActivateResponse;
import au.com.telstra.simcardactivator.model.Sim;

public interface SimService {
    ActivateResponse activateSim(String iccid, String costumerEmail);
}
