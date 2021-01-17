package com.curd.operation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curd.operation.entity.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Integer>{

}
