package AnimalKingdom;

public abstract class Animals{
    public static int maxId = 1;
    protected int id;
    protected String name;
    protected int yearNamed;
    protected String move;
    protected String breathe;
    protected String reproduce;

    public Animals(String name, int yearNamed, String move, String breathe, String reproduce) {
        id = maxId;
        maxId++;
        this.name = name;
        this.yearNamed = yearNamed;
        this.move = move;
        this.breathe = breathe;
        this.reproduce = reproduce;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getYearNamed(){
        return yearNamed;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearNamed(int yearNamed) {
        this.yearNamed = yearNamed;
    }

    public String getMove() {
        return move;
    };

    public String getBreath() {
        return breathe;
    };

    public String getReproduce() {
        return reproduce;
    }
    
    @Override
    public String toString() {
        return ("Animals{id=" + id + ", name=" + name + ", yearNamed=" + yearNamed + "},\n");
    }
}