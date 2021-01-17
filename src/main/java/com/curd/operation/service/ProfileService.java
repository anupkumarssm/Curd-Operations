package com.curd.operation.service;

import java.util.List;

import com.curd.operation.entity.Profile;

public interface ProfileService {

	List<Profile> findAll();

	void save(Profile profile);

	void deleteById(int id);

}
