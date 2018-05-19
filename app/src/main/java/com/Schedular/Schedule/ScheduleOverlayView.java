package com.Schedular.Schedule;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.Schedular.R;


public class ScheduleOverlayView extends RelativeLayout
{
    public ScheduleOverlayView ( Context context )
    {
        this ( context, null );
    }


    public ScheduleOverlayView ( Context context, AttributeSet attrs )
    {
        this ( context, attrs, 0 );
    }


    public ScheduleOverlayView ( Context context, AttributeSet attrs, int defStyle )
    {
        super ( context, attrs, defStyle );
        inflateLayout ( context );
    }


    // Inflates the Custom View Layout
    private void inflateLayout ( Context context )
    {

        final LayoutInflater inflater = LayoutInflater.from ( context );

        // Generates the layout for the view
        // TODO -> Replace With Our "Schedule Layout"
        inflater.inflate ( R.layout.schedule_bitmap_layout, this, true );
    }

    // TODO -> Our Custom View Methods for Uppdating Information
    public void setLocation ( String location )
    {
        TextView locationTextView = ( TextView ) findViewById ( R.id.scheduleLocationTextView );
        locationTextView.setText ( location );
    }

    public void setCourse ( String course )
    {
        TextView courseTextView = ( TextView ) findViewById ( R.id.scheduleCourseTextView );
        courseTextView.setText ( course );
    }

    public void setSchedule ( String schedule )
    {
        TextView scheduleTextView = ( TextView ) findViewById ( R.id.scheduleScheduleTextView );
        scheduleTextView.setText ( schedule );
    }

    public void setInstructor ( String instructor )
    {
        TextView instructorTextView = ( TextView ) findViewById ( R.id.scheduleInstructorTextView );
        instructorTextView.setText ( instructor );
    }
}
