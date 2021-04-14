/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bryan
 */
public class Game {
    
    private String team1;
    private String team2;
    private int score1;
    private int score2;
    
    public Game(String team1, String team2, int score1, int score2){
        this.team1 = team1;
        this.team2 = team2;
        this.score1 = score1;
        this.score2 = score2;
       }
    
    public boolean hasTeam(String team){
        return team1.equals(team) || team2.equals(team);
    }
    
    public String winner(){
        return score1 > score2 ? team1 : team2;
    }
}
