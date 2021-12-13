package cm.pareto.myapplication;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.telephony.TelephonyManager;
import android.util.Log;

import java.util.List;


public class MainActivity extends AppCompatActivity {
    private  String TAG = "Hello";
    public Context context;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RunToast a = new RunToast(this);
        a.o.run();
        //Log.d("LEARN","C!.c" +C1.c);
        /**
         * 通过蓝牙获取mac地址
         */

        /*
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        defaultAdapter.getAddress();
        */

        /**
         * 通过wifi获取mac地址
         */

        /*
        WifiManager wifiManager = (WifiManager) this.getApplicationContext().getSystemService(Context.WIFI_SERVICE);
        WifiInfo wifiInfo = wifiManager.getConnectionInfo();
        String macAddress = wifiInfo.getMacAddress();
        */


        /**
         * 通过CellInfoWcdma 获取MNC
         *
         */
        /*int mcc = -1;
        int mnc = -1;
        int lac = -1;
        int cellId = -1;
        int rssi = -1;
        TelephonyManager tm = (TelephonyManager) this.getSystemService(Context.TELEPHONY_SERVICE);
        String operator = tm.getNetworkOperator();
        mcc = Integer.parseInt(operator.substring(0, 3));
        List<String> list = new ArrayList<String>();
        List<CellInfo> infos = tm.getAllCellInfo();


        for (CellInfo info : infos){
            if (info instanceof CellInfoCdma){
                Log.d(TAG , "CellInfoWcdma");
                CellInfoCdma cellInfoCdma = (CellInfoCdma) info;
                CellIdentityCdma cellIdentityCdma = cellInfoCdma.getCellIdentity();
                mnc = cellIdentityCdma.getSystemId();
                lac = cellIdentityCdma.getNetworkId();
                cellId = cellIdentityCdma.getBasestationId();
                CellSignalStrengthCdma cellSignalStrengthCdma = cellInfoCdma.getCellSignalStrength();
                rssi = cellSignalStrengthCdma.getCdmaDbm();

            }else if (info instanceof CellInfoGsm){
                Log.d(TAG , "CellInfoGsm");
                CellInfoGsm cellInfoGsm = (CellInfoGsm) info;
                CellIdentityGsm cellIdentityGsm = cellInfoGsm.getCellIdentity();
                mnc = cellIdentityGsm.getMnc();
                lac = cellIdentityGsm.getLac();
                cellId = cellIdentityGsm.getCid();
                mcc = cellIdentityGsm.getMcc();
                CellSignalStrengthGsm cellSignalStrengthGsm = cellInfoGsm.getCellSignalStrength();
                rssi = cellSignalStrengthGsm.getDbm();
            }else if (info instanceof CellInfoLte){
                Log.d(TAG , "CellInfoLte");
                CellInfoLte cellInfoLte = (CellInfoLte) info;
                CellIdentityLte cellIdentityLte = cellInfoLte.getCellIdentity();
                mnc = cellIdentityLte.getMnc();
                lac = cellIdentityLte.getTac();
                cellId = cellIdentityLte.getCi();
                mcc = cellIdentityLte.getMcc();
                CellSignalStrengthLte cellSignalStrengthLte = cellInfoLte.getCellSignalStrength();
                rssi = cellSignalStrengthLte.getDbm();
            }else if (info instanceof CellInfoWcdma){
                Log.d(TAG , "CellInfoWcdma");
                CellInfoWcdma cellInfoWcdma = (CellInfoWcdma) info;
                CellIdentityWcdma cellIdentityWcdma = null;
                CellSignalStrengthWcdma cellSignalStrengthWcdma = null;
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.JELLY_BEAN_MR2) {
                    cellIdentityWcdma = cellInfoWcdma.getCellIdentity();
                    mnc = cellIdentityWcdma.getMnc();
                    lac = cellIdentityWcdma.getLac();
                    cellId = cellIdentityWcdma.getCid();
                    mcc = cellIdentityWcdma.getMcc();
                    cellSignalStrengthWcdma = cellInfoWcdma.getCellSignalStrength();
                    rssi = cellSignalStrengthWcdma.getDbm();
                }
            }
        }*/


        /**
         * 通过wifimanager 来获取wifi信息
         */

        /*
        WifiManager wf = (WifiManager)getApplicationContext().getSystemService(WIFI_SERVICE);
        List<ScanResult> scanResults = wf.getScanResults();
        for(ScanResult item : scanResults){
            Log.d(TAG , "item.SSID : " + item.toString() );
        }
        WifiInfo info = wf.getConnectionInfo();
        Log.d(TAG , info.toString());
        */

        /**
         * 获取手机IMSI
         */

        /*
        try {
            TelephonyManager manager = (TelephonyManager) this.getSystemService(Context.TELEPHONY_SERVICE);
            String imsi = manager.getSubscriberId();
            if(null == imsi){
                imsi = "";
            }
            Log.d(TAG , "IMSI :"+imsi);
        }
        catch (Exception E){
            Log.e(TAG, "get imsi error");
        }
        */


        /**
         * 获取设备IMEI号 getDeviceId getImei , 遇到问题抛出 SecurityException
         */


