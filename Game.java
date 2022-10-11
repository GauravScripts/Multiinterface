public class Game implements MyInterface, Picture {
    public void display(){
        System.out.println("Welcome to the came");
    }
    public void gameLogic(){
        System.out.println("Rules of the game");

    }
    public void playerData(){
        System.out.println("Name ID mailID Score");
    }

    @Override
    public void displayColor() {
        System.out.println("#fff");
    }

    @Override
    public void symbols() {
        System.out.println("@#$%^");
    }

    @Override
    public void emojis() {
        System.out.println("🚗🚜🚞😁🙄😣");
    }

    public static void main(String[] args) {
        Game obj = new Game();
        obj.display();
        obj.gameLogic();
        obj.playerData();

    }
}
