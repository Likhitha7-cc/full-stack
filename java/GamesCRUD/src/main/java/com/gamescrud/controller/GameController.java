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
	private GameService gamesService;
	
	@GetMapping  ({"/games","/",""})
	public List<Game> getAllGames() {
		List<Game> allGames = gamesService.getAllGames();
		return allGames;
	}
	@GetMapping  ("/gamesbyid")
	public Game getGameById(@RequestParam Long id) {
		Game game = gamesService.getGameById(id);
		return game;
	}
	@PutMapping  ("/games/id")
	public Game updateGameByid(@RequestBody Game game, @RequestParam Long id) {
		Game updateGame = gamesService.updateGameById(game, id);
		return updateGame ;
	}
	@DeleteMapping  ("/games/id")
	public String deleteGameById(@RequestParam Long id) {
	    gamesService.deleteGameById(id);
		return "game is deleted";
	}
	@PostMapping  ({"/games","/",""})
	public String storeGame() {
		return "storing game in server";
    }
	
}