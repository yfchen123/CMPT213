public class Screen {
    private ScreenType type;
    private ScreenState state;
    public Screen(){
        this.type = ScreenType.OLED;
        this.state = ScreenState.OFF;
    }
    public Screen(ScreenType type, ScreenState state){
        this.type = type;
        this.state = state;
    }

    public ScreenType getType() {
        return type;
    }

    public ScreenState getState(){ return state; }

    public void setState(ScreenState state){
        this.state = state;
    }

    public void setType(ScreenType type) {
        this.type = type;
    }

    public void turnOn(){
        this.state = ScreenState.ON;
    }

    public void turnOff(){
        this.state = ScreenState.OFF;
    }

    @Override
    public String toString() {
        return "{" +
                "type=" + type +
                ", state=" + state +
                '}';
    }
}
