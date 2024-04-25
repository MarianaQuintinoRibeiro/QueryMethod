package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entities.Livro;
import repository.LivroRepository;

@Service
public class LivroService {
	@Autowired
	private LivroRepository livroRepository;
	

    public Livro saveLivro(Livro livro) {
        return livroRepository.save(livro);
    }

    public Livro getLivroById(Long id) {
        return livroRepository.findById(id).orElse(null);
    }

    public List<Livro> getAllLivros() {
        return livroRepository.findAll();
    }

    public void deleteLivro(Long id) {
    	livroRepository.deleteById(id);
    }
}