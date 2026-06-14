package GMB_Data_Match_AND_Validation_System.Classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;


public class GMB_Functions {

	 public static String convertTo24HourFormat(String inputTime) {
	        // Replace non-breaking spaces with regular spaces
	        inputTime = inputTime.replace('\u202F', ' ');

	        // Define multiple formats to try parsing
	        SimpleDateFormat[] inputFormats = {
	            new SimpleDateFormat("h:mm a"),
	            new SimpleDateFormat("h a")
	        };

	        SimpleDateFormat outputFormat = new SimpleDateFormat("HH:mm");

	        // Try each input format
	        for (SimpleDateFormat inputFormat : inputFormats) {
	            try {
	                Date date = inputFormat.parse(inputTime);
	                return outputFormat.format(date);
	            } catch (ParseException e) {
	                // Continue to the next format if parsing fails
	            }
	        }

	        return null; // Handle parsing error as needed
	    }

	    // Method to extract and convert day-time pairs to the desired format
	 public static String extractDayTime(String input) {
		    // Define the mapping of days to numbers
		    String[] days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

		    // Split the input into lines
		    String[] lines = input.split("\n");

		    StringBuilder patternBuilder = new StringBuilder();

		    // Loop through the days and find corresponding time
		    for (int i = 0; i < days.length; i++) {
		        String day = days[i];
		        String time = null;

		        for (int j = 0; j < lines.length; j++) {
		            if (lines[j].equalsIgnoreCase(day)) {
		                if (j + 1 < lines.length) {
		                    time = lines[j + 1]; // The next line contains the time
		                    break;
		                }
		            }
		        }

		        if (time != null) {
		            String[] timeParts = time.split("–");
		            if (timeParts.length == 2) {
		                String startTime = convertTo24HourFormat(timeParts[0].trim());
		                String endTime = convertTo24HourFormat(timeParts[1].trim());

		                if (startTime != null && endTime != null) {
		                    patternBuilder.append(i + 1).append(":").append(startTime).append(":").append(endTime).append(", ");
		                }
		            }
		        }
		    }

		    // Trim the trailing comma and remove spaces
		    String pattern = patternBuilder.toString().trim();
		    if (pattern.endsWith(",")) {
		        pattern = pattern.substring(0, pattern.length() - 1);
		    }

		    // Remove all spaces from the pattern
		    pattern = pattern.replace(" ", "");

		    return pattern;
		}




	// Trim Function

	public static String trimTrailingCommaAndCheckFormat(String input) {
		// Define a regular expression pattern to match trailing comma and spaces
		String pattern = ",\\s*$";

		// Remove trailing comma and spaces
		String trimmed = input.replaceAll(pattern, "");

		// Check if the trimmed string ends with only alphabets and digits
		if (trimmed.matches(".*[a-zA-Z0-9]$")) {
			return trimmed;
		} else {
			return input; // Return the original string if the format doesn't match
		}
	}

	// Reagarange pattern

	public static String rearrangeString(String input) {
	    String[] parts = input.split(", "); // Split the string by comma and space
	    Arrays.sort(parts); // Sort the parts
	    return String.join(", ", parts); // Join the sorted parts back into a single string
	}
	
	public static String rearrangeStringSI(String input) {
		String[] parts = input.split(", "); // Split the string by comma and space
		Arrays.sort(parts); // Sort the parts
		return String.join(", ", parts); // Join the sorted parts back into a single string
	}

	public static double calculateDistance(double lat1, double lat2, double lon1, double lon2) {
	    // Convert latitude and longitude coordinates from degrees to radians
	    lat1 = Math.toRadians(lat1);
	    lat2 = Math.toRadians(lat2);
	    lon1 = Math.toRadians(lon1);
	    lon2 = Math.toRadians(lon2);

	    double dlon = lon2 - lon1;
	    double dlat = lat2 - lat1;
	    double a = Math.pow(Math.sin(dlat / 2), 2) + Math.cos(lat1) * Math.cos(lat2) * Math.pow(Math.sin(dlon / 2), 2);

	    double c = 2 * Math.asin(Math.sqrt(a));

	    // Radius of Earth in kilometers
	    double r = 6371;

	    // Calculate the distance in kilometers
	    double distanceInKilometers = c * r;

	    // Convert kilometers to meters
	    return distanceInKilometers * 1000;
	}
}