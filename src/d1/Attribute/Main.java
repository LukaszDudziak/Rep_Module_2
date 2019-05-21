package d1.Attribute;

public class Main {
    public static void main(String[] args) {
        AccessModifier accessModifier = new AccessModifier();

        String first = accessModifier.publicAttribute;
        String second = accessModifier.protectedAttribute;
        //String third = accessModifier.privateAttribute;

        System.out.println(first);
        System.out.println(second);
        //System.out.println(third);

        accessModifier.publicAttribute = "co tam";

        System.out.println(accessModifier.publicAttribute);
    }
}
