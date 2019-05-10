package com.google.android.gms.ads.internal.formats;

import android.graphics.Color;
import java.util.List;

public class zza
{
  private static final int zzxI;
  private static final int zzxJ;
  static final int zzxK = zzxJ;
  static final int zzxL = zzxI;
  private final int mTextColor;
  private final String zzxM;
  private final List zzxN;
  private final int zzxO;
  private final int zzxP;
  private final int zzxQ;
  
  static
  {
    int i = 204;
    zzxI = Color.rgb(12, 174, 206);
    zzxJ = Color.rgb(i, i, i);
  }
  
  public zza(String paramString, List paramList, Integer paramInteger1, Integer paramInteger2, Integer paramInteger3, int paramInt)
  {
    this.zzxM = paramString;
    this.zzxN = paramList;
    if (paramInteger1 != null)
    {
      i = paramInteger1.intValue();
      this.zzxO = i;
      if (paramInteger2 == null) {
        break label81;
      }
      i = paramInteger2.intValue();
      label42:
      this.mTextColor = i;
      if (paramInteger3 == null) {
        break label89;
      }
    }
    label81:
    label89:
    for (int i = paramInteger3.intValue();; i = 12)
    {
      this.zzxP = i;
      this.zzxQ = paramInt;
      return;
      i = zzxK;
      break;
      i = zzxL;
      break label42;
    }
  }
  
  public int getBackgroundColor()
  {
    return this.zzxO;
  }
  
  public String getText()
  {
    return this.zzxM;
  }
  
  public int getTextColor()
  {
    return this.mTextColor;
  }
  
  public int getTextSize()
  {
    return this.zzxP;
  }
  
  public List zzdG()
  {
    return this.zzxN;
  }
  
  public int zzdH()
  {
    return this.zzxQ;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\formats\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */