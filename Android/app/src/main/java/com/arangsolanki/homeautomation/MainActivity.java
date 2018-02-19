package com.arangsolanki.homeautomation;

import android.app.ProgressDialog;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.UUID;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    String address = null;
    private ProgressDialog progress;
    BluetoothAdapter myBluetooth = null;
    BluetoothSocket btSocket = null;
    private boolean isBtConnected = false;
    static final UUID myUUID = UUID.fromString("00001101-0000-1000-8000-00805F9B34FB");
    Switch switch1, switch2, switch3, switch4, switch5, switch6, switch7, switch8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent newint = getIntent();
        address = newint.getStringExtra(Connect.EXTRA_ADDRESS);
        setContentView(R.layout.activity_main);
        new ConnectBT().execute();
        switch1 = (Switch)findViewById(R.id.switch1);
        switch1.setOnCheckedChangeListener(this);
        switch2 = (Switch)findViewById(R.id.switch2);
        switch2.setOnCheckedChangeListener(this);
        switch3 = (Switch)findViewById(R.id.switch3);
        switch3.setOnCheckedChangeListener(this);
        switch4 = (Switch)findViewById(R.id.switch4);
        switch4.setOnCheckedChangeListener(this);
        switch5 = (Switch)findViewById(R.id.switch5);
        switch5.setOnCheckedChangeListener(this);
        switch6 = (Switch)findViewById(R.id.switch6);
        switch6.setOnCheckedChangeListener(this);
        switch7 = (Switch)findViewById(R.id.switch7);
        switch7.setOnCheckedChangeListener(this);
        switch8 = (Switch)findViewById(R.id.switch8);
        switch8.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if (compoundButton.isChecked()) {
            switch (compoundButton.getId()) {
                case R.id.switch1:
                    if (btSocket!=null) {
                        try {
                            btSocket.getOutputStream().write("-ON1".toString().getBytes());
                        }
                        catch (IOException e) {
                            msg("Unable to send data!");
                        }
                    }
                    break;
                case R.id.switch2:
                    if (btSocket!=null) {
                        try {
                            btSocket.getOutputStream().write("-ON2".toString().getBytes());
                        }
                        catch (IOException e) {
                            msg("Unable to send data!");
                        }
                    }
                    break;
                case R.id.switch3:
                    if (btSocket!=null) {
                        try {
                            btSocket.getOutputStream().write("-ON3".toString().getBytes());
                        }
                        catch (IOException e) {
                            msg("Unable to send data!");
                        }
                    }
                    break;
                case R.id.switch4:
                    if (btSocket!=null) {
                        try {
                            btSocket.getOutputStream().write("-ON4".toString().getBytes());
                        }
                        catch (IOException e) {
                            msg("Unable to send data!");
                        }
                    }
                    break;
                case R.id.switch5:
                    if (btSocket!=null) {
                        try {
                            btSocket.getOutputStream().write("-ON5".toString().getBytes());
                        }
                        catch (IOException e) {
                            msg("Unable to send data!");
                        }
                    }
                    break;
                case R.id.switch6:
                    if (btSocket!=null) {
                        try {
                            btSocket.getOutputStream().write("-ON6".toString().getBytes());
                        }
                        catch (IOException e) {
                            msg("Unable to send data!");
                        }
                    }
                    break;
                case R.id.switch7:
                    if (btSocket!=null) {
                        try {
                            btSocket.getOutputStream().write("-ON7".toString().getBytes());
                        }
                        catch (IOException e) {
                            msg("Unable to send data!");
                        }
                    }
                    break;
                case R.id.switch8:
                    if (btSocket!=null) {
                        try {
                            btSocket.getOutputStream().write("-ON8".toString().getBytes());
                        }
                        catch (IOException e) {
                            msg("Unable to send data!");
                        }
                    }
                    break;
                default:
                    msg("Error!");
            }
        } else {
            switch (compoundButton.getId()) {
                case R.id.switch1:
                    if (btSocket!=null) {
                        try {
                            btSocket.getOutputStream().write("-OFF1".toString().getBytes());
                        }
                        catch (IOException e) {
                            msg("Unable to send data!");
                        }
                    }
                    break;
                case R.id.switch2:
                    if (btSocket!=null) {
                        try {
                            btSocket.getOutputStream().write("-OFF2".toString().getBytes());
                        }
                        catch (IOException e) {
                            msg("Unable to send data!");
                        }
                    }
                    break;
                case R.id.switch3:
                    if (btSocket!=null) {
                        try {
                            btSocket.getOutputStream().write("-OFF3".toString().getBytes());
                        }
                        catch (IOException e) {
                            msg("Unable to send data!");
                        }
                    }
                    break;
                case R.id.switch4:
                    if (btSocket!=null) {
                        try {
                            btSocket.getOutputStream().write("-OFF4".toString().getBytes());
                        }
                        catch (IOException e) {
                            msg("Unable to send data!");
                        }
                    }
                    break;
                case R.id.switch5:
                    if (btSocket!=null) {
                        try {
                            btSocket.getOutputStream().write("-OFF5".toString().getBytes());
                        }
                        catch (IOException e) {
                            msg("Unable to send data!");
                        }
                    }
                    break;
                case R.id.switch6:
                    if (btSocket!=null) {
                        try {
                            btSocket.getOutputStream().write("-OFF6".toString().getBytes());
                        }
                        catch (IOException e) {
                            msg("Unable to send data!");
                        }
                    }
                    break;
                case R.id.switch7:
                    if (btSocket!=null) {
                        try {
                            btSocket.getOutputStream().write("-OFF7".toString().getBytes());
                        }
                        catch (IOException e) {
                            msg("Unable to send data!");
                        }
                    }
                    break;
                case R.id.switch8:
                    if (btSocket!=null) {
                        try {
                            btSocket.getOutputStream().write("-OFF8".toString().getBytes());
                        }
                        catch (IOException e) {
                            msg("Unable to send data!");
                        }
                    }
                    break;
                default:
                    msg("Error!");
            }
        }
    }

    private class ConnectBT extends AsyncTask<Void, Void, Void> {
        private boolean ConnectSuccess = true;

        @Override
        protected void onPreExecute() {
            progress = ProgressDialog.show(MainActivity.this, "Connecting...", "Please wait!!!");
        }

        @Override
        protected Void doInBackground(Void... devices) {
            try {
                if (btSocket == null || !isBtConnected) {
                    myBluetooth = BluetoothAdapter.getDefaultAdapter();
                    BluetoothDevice dispositivo = myBluetooth.getRemoteDevice(address);
                    btSocket = dispositivo.createInsecureRfcommSocketToServiceRecord(myUUID);
                    BluetoothAdapter.getDefaultAdapter().cancelDiscovery();
                    btSocket.connect();
                }
            } catch (IOException e) {
                ConnectSuccess = false;
            }
            return null;
        }
        @Override
        protected void onPostExecute(Void result) {
            super.onPostExecute(result);

            if (!ConnectSuccess) {
                msg("Connection Failed. Is it a SPP Bluetooth? Try again.");
                finish();
            } else {
                msg("Connected.");
                isBtConnected = true;
                if (btSocket!=null) {
                    try {
                        btSocket.getOutputStream().write("-CON".toString().getBytes());
                    }
                    catch (IOException e) {
                        msg("Unable to send data!");
                    }
                }
            }
            progress.dismiss();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.settings) {

        } else if (id == R.id.exit) {
            if (btSocket!=null) {
                try {
                    btSocket.getOutputStream().write("-DIS".toString().getBytes());
                }
                catch (IOException e) {
                    msg("Unable to send data!");
                }
            }
            if (btSocket!=null) {
                try {
                    btSocket.close();
                } catch (IOException e) {
                    msg("Error");
                }
            }
            finish();
        }
        return true;
    }

    private void msg(String s) {
        Toast.makeText(getApplicationContext(),s,Toast.LENGTH_SHORT).show();
    }

}
