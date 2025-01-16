
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LiteracyComparison {
    
    public static void main(String[] args) {


     try {
      List<String> rows = new ArrayList<>();
      Files.lines(Paths.get("literacy.csv")).forEach(row -> rows.add(row));

      List<LiteracyEntry> entries = new ArrayList<>();

      for (String row : rows) {
         String[] parts =  row.split(",");
         String country = parts[3].trim();
        int year = Integer.valueOf(parts[4].trim());
        String gender = parts[2].trim().replace(" (%)", "");
        double literacyRate = Double.valueOf(parts[5].trim());


        entries.add(new LiteracyEntry(country, year, gender, literacyRate));

      }

      Collections.sort(entries);

      for (LiteracyEntry entry : entries) {
        System.out.println(entry);
    }
    

     } catch (Exception e) {
      // TODO: handle exception
     }



    }
}
