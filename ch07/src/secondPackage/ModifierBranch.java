package secondPackage;

import firstPackage.AccessModifier;

class secondAccess extends AccessModifier {
    public void printModifier() {
//        System.out.println(privateData);
//        System.out.println(defaultData);
        System.out.println(protectedData);
        System.out.println(publicData);
    }
}

public class ModifierBranch {
    public static void main(String[] args) {
        secondAccess sa = new secondAccess();
//        System.out.println(sa.privateData);
//        System.out.println(sa.defaultData);
//        System.out.println(sa.protectedData);
        System.out.println(sa.publicData);
    }
}
