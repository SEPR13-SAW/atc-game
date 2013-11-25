package seprhou.gui;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class MainWindowLauncher 
{	
	public static void main(String[] args){
		
		//Create configuration
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		
		//Set configuration
		cfg.title = "Air Traffic Controller Game";
		cfg.width = 800;
		cfg.height = 480;
		cfg.resizable = false;
		cfg.useGL20 = true;
		
		//Create game
		new LwjglApplication(new MainWindow(), cfg);

	}
	
}
