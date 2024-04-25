package entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Livro")
public class Livro {
			
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Integer id;
	
	@Column(name = "nome", nullable = false, length = 100)
	private String nome;
	
	@Column(name = "autor", nullable = false, length = 100)
	private String autor;
	
	@Column(name = "editora", nullable = false, length = 100)
	private String editora;
	
	@Column(name = "isnb", nullable = false, length = 100)
	private String isbn;
	
	@Column(name = "titulo", nullable = false, length = 100)
	private String titulo;
	

}