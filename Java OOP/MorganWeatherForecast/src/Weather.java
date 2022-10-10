import java.util.*;

public class Weather {
	
	private double fahrenheit;
	private String SkyCondition;
	
	public Weather() {
		fahrenheit = 80;
		
		SkyCondition = "sunny";
	}
	
	public Weather(double f, String s) {
		fahrenheit = f;
		SkyCondition = s;
	}
	
	public String getSkyCondition() {
		return SkyCondition;
	}
	
	public double getFahrenheit() {
		return fahrenheit;
	}
	
	public void setfahrenheit(double f) {
		fahrenheit = f;
	}
	
	public void setSkyCondition(String s) {
		SkyCondition = s;
	}
	
	public String toString() {
		return "Sky condition is" + SkyCondition + "and temperature is" + fahrenheit;
	}
	
	public boolean equals(Weather W) {
		return ((fahrenheit == W.fahrenheit) && (SkyCondition.equalsIgnoreCase(W.SkyCondition)));
	}
	
	public double toCelsius() {
		return Math.round((fahrenheit-32)*5/9);
	}
	
	public boolean isConsistent() {
		if(fahrenheit<32 && !SkyCondition.equalsIgnoreCase("snowy"))
			return false;
		if(fahrenheit<100 && !SkyCondition.equalsIgnoreCase("sunny"))
			return false;
		return true;
	}
}
