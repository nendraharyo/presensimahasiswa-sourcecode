package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.overlay.zzk;
import com.google.android.gms.ads.internal.util.client.zza;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONObject;

public final class zzdo
  implements zzdf
{
  private final Map zzzI;
  
  public zzdo()
  {
    WeakHashMap localWeakHashMap = new java/util/WeakHashMap;
    localWeakHashMap.<init>();
    this.zzzI = localWeakHashMap;
  }
  
  private static int zza(Context paramContext, Map paramMap, String paramString, int paramInt)
  {
    str1 = (String)paramMap.get(paramString);
    if (str1 != null) {}
    try
    {
      zza localzza = zzn.zzcS();
      int i = Integer.parseInt(str1);
      paramInt = localzza.zzb(paramContext, i);
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;)
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder = localStringBuilder.append("Could not parse ").append(paramString);
        String str2 = " in a video GMSG: ";
        localStringBuilder = localStringBuilder.append(str2);
        str1 = str1;
        zzin.zzaK(str1);
      }
    }
    return paramInt;
  }
  
  public void zza(zzjp paramzzjp, Map paramMap)
  {
    int i = -1;
    Object localObject1 = paramMap.get("action");
    Object localObject3 = localObject1;
    localObject3 = (String)localObject1;
    if (localObject3 == null)
    {
      localObject1 = "Action missing from video GMSG.";
      zzin.zzaK((String)localObject1);
    }
    for (;;)
    {
      return;
      boolean bool1 = zzin.zzQ(3);
      Object localObject4;
      String str;
      if (bool1)
      {
        localObject1 = new org/json/JSONObject;
        ((JSONObject)localObject1).<init>(paramMap);
        ((JSONObject)localObject1).remove("google.afma.Notify_dt");
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        localObject4 = ((StringBuilder)localObject4).append("Video GMSG: ").append((String)localObject3);
        str = " ";
        localObject4 = ((StringBuilder)localObject4).append(str);
        localObject1 = ((JSONObject)localObject1).toString();
        localObject1 = (String)localObject1;
        zzin.zzaI((String)localObject1);
      }
      localObject1 = "background";
      bool1 = ((String)localObject1).equals(localObject3);
      Object localObject2;
      if (bool1)
      {
        localObject1 = (String)paramMap.get("color");
        boolean bool4 = TextUtils.isEmpty((CharSequence)localObject1);
        if (bool4)
        {
          localObject1 = "Color parameter missing from color video GMSG.";
          zzin.zzaK((String)localObject1);
        }
        else
        {
          int j;
          try
          {
            j = Color.parseColor((String)localObject1);
            localObject3 = paramzzjp.zzia();
            if (localObject3 == null) {
              break label240;
            }
            localObject3 = ((zzjo)localObject3).zzhM();
            if (localObject3 == null) {
              break label240;
            }
            ((zzk)localObject3).setBackgroundColor(j);
          }
          catch (IllegalArgumentException localIllegalArgumentException)
          {
            localObject2 = "Invalid color parameter in video GMSG.";
            zzin.zzaK((String)localObject2);
          }
          continue;
          label240:
          localObject3 = this.zzzI;
          localObject2 = Integer.valueOf(j);
          ((Map)localObject3).put(paramzzjp, localObject2);
        }
      }
      else
      {
        localObject2 = paramzzjp.zzia();
        if (localObject2 == null)
        {
          localObject2 = "Could not get underlay container for a video GMSG.";
          zzin.zzaK((String)localObject2);
        }
        else
        {
          boolean bool6 = "new".equals(localObject3);
          localObject4 = "position";
          boolean bool7 = ((String)localObject4).equals(localObject3);
          Context localContext;
          int i1;
          int i2;
          int i3;
          int n;
          float f1;
          if ((bool6) || (bool7))
          {
            localContext = paramzzjp.getContext();
            localObject3 = "x";
            int m = zza(localContext, paramMap, (String)localObject3, 0);
            localObject4 = "y";
            i1 = zza(localContext, paramMap, (String)localObject4, 0);
            str = "w";
            i2 = zza(localContext, paramMap, str, i);
            i3 = zza(localContext, paramMap, "h", i);
            Object localObject5 = "player";
            try
            {
              localObject5 = paramMap.get(localObject5);
              localObject5 = (String)localObject5;
              i4 = Integer.parseInt((String)localObject5);
            }
            catch (NumberFormatException localNumberFormatException3)
            {
              for (;;)
              {
                zzk localzzk1;
                boolean bool5;
                int i4 = 0;
                Object localObject6 = null;
                f1 = 0.0F;
              }
              ((zzjo)localObject2).zze(n, i1, i2, i3);
            }
            if (bool6)
            {
              localzzk1 = ((zzjo)localObject2).zzhM();
              if (localzzk1 == null)
              {
                ((zzjo)localObject2).zza(m, i1, i2, i3, i4);
                localObject3 = this.zzzI;
                bool5 = ((Map)localObject3).containsKey(paramzzjp);
                if (!bool5) {
                  continue;
                }
                localObject3 = (Integer)this.zzzI.get(paramzzjp);
                n = ((Integer)localObject3).intValue();
                localObject2 = ((zzjo)localObject2).zzhM();
                ((zzk)localObject2).setBackgroundColor(n);
                ((zzk)localObject2).zzfE();
                continue;
              }
            }
          }
          else
          {
            zzk localzzk2 = ((zzjo)localObject2).zzhM();
            if (localzzk2 == null)
            {
              zzk.zzg(paramzzjp);
            }
            else
            {
              localObject2 = "click";
              boolean bool2 = ((String)localObject2).equals(localObject3);
              if (bool2)
              {
                localObject2 = paramzzjp.getContext();
                i1 = zza((Context)localObject2, paramMap, "x", 0);
                localObject3 = "y";
                i2 = zza((Context)localObject2, paramMap, (String)localObject3, 0);
                long l = SystemClock.uptimeMillis();
                f1 = i1;
                float f2 = i2;
                i3 = 0;
                localContext = null;
                i = 0;
                localObject2 = MotionEvent.obtain(l, l, 0, f1, f2, 0);
                localzzk2.zzd((MotionEvent)localObject2);
                ((MotionEvent)localObject2).recycle();
              }
              else
              {
                localObject2 = "currentTime";
                bool2 = ((String)localObject2).equals(localObject3);
                float f3;
                StringBuilder localStringBuilder1;
                if (bool2)
                {
                  localObject2 = (String)paramMap.get("time");
                  if (localObject2 == null)
                  {
                    localObject2 = "Time parameter missing from currentTime video GMSG.";
                    zzin.zzaK((String)localObject2);
                  }
                  else
                  {
                    try
                    {
                      f3 = Float.parseFloat((String)localObject2);
                      i1 = 1148846080;
                      float f4 = 1000.0F;
                      f3 *= f4;
                      n = (int)f3;
                      localzzk2.seekTo(n);
                    }
                    catch (NumberFormatException localNumberFormatException1)
                    {
                      localStringBuilder1 = new java/lang/StringBuilder;
                      localStringBuilder1.<init>();
                      localObject4 = "Could not parse time parameter from currentTime video GMSG: ";
                      localStringBuilder1 = localStringBuilder1.append((String)localObject4);
                      localObject2 = (String)localObject2;
                      zzin.zzaK((String)localObject2);
                    }
                  }
                }
                else
                {
                  localObject2 = "hide";
                  bool2 = ((String)localObject2).equals(localStringBuilder1);
                  if (bool2)
                  {
                    int k = 4;
                    localzzk2.setVisibility(k);
                  }
                  else
                  {
                    localObject2 = "load";
                    boolean bool3 = ((String)localObject2).equals(localStringBuilder1);
                    if (bool3)
                    {
                      localzzk2.zzfD();
                    }
                    else
                    {
                      localObject2 = "mimetype";
                      bool3 = ((String)localObject2).equals(localStringBuilder1);
                      if (bool3)
                      {
                        localObject2 = (String)paramMap.get("mimetype");
                        localzzk2.setMimeType((String)localObject2);
                      }
                      else
                      {
                        localObject2 = "muted";
                        bool3 = ((String)localObject2).equals(localStringBuilder1);
                        if (bool3)
                        {
                          localObject2 = (String)paramMap.get("muted");
                          bool3 = Boolean.parseBoolean((String)localObject2);
                          if (bool3) {
                            localzzk2.zzff();
                          } else {
                            localzzk2.zzfg();
                          }
                        }
                        else
                        {
                          localObject2 = "pause";
                          bool3 = ((String)localObject2).equals(localStringBuilder1);
                          if (bool3)
                          {
                            localzzk2.pause();
                          }
                          else
                          {
                            localObject2 = "play";
                            bool3 = ((String)localObject2).equals(localStringBuilder1);
                            if (bool3)
                            {
                              localzzk2.play();
                            }
                            else
                            {
                              localObject2 = "show";
                              bool3 = ((String)localObject2).equals(localStringBuilder1);
                              if (bool3)
                              {
                                localzzk2.setVisibility(0);
                              }
                              else
                              {
                                localObject2 = "src";
                                bool3 = ((String)localObject2).equals(localStringBuilder1);
                                if (bool3)
                                {
                                  localObject2 = (String)paramMap.get("src");
                                  localzzk2.zzap((String)localObject2);
                                }
                                else
                                {
                                  localObject2 = "volume";
                                  bool3 = ((String)localObject2).equals(localStringBuilder1);
                                  StringBuilder localStringBuilder2;
                                  if (bool3)
                                  {
                                    localObject2 = (String)paramMap.get("volume");
                                    if (localObject2 == null)
                                    {
                                      localObject2 = "Level parameter missing from volume video GMSG.";
                                      zzin.zzaK((String)localObject2);
                                    }
                                    else
                                    {
                                      try
                                      {
                                        f3 = Float.parseFloat((String)localObject2);
                                        localzzk2.zza(f3);
                                      }
                                      catch (NumberFormatException localNumberFormatException2)
                                      {
                                        localStringBuilder2 = new java/lang/StringBuilder;
                                        localStringBuilder2.<init>();
                                        localObject4 = "Could not parse volume parameter from volume video GMSG: ";
                                        localStringBuilder2 = localStringBuilder2.append((String)localObject4);
                                        localObject2 = (String)localObject2;
                                        zzin.zzaK((String)localObject2);
                                      }
                                    }
                                  }
                                  else
                                  {
                                    localObject2 = "watermark";
                                    bool3 = ((String)localObject2).equals(localStringBuilder2);
                                    if (bool3)
                                    {
                                      localzzk2.zzfE();
                                    }
                                    else
                                    {
                                      localObject2 = new java/lang/StringBuilder;
                                      ((StringBuilder)localObject2).<init>();
                                      localObject4 = "Unknown video action: ";
                                      localObject2 = (String)localObject4 + localStringBuilder2;
                                      zzin.zzaK((String)localObject2);
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzdo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */