import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card> {
    @Override
    public int compare(Card c1, Card c2) {
        // First, compare by suit (using ordinal to maintain suit order)
        int suitComparison = c1.getSuit().ordinal() - c2.getSuit().ordinal();
        if (suitComparison != 0) {
            return suitComparison;
        }
        // If suits are the same, compare by value
        return c1.getValue() - c2.getValue();
    }
}
