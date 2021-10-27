package br.com.zup.ZupCar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

@Controller
public class CarroController {

    @GetMapping("/carro/fusca")
    @ResponseBody
    public HashMap<String, String> exibirFusca(){
        HashMap<String, String> fusca = new HashMap<>();
        fusca.put("Cor","Azul");
        fusca.put("Ano", "1964");
        fusca.put("Motor", "mil");

        return fusca;
    }
}
