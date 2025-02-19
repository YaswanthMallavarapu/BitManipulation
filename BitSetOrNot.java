class CheckBit {
    // Function to check if Kth bit is set or not.
    static boolean checkKthBit(int n, int k) {
        int num = 1 << k;
        return ((num & n) != 0);
    }
}