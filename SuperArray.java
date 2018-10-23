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
    return this.arraystg.length;
  }

  
}
