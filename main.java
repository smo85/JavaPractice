public class main {
  public static void main(String[] args) {
    // the new keyword is responsible for allocating memory for the new
    // object through a constructor
    // the constructor is used to initialize variables representing the main
    // properties of the created object
    HealthData myData = new HealthData(31, 65, "Sarah");
    HealthData myData2 = new HealthData(myData, "Devin");
    System.out.println(myData.toString());
    myData2.setHrv(40);
    System.out.println(myData2.toString());

    HealthData nullData = new HealthData();
    assert nullData.getUserName()  == null;
  }
}
