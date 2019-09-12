package it.unisalento.myairbnb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.unisalento.myairbnb.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
