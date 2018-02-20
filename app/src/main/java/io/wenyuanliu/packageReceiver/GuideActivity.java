package io.wenyuanliu.packageReceiver;
import android.app.*;
import android.os.*;
import android.widget.*;

public class GuideActivity extends Activity
{
	@Override
	public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState)
	{
	super.onCreate(savedInstanceState, persistentState);
	Toast.makeText(this,"The only thing you can do is start this app and wait.",Toast.LENGTH_LONG).show();
	finish();
	}
}
