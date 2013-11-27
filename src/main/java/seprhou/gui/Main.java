package seprhou.gui;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main 
{	
	public static void main(String[] args){
		
		//Create configuration
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		
		//Set configuration
		cfg.title = "Air Traffic Controller Game";
		cfg.width = 800;
		cfg.height = 500;
		cfg.resizable = true;
		cfg.useGL20 = true;
		cfg.fullscreen = false;
		
		//Create game
		new LwjglApplication(new AtcGame(), cfg);

	}
	
}