public class Car extends Vehicle {


    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку легковушке");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель легковой");
    }
}