        /*
        try{
            TelephonyManager telephonyMgr = (TelephonyManager) this.getSystemService(TELEPHONY_SERVICE);
            String imei = telephonyMgr.getImei();
            if (imei == null){
                imei = "";
            }
            Log.d(TAG , "IMEI : " + imei) ;
        }
        catch (Exception E){
            Log.e(TAG, "get imei error");
        }
        */

        /*
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_PHONE_STATE)
                != PackageManager.PERMISSION_GRANTED) {
            // READ_PHONE_STATE permission has not been granted.
            requestReadPhoneStatePermission();
            *//*TelephonyManager tm =(TelephonyManager)getSystemService(Context.TELEPHONY_SERVICE);
            //Get IMEI Number of Phone  //////////////// for this example i only need the IMEI
            String IMEINumber=tm.getDeviceId();
            Log.d(TAG , "IMEI : " + IMEINumber) ;*//*
        } else {
            // READ_PHONE_STATE permission is already been granted.
            TelephonyManager tm = (TelephonyManager) this.getSystemService(Service.TELEPHONY_SERVICE);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                Log.d(TAG  , "IMEI : "+ tm.getImei());
            } else {
                Log.d(TAG  , "IMEI : "+ tm.getDeviceId());

            }
        }
        */


        /**
         * 获取已安装应用的包名 getInstalledApplications
         * 所有包名都获取到了，
         */

        

        List<PackageInfo> allPkgs = this.getPackageManager().getInstalledPackages(0);
        for(int i = 0 ; i < allPkgs.size() ; i++){
            PackageInfo item = allPkgs.get(i);
            Log.d(TAG , "PACKAGENAME: " + item.packageName);
        }


        /**
         * 获取已安装应用的包名 getInstalledApplications
         * 部分名称为空。
         */


        /*
        List<ApplicationInfo> allApp = this.getPackageManager().getInstalledApplications(0);
        for(int i = 0 ; i < allApp.size() ; i++){
            ApplicationInfo item = allApp.get(i);
            Log.d(TAG , "PACKAGENAME: " + item.name);
        }
        */


        setContentView(R.layout.activity_main);
    }

    /**
     * Requests the READ_PHONE_STATE permission.
     * If the permission has been denied previously, a dialog will prompt the user to grant the
     * permission, otherwise it is requested directly.
     */
    private void requestReadPhoneStatePermission() {
        if (ActivityCompat.shouldShowRequestPermissionRationale(this,
                Manifest.permission.READ_PHONE_STATE)) {
            // Provide an additional rationale to the user if the permission was not granted
            // and the user would benefit from additional context for the use of the permission.
            // For example if the user has previously denied the permission.
            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.READ_PHONE_STATE},
                    0);
        } else {
            // READ_PHONE_STATE permission has not been granted yet. Request it directly.
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_PHONE_STATE},
                    0);
        }
    }

    public void doPermissionGrantedStuffs() {
        //Have an  object of TelephonyManager
        TelephonyManager tm =(TelephonyManager)getSystemService(Context.TELEPHONY_SERVICE);
        //Get IMEI Number of Phone  //////////////// for this example i only need the IMEI
        String IMEINumber=tm.getDeviceId();
        Log.d(TAG , "IMEI : " + IMEINumber) ;
        /************************************************
         * **********************************************
         * This is just an icing on the cake
         * the following are other children of TELEPHONY_SERVICE
         *
         //Get Subscriber ID
         String subscriberID=tm.getDeviceId();

         //Get SIM Serial Number
         String SIMSerialNumber=tm.getSimSerialNumber();

         //Get Network Country ISO Code
         String networkCountryISO=tm.getNetworkCountryIso();

         //Get SIM Country ISO Code
         String SIMCountryISO=tm.getSimCountryIso();

         //Get the device software version
         String softwareVersion=tm.getDeviceSoftwareVersion()

         //Get the Voice mail number
         String voiceMailNumber=tm.getVoiceMailNumber();


         //Get the Phone Type CDMA/GSM/NONE
         int phoneType=tm.getPhoneType();

         switch (phoneType)
         {
         case (TelephonyManager.PHONE_TYPE_CDMA):
         // your code
         break;
         case (TelephonyManager.PHONE_TYPE_GSM)
         // your code
         break;
         case (TelephonyManager.PHONE_TYPE_NONE):
         // your code
         break;
         }

         //Find whether the Phone is in Roaming, returns true if in roaming
         boolean isRoaming=tm.isNetworkRoaming();
         if(isRoaming)
         phoneDetails+="\nIs In Roaming : "+"YES";
         else
         phoneDetails+="\nIs In Roaming : "+"NO";


         //Get the SIM state
         int SIMState=tm.getSimState();
         switch(SIMState)
         {
         case TelephonyManager.SIM_STATE_ABSENT :
         // your code
         break;
         case TelephonyManager.SIM_STATE_NETWORK_LOCKED :
         // your code
         break;
         case TelephonyManager.SIM_STATE_PIN_REQUIRED :
         // your code
         break;
         case TelephonyManager.SIM_STATE_PUK_REQUIRED :
         // your code
         break;
         case TelephonyManager.SIM_STATE_READY :
         // your code
         break;
         case TelephonyManager.SIM_STATE_UNKNOWN :
         // your code
         break;

         }
         */
    }

}
