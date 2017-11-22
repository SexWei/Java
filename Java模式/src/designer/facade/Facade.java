package designer.facade;

public class Facade {
	
	private Alarm alarm;
	private Camera camera;
	private Sensor sensor;
	
	public Facade(){
		alarm=new Alarm();
		camera=new Camera();
		sensor=new Sensor();
		
	}
	
	public void init(){
		alarm.active();
		camera.on();
		sensor.on();
	}

}
