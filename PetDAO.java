package com.dp.demos.dataaccess.pet;

import java.util.List;

import com.dp.demos.model.pet.Pet;

public interface PetDAO {

	
	/**
	 * Interacts with the data access layer of the system in order to get a list of pets in no particular order.
	 * 
	 * @return a {@link List} of {@link Pet} in no particular order. 
	 * 
	 * @throws RuntimeException if there was an issue communicating with the backend layer.
	 */
	List<Pet> getPets();
}
