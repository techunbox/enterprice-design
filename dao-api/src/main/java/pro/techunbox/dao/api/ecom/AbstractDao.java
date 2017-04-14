package pro.techunbox.dao.api.ecom;

import java.util.List;

public interface AbstractDao<E, I> {
	E get(I i);
	
	List<E> get();
	
	E save(E e);

	E update(E e);

	E delete(I i);
}
