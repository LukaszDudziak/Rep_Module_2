package d1.Methods;

public class Main {
    public static void main(String[] args) {

        String name = "Lui";
        String surname = "Pudziak";

        Person person = new Person();
        person.setName(name);
        person.setSurname(surname);
        person.setAge(25);
        person.setGender('m'); //2nd

        person.fullName(); //3rd

        System.out.println(person.getAge());
        person.increaseAge();
        System.out.println(person.getAge());  //4th

        Car car = new Car();
        car.setBrand("Daewoo");
        car.setModel("Tico");
        car.setPrice(100);
        System.out.println(car.toString());
    }
}
