package it.unisalento.myairbnb.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.unisalento.myairbnb.entities.User;
import it.unisalento.myairbnb.repositories.UserRepository;
import it.unisalento.myairbnb.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	
	@Autowired
	UserRepository repository;
	
	@Override
	@Transactional
	public User save(User user) {
		// TODO Auto-generated method stub
		return repository.save(user);
	}

}
