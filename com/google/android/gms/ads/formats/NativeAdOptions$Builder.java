package com.google.android.gms.ads.formats;

public final class NativeAdOptions$Builder
{
  private boolean zzoN = false;
  private int zzoO = 0;
  private boolean zzoP = false;
  
  public NativeAdOptions build()
  {
    NativeAdOptions localNativeAdOptions = new com/google/android/gms/ads/formats/NativeAdOptions;
    localNativeAdOptions.<init>(this, null);
    return localNativeAdOptions;
  }
  
  public Builder setImageOrientation(int paramInt)
  {
    this.zzoO = paramInt;
    return this;
  }
  
  public Builder setRequestMultipleImages(boolean paramBoolean)
  {
    this.zzoP = paramBoolean;
    return this;
  }
  
  public Builder setReturnUrlsForImageAssets(boolean paramBoolean)
  {
    this.zzoN = paramBoolean;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\formats\NativeAdOptions$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */