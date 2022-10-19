package firstPackage;

public class AccessModifier {
    //접근 제어자
    private int privateData;
            int defaultData;
    protected int protectedData;
    public int publicData;

    public void printModifier(){
        System.out.println(privateData);
        System.out.println(defaultData);
        System.out.println(protectedData);
        System.out.println(publicData);
    }
}

class ModifierOrigin {
    public static void main(String[] args) {
        AccessModifier am = new AccessModifier();
        System.out.println(am.privateData);
        System.out.println(am.defaultData);
        System.out.println(am.protectedData);
        System.out.println(am.publicData);
    }
}
