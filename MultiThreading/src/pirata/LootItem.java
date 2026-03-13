package pirata;

public class LootItem {
    private String name;
    private double value;

    public LootItem(String name, double value){
        this.name = name;
        this.value = value;
    }

    public String toString(){
        return "( " + name + ", " + value + " )";
    }
}
