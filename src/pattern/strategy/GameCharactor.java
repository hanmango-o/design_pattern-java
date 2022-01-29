package pattern.strategy;

public class GameCharactor {
    // 접근점
    private Weapon weapon;

    // 교환 가능
    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    // 델리게이트
    public void attack() {
        if(weapon == null) {
            System.out.println("맨손 공격");
        } else {
            weapon.attack();
        }
    }
}
