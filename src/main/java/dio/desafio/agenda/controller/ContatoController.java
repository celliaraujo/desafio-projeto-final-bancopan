package dio.desafio.agenda.controller;

import dio.desafio.agenda.model.Contato;
import dio.desafio.agenda.service.impl.ContatoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contatos")
public class ContatoController {

    @Autowired
    private ContatoServiceImpl service;

    @GetMapping
    public List<Contato> mostrarTodosOsContatos(){
        return service.mostrarTodos();
    }
    @GetMapping("buscaNome/{nome}")
    public List<Contato> mostrarTodosComNome(@PathVariable String nome){
        return service.mostrarTodosComNome(nome);
    }

    @GetMapping("/{id}")
    public Contato mostrarPorId(@PathVariable Long id){
        return service.mostrarPorId(id);
    }

    @PostMapping
    public void adcionarContato(@RequestBody Contato contato){
        service.adicionarContato(contato);
    }

    @PutMapping("/{id}")
    public void atualizarContato(@PathVariable Long id, @RequestBody Contato contato){
        service.atualizarContato(id, contato);
    }

    @DeleteMapping("/{id}")
    public void excluirContato(@PathVariable Long id){
        service.excluirContato(id);
    }

}
