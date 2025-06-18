package day2_2605;

public class HeapInfo {
    public static void main(String[] args) {
        long heapSize = Runtime.getRuntime().totalMemory();
        long heapMaxSize = Runtime.getRuntime().maxMemory();
        System.out.println("Heap Size (bytes): " + heapSize);
        System.out.println("Max Heap Size (bytes): " + heapMaxSize);
        System.out.println("Heap Size (MB): " + (heapSize / 1024 / 1024));
        System.out.println("Max Heap Size (MB): " + (heapMaxSize / 1024 / 1024));
    }
}