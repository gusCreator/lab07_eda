package heap;

public class HeapMax<E extends Comparable<E>> {
  
  private E[] arr;
  private int size;

  @SuppressWarnings("unchecked")
  public HeapMax(int initialSize) {
    this.size = 0;
    this.arr = (E[]) new Comparable[initialSize];
  }

  public void insert(E x) {
    arr[this.size] = x;
    for(int i = this.size++; i >= 0;){
      if(arr[i].compareTo(arr[(i - 1) / 2]) > 0){
        E temp = arr[i];
        arr[i] = arr[(i - 1) / 2];
        arr[(i - 1) / 2] = temp;
        i = (i - 1) / 2;
      }else{
        break;
      }
    }
  }

  public E extract() {
    if(isEmpty()) return null;
    E temp = arr[0];
    arr[0] = arr[this.size - 1];
    for(int i = 0; i * 2 + 1 < this.size && i * 2 + 2 < this.size;){
      if(arr[i * 2 + 1].compareTo(arr[i * 2 + 2]) > 0) {
        E tempe = arr[i];
        arr[i] = arr[i * 2 + 1];
        arr[i * 2 + 1] = tempe;
        i = i * 2 + 1;
      }else{
        E tempe = arr[i];
        arr[i] = arr[i * 2 + 2];
        arr[i * 2 + 2] = tempe;
        i = i * 2 + 2;
      }
    }
    this.size--;
    return temp;
  }

  public boolean isEmpty() {
    return this.size == 0;
  }

  public String toString() {
    if(isEmpty()) return "[]";
    String s = "[";
    for(E e : this.arr){
      s += e + ", ";
    }
    return s + "]";
  }


}
