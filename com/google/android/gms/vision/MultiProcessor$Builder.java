package com.google.android.gms.vision;

public class MultiProcessor$Builder
{
  private MultiProcessor zzbns;
  
  public MultiProcessor$Builder(MultiProcessor.Factory paramFactory)
  {
    Object localObject = new com/google/android/gms/vision/MultiProcessor;
    ((MultiProcessor)localObject).<init>(null);
    this.zzbns = ((MultiProcessor)localObject);
    if (paramFactory == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("No factory supplied.");
      throw ((Throwable)localObject);
    }
    MultiProcessor.zza(this.zzbns, paramFactory);
  }
  
  public MultiProcessor build()
  {
    return this.zzbns;
  }
  
  public Builder setMaxGapFrames(int paramInt)
  {
    if (paramInt < 0)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "Invalid max gap: " + paramInt;
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    MultiProcessor.zza(this.zzbns, paramInt);
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\MultiProcessor$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */