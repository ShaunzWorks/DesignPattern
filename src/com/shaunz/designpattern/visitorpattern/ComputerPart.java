package com.shaunz.designpattern.visitorpattern;

public interface ComputerPart {
	public void accept(ComputerPartVisitor computerPartVisitor);
}
