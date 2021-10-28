package br.com.zup.ZupCar.controller;

import br.com.zup.ZupCar.dtos.CarroDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@RestController
@RequestMapping("/carros")
public class CarroController {

    private List<CarroDTO> concessionaria = new ArrayList<>();

    @GetMapping //pega a requisição
    public List<CarroDTO> exibirListaDeCarros() {
        return concessionaria;
    }

    //request = faz uma requisição/pedido
    //response = retorna a requisição/responde

    @PostMapping //faz uma requisição
    @ResponseStatus(HttpStatus.CREATED) //mudar status do protocolo http
    public void cadastrarCarro(@RequestBody CarroDTO carroDTO) {
        concessionaria.add(carroDTO);
    }

    @GetMapping("/{nomeDoCarro}")
    public CarroDTO exibirCarro(@PathVariable String nomeDoCarro) {
        for (CarroDTO referencia : concessionaria) {
            if (referencia.getModelo().equalsIgnoreCase(nomeDoCarro)) {
                return referencia;
            }
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Não Encontrado");
    }

    @PutMapping("/{novoNome}") //atualizar nome do carro
    public CarroDTO atualizarCarro(@PathVariable String novoNome, @RequestBody CarroDTO carroDTO) {
        //for - para pecorrer a lista
        //set - para atualizar os dados do carro
        for (CarroDTO referencia : concessionaria) {
            if (referencia.getModelo().equalsIgnoreCase(novoNome)) {
                referencia.setCor(carroDTO.getCor());
                referencia.setMotor(carroDTO.getMotor());
                referencia.setAno(carroDTO.getAno());

                return referencia;
            }
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Não Encontrado");
    }
}

