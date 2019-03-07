package MyPack;

public class VehicleGetSetMethod {
    public static void main(String args[]){

        Vehicle ferrari = new Vehicle(2, 25, 160 ,12);
        System.out.println(" Max скорость: " + ferrari.getMaxSpeed() + " км/ч");
        System.out.println("Число колес: " + ferrari.getWheels());
        ferrari.setWheels(4);
        System.out.println("Число колес: " + ferrari.getWheels());
        System.out.println("Расход топлива: " + ferrari.distance(10));
    }
}

