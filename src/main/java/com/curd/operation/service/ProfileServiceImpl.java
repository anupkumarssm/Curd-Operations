package com.curd.operation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.curd.operation.entity.Profile;
import com.curd.operation.repository.ProfileRepository;

//@Repository
@Service
public class ProfileServiceImpl implements ProfileService{
	@Autowired
	ProfileRepository profileRepository;

	@Override
	public List<Profile> findAll() {
		return profileRepository.findAll();
	}

	@Override
	public void save(Profile profile) {
		profileRepository.save(profile);
	}

	@Override
	public void deleteById(int id) {
		profileRepository.deleteById(id);
	}
}
