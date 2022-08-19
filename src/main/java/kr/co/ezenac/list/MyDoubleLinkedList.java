package kr.co.ezenac.list;

public class MyDoubleLinkedList<T> implements IList<T> {

    private class Node {
        T data;
        Node prev;
        Node next;

        public Node(T data) {
            this.data = data;
        }

        public Node(T data, Node prev, Node next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }


    @Override
    public void add(T t) {

    }

    @Override
    public void insert(int index, T t) {

    }

    @Override
    public void clear() {

    }

    @Override
    public boolean delete(T t) {
        return false;
    }

    @Override
    public boolean deleteByIndex(int index) {
        return false;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public int indexOf(T t) {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(T t) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }
}
