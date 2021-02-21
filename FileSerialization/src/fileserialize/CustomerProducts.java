package fileserialize;

import java.io.Serializable;
import java.util.Scanner;

public class CustomerProducts implements Serializable{
	
	private int productID;
	private String prodname;
	private String prodtype;
	private int prodamount;
	private transient String transactionID;
	
	public CustomerProducts(int productID, String prodname, String prodtype, int prodamount, String transactionID) {
		super();
		this.productID = productID;
		this.prodname = prodname;
		this.prodtype = prodtype;
		this.prodamount = prodamount;
		this.transactionID = transactionID;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String getProdname() {
		return prodname;
	}

	public void setProdname(String prodname) {
		this.prodname = prodname;
	}

	public String getProdtype() {
		return prodtype;
	}

	public void setProdtype(String prodtype) {
		this.prodtype = prodtype;
	}

	public int getProdamount() {
		return prodamount;
	}

	public void setProdamount(int prodamount) {
		this.prodamount = prodamount;
	}

	public String getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}
	
	
	@Override
	public String toString() {
		return "Product details: [productID=" + productID + ", prodname=" + prodname + ", prodtype=" + prodtype
				+ ", prodamount=" + prodamount + ", transactionID=" + transactionID + "]";
	}
	

}
