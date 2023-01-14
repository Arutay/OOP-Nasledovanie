import driver.DriverB;
import driver.DriverC;
import driver.DriverD;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++){
            DriverB driverB = new DriverB("Водитель категории В " + i,
                    true,
                    1
                    );

            Car car = new Car(
                    "Бренд " + i,
                    "Модель" + i,
                    1.6,
                    driverB
            );

            DriverD driverD = new DriverD("Водитель категории C " + i,
                    true,
                    1
            );

            Bus bus = new Bus(
                    "Бренд " + i,
                    "Модель " + i,
                    1.6,
                    driverD
            );

            DriverC driverC = new DriverC(
                    "Водитель категории C " + i,
                    true,
                    1
            );

            Truck truck = new Truck(
                    "Бренд " + i,
                    "Модель " + i,
                    1.6,
                    driverC
            );

            printInfo(car);
            printInfo(bus);
            printInfo(truck);
        }
    }

    private static void printInfo(Transport<?> transport) {
        System.out.println("Водитель " +transport.getDriver().getName() + " управляет автомобилем " +transport.getBrand() + transport.getModel() + " и будет учавствовать в заезде");
    }
}