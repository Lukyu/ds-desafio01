package com.lucastamb.dsdesafio01.entity;

import java.util.Objects;

public class Order {

	private Integer code;
	private Double basic;
	private Double discount;
	
	public Order(Integer code, Double basic, Double discount) {
		super();
		this.code = code;
		this.basic = basic;
		this.discount = discount;
	}
	
	public Integer getCode() {
		return code;
	}
	
	public void setCode(Integer code) {
		this.code = code;
	}
	
	public Double getBasic() {
		return basic;
	}
	
	public void setBasic(Double basic) {
		this.basic = basic;
	}
	
	public Double getDiscount() {
		return discount;
	}
	
	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "Order [code=" + code + ", basic=" + basic + ", discount=" + discount + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(basic);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(basic, other.basic);
	}
		
}
