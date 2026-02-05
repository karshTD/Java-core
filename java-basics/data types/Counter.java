class Counter {
    static int count = 0;
    Counter() {
        count++;  // All objects share the same count
    }
}
