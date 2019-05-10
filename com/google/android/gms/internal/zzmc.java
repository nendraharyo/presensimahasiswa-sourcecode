package com.google.android.gms.internal;

import android.graphics.Canvas;
import android.graphics.Path;
import android.net.Uri;
import android.widget.ImageView;

public final class zzmc
  extends ImageView
{
  private Uri zzakr;
  private int zzaks;
  private int zzakt;
  private zzmc.zza zzaku;
  private int zzakv;
  private float zzakw;
  
  protected void onDraw(Canvas paramCanvas)
  {
    Object localObject = this.zzaku;
    if (localObject != null)
    {
      localObject = this.zzaku;
      int i = getWidth();
      int j = getHeight();
      localObject = ((zzmc.zza)localObject).zzl(i, j);
      paramCanvas.clipPath((Path)localObject);
    }
    super.onDraw(paramCanvas);
    int k = this.zzakt;
    if (k != 0)
    {
      k = this.zzakt;
      paramCanvas.drawColor(k);
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    int i = this.zzakv;
    float f2;
    int j;
    switch (i)
    {
    default: 
      return;
    case 1: 
      i = getMeasuredHeight();
      float f1 = i;
      f2 = this.zzakw;
      f1 *= f2;
      j = (int)f1;
    }
    for (;;)
    {
      setMeasuredDimension(j, i);
      break;
      j = getMeasuredWidth();
      float f3 = j;
      f2 = this.zzakw;
      f3 /= f2;
      i = (int)f3;
    }
  }
  
  public void zzbO(int paramInt)
  {
    this.zzaks = paramInt;
  }
  
  public void zzm(Uri paramUri)
  {
    this.zzakr = paramUri;
  }
  
  public int zzqp()
  {
    return this.zzaks;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzmc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */