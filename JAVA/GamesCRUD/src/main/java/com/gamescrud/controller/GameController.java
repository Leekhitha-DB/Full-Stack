package com.gamescrud.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gamescrud.model.Game;
import com.gamescrud.service.GameService;

@RestController
public class GameController {
	@Autowired
	private GameService gameService;
	
	@GetMapping({"/games","/",""})
	public List<Game> getAllGames() {
		List<Game> allGames = gameService.getAllGames();
		return allGames; 
	}
	@GetMapping({"/gamebyid"})
	public Game getGameById(@RequestParam Long id) {
		Game game= gameService.getGameById(id);
		return game;
	}
	@PostMapping({"/games/id"})
	public String storeGame() {
		return "Storing Game in server";
	}
	@PutMapping({"/games/id"})
	public Game updateGameById(@RequestBody Game game, @RequestParam Long id) {
		Game updateGame=gameService.updateGameById(game,id);
		return updateGame;
	}
	@DeleteMapping({"/games/id"})
	public String deleteGameById(@RequestParam Long id) {
		gameService.deleteGameById(id);
		return "Game is Deleted";
	}
}
