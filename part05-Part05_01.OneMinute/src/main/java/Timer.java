/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bryan
 */
public class Timer {

    private ClockHand seconds;
    private ClockHand hundos;
    
    public Timer() {
        this.hundos = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }

    public void advance() {
        this.hundos.advance();

        if (this.hundos.value() == 0) {
            this.seconds.advance();
        }
    }
    
    public String toString(){
        return this.seconds + ":" + this.hundos; 
    }

}
