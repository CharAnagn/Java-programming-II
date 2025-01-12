
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }


    
    @Override
    public boolean equals(Object obj) {
        // Check if the compared object is the same instance
        if (this == obj) {
            return true;
        }
        // Check if the compared object is null or of a different type
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        // Cast the object to LicensePlate and compare fields
        LicensePlate other = (LicensePlate) obj;
        return Objects.equals(this.liNumber, other.liNumber) &&
               Objects.equals(this.country, other.country);
    }

    @Override
    public int hashCode() {
        // Use Objects.hash to generate a hash code based on fields
        return Objects.hash(liNumber, country);
    }

}
