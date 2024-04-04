package com.vision.oauthresourceserver.service;

import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.vision.oauthresourceserver.dto.UserDto;
import com.vision.oauthresourceserver.entity.User;
import com.vision.oauthresourceserver.repository.UserRepository;



@Service
public class UserService implements UserDetailsService{
	 @Autowired
	    private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user = userRepository.findByEmail(email);
		if(user == null) {
            throw  new UsernameNotFoundException("No User Found");
        }
		return null;
	}
	
	public List<UserDto> loadAllUser() throws UsernameNotFoundException {
		List<User> users = userRepository.findAll();
		if(users == null) {
            throw  new UsernameNotFoundException("No User Found");
        }

		ModelMapper modelMapper = new ModelMapper();
		List<UserDto> dtos = users.stream()
				  .map(user -> modelMapper.map(user, UserDto.class))
				  .collect(Collectors.toList());
		return dtos;
	}
	
	

}
