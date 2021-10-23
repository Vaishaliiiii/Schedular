package com.demo.schedulingtasks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.schedulingtasks.model.ApplicationForm;

@Repository("ApplicationRepository")
public interface ApplicationRepository extends JpaRepository<ApplicationForm, Integer> {

}
