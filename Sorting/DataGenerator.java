import java.util.*;

public class DataGenerator{
  public static String generateRandSTring(){
    int leftLimit = 97; // letter 'a'
    int rightLimit = 122; // letter 'z'
    int targetStringLength = 10;
    Random random = new Random();
    StringBuilder buffer = new StringBuilder(targetStringLength);
    for (int i = 0; i < targetStringLength; i++) {
        int randomLimitedInt = leftLimit + (int) 
          (random.nextFloat() * (rightLimit - leftLimit + 1));
        buffer.append((char) randomLimitedInt);
    }
    String generatedString = buffer.toString();
    return generatedString;
  }

  public static Integer generateCohortNo(){
    Random rand = new Random();
    int x = rand.nextInt(50);
    return x;
    
  }

  public static String generateLocation(){
    List<String> locations = Arrays.asList("NBO", "KLA", "LOS");
    Random rand = new Random();
    int x = rand.nextInt(locations.size());
    return locations.get(x);
  }

}