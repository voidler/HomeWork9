import java.util.Random;
import java.util.Scanner;

public class Main {
 public static Scanner scan = new Scanner(System.in);
 public static void main(String[] args) {
  createAndSetAndGetPowerOfMachines();
  createAndSetAndGetPowerAndHoursAndMaxWorkTemperatureOfHeatManagers();
 }


 public static void createAndSetAndGetPowerOfMachines(){

  Machine machine1 = new Machine();
  Machine machine2 = new Machine();
  Machine machine3 = new Machine();

  Machine[] machines = new Machine[3];
  machines[0] = machine1;
  machines[1] = machine2;
  machines[2] = machine3;

  System.out.println("Vyvedete moshtnostta na mashinatite: ");
  machine1.setPower(scan.nextInt());
  machine2.setPower(scan.nextInt());
  machine3.setPower(scan.nextInt());

  System.out.println("Moshtnostta na pyrvata mashina e: " + machine1.getPower() + "\n" +
          "Moshtnostta na vtorata mashina e: " + machine2.getPower() + "\n" +
          "Moshtnostta na tretata mashina e: " + machine3.getPower() + "\n");

 }

 public static void createAndSetAndGetPowerAndHoursAndMaxWorkTemperatureOfHeatManagers(){

  HeatManager heatManager1 = new HeatManager();
  HeatManager heatManager2 = new HeatManager();
  HeatManager heatManager3 = new HeatManager();

  HeatManager[] heatManagers = new HeatManager[3];
  heatManagers[0] = heatManager1;
  heatManagers[1] = heatManager2;
  heatManagers[2] = heatManager3;

  System.out.println("Vyvedete moshnostta na toplinnite menidjyri: ");
  heatManager1.setPower(scan.nextInt());
  heatManager2.setPower(scan.nextInt());
  heatManager3.setPower(scan.nextInt());

  System.out.println("Vyvedete chasovete na rabota na toplinnite menidjyri: ");
  heatManager1.setHours( scan.nextInt());
  heatManager2.setHours( scan.nextInt());
  heatManager3.setHours( scan.nextInt());

  System.out.println("Maksimalnata rabotna temperatura na pyrviq toplinen menidjyr e: " + heatManager1.getMaxWorkTemperature() + "\n" +
          "Maksimalnata rabotna temperatura na vtoriq toplinen menidjyr e: " + heatManager2.getMaxWorkTemperature() + "\n" +
          "Maksimalnata rabotna temperatura na tretiq toplinen menidjyr e: " + heatManager3.getMaxWorkTemperature() );
 }
 }








