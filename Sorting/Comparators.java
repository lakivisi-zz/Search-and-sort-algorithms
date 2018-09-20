import java.util.*;

public class Comparators{
  public static Comparator<Fellow> fellowCohortComparator = Comparator.comparing(Fellow::getCohortNo);

  public static Comparator<Fellow> fellowLocationComparator = Comparator.comparing(Fellow::getLocation);
}