package com.google.android.gms.internal;

import java.io.FilterInputStream;
import java.io.InputStream;

class zzv$zzb
  extends FilterInputStream
{
  private int zzaC = 0;
  
  private zzv$zzb(InputStream paramInputStream)
  {
    super(paramInputStream);
  }
  
  public int read()
  {
    int i = super.read();
    int j = -1;
    if (i != j)
    {
      j = this.zzaC + 1;
      this.zzaC = j;
    }
    return i;
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = super.read(paramArrayOfByte, paramInt1, paramInt2);
    int j = -1;
    if (i != j)
    {
      j = this.zzaC + i;
      this.zzaC = j;
    }
    return i;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzv$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */