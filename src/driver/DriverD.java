package driver;

public class DriverD extends Driver implements java.sql.Driver {

    public DriverD(String name,
                   boolean hasDriverLicence,
                   int experinceInYears){
        super(name, hasDriverLicence, experinceInYears);
    }

    @Override
    public void startMove() {
        System.out.println("Водитель категории D " + getName() + " начал движение");

    }
    @Override
        public void finishMove() {
        System.out.println("Водитель категории D " + getName() + " закончил движение");

    }
    @Override
            public void refill(){
                System.out.println("Водитель категории D " + getName() + " заправляет авто");

}}
