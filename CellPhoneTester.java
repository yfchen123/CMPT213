public class CellPhoneTester {
    public static void main(String[] args) {
        Screen newScreen = new Screen();
        Electronics newItem = new Electronics(newScreen);

        System.out.println(newItem.toString());
        Buttons power = new Buttons(ButtonType.POWER);
        Buttons volume = new Buttons(ButtonType.VOLUME);
        Cellphones myCell = new Cellphones();
        System.out.println(myCell.toString());
        myCell.pushButton(power);
        System.out.println(myCell.toString());
        myCell.pushButton(volume);
        System.out.println(myCell.toString());
    }
}
