/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.iniciando.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Marcos
 */
@Controller
public class IniciandoController {
    
    @RequestMapping ("/olaMundo")
    public String Inciando (){
        return "index";
    }
    
    @RequestMapping ("/cadastrodecorretor")
    public String cadastro(){
        return "cadastroCorretor";
    }
    
    @RequestMapping ("/cadastrofoto")
    public String foto(){
        return "cadastroFotos";
    }
    
    @RequestMapping ("/cadastroimovel")
    public String imovel (){
        return "cadastroImovel";
    }
    
    @RequestMapping ("/registrohistorico")
    public String historico(){
        return "cadastroHistorico";
    }
    
    @RequestMapping ("/cadastroproprietario")
    public String proprietario(){
        return "cadastroProprietario";
    }
}
