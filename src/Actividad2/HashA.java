package Actividad2;
import java.util.ArrayList;
import java.util.LinkedList;

public class HashA<E extends Comparable<E>> {

    protected class Element {
        int mark;
        Register<E> reg;

        public Element(int mark, Register<E> reg) {
            this.mark = mark;
            this.reg = reg;
        }
    }

    protected ArrayList<LinkedList<Element>> table;
    protected int m;

    public HashA(int n) {
        this.m = n;
        this.table = new ArrayList<>(m);
        for (int i = 0; i < m; i++) {
            this.table.add(new LinkedList<>());
        }
    }

    private int functionHash(int key) {
        return key % m;
    }

    public void insert(int key, E reg) {
        int hash = functionHash(key);
        table.get(hash).add(new Element(1, new Register<>(key, reg)));
    }

    public String toString() {
        String s = "Tabla HashA:\n";
        for (int i = 0; i < table.size(); i++) {
            LinkedList<Element> list = table.get(i);
            s += i + " --> ";
            if (!list.isEmpty()) {
                for (Element item : list) {
                    s += functionHash(item.reg.getKey()) + " --> " + item.reg.toString() + " ";
                }
                s += "\n";
            } else {
                s += "empty\n";
            }
        }
        return s;
    }
}
