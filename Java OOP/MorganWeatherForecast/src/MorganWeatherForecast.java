// Connor Morgan
// Java OOP
// Oct 2nd 2022
// Weather forecast project



public class MorganWeatherForecast {

	public static void main(String[] args) {
		System.out.println("Temperature cannot be less than -50 or greater than 150");
		Weather forecast1 = new Weather();
		
		forecast1.setSkyCondition("cloudy");
		
		System.out.println("temperature set to " + forecast1.getFahrenheit());
		
		Weather forecast2 = new Weather(45.0,"sunny");
		System.out.println("The Temperature of Weather Forecast #1 is " + forecast2.getFahrenheit() + " F or " + forecast2.toCelsius() );
		System.out.println("The Sky condition of Weather Forecast #1 is " + forecast2.getSkyCondition() );


		System.out.println("Weather Forecast #2 is Temperature " + forecast1.getFahrenheit() + "; sky: " + forecast1.getSkyCondition() );

		System.out.println("Weather Forecast Temperature: " + forecast2.getFahrenheit());
		if(forecast2.isConsistent()== true)
		System.out.println(forecast2.getSkyCondition() + " is Consistent");
		else
		System.out.println(forecast2.getSkyCondition() + " is not Consistent");

		System.out.println("Weather Forecast Temperature: " + forecast1.getFahrenheit());
		if(forecast1.isConsistent()== true)
		System.out.println(forecast1.getSkyCondition() + " is Consistent");
		else
		System.out.println(forecast1.getSkyCondition() + " is not Consistent");

		if(forecast1.equals(forecast2) == true)
		System.out.println("Original Weather Forecast #1 and #2 are same");
		else
		System.out.println("Original Weather Forecast #1 and #2 are different");
		}

}
