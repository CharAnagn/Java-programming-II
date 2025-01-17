

public class Checker {


  public boolean isDayOfWeek(String string) {

  String regex = "mon|tue|wed|thu|fri|sat|sun";
      return string.matches(regex);
  }


  public boolean allVowels(String string) {
    return string.matches("[aeiou]*"); // Matches a string with zero or more vowels
}


public boolean timeOfDay(String string) {
  // Regular expression for the correct format (hh:mm:ss)
  String regex = "\\d{2}:\\d{2}:\\d{2}";

  // Check if the string matches the format
  if (!string.matches(regex)) {
      return false;
  }

  // Split the string into parts (hh, mm, ss)
  String[] parts = string.split(":");

  // Parse each part and check the range
  int hours = Integer.parseInt(parts[0]);
  int minutes = Integer.parseInt(parts[1]);
  int seconds = Integer.parseInt(parts[2]);

  // Validate the ranges for hours, minutes, and seconds
  if (hours < 0 || hours > 23) {
      return false;
  }
  if (minutes < 0 || minutes > 59) {
      return false;
  }
  if (seconds < 0 || seconds > 59) {
      return false;
  }

  // If all checks pass, the time is valid
  return true;
}


}
