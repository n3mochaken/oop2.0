public class Truck extends MotorVehicle {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, 6);
    }
    public void checkTrailer (){
        System.out.println("PRISEP CHEKAEM");
    }

    @Override
    public void service() {
        super.service();
        checkTrailer();
    }


}