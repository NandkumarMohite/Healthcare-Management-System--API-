package com.healthcaresystem.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.healthcaresystem.dao.CoachDAOInterface;
import com.healthcaresystem.model.Coach;




@Service
public  class CoachService implements CoachServiceInterface {
	
	
	@Autowired
	private CoachDAOInterface coachDaoInterface;
	

	@Override
	public Coach getCoachDetails(int coachId) {
		// TODO Auto-generated method stub
		
		Optional<Coach> x = coachDaoInterface.findById(coachId);
		Coach c = new Coach();
		if(x.isPresent())
		{
			 c = x.get();
			
		}
		return c;
	}

	@Override
	public boolean addCoach(Coach c) {
		// TODO Auto-generated method stub
		boolean added = false;
		try {
			coachDaoInterface.save(c);
			added=true;
		} catch (Exception e) {
			
		}
		return added;
	}

	@Override
    public Coach updateCoach(Coach c, int coachId)
    {
    	Coach depDB = coachDaoInterface.findById(coachId).get();
  
        if (Objects.nonNull(c.getFirstName()) && !"".equalsIgnoreCase(depDB.getFirstName())) {
            depDB.setFirstName(c.getFirstName());
        }
  

  
        return coachDaoInterface.save(depDB);
    }

	@Override
	public String deleteCoachById(int coachId) {
//		Coach depDB = coachDaoInterface.findById(coachId).get();
	
		coachDaoInterface.deleteById(coachId);
		return "";
	}
	
	

	@Override
	public List<Coach> findAll() {
		// TODO Auto-generated method stub
		List<Coach> depBd =coachDaoInterface.findAll();
		return depBd;
	}

}
   

