public class Private {
  private String myField;

  public Private() {
    this.myField = "empty";
  }
  public Private(String myField) {
    this.myField = myField;
  }

  public String getMyField() {
    return this.myField;
  }

  public void setMyField(String value) {
    this.myField = value;
  }

}
