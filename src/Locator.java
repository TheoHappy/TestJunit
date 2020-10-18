
public class Locator {
	Door door;
	Window window;
	Roof roof;
	public Locator(){
		door = new Door();
		window = new Window();
		roof = new Roof();
	}
	protected Door getDoor(){
		return door;
	}
	protected Roof getRoof(){
		return roof;
	}
	protected Window getWindow(){
		return window;
	}
}
