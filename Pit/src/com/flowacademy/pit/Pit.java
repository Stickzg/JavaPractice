package com.flowacademy.pit;

import com.flowacademy.pit.exceptions.PopException;
import com.flowacademy.pit.exceptions.PushException;
import com.sun.org.apache.bcel.internal.generic.POP;

import java.util.Arrays;

public class Pit {

    int[] pitInt;
    int head = 0;

    public Pit(int pitIntSize) {
        this.pitInt = new int [pitIntSize];
    }

    public Pit() {
        this.pitInt= new int[10];
    }

    public int[] getPitInt() {
        return pitInt;
    }

    public void setPitInt(int[] pitInt) {
        this.pitInt = pitInt;
    }

    public void push(int pushedInt) throws PushException {
        if(head < pitInt.length) {
            System.out.println("Added: " + pushedInt);
            pitInt[head] = pushedInt;
            head++;
        } else {
            throw new PushException("Pit overflow");
        }

    }

    public int pop () throws PopException {
        if(head > 0) {
            head--;
            int temp = pitInt[head];
            System.out.println("removed : " + temp);
            return temp;
        } else {
            throw new PopException("Empty pit");
        }
    }


    public String toString() {
        return "com.flowacademy.pit.Pit(" +
                "members:" + Arrays.toString(pitInt) +
                ')';
    }

    public static void main(String[] args) {
        Pit verem = new Pit();

        System.out.println(verem.toString());

        try {
            verem.push(10);
            verem.pop();
            verem.pop();
        } catch (PushException | PopException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Ez egy verem volt!");
        }



    }

}



