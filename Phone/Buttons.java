public class Buttons {
    private ButtonType type;

    public Buttons(ButtonType type) {
        this.type = type;
    }


    public ButtonType getType() {
        return type;
    }

    public void setType(ButtonType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "" + type;
    }
}
