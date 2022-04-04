package org.humanbooster.monprojet.model;


public class Orc {

    public int force;
    public int health;
    public String name = "NameLess";


    public Orc(int force, int health) {
        this.force = force;
        this.setHealth(health);
    }

    public Orc(int force, int health, String name) {
        this(force, health);
        this.name = name;
    }

    public int attack(Orc orc){
        return health -= this.force;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = Math.min(health, 100);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Orc{");
        sb.append("force=").append(force);
        sb.append(", health=").append(health);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
