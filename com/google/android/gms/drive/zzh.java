package com.google.android.gms.drive;

public class zzh
  extends ExecutionOptions
{
  private String zzaoY;
  private String zzaoZ;
  
  private zzh(String paramString1, boolean paramBoolean, String paramString2, String paramString3, int paramInt)
  {
    super(paramString1, paramBoolean, paramInt);
    this.zzaoY = paramString2;
    this.zzaoZ = paramString3;
  }
  
  public static zzh zza(ExecutionOptions paramExecutionOptions)
  {
    Object localObject = new com/google/android/gms/drive/zzh$zza;
    ((zzh.zza)localObject).<init>();
    if (paramExecutionOptions != null)
    {
      int i = paramExecutionOptions.zzsD();
      if (i != 0)
      {
        localObject = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject).<init>("May not set a conflict strategy for new file creation.");
        throw ((Throwable)localObject);
      }
      String str = paramExecutionOptions.zzsB();
      if (str != null) {
        ((zzh.zza)localObject).zzcY(str);
      }
      boolean bool = paramExecutionOptions.zzsC();
      ((zzh.zza)localObject).zzad(bool);
    }
    return ((zzh.zza)localObject).zzsH();
  }
  
  public String zzsF()
  {
    return this.zzaoY;
  }
  
  public String zzsG()
  {
    return this.zzaoZ;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\zzh.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */