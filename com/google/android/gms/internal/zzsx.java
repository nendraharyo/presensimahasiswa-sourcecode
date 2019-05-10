package com.google.android.gms.internal;

public final class zzsx
{
  public static final boolean[] zzbuA = new boolean[0];
  public static final String[] zzbuB = new String[0];
  public static final byte[][] zzbuC = new byte[0][];
  public static final byte[] zzbuD = new byte[0];
  public static final int[] zzbuw = new int[0];
  public static final long[] zzbux = new long[0];
  public static final float[] zzbuy = new float[0];
  public static final double[] zzbuz = new double[0];
  
  static int zzF(int paramInt1, int paramInt2)
  {
    return paramInt1 << 3 | paramInt2;
  }
  
  public static boolean zzb(zzsm paramzzsm, int paramInt)
  {
    return paramzzsm.zzmo(paramInt);
  }
  
  public static final int zzc(zzsm paramzzsm, int paramInt)
  {
    int i = 1;
    int j = paramzzsm.getPosition();
    paramzzsm.zzmo(paramInt);
    for (;;)
    {
      int k = paramzzsm.zzIX();
      if (k != paramInt) {
        break;
      }
      paramzzsm.zzmo(paramInt);
      i += 1;
    }
    paramzzsm.zzms(j);
    return i;
  }
  
  static int zzmI(int paramInt)
  {
    return paramInt & 0x7;
  }
  
  public static int zzmJ(int paramInt)
  {
    return paramInt >>> 3;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzsx.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */