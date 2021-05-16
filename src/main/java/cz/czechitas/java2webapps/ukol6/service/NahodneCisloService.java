package cz.czechitas.java2webapps.ukol6.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class NahodneCisloService {

    public int dejNahodneCislo(int horniMez) {
        final Random random;
        random = new Random();
        return random.nextInt(horniMez);
    }
}
