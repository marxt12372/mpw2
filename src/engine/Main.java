package engine;

import org.lwjgl.opengl.Display;
import renderingEngine.DisplayManager;
import toolbox.*;


public class Main
{
	public static void main(String[] args)
	{
		DisplayManager.createDisplay();
		while(!Display.isCloseRequested())
		{
			DisplayManager.updateDisplay();
		}
		DisplayManager.closeDisplay();
	}
}
