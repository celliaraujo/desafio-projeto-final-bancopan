package dio.desafio.agenda.service;

import dio.desafio.agenda.model.Contato;

import java.util.List;

public interface IContatoService {


    List<Contato> mostrarTodos();

    List<Contato> mostrarTodosComNome(String nome);

    Contato mostrarPorId(Long id);

    void adicionarContato(Contato contato);

    void atualizarContato(Long id, Contato contato);

    void excluirContato(Long id);
}
