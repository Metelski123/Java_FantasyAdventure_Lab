package characters;

public abstract class Fighter extends Character {

    private String name;
    private int maxHealth;
    private int currentHealth;

    public Fighter(String name, int maxHealth, int currentHealth) {
        super(name, maxHealth, currentHealth);
    }

}
