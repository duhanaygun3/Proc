package Abstracts;

import entities.Game;

public interface IGameManager {
	
	public void add(Game game);
	public void delete(Game game);
	public void update(Game game);
}

