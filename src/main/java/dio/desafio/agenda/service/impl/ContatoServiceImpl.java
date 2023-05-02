package dio.desafio.agenda.service.impl;

import dio.desafio.agenda.model.Contato;
import dio.desafio.agenda.model.ContatoRepository;
import dio.desafio.agenda.service.IContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContatoServiceImpl implements IContatoService {

    @Autowired
    private ContatoRepository contatoRepository;
    @Override
    public List<Contato> mostrarTodos() {
        return contatoRepository.findAll();
    }

    @Override
    public List<Contato> mostrarTodosComNome(String nome) {
        return contatoRepository.findByNome(nome);
    }

    @Override
    public Contato mostrarPorId(Long id) {
        return contatoRepository.findById(id).get();
    }

    @Override
    public void adicionarContato(Contato contato) {
        Contato contatoBd = new Contato();
        contatoBd.setNome(contato.getNome());
        contatoBd.setTelefone(contato.getTelefone().get(0));
        contatoBd.setEndereco(contato.getEndereco());
        contatoRepository.save(contato);

    }

    @Override
    public void atualizarContato(Long id, Contato contato) {
        Contato contatoBd = contatoRepository.findById(id).get();
        contatoBd.setNome(contato.getNome());
        contatoBd.setEndereco(contato.getEndereco());
        contatoRepository.save(contato);

    }

    @Override
    public void excluirContato(Long id) {
        contatoRepository.deleteById(id);
    }
}
