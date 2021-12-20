package gft.com.estudoAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import gft.com.estudoAPI.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	Produto findById(long id);
}
