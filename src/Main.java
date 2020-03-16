public class Main {
    public static void main(String[] args) {
        char[] symbols = {'7', '8', '9', 'J', 'Q', 'K','A'};
        char[] reel1 = new char[3];
        char[] reel2 = new char[3];
        char[] reel3 = new char[3];

        boolean[] winOnLines = {false, false, false, false, false};


        for (int i = 0; i < 3; i++) {
            reel1[i] = symbols[(int)(Math.random()*6)];
            reel2[i] = symbols[(int)(Math.random()*6)];
            reel3[i] = symbols[(int)(Math.random()*6)];
            System.out.println("  " + reel1[i] + "  " + reel2[i] + "  " + reel3[i] + "  ");
        }

        // Line 1
        if (reel1[0] == reel2[0] && reel1[0] == reel3[0]){
            System.out.println("Win on line 1 yields €20");
            winOnLines[0] = true;
        }

        // Line 2
        if (reel1[1] == reel2[1] && reel1[1] == reel3[1]){
            System.out.println("Win on line 2 yields €20");
            winOnLines[1] = true;
        }

        // Line 3
        if (reel1[2] == reel2[2] && reel1[2] == reel3[2]){
            System.out.println("Win on line 3 yields €20");
            winOnLines[2] = true;
        }

        // Line 4
        if (reel1[0] == reel2[1] && reel1[0] == reel3[2]){
            System.out.println("Win on line 4 yields €20");
            winOnLines[3] = true;
        }

        // Line 5
        if (reel1[2] == reel2[1] && reel1[2] == reel3[0]){
            System.out.println("Win on line 4 yields €20");
            winOnLines[4] = true;
        }

        int winCount = 0;
        for (int i = 0; i < 5; i++) {
            if (winOnLines[i])
                winCount++;
        }

        System.out.println("Total win: €" + winCount*20);
        winCount = 0;
        for (int i = 0; i < winOnLines.length; i++) {
            winOnLines[i] = false;
        }
    }
}
