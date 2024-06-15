
public class Cat {

    private final String Name;
    private final int Age;
    private final String OwnerName;

    public Cat(String Name, int Age, String OwnerName) {
        this.Name = Name;
        this.Age = Age;
        this.OwnerName = OwnerName;
    }

    public String getName() { return this.Name; }

    public int getAge() { return this.Age; }

    public String getOwnerName() { return this.OwnerName; }

    public void Meow() { System.out.println("Meow!"); }

    public void MilkLap() { System.out.println("Lap"); }

    public void Jump() { System.out.println("Jump!"); }

}
