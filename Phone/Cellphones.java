public class Cellphones extends Electronics{
    private Buttons myButtons;
    private int volume;
    private final int MIN_VOLUME = 1;
    private final int MAX_VOLUME = 10;
    public Cellphones(){
        super();
        volume = MIN_VOLUME;
    }


    public Buttons getMyButtons() {
        return myButtons;
    }

    public void setMyButtons(Buttons myButtons) {
        this.myButtons = myButtons;
    }



    public void pushButton(Buttons myButtons){
        if(myButtons.getType() == ButtonType.POWER){
            changeScreenState();
        }else{
            if(volume == MAX_VOLUME){
                volume = MIN_VOLUME;
            }else{
                volume++;
            }
        }
    }


    @Override
    public String toString() {
        return "Cellphones{" +
                "volume=" + volume +
                ", State=" + getMyScreen().getState() +
                '}';
    }
}
