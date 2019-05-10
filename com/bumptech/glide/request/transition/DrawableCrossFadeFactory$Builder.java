package com.bumptech.glide.request.transition;

public class DrawableCrossFadeFactory$Builder
{
  private static final int DEFAULT_DURATION_MS = 300;
  private final int durationMillis;
  private boolean isCrossFadeEnabled;
  
  public DrawableCrossFadeFactory$Builder()
  {
    this(300);
  }
  
  public DrawableCrossFadeFactory$Builder(int paramInt)
  {
    this.durationMillis = paramInt;
  }
  
  public DrawableCrossFadeFactory build()
  {
    DrawableCrossFadeFactory localDrawableCrossFadeFactory = new com/bumptech/glide/request/transition/DrawableCrossFadeFactory;
    int i = this.durationMillis;
    boolean bool = this.isCrossFadeEnabled;
    localDrawableCrossFadeFactory.<init>(i, bool);
    return localDrawableCrossFadeFactory;
  }
  
  public Builder setCrossFadeEnabled(boolean paramBoolean)
  {
    this.isCrossFadeEnabled = paramBoolean;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\request\transition\DrawableCrossFadeFactory$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */