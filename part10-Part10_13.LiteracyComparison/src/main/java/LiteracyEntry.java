public class LiteracyEntry implements Comparable<LiteracyEntry> {
    private String country;
    private int year;
    private String gender;
    private double literacyRate;

    public LiteracyEntry(String country, int year, String gender, double literacy) {
        this.country = country;
        this.year = year;
        this.gender = gender;
        this.literacyRate = literacy;
    }


    public String getCountry() {
        return this.country;
    }

    public int getYear() {
      return this.year;
    }

    public String getGender() {
      return this.gender;
    }

  public double getRate() {
    return this.literacyRate;
  }

    @Override
    public String toString() {
      return getCountry() + " (" + getYear() + "), " + getGender() + ", " + getRate();
    }

    @Override
    public int compareTo(LiteracyEntry entry) {
      return Double.compare(this.literacyRate, entry.getRate());
    }
}
