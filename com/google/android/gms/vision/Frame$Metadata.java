package com.google.android.gms.vision;

public class Frame$Metadata
{
  private int mId;
  private int zzDE;
  private long zzaJi;
  private int zzoG;
  private int zzoH;
  
  public Frame$Metadata() {}
  
  public Frame$Metadata(Metadata paramMetadata)
  {
    int i = paramMetadata.getWidth();
    this.zzoG = i;
    i = paramMetadata.getHeight();
    this.zzoH = i;
    i = paramMetadata.getId();
    this.mId = i;
    long l = paramMetadata.getTimestampMillis();
    this.zzaJi = l;
    i = paramMetadata.getRotation();
    this.zzDE = i;
  }
  
  public int getHeight()
  {
    return this.zzoH;
  }
  
  public int getId()
  {
    return this.mId;
  }
  
  public int getRotation()
  {
    return this.zzDE;
  }
  
  public long getTimestampMillis()
  {
    return this.zzaJi;
  }
  
  public int getWidth()
  {
    return this.zzoG;
  }
  
  public void zzIf()
  {
    int i = this.zzDE % 2;
    if (i != 0)
    {
      i = this.zzoG;
      int j = this.zzoH;
      this.zzoG = j;
      this.zzoH = i;
    }
    this.zzDE = 0;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\Frame$Metadata.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */