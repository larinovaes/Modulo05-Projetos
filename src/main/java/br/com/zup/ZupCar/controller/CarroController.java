package br.com.zup.ZupCar.controller;

import br.com.zup.ZupCar.dtos.CarroDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/carro")
public class CarroController {

    private List<CarroDTO> concessionaria = new ArrayList<>();
}
