public class SuperArray{
  private String[] data;
  private int size;

  SuperArray(){
    data = new String[10];
  }

  public void clear(){
    size = 0;
  }

  public int size(){
    int output = 0;
    for (int x = 0; x < this.data.length; x++){
      if (this.data[x] != null){
        output++;
      }
    }
    return output;
  }

  public boolean isEmpty(){
    if (size() == 0){
      return true;
    }
    return false;
  }

  public void add(String element){
    if (size() == data.length) {
      this.resize();
    }
    this.data[size] = element;
    size++;
  }

  public String toString(){
    String output = "[";
    for (int x = 0; x < size(); x++){
      output += this.data[x] + ", ";
    }
    return output + "]";
  }

  public String toStringDebug(){
    String output = "";
    for (int x = 0; x < this.data.length; x++){
      output += this.data[x] + ", ";
    }
    return output;
  }

  public String get(int index){
    if (index < 0|| index >= size()){
      System.out.println("INVALID GET CALL");
      return null;
    }
    return data[index];
  }

  public String set(int index, String element){
    String output;
    if (index < 0 || index >= size()){
      System.out.println("INVALID SET CALL");
      return null;
    }
    output = data[index];
    data[index] = element;
    return output;
  }

  public void resize(){
    String[] output = new String[data.length * 2 + 1];
    for (int x = 0; x < size(); x++){
      output[x] = data[x];
    }

    this.data = output;
  }
}
