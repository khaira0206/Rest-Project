package trng.rest.bean;

import lombok.Data;

@Data
public class Order {

	private String pname;
	private String desc;
	private double price;
	
	public Order() {
		
	}
	
}