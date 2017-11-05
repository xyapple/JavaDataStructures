package JavaOOP.abstractclass;

public class Inital {
    public static void main(String[] args) {
        System.out.println("============== Abstract Class =======");
        Telphone cell = new cellphone();
        cell.call();
        cell.message();
        
        Telphone smart = new smartPhone();
        smart.call();
        smart.message();
        System.out.println("============== Interface Part 1=========");
        IPlayGame playgame1 = new smartPhone();
        playgame1.playGame();
        IPlayGame playGame2 = new Psp();
        playGame2.playGame();
        System.out.println("============== Interface Part 2 =========");
        IPlayGame playGame3 = new IPlayGame() {
            @Override
            public void playGame() {
                System.out.println("Use the Interface anonymous method");
            }
        };
        playGame3.playGame();
        
    }
    
}
