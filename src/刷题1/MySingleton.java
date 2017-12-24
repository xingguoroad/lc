package 刷题1;

public enum MySingleton {
    INSTANCE;
    private MySingleton() {
        System.out.println("Here");
    }

    public static void main(String[] args) {
        System.out.println(MySingleton.INSTANCE);
    }
}