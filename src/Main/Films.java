package Main;

public class Films implements Comparable<Films> {
    private String name;
    private int year;

    public Films(String name, int year){
        this.name = name;
        this.year = year;
    }

    public String toString(){
        return name +", "+year;
    }

    @Override
    public int compareTo(Films f) {
        return this.year-f.year;
    }
}
