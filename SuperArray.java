public class SuperArray{
  private String[] arraystg;

  SuperArray(String[] inp){
    arraystg = new String[inp.length];
    for (int x = 0; x < inp.length; x++){
      arraystg[x] = inp[x];
    }
  }

  SuperArray(){
    arraystg = new String[10];
  }

  public void clear(){
    arraystg = new String[0];
  }

  public boolean isEmpty(){
    if (this.arraystg.length == 0){
      return true;
    }
    return false;
  }

  public int size(){
    int output = 0;
    for (int x = 0; x < this.arraystg.length; x++){
      if (arraystg[x] != null){
        output++;
      }
    }
    return output;
  }

  public String set(int index, String element){
    String temp = this.arraystg[index];
    this.arraystg[index] = element;
    return temp;
  }

  public String toString(){
    String output = "";
    for (int x = 0; x < arraystg.length; x++){
      output += arraystg[x];
    }
    return "[" + output + "]";
  }

  public boolean contains(String element){
    for (int x = 0; x < this.arraystg.length; x++){
      if (arraystg[x] == element) {
        return true;
      }
    }
    return false;
  }

  public boolean add(String element){
    String[] output = new String[this.arraystg.length + 1];
    output[output.length - 1] = element;
    return true;
  }


}
