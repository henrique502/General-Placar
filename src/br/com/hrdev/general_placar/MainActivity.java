package br.com.hrdev.general_placar;

import factories.GameFactory;
import br.com.hrdev.general_placar.models.Player;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
		/*
		TextView text = (TextView) findViewById(R.id.texto);
		
		http://stackoverflow.com/questions/3152422/webview-load-html-from-assets-directory
		
		
		Player[] jogadores = GameFactory.genratePlayersArray(10);

		String texto = "";
		for(Player p : jogadores)
			texto += p + "\n";
		
		text.setText(texto);
		
		*/
	}
	
	
	private void newTest(){
		Intent myIntent = new Intent(MainActivity.this, PlayersActivity.class);
		MainActivity.this.startActivity(myIntent);
	}
	
}
