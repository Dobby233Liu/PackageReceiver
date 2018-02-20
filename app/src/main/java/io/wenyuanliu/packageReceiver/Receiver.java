package io.wenyuanliu.packageReceiver;

import android.app.*;
import android.os.*;
import android.content.*;
import android.media.*;

public class Receiver extends BroadcastReceiver
{
	@Override
	public void onReceive(Context p1, Intent p2)
	{
	MediaPlayer mp=MediaPlayer.create(p1, R.raw.package_alarm);
	mp.setVolume(100,100);
	mp.start();
	mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener(){
		@Override
		public void onCompletion(MediaPlayer p1)
		{
		p1.stop();
		p1.release();
		}
	});
	}
}
