package d1.Attribute;

public class Main {
    public static void main(String[] args) {
        AccessModifier accessModifier = new AccessModifier();

        String first = accessModifier.publicAttribute;
        String second = accessModifier.protectedAttribute;
        //String third = accessModifier.privateAttribute;

        System.out.println(first);
        System.out.println(second);
        //System.out.println(third); //1st

        accessModifier.publicAttribute = "co tam";

        System.out.println(accessModifier.publicAttribute); //2nd

        Person person = new Person();
        System.out.println(person.name);
        System.out.println(person.surname);
        System.out.println(person.age);
        System.out.println(person.gender);  //3rd
    }
}
