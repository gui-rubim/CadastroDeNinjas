package dev.java10x.CadastroDeNinjas.Ninjas;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class NinjaController {
    //Controller é usada para receber as requisições (pedidos) do http.

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasvindas")
    public String BoasVindas(){
        return "essa é a minha primeira mensagem";
    }

    // Adicionar ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja(){
        return "Ninja criado";
    }
    // Mostrar ninja por ID (READ)
    @GetMapping("/todos")
    public String mostrarTodosOsNinjas(){
        return "Mostrar ninja";
    }

    @GetMapping("/listar")
    public List<NinjaModel> ninjaRepositorio(){
        return ninjaService.listarNinjas();
    }

    @GetMapping("/listar/{id}")
    public NinjaModel listarNinjaPorID (@PathVariable Long id){
        return ninjaService.listaNinjasPorId(id);
    }


    // Procurar Ninja por ID (READ)
    @GetMapping("/todosID")
    public String mostrarTodosOsNinjasPorId(){
        return "Mostrar ninja por ID";
    }

    @DeleteMapping("/deletarID")
    public String deletarNinjaPorId(){
        return "Ninja deletado por id: ";
    }


    // Alterar dados dos ninjas (UPDATE)

    // Deletar Ninja (DELETE)

}

