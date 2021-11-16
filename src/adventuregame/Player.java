package adventuregame;

public class Player {

    private int hitPoints;
    private int strength;
    private int dexterity;
    private int intelligence;
    private int totalGold;

    public Player() {
        Dice d1 = new Dice();
        this.hitPoints = 20;
        this.strength = d1.getRoll(6) + d1.getRoll(6) + d1.getRoll(6);
        this.dexterity = d1.getRoll(6) + d1.getRoll(6) + d1.getRoll(6);
        this.intelligence = d1.getRoll(6) + d1.getRoll(6) + d1.getRoll(6);
        this.totalGold = 0;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getTotalGold() {
        return totalGold;
    }

    public void setTotalGold(int totalGold) {
        this.totalGold = totalGold;
    }

    @Override
    public String toString() {
        return 
                "Strength: " + this.strength + "\n\n"
                + "Dexterity: " + this.dexterity + "\n\n"
                + "Intelligence: " + this.intelligence + "\n\n"
                + "Hit Points: " + this.hitPoints + "\n\n\n"
                + "Total Gold: " + this.totalGold;
    }

}
