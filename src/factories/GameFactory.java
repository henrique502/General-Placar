package factories;

import br.com.hrdev.general_placar.models.Player;
import br.com.hrdev.general_placar.points.Point;
import br.com.hrdev.general_placar.points.General;
import br.com.hrdev.general_placar.points.Quina;
import br.com.hrdev.general_placar.points.Quadra;
import br.com.hrdev.general_placar.points.FullHouse;
import br.com.hrdev.general_placar.points.Sequencia;
import br.com.hrdev.general_placar.points.Six;
import br.com.hrdev.general_placar.points.Five;
import br.com.hrdev.general_placar.points.Four;
import br.com.hrdev.general_placar.points.Three;
import br.com.hrdev.general_placar.points.Two;
import br.com.hrdev.general_placar.points.One;

public class GameFactory {
	
	public static Player[] genratePlayersArray(int size){
		Player[] players = new Player[size];
		
		for (int i = 0; i < players.length; i++) {
			players[i] = new Player("Jogador " + (i + 1),genratePointsArray());
		}
		return players;
	}
	
	public static Point[] genratePointsArray(){
		Point[] points = new Point[11];
		
		points[0] = new General();
		points[1] = new Quina();
		points[2] = new Quadra();
		points[3] = new FullHouse();
		points[4] = new Sequencia();
		points[5] = new Six();
		points[6] = new Five();
		points[7] = new Four();
		points[8] = new Three();
		points[9] = new Two();
		points[10] = new One();
	
		return points;
	}
}
