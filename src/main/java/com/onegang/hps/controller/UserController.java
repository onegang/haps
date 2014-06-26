package com.onegang.hps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.onegang.hps.dto.UserDto;
import com.onegang.hps.exception.UserCreationException;
import com.onegang.hps.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	@RequestMapping(value="/create", method = RequestMethod.POST)
	public @ResponseBody UserDto createUser() throws UserCreationException {
		return userService.createUser();
	}
	
	@RequestMapping(value="/info/{userid}", method = RequestMethod.GET)
	public @ResponseBody UserDto getUser(@PathVariable String userid) {
		return userService.getUser(userid);
	}
	
	@RequestMapping(value="/connect/fb/{userid}/{fbid}", method = RequestMethod.PUT)
	public @ResponseBody UserDto connectFacebook(@PathVariable String userid, @PathVariable String fbid) {
		return userService.connectFacebook(userid, fbid);
	}
	
}
