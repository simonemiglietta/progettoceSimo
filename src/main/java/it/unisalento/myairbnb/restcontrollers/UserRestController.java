package it.unisalento.myairbnb.restcontrollers;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.unisalento.myairbnb.dto.UserDTO;
import it.unisalento.myairbnb.entities.User;
import it.unisalento.myairbnb.exceptions.UserNotFoundException;
import it.unisalento.myairbnb.repositories.UserRepository;
import it.unisalento.myairbnb.service.UserService;

@RestController
@RequestMapping("/user")
public class UserRestController {
	
	
	@Autowired
	UserService userService;

	
	@PostMapping(
			value = "/save",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE
			)
	public UserDTO post(@RequestBody @Valid UserDTO userDTO) {
		userDTO.setId(39238);
		
		User user = new User();
		user.setBirthdate(new Timestamp(0));
		user.setName(userDTO.getName());
		user.setSurname(userDTO.getSurname());
		user.setEmail(userDTO.getEmail());
		
		userService.save(user);
		
		return userDTO;
	}
	
	@GetMapping( value="/getById/{id}",
			produces = MediaType.APPLICATION_JSON_VALUE
			)
	public UserDTO get(@PathVariable int id) throws UserNotFoundException {
		if (id == 84) {
			throw new UserNotFoundException();
		}
		UserDTO userDTO = new UserDTO();
		userDTO.setAge(8);
		userDTO.setId(id);
		userDTO.setDataNascita(new Date());
		userDTO.setEmail("pbf@jjn.it");
		// et etc
		return userDTO;
	}
	
	@GetMapping(
			value = "/getAll",
			produces = MediaType.APPLICATION_JSON_VALUE
			)
	public List<UserDTO> getAll() {
		UserDTO userDTO1 = new UserDTO();
		userDTO1.setAge(8);
		userDTO1.setId(23);
		userDTO1.setName("Orazio");
		userDTO1.setSurname("lafronza");
		userDTO1.setDataNascita(new Date());
		userDTO1.setEmail("dkjhjhsloit");
		
		UserDTO userDTO2 = new UserDTO();
		userDTO2.setAge(8);
		userDTO2.setId(24);
		userDTO1.setName("Gervaso");
		userDTO1.setSurname("De Pandis");
		userDTO2.setDataNascita(new Date());
		userDTO2.setEmail("dpppppppp@lo.it");
		List<UserDTO> list = new ArrayList<UserDTO>();
		list.add(userDTO1);
		list.add(userDTO2);
		return list;
		
	}
	
}
