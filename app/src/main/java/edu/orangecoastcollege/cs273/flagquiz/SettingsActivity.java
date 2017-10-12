package edu.orangecoastcollege.cs273.flagquiz;

import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class SettingsActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        // Enable home button (not enabled by default)
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // user our fragment to fill out the content
        getFragmentManager()
                .beginTransaction()
                .replace(android.R.id.content, new SettingsActivityFragment())
                .commit();
    }

    public static class SettingsActivityFragment extends PreferenceFragment
    {
        // creates preferences GUI from preferences.xml file in res/xml
        @Override
        public void onCreate(@Nullable Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            addPreferencesFromResource(R.xml.preferences); // load from XML
        }
    }

}
