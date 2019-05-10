package com.google.android.gms.ads.formats;

public final class NativeAdOptions
{
  public static final int ORIENTATION_ANY = 0;
  public static final int ORIENTATION_LANDSCAPE = 2;
  public static final int ORIENTATION_PORTRAIT = 1;
  private final boolean zzoN;
  private final int zzoO;
  private final boolean zzoP;
  
  private NativeAdOptions(NativeAdOptions.Builder paramBuilder)
  {
    boolean bool1 = NativeAdOptions.Builder.zza(paramBuilder);
    this.zzoN = bool1;
    int i = NativeAdOptions.Builder.zzb(paramBuilder);
    this.zzoO = i;
    boolean bool2 = NativeAdOptions.Builder.zzc(paramBuilder);
    this.zzoP = bool2;
  }
  
  public int getImageOrientation()
  {
    return this.zzoO;
  }
  
  public boolean shouldRequestMultipleImages()
  {
    return this.zzoP;
  }
  
  public boolean shouldReturnUrlsForImageAssets()
  {
    return this.zzoN;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\formats\NativeAdOptions.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */