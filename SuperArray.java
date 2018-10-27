public class SuperArray {

//phase 1
private String[] data;
private int size;

SuperArray(){
        data = new String[10];
}

public void clear(){
        size = 0;
}

public int retSize(){
        return size;
}

public int size(){
        int output = 0;
        for (int x = 0; x < size; x++) {
                if (this.data[x] != null) {
                        output++;
                }
        }
        return output;
}

public boolean isEmpty(){
        if (size() == 0) {
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
        for (int x = 0; x < size(); x++) {
                output += this.data[x] + ", ";
        }
        return output + "]";
}

public String toStringDebug(){
        String output = "";
        for (int x = 0; x < this.data.length; x++) {
                output += this.data[x] + ", ";
        }
        return output;
}

public String get(int index){
        if(index < 0 || index >= size()) {
                throw new ArrayIndexOutOfBoundsException();
        }
        return data[index];
}

public String set(int index, String element){
        if (index < 0 || index >= size()) {
                throw new ArrayIndexOutOfBoundsException();
        }
        String output;
        output = data[index];
        data[index] = element;
        return output;
}


//phase 2
public void resize(){
        String[] output = new String[data.length * 2 + 1];
        for (int x = 0; x < size(); x++) {
                output[x] = data[x];
        }

        this.data = output;
}

//phase 3
public boolean contains(String element){
        for (int x = 0; x < size(); x++) {
                if (data[x] == element) {
                        return true;
                }
        }
        return false;
}

public int indexOf(String element){
        for (int x = 0; x < size(); x++) {
                if (data[x] == element) {
                        return x;
                }
        }
        return -1;
}

public int lastIndexOf(String element){
        for (int x = 1; x - size() != 1; x++) {
                if (data[size() - x] == element) {
                        return size() - x;
                }
        }
        return -1;
}

public void add(int index, String element){
        if (index < 0 || index >= size()) {
                throw new ArrayIndexOutOfBoundsException();
        }
        String[] output = new String[size() + 3];
        for (int x = 0; x < index; x++) {  //copies data to output until index
                output[x] = data[x];
        }
        for (int x = index; x < size(); x++) { //copies remaining data to output
                output[x + 1] = data[x];   //leaves one space for element
        }
        output[index] = element;
        data = output;
        size++;
}

public void remove(int index){
        if (index < 0 || index >= size()) {
                throw new ArrayIndexOutOfBoundsException();
        }
        String[] output = new String[size() + 3];
        for (int x = 0; x < index; x++) {  //copies data to output until index
                output[x] = data[x];
        }
        for (int x = index; x < size(); x++) {
                output[x] = data[x + 1];
        }
        data = output;
}

public void remove(String element){
        int idx = indexOf(element);
        if (idx < 0 || idx >= size()) {
                throw new ArrayIndexOutOfBoundsException();
        }
        remove(idx);
}

}
