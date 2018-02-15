package com.hfad.workout;


import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.content.Context;
import android.widget.ListView;

public class WorkoutListFragment extends ListFragment {

    static interface Listener{
        void itemClicked(long id);
    };

    private Listener listener;

    public WorkoutListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String names[] = new String[Workout.workouts.length];

        for (int i = 0; i< names.length; i++){
            names[i]= Workout.workouts[i].getName();
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(inflater.getContext(),android.R.layout.simple_list_item_1, names);

        setListAdapter(adapter);

        return super.onCreateView(inflater,container,savedInstanceState);
    }

    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        this.listener = (Listener)context;
    } // gets called when fragment is attached to the activity

    @Override
    public void onListItemClick(ListView listView, View itemView, int position, long id){
        if(listener != null){
            listener.itemClicked(id);
        } // tell the listener when an item gets clicked...
    }

}
