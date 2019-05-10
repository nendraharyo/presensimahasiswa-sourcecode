package com.google.android.gms.internal;

public class zzoz
{
  private static final ThreadLocal zzazL;
  
  static
  {
    ThreadLocal localThreadLocal = new java/lang/ThreadLocal;
    localThreadLocal.<init>();
    zzazL = localThreadLocal;
  }
  
  public static String zzD(String paramString1, String paramString2)
  {
    if ((paramString1 == null) || (paramString2 == null)) {}
    for (;;)
    {
      return paramString1;
      int i = paramString1.length();
      int j = paramString2.length();
      byte[] arrayOfByte1 = new byte[i + j];
      byte[] arrayOfByte2 = paramString1.getBytes();
      int k = paramString1.length();
      System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 0, k);
      arrayOfByte2 = paramString2.getBytes();
      k = paramString1.length();
      int m = paramString2.length();
      System.arraycopy(arrayOfByte2, 0, arrayOfByte1, k, m);
      j = arrayOfByte1.length;
      i = zznd.zza(arrayOfByte1, 0, j, 0);
      paramString1 = Integer.toHexString(i);
    }
  }
  
  public static String zzdF(String paramString)
  {
    boolean bool = zzuH();
    if (bool) {}
    for (;;)
    {
      return paramString;
      String str = (String)zzazL.get();
      paramString = zzD(paramString, str);
    }
  }
  
  public static boolean zzuH()
  {
    String str1 = (String)zzazL.get();
    boolean bool;
    if (str1 != null)
    {
      String str2 = "com.google";
      bool = str1.startsWith(str2);
      if (!bool) {}
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      str1 = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzoz.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */