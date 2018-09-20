import java.util.*;

class Main{
  public static void main(String[] args) {
    List<Fellow> fellowList = populateData(5);
    System.out.println(fellowList);

    Scanner reader = new Scanner(System.in);
    System.out.println("Choose to sort by name, cohort or location");
    String s = reader.next();
    reader.close();

    if(s.equals("name")) Collections.sort(fellowList);
    if(s.equals("cohort")) Collections.sort(fellowList, Comparators.fellowCohortComparator);
    if(s.equals("location")) Collections.sort(fellowList, Comparators.fellowLocationComparator);
    
    System.out.println(fellowList);
    
  }

  private static List<Fellow> populateData(int listsize){

    DataGenerator gen = new DataGenerator();

    ArrayList<Fellow> fellowList = new ArrayList<>();
    for(int i = 0; i < listsize; i++){
      String name = gen.generateRandSTring();
      String email = name + "@andela.com";
      String location = gen.generateLocation();
      Integer cohortNo = gen.generateCohortNo();
      Fellow newFellow = new Fellow(name, email, cohortNo, location);
      fellowList.add(newFellow);
    }
    return fellowList;
  }

  
}