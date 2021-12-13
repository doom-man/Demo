package cm.pareto.myapplication;

import android.content.Context;
import android.os.Handler;
import android.widget.Toast;

public class RunToast implements Runnable {
    private final Context  context;
    public RunToast(Context ctx){
        this.context = ctx;
    }
    public final  Runnable  o = new  Runnable(){

        @Override
        public void run() {
            Handler handler = new Handler();
            Toast.makeText(context , "2 secs" , Toast.LENGTH_SHORT).show();
            handler.postDelayed(RunToast.this.o,2000);

        }
    };
    @Override
    public void run() {
        Handler handler = new Handler();
    }
}
