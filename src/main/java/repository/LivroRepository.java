package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long>{

}
