package com.google.android.gms.tagmanager;

import java.util.Arrays;

class zzw$zzb
{
  final byte[] zzbiK;
  final String zzvs;
  
  zzw$zzb(String paramString, byte[] paramArrayOfByte)
  {
    this.zzvs = paramString;
    this.zzbiK = paramArrayOfByte;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("KeyAndSerialized: key = ");
    String str = this.zzvs;
    localStringBuilder = localStringBuilder.append(str).append(" serialized hash = ");
    int i = Arrays.hashCode(this.zzbiK);
    return i;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzw$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */