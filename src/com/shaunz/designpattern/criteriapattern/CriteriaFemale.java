package com.shaunz.designpattern.criteriapattern;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria{

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> malePersons = new ArrayList<Person>();
		for (Person person : persons) {
			if(person.getGender().equalsIgnoreCase("FEMALE")){
				malePersons.add(person);
			}
		}
		return malePersons;
	}

}
