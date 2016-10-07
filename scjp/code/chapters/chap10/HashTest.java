public class HashTest{
  public static void main(String[] args) {
      HashStore hs1 = new HashStore(89, 101);
      HashStore hs2 = new HashStore(75, 101);
      HashStore hs3 = new HashStore(89, 101);
      
      System.out.println("Hashcode for hs1: " + hs1.hashCode());
      System.out.println("Hashcode for hs2: " + hs2.hashCode());
      System.out.println("Hashcode for hs3: " + hs3.hashCode());

      if(hs1.equals(hs2)) {
         System.out.println("hs1 is equal to hs2");
      }else {
         System.out.println("hs1 is not equal to hs2");
      }

      if(hs1.equals(hs3)) {
         System.out.println("hs1 is equal to hs3");
      }else {
         System.out.println("hs1 is not equal to hs3");
      }

  }
}

class HashStore {
  private int key=0;
  private int value=0;
  private int storeSize = 10;
   HashStore(int key, int value){
      this.key=key;
      this.value=value;
   }
public boolean equals(Object obj) {
  if (!(obj instanceof HashStore)) {
    return false;
  }
   HashStore hs = (HashStore) obj;
   return (key==hs.key && value==hs.value);
}

public int hashCode() {
   return key%storeSize;
}

}