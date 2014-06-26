package com.onegang.hps.service;

import org.springframework.web.bind.annotation.PathVariable;

import com.onegang.hps.dto.UserDto;
import com.onegang.hps.exception.UserCreationException;

public interface IUserService {

	UserDto createUser() throws UserCreationException;
	
	UserDto getUser(String userid);
	
	UserDto connectFacebook(@PathVariable String userid, @PathVariable String fbid);
	
}
