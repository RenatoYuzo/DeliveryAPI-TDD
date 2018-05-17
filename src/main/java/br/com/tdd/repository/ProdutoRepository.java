package br.com.tdd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.tdd.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
