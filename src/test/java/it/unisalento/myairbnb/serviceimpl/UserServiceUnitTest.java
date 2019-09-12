package it.unisalento.myairbnb.serviceimpl;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.BDDMockito.Then;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import it.unisalento.myairbnb.entities.User;
import it.unisalento.myairbnb.service.UserService;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class UserServiceUnitTest {
	
	@Mock
	private UserService userServiceMock;
	
	private User user;
	
	
	@BeforeEach
	private void setUp() {
		
		user = new User();
		 
		user.setName("prova_name");
		user.setSurname("prova_surname");
		user.setEmail("prova_eddmail@email.com");
		
	}
	
	@Test
	public void saveUserTest() {
			
		when(userServiceMock.save(user)).thenReturn(user);
		
		int id = userServiceMock.save(user).getIduser();
		
		assertThat(id).isNotNull();
		
	}
	

}
