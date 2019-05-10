package com.google.android.gms.drive;

public class zzi$zza
  extends ExecutionOptions.Builder
{
  private boolean zzapa = true;
  
  public zza zzae(boolean paramBoolean)
  {
    super.setNotifyOnCompletion(paramBoolean);
    return this;
  }
  
  public zza zzcZ(String paramString)
  {
    super.setTrackingTag(paramString);
    return this;
  }
  
  public zza zzcy(int paramInt)
  {
    super.setConflictStrategy(paramInt);
    return this;
  }
  
  public zzi zzsJ()
  {
    zzsE();
    zzi localzzi = new com/google/android/gms/drive/zzi;
    String str = this.zzaoV;
    boolean bool1 = this.zzaoW;
    int i = this.zzaoX;
    boolean bool2 = this.zzapa;
    localzzi.<init>(str, bool1, i, bool2, null);
    return localzzi;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\zzi$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */