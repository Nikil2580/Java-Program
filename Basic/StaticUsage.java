class StaticUsage {
    static int count = 0;

    StaticUsage() { // Constructor
        count++;
        System.out.println(count);
    }

    public static void main(String args[]) {
        new StaticUsage(); // StaticUsage obj1 = new StaticUsage();
        new StaticUsage(); // StaticUsage obj2 = new StaticUsage();
        new StaticUsage(); // StaticUsage obj3 = new StaticUsage();
    }
}