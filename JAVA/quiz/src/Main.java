class Main{
    static int countWays(int n)
    {
        int arr[] = new int[n + 1];
        arr[0] = arr[1] = arr[2] = 1;
        arr[3] = 2;
        for (int i = 4; i <= n; i++)
            arr[i] = arr[i - 1] + arr[i - 3]
                    + arr[i - 4];

        return arr[n];
    }
    public static void main(String[] args)
    {
        int n = 4;
        System.out.println(countWays(n));
    }
}