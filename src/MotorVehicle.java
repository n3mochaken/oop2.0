public abstract class MotorVehicle extends Vehicle{
    public MotorVehicle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void checkEngine (){
        System.out.println("PORSHEN PORSHEN");
    }

    @Override
    public void service() {
        super.service();
        checkEngine();
    }

}
