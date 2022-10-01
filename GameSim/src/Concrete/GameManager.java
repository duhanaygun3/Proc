package Concrete;

import Abstracts.IGameManager;
import entities.Game;

public class GameManager implements IGameManager {

	@Override
	public void add(Game game) {
		System.out.println(game.getName()+" "+game.getPrice()+" "+"fiyatıyla eklendi.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName()+" "+"oyununun bilgileri güncellendi.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName()+" "+"sistemden kaldırıldı.");
		
	}

}
