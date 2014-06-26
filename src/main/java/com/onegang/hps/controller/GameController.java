package com.onegang.hps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.onegang.hps.service.IGameService;

@Controller
@RequestMapping("/game")
public class GameController {

	@Autowired
	private IGameService gameService;
	
	@RequestMapping(value="/info/{userid}", method = RequestMethod.GET)
	public @ResponseBody String getGames(@PathVariable String userid) {
		return null;
	}
	
	@RequestMapping(value="/create/random/{userid}", method = RequestMethod.POST)
	public @ResponseBody String createRandomGame(@PathVariable String userid) {
		return null;
	}
	
	@RequestMapping(value="/create/friend/{userid}/{oppid}", method = RequestMethod.POST)
	public @ResponseBody String createFriendGame(@PathVariable String userid, @PathVariable String oppid) {
		return null;
	}
	
	@RequestMapping(value="/delete/{gameid}/{userid}", method = RequestMethod.POST)
	public @ResponseBody String deleteGame(@PathVariable String gameid, @PathVariable String userid) {
		return null;
	}
	
	@RequestMapping(value="/update/hide/{gameid}/{userid}", method = RequestMethod.PUT)
	public @ResponseBody String submitHideGame(@PathVariable String gameid, @PathVariable String userid) {
		return null;
	}
	
	@RequestMapping(value="/update/tap/{gameid}/{userid}", method = RequestMethod.PUT)
	public @ResponseBody String submitTapGame(@PathVariable String gameid, @PathVariable String userid) {
		return null;
	}
	
}
