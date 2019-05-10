package com.google.android.gms.drive;

public class ExecutionOptions$Builder
{
  protected String zzaoV;
  protected boolean zzaoW;
  protected int zzaoX = 0;
  
  public ExecutionOptions build()
  {
    zzsE();
    ExecutionOptions localExecutionOptions = new com/google/android/gms/drive/ExecutionOptions;
    String str = this.zzaoV;
    boolean bool = this.zzaoW;
    int i = this.zzaoX;
    localExecutionOptions.<init>(str, bool, i);
    return localExecutionOptions;
  }
  
  public Builder setConflictStrategy(int paramInt)
  {
    boolean bool = ExecutionOptions.zzcw(paramInt);
    if (!bool)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "Unrecognized value for conflict strategy: " + paramInt;
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    this.zzaoX = paramInt;
    return this;
  }
  
  public Builder setNotifyOnCompletion(boolean paramBoolean)
  {
    this.zzaoW = paramBoolean;
    return this;
  }
  
  public Builder setTrackingTag(String paramString)
  {
    boolean bool = ExecutionOptions.zzcX(paramString);
    if (!bool)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      Object[] arrayOfObject = new Object[1];
      Integer localInteger = Integer.valueOf(65536);
      arrayOfObject[0] = localInteger;
      String str = String.format("trackingTag must not be null nor empty, and the length must be <= the maximum length (%s)", arrayOfObject);
      localIllegalArgumentException.<init>(str);
      throw localIllegalArgumentException;
    }
    this.zzaoV = paramString;
    return this;
  }
  
  protected void zzsE()
  {
    int i = this.zzaoX;
    int j = 1;
    if (i == j)
    {
      boolean bool = this.zzaoW;
      if (!bool)
      {
        IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
        localIllegalStateException.<init>("Cannot use CONFLICT_STRATEGY_KEEP_REMOTE without requesting completion notifications");
        throw localIllegalStateException;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\ExecutionOptions$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */