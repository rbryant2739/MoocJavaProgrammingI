/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bryan
 */
public class Counter {

    private int value;

    public Counter(int startValue) {
        this.value = startValue;
    }

    public Counter() {
        this.value = 0;
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        value++;
    }

    public void increase(int amount) {
        if (amount > 0) {
            value += amount;
        }
    }

    public void decrease() {
        value--;
    }

    public void decrease(int amount) {
        if (amount > 0) {
            value -= amount;
        }
    }
}
