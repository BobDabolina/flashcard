public class Card{
    String question;
    String answer;

    public Card(){
        question = "";
        answer = "";
    }

    public void setQuestion(String text) {
        question = "";
    }

    public String getQuestion() {
        return question;
    }

    public void setAnswer(String text) {
        answer = "";
    }

    public String getAnswer() {
        return answer;
    }

    /**
     * Adds this card to a deck
     * @param deck is the target deck
     */
    public void addToDeck(Deck deck) {
        deck.addCard(this);
    }
}