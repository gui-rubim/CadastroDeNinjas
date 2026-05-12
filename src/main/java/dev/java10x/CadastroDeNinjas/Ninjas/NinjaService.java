package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class NinjaService {

    private final NinjaRepository ninjaRepositorio;

    public NinjaService(NinjaRepository ninjaRepositorio) {
        this.ninjaRepositorio = ninjaRepositorio;
    }

    public List<NinjaModel> listarNinjas() {
        return ninjaRepositorio.findAll();
    }

}