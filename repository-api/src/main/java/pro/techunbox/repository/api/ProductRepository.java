package pro.techunbox.repository.api;

import org.springframework.data.jpa.repository.JpaRepository;

import pro.techunbox.entity.ecom.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Long>{
	
}
