package com.demo.schedulingtasks.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.schedulingtasks.model.ApplicationForm;
import com.demo.schedulingtasks.repository.ApplicationRepository;

@Transactional
@Service("ApplicationService")
public class ApplicationServiceImp implements ApplicationService {
	
	@Autowired
	private ApplicationRepository repo;

	@Override
	@Scheduled(cron = "0 */1 * * * *")
	public List<ApplicationForm> findAll() {
		return repo.findAll();
	}
	
	public ApplicationForm update(ApplicationForm appliForm) {
		return repo.save(appliForm);
	}  
}
