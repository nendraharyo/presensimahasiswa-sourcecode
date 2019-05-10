package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.media.AudioAttributes.Builder;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;

public class w$c
{
  Bundle A;
  int B;
  int C;
  Notification D;
  RemoteViews E;
  RemoteViews F;
  RemoteViews G;
  String H;
  int I;
  String J;
  long K;
  int L;
  Notification M;
  public ArrayList N;
  public Context a;
  public ArrayList b;
  CharSequence c;
  CharSequence d;
  PendingIntent e;
  PendingIntent f;
  RemoteViews g;
  Bitmap h;
  CharSequence i;
  int j;
  int k;
  boolean l;
  boolean m;
  w.d n;
  CharSequence o;
  CharSequence[] p;
  int q;
  int r;
  boolean s;
  String t;
  boolean u;
  String v;
  boolean w;
  boolean x;
  boolean y;
  String z;
  
  public w$c(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public w$c(Context paramContext, String paramString)
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.b = ((ArrayList)localObject);
    this.l = true;
    this.w = false;
    this.B = 0;
    this.C = 0;
    this.I = 0;
    this.L = 0;
    localObject = new android/app/Notification;
    ((Notification)localObject).<init>();
    this.M = ((Notification)localObject);
    this.a = paramContext;
    this.H = paramString;
    localObject = this.M;
    long l1 = System.currentTimeMillis();
    ((Notification)localObject).when = l1;
    this.M.audioStreamType = -1;
    this.k = 0;
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.N = ((ArrayList)localObject);
  }
  
  private void a(int paramInt, boolean paramBoolean)
  {
    Notification localNotification;
    int i1;
    if (paramBoolean)
    {
      localNotification = this.M;
      i1 = localNotification.flags | paramInt;
    }
    for (localNotification.flags = i1;; localNotification.flags = i1)
    {
      return;
      localNotification = this.M;
      i1 = localNotification.flags;
      int i2 = paramInt ^ 0xFFFFFFFF;
      i1 &= i2;
    }
  }
  
  protected static CharSequence d(CharSequence paramCharSequence)
  {
    int i1 = 5120;
    if (paramCharSequence == null) {}
    for (;;)
    {
      return paramCharSequence;
      int i2 = paramCharSequence.length();
      if (i2 > i1)
      {
        i2 = 0;
        paramCharSequence = paramCharSequence.subSequence(0, i1);
      }
    }
  }
  
  public Notification a()
  {
    x localx = new android/support/v4/app/x;
    localx.<init>(this);
    return localx.b();
  }
  
  public c a(int paramInt)
  {
    this.M.icon = paramInt;
    return this;
  }
  
  public c a(int paramInt, CharSequence paramCharSequence, PendingIntent paramPendingIntent)
  {
    ArrayList localArrayList = this.b;
    w.a locala = new android/support/v4/app/w$a;
    locala.<init>(paramInt, paramCharSequence, paramPendingIntent);
    localArrayList.add(locala);
    return this;
  }
  
  public c a(long paramLong)
  {
    this.M.when = paramLong;
    return this;
  }
  
  public c a(PendingIntent paramPendingIntent)
  {
    this.e = paramPendingIntent;
    return this;
  }
  
  public c a(Uri paramUri)
  {
    this.M.sound = paramUri;
    Notification localNotification = this.M;
    localNotification.audioStreamType = -1;
    int i1 = Build.VERSION.SDK_INT;
    int i2 = 21;
    if (i1 >= i2)
    {
      localNotification = this.M;
      Object localObject = new android/media/AudioAttributes$Builder;
      ((AudioAttributes.Builder)localObject).<init>();
      localObject = ((AudioAttributes.Builder)localObject).setContentType(4);
      int i3 = 5;
      localObject = ((AudioAttributes.Builder)localObject).setUsage(i3).build();
      localNotification.audioAttributes = ((AudioAttributes)localObject);
    }
    return this;
  }
  
  public c a(w.d paramd)
  {
    w.d locald = this.n;
    if (locald != paramd)
    {
      this.n = paramd;
      locald = this.n;
      if (locald != null)
      {
        locald = this.n;
        locald.a(this);
      }
    }
    return this;
  }
  
  public c a(CharSequence paramCharSequence)
  {
    CharSequence localCharSequence = d(paramCharSequence);
    this.c = localCharSequence;
    return this;
  }
  
  public c a(boolean paramBoolean)
  {
    a(2, paramBoolean);
    return this;
  }
  
  public c b(int paramInt)
  {
    this.k = paramInt;
    return this;
  }
  
  public c b(PendingIntent paramPendingIntent)
  {
    this.M.deleteIntent = paramPendingIntent;
    return this;
  }
  
  public c b(CharSequence paramCharSequence)
  {
    CharSequence localCharSequence = d(paramCharSequence);
    this.d = localCharSequence;
    return this;
  }
  
  public c b(boolean paramBoolean)
  {
    a(16, paramBoolean);
    return this;
  }
  
  public c c(int paramInt)
  {
    this.B = paramInt;
    return this;
  }
  
  public c c(CharSequence paramCharSequence)
  {
    Notification localNotification = this.M;
    CharSequence localCharSequence = d(paramCharSequence);
    localNotification.tickerText = localCharSequence;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\app\w$c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */