package mainpack;

import java.util.logging.Logger;

public class Light {
	public static void main(final String[] args) {
		int lightSpeed;
		long days;
		long seconds;

		// approximate speed of light in miles per second
		lightSpeed = 186000;
		Logger log = Logger.getLogger(Light.class.getName());
		long distance;
		days = 1000; // specify number of days here
		seconds = days * 24 * 60 * 60; // convert to seconds
		distance = lightSpeed * seconds; // compute distance
		log.fine("In " + days);
		log.fine(" days light will travel about ");
		log.fine(distance + " miles.");
	}
}
