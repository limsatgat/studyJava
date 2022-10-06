public class Ex05_StringArray {

    public static void main(String[] args) {
        String[] names = new String[]{"Lim", "Soo", "Heon"};

        for(int i = 0; i < names.length; ++i) {
            System.out.println("names[" + i + "] : " + names[i]);
        }

        names[0] = "lemon";
        String[] var6 = names;
        int var3 = names.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            String str = var6[var4];
            System.out.println(str);
        }

    }
}