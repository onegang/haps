package com.onegang.hps.service.impl;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.onegang.hps.dto.UserDto;
import com.onegang.hps.exception.UserCreationException;
import com.onegang.hps.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Override
	public UserDto createUser() throws UserCreationException {
		try {
			String userid = String.valueOf(Math.abs(SecureRandom.getInstance("SHA1PRNG").nextLong()));
			LOGGER.info("Creating user: {}", userid);
			UserDto dto = new UserDto();
			dto.setUserid(userid);
			return dto;
		} catch (NoSuchAlgorithmException ex) {
			LOGGER.error("Unable to create user", ex);
			throw new UserCreationException("Unable to create user", ex);
		}
	}

	@Override
	public UserDto getUser(String userid) {
		// TODO Auto-generated method stub
		LOGGER.info("user: {}", userid);
		UserDto dto = new UserDto();
		dto.setUserid(userid);
		return dto;
	}

	@Override
	public UserDto connectFacebook(String userid, String fbid) {
		// TODO Auto-generated method stub
		LOGGER.info("Facebook connect: user={}, facebook={}", userid, fbid);
		UserDto dto = new UserDto();
		dto.setUserid(userid);
		dto.setFbid(fbid);
		return dto;
	}

}
