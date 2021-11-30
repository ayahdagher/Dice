public class Die {
  private int value;
  private int numSides;

  public Die(int v, int n) {
    setValue(v);
    setNumSides(n);
  }

  public Die() {
    this(1, 6);
  }

  public int getValue() {
    return value;
  }

  public int getNumSides() {
    return numSides;
  }

  public boolean equals(Die d) {
    if (this.getValue() == d.getValue()) {
      return true;
    } else {
      return false;
    }
  }

  public void setValue(int v) {
    value = v;
  }

  public void setNumSides(int ns) {
    numSides = ns;
  }

  public int roll() {
    int value = (1 + (int) (numSides * Math.random()));
    this.setValue(value);
    return value;
  }

  public String toString() {
    return ("\nValue: " + value + "\nNumber of Sides: " + numSides);
  }
}
