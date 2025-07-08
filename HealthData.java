class HealthData {
  Integer hrv;
  Integer rhr;
  String userName;

  // parameterized constructor
  // allows us to inject values into the object
  public HealthData(Integer hrv, Integer rhr, String userName) {
    this.hrv = hrv;
    this.rhr = rhr;
    this.userName = userName;
  }

  // this is an example of a no arg constructor, this is added by default if you dont add one
  public HealthData() {
    this.hrv = 35;
    this.rhr = 60;
  }

  public HealthData(HealthData other, String userName) {
    this.hrv = other.hrv;
    this.rhr = other.rhr;
    this.userName = userName;
  }

  public Integer getHrv() {
    return hrv;
  }

  public void setHrv(Integer hrv) {
    this.hrv = hrv;
  }

  public Integer getRhr() {
    return rhr;
  }

  public void setRhr(Integer rhr) {
    this.rhr = rhr;
  }

  public String getUserName() {
    return userName;
  }

  @Override
  public String toString() {
    String template = "%s: hrv=%d, rhr=%d";
    return template.formatted(userName, hrv, rhr);
  }
}
