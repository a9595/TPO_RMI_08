import java.io.Serializable;

/**
  Created by tieorange (Andrii Kovalchuk) on 5/16/2015.
 */
public class My_Digit implements Serializable {
    private int number;

    public My_Digit(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public My_Digit add(My_Digit other) {
        int sum = this.number + other.getNumber();

        return new My_Digit(sum);
    }

    @Override
    public String toString() {
        return String.valueOf(number);
    }
}
