import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Hand implements Comparable<Hand>{
  private List<Card> cards;


  public Hand() {
    this.cards = new ArrayList<>();
  }

  public void add(Card card) {
    this.cards.add(card);
  }

  public void print() {
    cards.forEach(System.out::println);
  }

  public void sort() {
     Collections.sort(cards);
  }

  public int getSum() {
      return cards.stream().mapToInt(Card::getValue).sum();
  }

  public int compareTo(Hand hand) {
    return Integer.compare(this.getSum(), hand.getSum());
  }


public void sortBySuit() {
        // Sort using BySuitInValueOrder comparator
        Collections.sort(cards, new Comparator<Card>() {
            @Override
            public int compare(Card c1, Card c2) {
                int suitComparison = c1.getSuit().ordinal() - c2.getSuit().ordinal();
                if (suitComparison != 0) {
                    return suitComparison; // Sort by suit first
                }
                return c1.getValue() - c2.getValue(); // Then by value
            }
        });
    }
}
