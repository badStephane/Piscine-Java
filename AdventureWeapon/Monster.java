public class Monster extends Character {
    public Monster(String name, int maxHealth, Weapon weapon) {
        super(name, maxHealth, weapon);
    }
    public void attack(Character character) {
        if (getWeapon() == null) {
            character.takeDamage(7);
        } else {
            character.takeDamage(getWeapon().getDamage());
        }
    }

    public void takeDamage(int damage){
        int effectiveDamage = Math.max(0, (int)(damage * 0.8));
        setCurrentHealth(Math.max(0, getCurrentHealth() - effectiveDamage));
    }

    @Override
    public String toString() {
        if (this.getCurrentHealth() == 0){
            return String.format(("%s is a monster and is dead"), this.getName());
        }
        return String.format(("%s is a monster with %d HP. He has the weapon %s"), this.getName(), this.getCurrentHealth(), getWeapon().toString());
    }

}
