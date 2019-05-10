package com.google.android.gms.appdatasearch;

public final class UsageInfo$zza
{
  private String zzOJ;
  private DocumentId zzUs;
  private long zzUt = -1;
  private int zzUu;
  private DocumentContents zzUv;
  private boolean zzUw;
  private int zzUx;
  private int zzUy;
  
  public UsageInfo$zza()
  {
    this.zzUu = i;
    this.zzUx = i;
    this.zzUw = false;
    this.zzUy = 0;
  }
  
  public zza zzO(boolean paramBoolean)
  {
    this.zzUw = paramBoolean;
    return this;
  }
  
  public zza zza(DocumentContents paramDocumentContents)
  {
    this.zzUv = paramDocumentContents;
    return this;
  }
  
  public zza zza(DocumentId paramDocumentId)
  {
    this.zzUs = paramDocumentId;
    return this;
  }
  
  public zza zzar(int paramInt)
  {
    this.zzUu = paramInt;
    return this;
  }
  
  public zza zzas(int paramInt)
  {
    this.zzUy = paramInt;
    return this;
  }
  
  public UsageInfo zzmi()
  {
    UsageInfo localUsageInfo = new com/google/android/gms/appdatasearch/UsageInfo;
    DocumentId localDocumentId = this.zzUs;
    long l = this.zzUt;
    int i = this.zzUu;
    String str = this.zzOJ;
    DocumentContents localDocumentContents = this.zzUv;
    boolean bool = this.zzUw;
    int j = this.zzUx;
    int k = this.zzUy;
    localUsageInfo.<init>(localDocumentId, l, i, str, localDocumentContents, bool, j, k, null);
    return localUsageInfo;
  }
  
  public zza zzw(long paramLong)
  {
    this.zzUt = paramLong;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\appdatasearch\UsageInfo$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */