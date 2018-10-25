public class Driver{

  public static void main(String[] args) {
    SuperArray t = new SuperArray();
    System.out.println("toString of object t");
    System.out.println(t);

    System.out.println("adding 4");
    t.add("4");
    System.out.println("object t and its size");
    System.out.println(t);
    System.out.println(t.size());
    System.out.println("adding more elements");
    t.add("cat");
    t.add("fish");
    t.add("barbarian");
    System.out.println("obj t and its size");
    System.out.println(t);
    System.out.println(t.size());
    System.out.println("testing get");

    System.out.print("at 0: ");
    System.out.println(t.get(0));

    System.out.print("at 1: ");
    System.out.println(t.get(1));

    System.out.print("at 2: ");
    System.out.println(t.get(2));

    System.out.print("at 3: ");
    System.out.println(t.get(3));

    System.out.print("at 4: ");
    System.out.println(t.get(4));

    System.out.println(t.get(6));
    System.out.print("at 6: ");

    System.out.println("");
    System.out.println("");


    System.out.println("testing set");
    System.out.println(t);

    System.out.println("adding trubbish at 0");
    t.set(0, "trubbish");
    System.out.println(t);
    System.out.println("");


    System.out.println("adding skitty at 5; should throw error");
    t.set(5, "skitty");
    System.out.println(t);
    System.out.println("");

    System.out.println("adding pikapika at 3");
    t.set(3, "pikapika");
    System.out.println(t);
    System.out.println("");

    System.out.println("adding maneky at 4");
    t.set(4, "maneky");
    System.out.println(t);
    System.out.println("");
  }
}
