package com.shaunz.designpattern.builderpattern;

public class MealBuilder {
	public Meal prepareVegMeal(){
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}
	
	public Meal prepareNonVegMeal(){
		Meal meal = new Meal();
		meal.addItem(new ChickBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}
