public class main {
  public static void main(String[] args) {
    HealthData myData = new HealthData(31, 65);
    HealthData myData2 = new HealthData(myData);
    System.out.println(myData.toString());
    myData2.setHrv(40);
    System.out.println(myData2.toString());
  }
}
