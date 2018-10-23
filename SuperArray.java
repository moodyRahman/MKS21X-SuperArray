public class SuperArray{
  private String[] arraystg;

  SuperArray(String[] inp){
    arraystg = new String[inp.length];
    for (int x = 0; x < inp.length; x++){
      arraystg[x] = inp[x];
    }
  }

}
