package cat.jgervas.locationsample;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by jgervas on 28/11/2017.
 */

public class SettingsFragment extends PreferenceFragment {

    public SettingsFragment() {  }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Load the preferences from an XML resource
        addPreferencesFromResource(R.xml.preferences);

    }

}
