class Main {
    static boolean eligible(boolean python, boolean ds) {
        return python && ds;
    }

    public static void main(String[] args) {
        String[] names = {"Arun", "Bala", "Charan", "Divya"};
        boolean[] python = {true, true, true, false};
        boolean[] ds = {true, false, true, true};

        for (int i = 0; i < names.length; i++) {
            if (eligible(python[i], ds[i])) {
                System.out.println(names[i]);
            }
        }
    }
}
