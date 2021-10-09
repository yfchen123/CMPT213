public class Electronics {
    private Screen myScreen;

    public Electronics(){
        myScreen = new Screen();
    }
    public Electronics(Screen screen){
        myScreen = screen;
    }


    public Screen getMyScreen() {
        return myScreen;
    }

    public void setMyScreen(Screen myScreen) {
        this.myScreen = myScreen;
    }

    public void changeScreenState(){
        if(myScreen.getState() == ScreenState.OFF){
            myScreen.setState(ScreenState.ON);
        }else{
            myScreen.setState(ScreenState.OFF);
        }
    }


    @Override
    public String toString() {
        return "Electronics{" +
                "myScreen" + myScreen.toString() +
                '}';
    }
}
