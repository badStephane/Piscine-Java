public class Templar extends Character implements Healer, Tank {
    private final int healCapacity;
    private final int shield;

    public Templar(String name, int maxHealth, int healCapacity, int shield, Weapon weapon) {
        super(name, maxHealth, weapon);
        this.healCapacity = healCapacity;
        this.shield = shield;
    }
    public int getHealCapacity(){
        return healCapacity;
    }
    public void heal(Character character) {
        int newHealth = character.getCurrentHealth() + healCapacity;
        character.setCurrentHealth(Math.min(newHealth, character.getMaxHealth()));
    }

    public int getShield() {
        return shield;
    }

    public void attack(Character character) {
        if(getWeapon() == null){
            heal(this);
            character.takeDamage(6);
        }
        character.takeDamage(getWeapon().getDamage());
    }

    public void takeDamage(int damage){
        int effectiveDamage = Math.max(0, (int)(damage - shield));
        setCurrentHealth(Math.max(0, getCurrentHealth() - effectiveDamage));
    }

    @Override
    public String toString(){
        if(this.getCurrentHealth() == 0){
            return String.format("%s has been beaten, even with its %d shield. So bad, it could heal %d HP.", this.getName(), shield, healCapacity);
        }
        return String.format("%s is a strong Templar with %d HP. It can heal %d HP and has a shield of %d. . He has the weapon %s", this.getName(), this.getCurrentHealth(), healCapacity, shield, getWeapon().toString());
    }
}
