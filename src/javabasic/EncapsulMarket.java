package javabasic;

public class EncapsulMarket {


private String vegetable0;
private String vegetable1;
private Integer total;

private int vegetable0Price;
private int vegetable2Price;


public String getVegetable0() {
	return vegetable0 + " = " + vegetable0Price;
}



public void setVegetable0(String vegetables0) {
	this.vegetable0=vegetables0 ;
}


public String getVegetable1() {
	return vegetable1 + " = "+ vegetable2Price;
}


public void setVegetables1(String vegetable1) {
	this.vegetable1=vegetable1;
}
public Integer getTotal() {
	
	this.total = vegetable0Price+vegetable2Price;
	return total;
}

public void setTotal(Integer total) {
	this.total=total;
}


public int getVegetable0Price() {
	return vegetable0Price;
}



public void setVegetable0Price(int vegetable0Price) {
	this.vegetable0Price = vegetable0Price;
}



public int getVegetable2Price() {
	return vegetable2Price;
}



public void setVegetable2Price(int vegetable2Price) {
	this.vegetable2Price = vegetable2Price;
}

	}


