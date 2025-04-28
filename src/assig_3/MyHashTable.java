package assig_3;

public class MyHashTable<K, V> {
    private class HashNode<K, V> {
        K key;
        V value;
        HashNode<K, V> next;

        public HashNode(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    private HashNode<K, V>[] chainArray;
    private int M = 11;
    private int size;

    public MyHashTable() {
        this.chainArray = (HashNode<K, V>[]) new HashNode[M];
        this.size = 0;
    }

    public MyHashTable(int M) {
        this.M = M;
        this.chainArray = (HashNode<K, V>[]) new HashNode[M];
        this.size = 0;
    }

    private int hash(K key) {
        return Math.abs(key.hashCode() % M);
    }

    public void put(K key, V value) {
        int index = hash(key);
        HashNode<K, V> node = chainArray[index];

        if (node == null) {
            chainArray[index] = new HashNode<>(key, value);
            size++;
            return;
        }

        while (node != null) {
            if (node.key.equals(key)) {
                System.out.println("Duplicate key found: " + key);
                node.value = value;
                return;
            }
            if (node.next == null) break;
            node = node.next;
        }

        node.next = new HashNode<>(key, value);
        size++;
    }

    public V get(K key) {
        int index = hash(key);
        HashNode<K, V> node = chainArray[index];

        while (node != null) {
            if (node.key.equals(key)) {
                return node.value;
            }
            node = node.next;
        }
        return null;
    }

    public V remove(K key) {
        int index = hash(key);
        HashNode<K, V> node = chainArray[index];
        HashNode<K, V> prev = null;

        while (node != null) {
            if (node.key.equals(key)) {
                V value = node.value;
                if (prev == null) {
                    chainArray[index] = node.next;
                } else {
                    prev.next = node.next;
                }
                size--;
                return value;
            }
            prev = node;
            node = node.next;
        }
        return null;
    }

    public boolean contains(V value) {
        for (int i = 0; i < M; i++) {
            HashNode<K, V> node = chainArray[i];
            while (node != null) {
                if (node.value.equals(value)) {
                    return true;
                }
                node = node.next;
            }
        }
        return false;
    }

    public K getKey(V value) {
        for (int i = 0; i < M; i++) {
            HashNode<K, V> node = chainArray[i];
            while (node != null) {
                if (node.value.equals(value)) {
                    return node.key;
                }
                node = node.next;
            }
        }
        return null;
    }

    public int getSize() {
        return size;
    }

    // New method to get the number of elements in a specific bucket
    public int getBucketSize(int index) {
        if (index < 0 || index >= M) {
            throw new IllegalArgumentException("Index out of bounds");
        }
        int bucketSize = 0;
        HashNode<K, V> node = chainArray[index];
        while (node != null) {
            bucketSize++;
            node = node.next;
        }
        return bucketSize;
    }

    // New method to get the number of buckets
    public int getBucketCount() {
        return M;
    }
}