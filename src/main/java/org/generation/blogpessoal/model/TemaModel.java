package org.generation.blogpessoal.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity 
@Table(name= "tb_tema") 
public class TemaModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@NotBlank(message = "O atributo discrição é obrigatório e não pode utilizar espaços em branco!") //geralmente não usa para número
	private String descricao;


	@OneToMany(mappedBy="tema", cascade = CascadeType.ALL) //tema vai comandar tudo no quesito de relacionamento
	@JsonIgnoreProperties("tema")
    private List<PostagemModel> postagem;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<PostagemModel> getPostagem() {
		return postagem;
	}

	public void setPostagem(List<PostagemModel> postagem) {
		this.postagem = postagem;
	}
	
	
	
}
