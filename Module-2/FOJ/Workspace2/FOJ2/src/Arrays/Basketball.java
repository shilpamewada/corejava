package Arrays;

class BasketBall {

    static public String playerPerformanceAnalysis(int[] points) {
        // If the array is empty, return a message indicating no games played
        if (points.length == 0) {
            return "No games played.";
        }

        int sum = 0;
        int gamesAbove20 = 0;

        for (int i = 0; i < points.length; i++) {
            sum += points[i];
            if (points[i] > 20) {
                gamesAbove20++;
            }
        }

        return "Total Points: " + sum + ". Games scored above 20: " + gamesAbove20 + ".";
    }
}
