class HealthData {
  Integer hrv;
  Integer rhr;

  // parameterized constructor
  // allows us to inject values into the object
  public HealthData(Integer hrv, Integer rhr) {
    this.hrv = hrv;
    this.rhr = rhr;
  }

  // this is an example of a no arg constructor, this is added by default if you dont add one
  public HealthData() {
    this.hrv = 35;
    this.rhr = 60;
  }

  public HealthData(HealthData other) {
    this.hrv = other.hrv;
    this.rhr = other.rhr;
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

  @Override
  public String toString() {
    String template = "HealthData{hrv=%d, rhr=%d}";
    return template.formatted(hrv, rhr);
  }
}
