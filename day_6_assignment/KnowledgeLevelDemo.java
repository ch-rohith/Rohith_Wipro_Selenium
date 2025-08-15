package day_6_assignment;

public class KnowledgeLevelDemo {

    enum KnowledgeLevel {
        BEGINNER, ADVANCED, PROFESSIONAL, MASTER;

        public static KnowledgeLevel fromScore(int score) {
            if (score >= 0 && score <= 3) {
                return BEGINNER;
            } else if (score <= 6) {
                return ADVANCED;
            } else if (score <= 9) {
                return PROFESSIONAL;
            } else if (score == 10) {
                return MASTER;
            } else {
                throw new IllegalArgumentException("Score must be between 0 and 10");
            }
        }
    }

    public static void main(String[] args) {

        int[] testScores = {0, 3, 4, 6, 7, 9, 10};

        for (int score : testScores) {
            KnowledgeLevel level = KnowledgeLevel.fromScore(score);
            System.out.println("Score: " + score + " → Level: " + level);
        }

        
    }
}
