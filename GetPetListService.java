package com.dp.demos.service.pet;

import java.util.List;

import com.dp.demos.model.pet.Pet;
import com.dp.demos.model.pet.PetType;

public interface GetPetListService {

	/**
	 * <p>
	 * This method is responsible for retrieving the list of pets by requested {@link PetType}. Only those pets that
	 * have {@code pet.type} equal to the requested {@code type} should be returned in the list.
	 * </p>
	 * 
	 * @param type is the type of pet to retrieve.
	 * 
	 * @return the {@link List} of {@link Pet} objects where each {@link Pet} is of the specified {@code type}.
	 *         
	 * @throws IllegalArgumentException if the consumer did not specify the {@code type}.
	 * @throws IllegalStateException if there was an issue communicating with the backend to get the list of pets.
	 *         
	 */
	List<Pet> getPetsByType(PetType type);
}

