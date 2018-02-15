package com.hfad.workout;

/**
 * Created by vibhav on 13/2/18.
 */

public class Workout {
    private String name;
    private String description;

    public static final Workout[] workouts ={
            new Workout("The Limb Loosener","5 handstand pushups\n 10 1-legged squats\n 15 pull-ups"),
            new Workout("Core Agony","100 handstand pushups\n 100 1-legged squats\n 18 pull-ups"),
            new Workout("The Wimp Special","15 handstand pushups\n 1 1-legged squat\n 5 pull-ups"),
            new Workout("Strength and Length","500 metre run\n 2 kettle ball swings\n 21 pull-ups"),
    };

    private Workout(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return this.name;
    }
}
