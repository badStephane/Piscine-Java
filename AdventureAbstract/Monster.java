public class Monster extends Character {
    public Monster(String name, int maxHealth) {
        super(name, maxHealth);
    }
    public void attack(Character character) {
        character.takeDamage(7);
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
        return String.format(("%s is a monster with %d HP"), this.getName(), this.getCurrentHealth());
    }

}
