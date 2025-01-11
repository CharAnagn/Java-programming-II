import java.util.HashMap;

public class Abbreviations {
  private HashMap<String, String> list;

  public Abbreviations() {
      this.list = new HashMap<>();
  }

  public void addAbbreviation(String abbreviation, String explanation) {
    list.put(abbreviation, explanation);
  }


  public boolean hasAbbreviation(String abbreviation) {
      if (abbreviation == null ) {
          return false;
      }

     return this.list.containsKey(abbreviation);
  }

  public String findExplanationFor(String abbreviation) {
      if (hasAbbreviation(abbreviation)) {
          return list.get(abbreviation);
      } else {
        return null;
      }
  }

}



