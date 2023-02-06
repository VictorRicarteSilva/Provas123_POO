public class Main {
    public static void main(String[] args) {
        SpeedBike b1 = new SpeedBike(0.0, 5, 15);
        try{
            b1.acelerar(50000);
        }catch (VelocidadeException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println(b1.getVelocidade());
        }
        Qualidade[] bikes = new Qualidade[3];
        bikes[0] = new SpeedBike(10.0, 15, 5);
        bikes[1] = new SpeedBike(10.0, 15, 7);
        bikes[2] = new SpeedBike(10.0, 15, 15);
        OrdenaVet.ordena(bikes);
        for(int i = 0;i < 3;i++){
            System.out.println(((SpeedBike) bikes[i]).getEspessuraPneu());
        }
    }
}