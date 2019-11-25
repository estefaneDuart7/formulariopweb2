package br.edu.ifal.cadastroaluno;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Controlador{

    @RequestMapping("/")
    public ModelAndView index(){
        return new ModelAndView("index.html");
    }

    @RequestMapping("/formulario")
    public ModelAndView form(){
        return new ModelAndView("formulario.html");
    }

    @RequestMapping("/cadastro")
    public ModelAndView cadastro(Aluno a){
        ModelAndView retorno = new ModelAndView("resultado.html");
        retorno.addObject("nome", a.getNome());
        retorno.addObject("sobrenome", a.getSobrenome());
        retorno.addObject("email", a.getEmail());
        retorno.addObject("senha", a.getSenha());
        retorno.addObject("endereco", a.getEndereco());
        retorno.addObject("cidad", a.getCidade());
        retorno.addObject("estado", a.getEstado());
        retorno.addObject("cep", a.getCep());
        return retorno;
    }

}
