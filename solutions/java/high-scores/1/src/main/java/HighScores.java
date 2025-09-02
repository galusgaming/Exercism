import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class HighScores {

        private List<Integer> highScore;
    public HighScores(List<Integer> highScores) {
        this.highScore = highScores;
    }

    List<Integer> scores() {
        return highScore;
    }

    Integer latest() {
        return highScore.get(highScore.size() - 1);
    }

    Integer personalBest() {
        return Collections.max(highScore);
    }

    List<Integer> personalTopThree() {
        return highScore.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());

    }

}
