class Main {
    static boolean promotion(int experience, boolean training, int rating) {
        return experience >= 5 && training && rating >= 4;
    }

    public static void main(String[] args) {
        String[] names = {"Ravi", "Priya", "Kumar", "Meena"};
        int[] experience = {6, 3, 8, 7};
        boolean[] training = {true, true, false, true};
        int[] rating = {5, 4, 5, 4};

        for (int i = 0; i < names.length; i++) {
            if (promotion(experience[i], training[i], rating[i])) {
                System.out.println(names[i]);
            }
        }
    }
}
