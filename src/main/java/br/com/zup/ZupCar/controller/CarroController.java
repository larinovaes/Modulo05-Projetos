package br.com.zup.ZupCar.controller;

import br.com.zup.ZupCar.dtos.CarroDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/carros")
public class CarroController {

    private List<CarroDTO> concessionaria = new ArrayList<>();

    @GetMapping //pega a requisição
    public  List<CarroDTO> exibirListaDeCarros() {
        return concessionaria;
    }

    //request = faz uma requisição/pedido
    //response = retorna a requisição/responde

    @PostMapping //faz uma requisição
    public void cadastrarCarro(@RequestBody CarroDTO carroDTO){
        concessionaria.add(carroDTO);
    }
}
