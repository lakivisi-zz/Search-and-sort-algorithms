public class Fellow {
  String name;
  String email;
  Integer cohortNo;
  String location;

  public Fellow(String name, String email, Integer cohortNo, String location){
    this.name = name;
    this.email = email;
    this.cohortNo = cohortNo;
    this.location = location;
  }
  public String getName() {
      return name;
  }

  public void setName(String name) {
      this.name = name;
  }

  public String getEmail() {
      return email;
  }

  public void setEmail(String email) {
      this.email = email;
  }

  public int getCohortNo() {
      return cohortNo;
  }

  public void setCohortNo(int cohortNo) {
      this.cohortNo = cohortNo;
  }
  public String getLocation() {
      return location;
  }

  public void setLocation(String location) {
      this.location = location;
  }

  @Override
  public String toString() {
        return "Name: {}, email: {}".format(name, location);
    }
}
