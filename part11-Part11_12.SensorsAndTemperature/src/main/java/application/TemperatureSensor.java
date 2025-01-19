package application;

public class TemperatureSensor implements Sensor {
  
  private boolean isOn;

  public TemperatureSensor() {

      this.isOn = false;
  }

  public boolean isOn() {
      return isOn;
  }

  public void setOn() {
      this.isOn = true;
  }

  public void setOff() {
    this.isOn = false;
  }

  public int read() {

    if (!isOn) {
        throw new IllegalStateException("Sensor is off");
    }
    int max = 30;
    int min = -30;

    int randomNumber = (int) (Math.random() * (max - min + 1)) + min;


      return randomNumber;
  }
}
