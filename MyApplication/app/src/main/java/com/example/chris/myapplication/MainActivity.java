package com.example.chris.myapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showHomeScreen();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    // CAM

    public void setAsProductiveActivity(View view)
    {
        ((RadioButton) findViewById(R.id.camProductiveActivityNo)).setChecked(false);
    }

    public void setAsUnproductiveActivity(View view)
    {
        ((RadioButton) findViewById(R.id.camProductiveActivityYes)).setChecked(false);
    }

    public void setActivityAlarmEnabled(View view)
    {
        ((RadioButton) findViewById(R.id.camPeriodicAlarmNo)).setChecked(false);
        ((TextView) findViewById(R.id.camAlarmTimeIntervalTextView1)).setEnabled(true);
        ((TextView) findViewById(R.id.camAlarmTimeIntervalTextView2)).setEnabled(true);
        ((EditText) findViewById(R.id.camAlarmTimeIntervalEditText)).setEnabled(true);
    }

    public void setActivityAlarmDisabled(View view)
    {
        ((RadioButton) findViewById(R.id.camPeriodicAlarmYes)).setChecked(false);
        ((TextView) findViewById(R.id.camAlarmTimeIntervalTextView1)).setEnabled(false);
        ((TextView) findViewById(R.id.camAlarmTimeIntervalTextView2)).setEnabled(false);
        ((EditText) findViewById(R.id.camAlarmTimeIntervalEditText)).setEnabled(false);
    }

    public void openHomeScreen(View view)
    {
        hideCreateActivityScreen();
        showHomeScreen();
    }

    public void openCreateActivityWindow(View view)
    {
        hideHomeScreen();
        showCreateActivityScreen();
    }

    private void showHomeScreen()
    {
        ((TextView) findViewById(R.id.homeOnFocus)).setVisibility(TextView.VISIBLE);
        ((Button) findViewById(R.id.homeStartActivity)).setVisibility(Button.VISIBLE);
        ((Button) findViewById(R.id.homeCreateActivity)).setVisibility(Button.VISIBLE);
        ((Button) findViewById(R.id.homeSetDailyGoal)).setVisibility(Button.VISIBLE);
    }

    private void hideHomeScreen()
    {
        ((TextView) findViewById(R.id.homeOnFocus)).setVisibility(TextView.INVISIBLE);
        ((Button) findViewById(R.id.homeStartActivity)).setVisibility(Button.INVISIBLE);
        ((Button) findViewById(R.id.homeCreateActivity)).setVisibility(Button.INVISIBLE);
        ((Button) findViewById(R.id.homeSetDailyGoal)).setVisibility(Button.INVISIBLE);
    }

    private void showCreateActivityScreen()
    {
        ((TextView) findViewById(R.id.camCreateActivityTextView)).setVisibility(TextView.VISIBLE);

        ((TextView) findViewById(R.id.camActivityNameTextView)).setVisibility(TextView.VISIBLE);
        ((EditText) findViewById(R.id.camActivityNameEditText)).setVisibility(EditText.VISIBLE);
        ((EditText) findViewById(R.id.camActivityNameEditText)).setText("");

        ((TextView) findViewById(R.id.camProductiveActivityTextView)).setVisibility(TextView.VISIBLE);
        ((RadioButton) findViewById(R.id.camProductiveActivityYes)).setVisibility(TextView.VISIBLE);
        ((RadioButton) findViewById(R.id.camProductiveActivityNo)).setVisibility(TextView.VISIBLE);

        ((RadioButton) findViewById(R.id.camProductiveActivityYes)).setChecked(true);
        setAsProductiveActivity(null);

        ((TextView) findViewById(R.id.camPeriodicAlarmTextView)).setVisibility(TextView.VISIBLE);
        ((RadioButton) findViewById(R.id.camPeriodicAlarmYes)).setVisibility(TextView.VISIBLE);
        ((RadioButton) findViewById(R.id.camPeriodicAlarmNo)).setVisibility(TextView.VISIBLE);

        ((RadioButton) findViewById(R.id.camPeriodicAlarmNo)).setChecked(true);
        setActivityAlarmDisabled(null);

        ((TextView) findViewById(R.id.camAlarmTimeIntervalTextView1)).setVisibility(TextView.VISIBLE);
        ((TextView) findViewById(R.id.camAlarmTimeIntervalTextView2)).setVisibility(TextView.VISIBLE);
        ((EditText) findViewById(R.id.camAlarmTimeIntervalEditText)).setVisibility(EditText.VISIBLE);
        ((EditText) findViewById(R.id.camAlarmTimeIntervalEditText)).setText("15");

        ((Button) findViewById(R.id.camSave)).setVisibility(Button.VISIBLE);
        ((Button) findViewById(R.id.camCancel)).setVisibility(Button.VISIBLE);
    }

    private void hideCreateActivityScreen()
    {
        ((TextView) findViewById(R.id.camCreateActivityTextView)).setVisibility(TextView.INVISIBLE);

        ((TextView) findViewById(R.id.camActivityNameTextView)).setVisibility(TextView.INVISIBLE);
        ((EditText) findViewById(R.id.camActivityNameEditText)).setVisibility(EditText.INVISIBLE);

        ((TextView) findViewById(R.id.camProductiveActivityTextView)).setVisibility(TextView.INVISIBLE);
        ((RadioButton) findViewById(R.id.camProductiveActivityYes)).setVisibility(TextView.INVISIBLE);
        ((RadioButton) findViewById(R.id.camProductiveActivityNo)).setVisibility(TextView.INVISIBLE);

        ((TextView) findViewById(R.id.camPeriodicAlarmTextView)).setVisibility(TextView.INVISIBLE);
        ((RadioButton) findViewById(R.id.camPeriodicAlarmYes)).setVisibility(TextView.INVISIBLE);
        ((RadioButton) findViewById(R.id.camPeriodicAlarmNo)).setVisibility(TextView.INVISIBLE);

        ((TextView) findViewById(R.id.camAlarmTimeIntervalTextView1)).setVisibility(TextView.INVISIBLE);
        ((TextView) findViewById(R.id.camAlarmTimeIntervalTextView2)).setVisibility(TextView.INVISIBLE);
        ((EditText) findViewById(R.id.camAlarmTimeIntervalEditText)).setVisibility(EditText.INVISIBLE);

        ((Button) findViewById(R.id.camSave)).setVisibility(Button.INVISIBLE);
        ((Button) findViewById(R.id.camCancel)).setVisibility(Button.INVISIBLE);
    }

}
