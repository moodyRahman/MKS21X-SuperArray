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

    System.out.println("");
    System.out.println("testing get");

    System.out.print("at 0: ");
    System.out.println(t.get(0));

    System.out.print("at 1: ");
    System.out.println(t.get(1));

    System.out.print("at 2: ");
    System.out.println(t.get(2));

    System.out.print("at 3: ");
    System.out.println(t.get(3));

    //System.out.print("at 4: ");
    //System.out.println(t.get(4));

    //System.out.println(t.get(99));
    //System.out.print("at 6: ");

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

    System.out.println("");
    System.out.println("testing isEmpty()");
    SuperArray d = new SuperArray();
    System.out.println(d.isEmpty());
    System.out.println(t.isEmpty());

    System.out.println("");
    System.out.println("testing add extender");
    SuperArray s = new SuperArray();
    for (int x = 0; x < 10; x++){
      s.add("foop");
    }
    System.out.println(s);
    System.out.println(s.size());
    s.add("eric lin");
    System.out.println(s);
    System.out.println(s.size());
    s.add("roosevelt");
    System.out.println(s);
    System.out.println(s.size());

    System.out.println("---------------");
    s.clear();
    System.out.println(s.size());
    System.out.println(s.retSize());
    System.out.println(s);

    s.add("wack");
    System.out.println(s);

    System.out.println("---------------");

    System.out.println("");
    System.out.println("testing indexOf");
    t.add("cat");
    t.add("foop");
    t.add("bat");
    t.add("qwe");
    t.add("iop");
    t.add("naught");
    t.add("healthfirst");
    t.set(0, "cat");
    System.out.println(t);
    System.out.println(t.indexOf("cat"));
    t.set(0, "frick");
    System.out.println(t);
    System.out.println(t.indexOf("cat"));
    System.out.println(t.indexOf("aaaaaaaa"));
    System.out.println(t.indexOf("naught"));

    System.out.println("");
    System.out.println("lastIndexOf testing");
    System.out.println(t.lastIndexOf("cat"));
    System.out.println(t.lastIndexOf("aaaaaaaa"));
    System.out.println(t.lastIndexOf("healthfirst"));
    System.out.println(t.lastIndexOf("frick"));
    System.out.println(t.lastIndexOf("foop"));

    System.out.println("");
    System.out.println("testing advanced add");
    System.out.println(t.toStringDebug());
    t.add(2, "aaa");
    System.out.println(t.toStringDebug());
  }
}
