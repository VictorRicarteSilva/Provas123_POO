import java.util.Scanner;

public class Main {
    public static void main(String[] args) { // a resposta da 1D está no arquivo txt.
        int n = 3;
        Marcha m1 = new Marcha(3, "Caloi");
        Marcha m2 = new Marcha(6, "SpeedDragon");
        Marcha m3 = new Marcha(4, "Hunter");
        Bike[] bikes = new Bike[n];
        bikes[0] = new Bike("aro16", 123, "Caloi", m1, 0.0);
        bikes[1] = new SpeedBike("700", 456, "Soul", 3.0, m2, 20);
        bikes[2] = new MountainBike("off-road", 789, "EXTREME", m3, 45.0, "Mola");

        for (int i = 0; i < n; i++) {
            bikes[i].imprimirDados();
        }
    }
}