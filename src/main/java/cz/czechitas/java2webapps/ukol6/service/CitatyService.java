package cz.czechitas.java2webapps.ukol6.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CitatyService {

    private final NahodneCisloService nahodneCisloService;
    private final CitatyRepository citatyRepository;

    @Autowired
    public CitatyService(NahodneCisloService nahodneCisloService, CitatyRepository citatyRepository) {
        this.nahodneCisloService = nahodneCisloService;
        this.citatyRepository = citatyRepository;
    }

    public String nahodnyCitat() {
        int nahodneCislo = nahodneCisloService.dejNahodneCislo(citatyRepository.pocet());
        return citatyRepository.citat(nahodneCislo);
    }

}

