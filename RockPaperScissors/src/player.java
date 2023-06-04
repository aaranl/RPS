public class player {
    private String answer;
    public player() {

    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }

    public String compare(player otherPlayer) {

        int selection1 = this.getAnswer().length();
        int selection2 = otherPlayer.getAnswer().length();
        // Rock = 4, Paper = 5, Scissors = 8

        if (selection1 + selection2 == 9) {
            if (this.getAnswer().equalsIgnoreCase("paper")) {
                return "Player1 Wins!";
            } else if (otherPlayer.getAnswer().equalsIgnoreCase("paper")) {
                return "Player2 Wins!";
            }
        }
        else if (selection1 + selection2 == 12) {
            if (this.getAnswer().equalsIgnoreCase("rock")) {
                return "Player1 Wins!";
            } else if (otherPlayer.getAnswer().equalsIgnoreCase("rock")) {
                return "Player2 Wins!";
            }
        }
        else if (selection1 + selection2 == 13) {
            if (this.getAnswer().equalsIgnoreCase("scissors")) {
                return "Player1 Wins!";
            } else if (otherPlayer.getAnswer().equalsIgnoreCase("scissors")) {
                return "Player2 Wins!";
            }
        }
        return "whatever";

    }
}
