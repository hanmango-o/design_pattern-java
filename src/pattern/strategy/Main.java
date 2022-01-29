package pattern.strategy;

public class Main {
    public static void main(String[] args) {
        GameCharactor character = new GameCharactor();
        character.attack();

        character.setWeapon(new Knife());
        character.attack();

        character.setWeapon(new Sword());
        character.attack();

        character.setWeapon(new Ax());
        character.attack();
    }
}
