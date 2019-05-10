package com.bumptech.glide.request.target;

import com.bumptech.glide.util.Util;

public abstract class SimpleTarget
  extends BaseTarget
{
  private final int height;
  private final int width;
  
  public SimpleTarget()
  {
    this(i, i);
  }
  
  public SimpleTarget(int paramInt1, int paramInt2)
  {
    this.width = paramInt1;
    this.height = paramInt2;
  }
  
  public final void getSize(SizeReadyCallback paramSizeReadyCallback)
  {
    int i = this.width;
    int k = this.height;
    boolean bool = Util.isValidDimensions(i, k);
    if (!bool)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ");
      int m = this.width;
      localObject = ((StringBuilder)localObject).append(m).append(" and height: ");
      m = this.height;
      localObject = m + ", either provide dimensions in the constructor or call override()";
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    int j = this.width;
    k = this.height;
    paramSizeReadyCallback.onSizeReady(j, k);
  }
  
  public void removeCallback(SizeReadyCallback paramSizeReadyCallback) {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\request\target\SimpleTarget.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */