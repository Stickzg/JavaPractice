import java.util.NoSuchElementException;

public class Lista implements Iterable<Integer> {
    private int[] lista;
    int length;

    public Lista(int[] lista) {
        this.lista = lista;
        this.length = lista.length;
    }

    public Lista() {
        this.lista=new int[110];
        this.length=0;
    }

    public void add (int value) {
        lista[length] = value;
        length++;
    }

    public int getsize(){
        return this.length;
    }

    public Iterator iterator() {
        return new Iterator(this, 0);
    }

    class Iterator implements java.util.Iterator<Integer> {
        Lista peldany;
        int sp;

        public Iterator(Lista peldany, int sp) {
            this.peldany = peldany;
            this.sp = sp;
        }

        public boolean hasNext () {
            return sp < peldany.getsize();
        }

        public Integer next () throws NoSuchElementException {
            if (hasNext()) {
                return peldany.lista[sp++];
            }
            throw new NoSuchElementException("Túlindexeltél!");
        }
    }

    public static void main(String[] args) throws Exception {
        Lista ezEgylista = new Lista();
        ezEgylista.add(1);
        ezEgylista.add(2);
        ezEgylista.add(3);

        /*
        Iterator iteralo = ezEgylista.iterator();

        while (iteralo.hasNext()) {
            System.out.println(iteralo.next());
        }
        */

        for(Integer i: ezEgylista) {
            System.out.println(i);
        }
    }

}
