package com.fmr.dp.demos.service.pet;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dp.demos.dataaccess.pet.PetDAO;
import com.dp.demos.model.pet.Pet;
import com.dp.demos.model.pet.PetType;
import com.dp.demos.service.pet.GetPetListService;


public class GetPetListServiceStubDataImpl implements GetPetListService {

	/** Logger to utilize for the class. */
	private static final Logger LOG = LoggerFactory.getLogger(GetPetListServiceStubDataImpl.class);

	/** This {@link PetDAO} will return the list of pets unordered. */ 
	private PetDAO dao;
	
	public GetPetListServiceStubDataImpl(PetDAO dao) {
		this.dao = dao;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<Pet> getPetsByType(PetType type) {
		List<Pet> filteredPets = new ArrayList<>();
		
		// returns a unfiltered, unsorted list of pets from backend, throws a RuntimeException if there was an issue
		// communicating with the backend layer the DAO depends on.
		List<Pet> daoPets = dao.getPets();
			
		return filteredPets;
	} 
	
	
}
