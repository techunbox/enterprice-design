package pro.techunbox.dao.api.ecom;

import java.util.List;

import pro.techunbox.entity.ecom.ProductEntity;

public interface ProductDao extends AbstractDao<ProductEntity, Integer>{
	List<ProductEntity> getProductByRange(Integer fromPrice, Integer toPrice);
}
