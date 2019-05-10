package android.support.v4.media.session;

import android.media.AudioAttributes;
import android.media.session.MediaController.PlaybackInfo;

public class c$c
{
  private static int a(AudioAttributes paramAudioAttributes)
  {
    int i = 4;
    int j = 3;
    int k = 1;
    int m = paramAudioAttributes.getFlags() & 0x1;
    if (m == k) {
      j = 7;
    }
    for (;;)
    {
      return j;
      m = paramAudioAttributes.getFlags() & 0x4;
      if (m == i)
      {
        j = 6;
      }
      else
      {
        m = paramAudioAttributes.getUsage();
        switch (m)
        {
        case 1: 
        case 11: 
        case 12: 
        case 14: 
        default: 
          break;
        case 2: 
          j = 0;
          break;
        case 13: 
          j = k;
          break;
        case 3: 
          j = 8;
          break;
        case 4: 
          j = i;
          break;
        case 6: 
          j = 2;
          break;
        case 5: 
        case 7: 
        case 8: 
        case 9: 
        case 10: 
          j = 5;
        }
      }
    }
  }
  
  public static AudioAttributes a(Object paramObject)
  {
    return ((MediaController.PlaybackInfo)paramObject).getAudioAttributes();
  }
  
  public static int b(Object paramObject)
  {
    return a(a(paramObject));
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\media\session\c$c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */