package homework_38;

import java.util.Comparator;

public class ScoreComparator implements Comparator<Sportsman> {
    @Override
    public int compare(Sportsman o1, Sportsman o2) {
        // String, Integer и все оберточные классы - реализуют интерфейс Comparable
        String score1 = o1.getScore();
        String score2 = o2.getScore();

        return score1.compareTo(score2);
      //  return Double.compare(s1.getScore(), s2.getScore());
    }
}
