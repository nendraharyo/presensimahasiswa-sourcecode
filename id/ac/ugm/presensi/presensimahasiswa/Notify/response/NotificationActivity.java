package id.ac.ugm.presensi.presensimahasiswa.Notify.response;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.Window;
import android.widget.Button;
import java.io.IOException;

public class NotificationActivity
  extends Activity
{
  private MediaPlayer a;
  
  private Uri a()
  {
    int i = 4;
    Uri localUri = RingtoneManager.getDefaultUri(i);
    if (localUri == null)
    {
      i = 2;
      localUri = RingtoneManager.getDefaultUri(i);
      if (localUri == null)
      {
        i = 1;
        localUri = RingtoneManager.getDefaultUri(i);
      }
    }
    return localUri;
  }
  
  private void a(Context paramContext, Uri paramUri)
  {
    Object localObject = new android/media/MediaPlayer;
    ((MediaPlayer)localObject).<init>();
    this.a = ((MediaPlayer)localObject);
    try
    {
      localObject = this.a;
      ((MediaPlayer)localObject).setDataSource(paramContext, paramUri);
      localObject = "audio";
      localObject = paramContext.getSystemService((String)localObject);
      localObject = (AudioManager)localObject;
      int i = 4;
      int j = ((AudioManager)localObject).getStreamVolume(i);
      if (j != 0)
      {
        localObject = this.a;
        i = 4;
        ((MediaPlayer)localObject).setAudioStreamType(i);
        localObject = this.a;
        ((MediaPlayer)localObject).prepare();
        localObject = this.a;
        ((MediaPlayer)localObject).start();
      }
      return;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    int i = 1024;
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    getWindow().setFlags(i, i);
    setContentView(2131427413);
    Object localObject = (Button)findViewById(2131296309);
    NotificationActivity.1 local1 = new id/ac/ugm/presensi/presensimahasiswa/Notify/response/NotificationActivity$1;
    local1.<init>(this);
    ((Button)localObject).setOnTouchListener(local1);
    localObject = a();
    a(this, (Uri)localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\Notify\response\NotificationActivity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */