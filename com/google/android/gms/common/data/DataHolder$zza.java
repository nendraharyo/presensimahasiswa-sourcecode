package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.zzx;
import java.util.ArrayList;
import java.util.HashMap;

public class DataHolder$zza
{
  private final String[] zzaji;
  private final ArrayList zzajr;
  private final String zzajs;
  private final HashMap zzajt;
  private boolean zzaju;
  private String zzajv;
  
  private DataHolder$zza(String[] paramArrayOfString, String paramString)
  {
    Object localObject = (String[])zzx.zzz(paramArrayOfString);
    this.zzaji = ((String[])localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.zzajr = ((ArrayList)localObject);
    this.zzajs = paramString;
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.zzajt = ((HashMap)localObject);
    this.zzaju = false;
    this.zzajv = null;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\data\DataHolder$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */