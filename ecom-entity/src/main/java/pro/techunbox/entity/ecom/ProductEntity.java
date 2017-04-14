package pro.techunbox.entity.ecom;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class ProductEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Column(name="product_id")
    protected long productId;
    
	@Column(name="product_desc")
    protected String productDescription;
    
	@Column(name="product_price")
    protected double productPrice;
	
	public ProductEntity() {
	}
	
	public ProductEntity(long productId, String productDescription, double productPrice) {
		super();
		this.productId = productId;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
	}



	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((productDescription == null) ? 0 : productDescription.hashCode());
		result = prime * result + (int) (productId ^ (productId >>> 32));
		long temp;
		temp = Double.doubleToLongBits(productPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductEntity other = (ProductEntity) obj;
		if (productDescription == null) {
			if (other.productDescription != null)
				return false;
		} else if (!productDescription.equals(other.productDescription))
			return false;
		if (productId != other.productId)
			return false;
		if (Double.doubleToLongBits(productPrice) != Double.doubleToLongBits(other.productPrice))
			return false;
		return true;
	}
}
