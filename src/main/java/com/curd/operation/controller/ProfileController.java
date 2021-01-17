package com.curd.operation.controller;

import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;

import com.curd.operation.entity.Profile;
import com.curd.operation.repository.ProfileRepository;
import com.curd.operation.service.ProfileService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ProfileController {

	@Autowired
	ProfileRepository profileRepository;
	
	@Autowired
	ProfileService profileService;

	/**
	 * Get All Profile List
	 * @return All profiles
	 */
	@RequestMapping(value = "/getprofilelist")
	public List<Profile> profileList() {
		return profileService.findAll();

	}
	/**
	 * Add or Update Profile
	 * @param profile
	 */
	@RequestMapping(value = "/saveprofile")
	public void saveStudent(@RequestBody Profile profile) {
		profileService.save(profile);

	} 
	/**
	 * Delete Profile
	 * @param id
	 * @return Profile List
	 */
	@RequestMapping(value = "/deleteprofile/{id}")
	public List<Profile> delete(@PathVariable("id") int id) {
		try {
			profileService.deleteById(id);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return profileRepository.findAll();
	}

}
