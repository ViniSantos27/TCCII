package tcc.fundatec.org.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tcc.fundatec.org.model.Cliente;
import tcc.fundatec.org.repository.ClienteRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    // Lista todos os clientes
    public List<Cliente> listarTodos() {
        return clienteRepository.findAll();
    }

    // Busca um cliente pelo ID
    public Optional<Cliente> buscarPorId(Long id) {
        return clienteRepository.findById(id);
    }

    // Salva um cliente no banco de dados
    public Cliente salvar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    // Deleta um cliente pelo ID
    public void deletar(Long id) {
        clienteRepository.deleteById(id);
    }
}
