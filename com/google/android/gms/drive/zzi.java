package com.google.android.gms.drive;

public class zzi
  extends ExecutionOptions
{
  private boolean zzapa;
  
  private zzi(String paramString, boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    super(paramString, paramBoolean1, paramInt);
    this.zzapa = paramBoolean2;
  }
  
  public static zzi zzb(ExecutionOptions paramExecutionOptions)
  {
    zzi.zza localzza = new com/google/android/gms/drive/zzi$zza;
    localzza.<init>();
    if (paramExecutionOptions != null)
    {
      int i = paramExecutionOptions.zzsD();
      localzza.zzcy(i);
      boolean bool = paramExecutionOptions.zzsC();
      localzza.zzae(bool);
      String str = paramExecutionOptions.zzsB();
      if (str != null) {
        localzza.zzcZ(str);
      }
    }
    return localzza.zzsJ();
  }
  
  public boolean zzsI()
  {
    return this.zzapa;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\zzi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */