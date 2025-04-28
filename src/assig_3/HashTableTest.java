package assig_3;

import java.util.Random;

public class HashTableTest {
    public static void main(String[] args) {
        MyHashTable<MyTestingClass, Student> table = new MyHashTable<>(997);
        Random random = new Random();

        for (int i = 0; i < 10000; i++) {
            int id = i;
            MyTestingClass key = new MyTestingClass(id);
            Student value = new Student("Student" + i);
            table.put(key, value);
        }

        // We find the minimum and maximum sizes of baskets
        int minBucketSize = Integer.MAX_VALUE;
        int maxBucketSize = Integer.MIN_VALUE;

        for (int i = 0; i < table.getBucketCount(); i++) {
            int bucketSize = table.getBucketSize(i);
            System.out.println("Bucket " + i + ": " + bucketSize + " elements");
            if (bucketSize < minBucketSize) minBucketSize = bucketSize;
            if (bucketSize > maxBucketSize) maxBucketSize = bucketSize;
        }

        System.out.println("Total elements: " + table.getSize());
        System.out.println("Min bucket size: " + minBucketSize);
        System.out.println("Max bucket size: " + maxBucketSize);
    }
}