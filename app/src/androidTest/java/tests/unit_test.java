package tests;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;
import android.widget.TextView;

import com.android.labexcercise1.MainActivity;
import com.android.labexcercise1.R;

/**
 * Created by Jacqui on 4/19/2016.
 */
public class unit_test extends ActivityInstrumentationTestCase2<MainActivity> {
    MainActivity mainActivity;

    public unit_test() {
        super(MainActivity.class);
    }

    public void test_positives() {
        mainActivity = getActivity();

        int answer = mainActivity.sum(5,8);

        assertEquals(13, answer);
    }

    public void test_negatives() {
        mainActivity = getActivity();

        int answer = mainActivity.sum(-5, -8);

        assertEquals(-13, answer);
    }

    public void test_both() {
        mainActivity = getActivity();

        int answer = mainActivity.sum(-5,8);

        assertEquals(3, answer);
    }

}