package br.com.fiap.checkpoint.service;

import br.com.fiap.checkpoint.model.Empregado;
import br.com.fiap.checkpoint.repository.EmpregadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpregadoService {

    @Autowired
    private EmpregadoRepository empregadoRepository;

    public List<Empregado> listAll() {
        return empregadoRepository.findAll();
    }

    public Empregado getById(Long id) {
        return empregadoRepository.findById(id).orElse(null);
    }

    public void save(Empregado empregado) {
        empregadoRepository.save(empregado);
    }

    public void update(Empregado empregado) {
        empregadoRepository.save(empregado);
    }

    public void delete(Long id) {
        empregadoRepository.deleteById(id);
    }
}
