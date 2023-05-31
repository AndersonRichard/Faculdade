package models;

public class Moto {
    private boolean garupa;

    public boolean isGarupa() {
        return garupa;
    }

    public void setGarupa(boolean garupa) {
        this.garupa = garupa;
    }

    public void mudaGarupa(){

    }
    @Override
    public String toString() {
        return "Moto{" +
                "garupa=" + garupa +
                '}';
    }
}
