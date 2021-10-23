package com.demo.schedulingtasks.service;

import java.util.List;

import com.demo.schedulingtasks.model.ApplicationForm;

public interface ApplicationService {

	public List<ApplicationForm> findAll();
	public ApplicationForm update(ApplicationForm appliForm);
}
