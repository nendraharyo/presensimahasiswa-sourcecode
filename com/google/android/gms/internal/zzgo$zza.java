package com.google.android.gms.internal;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.os.AsyncTask;
import android.os.Handler;
import android.view.View.MeasureSpec;
import android.webkit.WebView;

public final class zzgo$zza
  extends AsyncTask
{
  private final WebView zzGp;
  private Bitmap zzGq;
  
  public zzgo$zza(zzgo paramzzgo, WebView paramWebView)
  {
    this.zzGp = paramWebView;
  }
  
  protected void onPreExecute()
  {
    try
    {
      Object localObject1 = this.zzGr;
      int i = zzgo.zza((zzgo)localObject1);
      Object localObject3 = this.zzGr;
      int j = zzgo.zzb((zzgo)localObject3);
      Object localObject4 = Bitmap.Config.ARGB_8888;
      localObject1 = Bitmap.createBitmap(i, j, (Bitmap.Config)localObject4);
      this.zzGq = ((Bitmap)localObject1);
      localObject1 = this.zzGp;
      j = 0;
      localObject3 = null;
      ((WebView)localObject1).setVisibility(0);
      localObject1 = this.zzGp;
      localObject3 = this.zzGr;
      j = zzgo.zza((zzgo)localObject3);
      int k = 0;
      localObject4 = null;
      j = View.MeasureSpec.makeMeasureSpec(j, 0);
      localObject4 = this.zzGr;
      k = zzgo.zzb((zzgo)localObject4);
      int m = 0;
      zzgo localzzgo1 = null;
      k = View.MeasureSpec.makeMeasureSpec(k, 0);
      ((WebView)localObject1).measure(j, k);
      localObject1 = this.zzGp;
      j = 0;
      localObject3 = null;
      k = 0;
      localObject4 = null;
      localzzgo1 = this.zzGr;
      m = zzgo.zza(localzzgo1);
      zzgo localzzgo2 = this.zzGr;
      int n = zzgo.zzb(localzzgo2);
      ((WebView)localObject1).layout(0, 0, m, n);
      localObject1 = new android/graphics/Canvas;
      localObject3 = this.zzGq;
      ((Canvas)localObject1).<init>((Bitmap)localObject3);
      localObject3 = this.zzGp;
      ((WebView)localObject3).draw((Canvas)localObject1);
      localObject1 = this.zzGp;
      ((WebView)localObject1).invalidate();
      return;
    }
    finally {}
  }
  
  /* Error */
  protected Boolean zza(Void... paramVarArgs)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 51	com/google/android/gms/internal/zzgo$zza:zzGq	Landroid/graphics/Bitmap;
    //   6: astore_2
    //   7: aload_2
    //   8: invokevirtual 87	android/graphics/Bitmap:getWidth	()I
    //   11: istore_3
    //   12: aload_0
    //   13: getfield 51	com/google/android/gms/internal/zzgo$zza:zzGq	Landroid/graphics/Bitmap;
    //   16: astore_2
    //   17: aload_2
    //   18: invokevirtual 90	android/graphics/Bitmap:getHeight	()I
    //   21: istore 4
    //   23: iload_3
    //   24: ifeq +8 -> 32
    //   27: iload 4
    //   29: ifne +17 -> 46
    //   32: iconst_0
    //   33: istore 5
    //   35: aconst_null
    //   36: astore_2
    //   37: iconst_0
    //   38: invokestatic 94	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   41: astore_2
    //   42: aload_0
    //   43: monitorexit
    //   44: aload_2
    //   45: areturn
    //   46: iconst_0
    //   47: istore 6
    //   49: iconst_0
    //   50: istore 5
    //   52: aconst_null
    //   53: astore_2
    //   54: iload 6
    //   56: iload_3
    //   57: if_icmpge +65 -> 122
    //   60: iconst_0
    //   61: istore 7
    //   63: iload 7
    //   65: iload 4
    //   67: if_icmpge +41 -> 108
    //   70: aload_0
    //   71: getfield 51	com/google/android/gms/internal/zzgo$zza:zzGq	Landroid/graphics/Bitmap;
    //   74: astore 8
    //   76: aload 8
    //   78: iload 6
    //   80: iload 7
    //   82: invokevirtual 97	android/graphics/Bitmap:getPixel	(II)I
    //   85: istore 9
    //   87: iload 9
    //   89: ifeq +9 -> 98
    //   92: iload 5
    //   94: iconst_1
    //   95: iadd
    //   96: istore 5
    //   98: iload 7
    //   100: bipush 10
    //   102: iadd
    //   103: istore 7
    //   105: goto -42 -> 63
    //   108: iload 6
    //   110: bipush 10
    //   112: iadd
    //   113: istore 7
    //   115: iload 7
    //   117: istore 6
    //   119: goto -65 -> 54
    //   122: iload 5
    //   124: i2d
    //   125: dstore 10
    //   127: iload_3
    //   128: iload 4
    //   130: imul
    //   131: i2d
    //   132: dstore 12
    //   134: ldc2_w 100
    //   137: dstore 14
    //   139: dload 12
    //   141: dload 14
    //   143: ddiv
    //   144: dstore 12
    //   146: dload 10
    //   148: dload 12
    //   150: ddiv
    //   151: dstore 10
    //   153: ldc2_w 104
    //   156: dstore 12
    //   158: dload 10
    //   160: dload 12
    //   162: dcmpl
    //   163: istore 5
    //   165: iload 5
    //   167: ifle +15 -> 182
    //   170: iconst_1
    //   171: istore 5
    //   173: iload 5
    //   175: invokestatic 94	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   178: astore_2
    //   179: goto -137 -> 42
    //   182: iconst_0
    //   183: istore 5
    //   185: aconst_null
    //   186: astore_2
    //   187: goto -14 -> 173
    //   190: astore_2
    //   191: aload_0
    //   192: monitorexit
    //   193: aload_2
    //   194: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	195	0	this	zza
    //   0	195	1	paramVarArgs	Void[]
    //   6	181	2	localObject1	Object
    //   190	4	2	localObject2	Object
    //   11	120	3	i	int
    //   21	110	4	j	int
    //   33	90	5	k	int
    //   163	21	5	bool	boolean
    //   47	71	6	m	int
    //   61	55	7	n	int
    //   74	3	8	localBitmap	Bitmap
    //   85	3	9	i1	int
    //   125	34	10	d1	double
    //   132	29	12	d2	double
    //   137	5	14	d3	double
    // Exception table:
    //   from	to	target	type
    //   2	6	190	finally
    //   7	11	190	finally
    //   12	16	190	finally
    //   17	21	190	finally
    //   37	41	190	finally
    //   70	74	190	finally
    //   80	85	190	finally
    //   173	178	190	finally
  }
  
  protected void zza(Boolean paramBoolean)
  {
    long l1 = 0L;
    Object localObject1 = this.zzGr;
    zzgo.zzc((zzgo)localObject1);
    boolean bool1 = paramBoolean.booleanValue();
    long l2;
    if (!bool1)
    {
      localObject1 = this.zzGr;
      bool1 = ((zzgo)localObject1).zzgg();
      if (!bool1)
      {
        localObject1 = this.zzGr;
        l2 = zzgo.zzd((zzgo)localObject1);
        bool1 = l2 < l1;
        if (bool1) {
          break label119;
        }
      }
    }
    localObject1 = this.zzGr;
    boolean bool2 = paramBoolean.booleanValue();
    ((zzgo)localObject1).zzGo = bool2;
    localObject1 = zzgo.zze(this.zzGr);
    Object localObject2 = this.zzGr.zzpD;
    boolean bool3 = true;
    ((zzjq.zza)localObject1).zza((zzjp)localObject2, bool3);
    for (;;)
    {
      return;
      label119:
      localObject1 = this.zzGr;
      l2 = zzgo.zzd((zzgo)localObject1);
      bool1 = l2 < l1;
      if (bool1)
      {
        bool1 = zzin.zzQ(2);
        if (bool1)
        {
          localObject1 = "Ad not detected, scheduling another run.";
          zzin.zzaI((String)localObject1);
        }
        localObject1 = zzgo.zzg(this.zzGr);
        localObject2 = this.zzGr;
        zzgo localzzgo = this.zzGr;
        l1 = zzgo.zzf(localzzgo);
        ((Handler)localObject1).postDelayed((Runnable)localObject2, l1);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzgo$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */