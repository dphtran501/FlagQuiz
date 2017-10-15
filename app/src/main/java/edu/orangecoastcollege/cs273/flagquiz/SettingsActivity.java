package edu.orangecoastcollege.cs273.flagquiz;

import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * This activity allows the user to specify the regions to include and the number of buttons to
 * display in <code>MainActivity</code>.
 *
 * @author Derek Tran
 * @verion 1.0
 * @since October 12, 2017
 */
public class SettingsActivity extends AppCompatActivity
{

    /**
     * Initializes <code>SettingsActivity</code> by inflating its UI.
     *
     * @param savedInstanceState Bundle containing the data it recently supplied in
     *                           onSaveInstanceState(Bundle) if activity was reinitialized after
     *                           being previously shut down. Otherwise it is null.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        // Enable home button (not enabled by default)
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // use our fragment to fill out the content
        getFragmentManager()
                .beginTransaction()
                .replace(android.R.id.content, new SettingsActivityFragment())
                .commit();
    }

    /**
     * Shows a hierarchy of <code>Preference</code> objects as lists. Used to deal with preferences
     * in applications.
     */
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
