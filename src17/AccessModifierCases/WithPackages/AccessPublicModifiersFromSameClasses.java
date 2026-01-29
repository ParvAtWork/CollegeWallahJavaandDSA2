package AccessModifierCases.WithPackages;

public class AccessPublicModifiersFromSameClasses {
    public String str_1 = "I am the public member";

    public void printFromClass() {
        System.out.println("Within class: " + str_1);
    }
}

