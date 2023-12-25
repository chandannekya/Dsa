import java.io.*;

class GFG{
    private static final int MOD = 1000000007;

    public static int CountString(int X, int Y) {
        // Initialize a 2D DP array
        long[][] dp = new long[X + 1][Y + 1];

        // Base cases
        dp[1][0] = 1;
        dp[0][1] = 1;

        // Fill the DP table
        for (int i = 2; i <= X; i++) {
            for (int j = 0; j <= Y; j++) {
                dp[i][j] = (dp[i - 1][j] + dp[i - 2][j]) % MOD;
            }
        }

        for (int j = 0; j <= Y; j++) {
            for (int i = 2; i <= X; i++) {
                dp[i][j] = (dp[i][j] + dp[i - 1][j]) % MOD;
            }
        }

        return (int) dp[X][Y];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] input = br.readLine().trim().split(" ");
            int X = Integer.parseInt(input[0]);
            int Y = Integer.parseInt(input[1]);
            System.out.println(CountString(X, Y));
        }
    }
}

