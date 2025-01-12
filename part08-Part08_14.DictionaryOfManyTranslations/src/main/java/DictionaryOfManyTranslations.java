import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
  
  private HashMap<String, ArrayList<String>> translationPair;


  public DictionaryOfManyTranslations() {
     this.translationPair = new HashMap();
  }

  public void add(String word, String translation) {
      this.translationPair.putIfAbsent(word, new ArrayList<>());


      ArrayList<String> translations = this.translationPair.get(word);

      translations.add(translation);
  }

  public ArrayList<String> translate(String word) {
    
      if (translationPair.get(word) != null)  {
        return translationPair.get(word);
      }

      return new ArrayList<>();
  }

  public void remove(String word) {
      if (translationPair.get(word) != null) {
          translationPair.remove(word);
      }
  }
}
