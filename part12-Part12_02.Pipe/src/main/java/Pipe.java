import java.util.ArrayList;

public class Pipe<T> {
  private ArrayList<T> list;

    public Pipe() {
        this.list = new ArrayList<>();
    }

    public void putIntoPipe(T value) {
      list.add(value);
    }

    public T takeFromPipe() {
      T removed = list.remove(list.size());

      return removed;
    }

    public boolean isInPipe() {
        return list.isEmpty();
    }
} 
