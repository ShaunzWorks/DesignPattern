package com.shaunz.designpattern.commandpattern;

public class SellStock implements Order{
	private Stock abcStock;
	
	public SellStock(Stock abcStock){
		this.abcStock = abcStock;
	}

	@Override
	public void execute() {
		abcStock.sell();
	}
	
}
