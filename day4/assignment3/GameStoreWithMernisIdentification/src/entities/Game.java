package entities;

public class Game {
    int id = 1;
    String name;
    String detail;
    double price;
    String type;

    private static Game game;

    public Game(int id, String name, String detail, double price, String type) {
        this.id = id;
        this.name = name;
        this.detail = detail;
        this.price = price;
        this.type = type;
    }

    private Game() {

    }

    public static Game getInstance() {
        if (game == null)
            game = new Game();

        return game;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDetail() {
        return name +
                "\n-------------" +
                "\n"
                + detail
                +
                "\n------------------------------\n" +
                "Type of game:" + type +
                "\n------------------------------\n"
                + "Price: " + price +" TRY";
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

}
