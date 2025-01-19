package application;

public class StandardSensor implements Sensor {
  private int number;

  public StandardSensor(int num) {
      this.number = num;
  }

  public boolean isOn() {
      return true;
  }

  public void setOn() {

  }

  public void setOff() {
    
  }

  public int read() {
      return this.number;
  }
}
