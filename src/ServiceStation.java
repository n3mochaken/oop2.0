public interface ServiceStation {
    default void check (Car car){
        System.out.println("Легковушку не привезли");
    }
    default void check(Truck truck){
        System.out.println("Грузовик не завезли");
    }default void check(Bicycle bicycle){
        System.out.println("Велосипед не завезли");
    }
}
