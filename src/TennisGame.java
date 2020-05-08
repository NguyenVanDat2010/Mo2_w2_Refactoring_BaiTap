public class TennisGame {

    public static final int ZERO = 0;
    public static final int ONE = 1;
    public static final int TWO = 2;
    public static final int THREE = 3;
    public static final String SUBTRACTION = "-";

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        String score = "";
        int tempScore= ZERO;
        if (player1Score==player2Score)
        {
            switch (player1Score)
            {
                case ZERO:
                    score = "Love-All";
                    break;
                case ONE:
                    score = "Fifteen-All";
                    break;
                case TWO:
                    score = "Thirty-All";
                    break;
                case THREE:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;
            }
        }
        else if (player1Score>=4 || player2Score>=4)
        {
            int minusResult = player1Score-player2Score;
            if (minusResult==1) score ="Advantage player1";
            else if (minusResult ==-1) score ="Advantage player2";
            else if (minusResult>=2) score = "Win for player1";
            else score ="Win for player2";
        }
        else
        {
            for (int i = 1; i< THREE; i++)
            {
                if (i==ONE) tempScore = player1Score;
                else { score+= SUBTRACTION; tempScore = player2Score;}
                switch(tempScore)
                {
                    case ZERO:
                        score+="Love";
                        break;
                    case ONE:
                        score+="Fifteen";
                        break;
                    case TWO:
                        score+="Thirty";
                        break;
                    case THREE:
                        score+="Forty";
                        break;
                }
            }
        }
        return score;
    }
}
