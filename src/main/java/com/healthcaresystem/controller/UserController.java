package com.healthcaresystem.controller;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.healthcaresystem.model.User;
import com.healthcaresystem.service.UserServiceInterface;
@CrossOrigin(origins= "http://localhost:3000")
@RestController
public class UserController {



	@Autowired
	private UserServiceInterface userServiceInterface;
	@GetMapping("/diplayUser")
	public List<User> displayAllUser()
	{
		return userServiceInterface.findAll();
	}
	
	
	// http://localhost:888/gr/3
	@GetMapping("/get/{srNo}")
	public User getUserDetails(@PathVariable int srNo) {
		
				return userServiceInterface.getUserDetails(srNo);
		
	}
	//
	
//	http://localhost:888/ar
	@PostMapping("/addUser")
	public boolean addUser(@RequestBody User r) {
		
		return userServiceInterface.addUser(r); 
		
	}
	
	
//	http://localhost:888/ur/1
	@PutMapping("/update/{srNo}")
	
    public User updateUser(@RequestBody User u,@PathVariable("srNo") int srNo)
    {
		return userServiceInterface.updateUser(u,srNo);
	
       
    }
	
	
	// Delete operation
	
//	http://localhost:888/ur/1
    @DeleteMapping("/delete/{srNo}")
    public String deleteResourceById(@PathVariable("srNo") int srNo)
    {
        userServiceInterface.deleteById(srNo);
  
        return "Deleted Successfully";
        
    }
    
    
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User user)
    {
      
      user= userServiceInterface.login(user);
      
      if(user != null)
      {
        return new ResponseEntity<User>(user,HttpStatus.OK);
      }else 
      {
        return null;
      }
    
      
    }
    
    @RequestMapping(value = {"/logout"}, method = RequestMethod.POST)
    public String logoutDo(HttpServletRequest request,HttpServletResponse response)
    {
    
  
        return "redirect:/login";
    }
}
