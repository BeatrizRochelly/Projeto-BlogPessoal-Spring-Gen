package org.generation.blogpessoal.repository;

import java.util.List;

import org.generation.blogpessoal.model.PostagemModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PostagemRepository  extends JpaRepository<PostagemModel, Long>{
	

    public List <PostagemModel> findAllByTituloContainingIgnoreCase (@Param ("titulo") String titulo); //só adiciona com String esse @Param
    //SELECT * FROM tb_porstagens WHERE titulo = id
    //SELECT FROM tb_personagens Like = "%"

}
