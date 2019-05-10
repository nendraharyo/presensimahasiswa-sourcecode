package android.support.v4.app;

import android.app.Notification;
import android.app.Notification.Action;
import android.app.Notification.Action.Builder;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class x
  implements v
{
  private final Notification.Builder a;
  private final w.c b;
  private RemoteViews c;
  private RemoteViews d;
  private final List e;
  private final Bundle f;
  private int g;
  private RemoteViews h;
  
  x(w.c paramc)
  {
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    this.e = ((List)localObject1);
    localObject1 = new android/os/Bundle;
    ((Bundle)localObject1).<init>();
    this.f = ((Bundle)localObject1);
    this.b = paramc;
    int i3 = Build.VERSION.SDK_INT;
    Object localObject2;
    Object localObject3;
    long l;
    int i12;
    int i14;
    Object localObject4;
    label258:
    label286:
    label314:
    int i6;
    if (i3 >= i)
    {
      localObject1 = new android/app/Notification$Builder;
      localObject2 = paramc.a;
      localObject3 = paramc.H;
      ((Notification.Builder)localObject1).<init>((Context)localObject2, (String)localObject3);
      this.a = ((Notification.Builder)localObject1);
      localObject2 = paramc.M;
      localObject1 = this.a;
      l = ((Notification)localObject2).when;
      localObject1 = ((Notification.Builder)localObject1).setWhen(l);
      i12 = ((Notification)localObject2).icon;
      i14 = ((Notification)localObject2).iconLevel;
      localObject1 = ((Notification.Builder)localObject1).setSmallIcon(i12, i14);
      localObject3 = ((Notification)localObject2).contentView;
      localObject1 = ((Notification.Builder)localObject1).setContent((RemoteViews)localObject3);
      localObject3 = ((Notification)localObject2).tickerText;
      localObject4 = paramc.g;
      localObject1 = ((Notification.Builder)localObject1).setTicker((CharSequence)localObject3, (RemoteViews)localObject4);
      localObject3 = ((Notification)localObject2).vibrate;
      localObject1 = ((Notification.Builder)localObject1).setVibrate((long[])localObject3);
      i12 = ((Notification)localObject2).ledARGB;
      i14 = ((Notification)localObject2).ledOnMS;
      int i15 = ((Notification)localObject2).ledOffMS;
      localObject3 = ((Notification.Builder)localObject1).setLights(i12, i14, i15);
      i3 = ((Notification)localObject2).flags & 0x2;
      if (i3 == 0) {
        break label695;
      }
      i3 = m;
      localObject3 = ((Notification.Builder)localObject3).setOngoing(i3);
      int i4 = ((Notification)localObject2).flags & 0x8;
      if (i4 == 0) {
        break label704;
      }
      i4 = m;
      localObject3 = ((Notification.Builder)localObject3).setOnlyAlertOnce(i4);
      int i5 = ((Notification)localObject2).flags & 0x10;
      if (i5 == 0) {
        break label713;
      }
      i5 = m;
      localObject1 = ((Notification.Builder)localObject3).setAutoCancel(i5);
      i12 = ((Notification)localObject2).defaults;
      localObject1 = ((Notification.Builder)localObject1).setDefaults(i12);
      localObject3 = paramc.c;
      localObject1 = ((Notification.Builder)localObject1).setContentTitle((CharSequence)localObject3);
      localObject3 = paramc.d;
      localObject1 = ((Notification.Builder)localObject1).setContentText((CharSequence)localObject3);
      localObject3 = paramc.i;
      localObject1 = ((Notification.Builder)localObject1).setContentInfo((CharSequence)localObject3);
      localObject3 = paramc.e;
      localObject1 = ((Notification.Builder)localObject1).setContentIntent((PendingIntent)localObject3);
      localObject3 = ((Notification)localObject2).deleteIntent;
      localObject3 = ((Notification.Builder)localObject1).setDeleteIntent((PendingIntent)localObject3);
      localObject4 = paramc.f;
      i6 = ((Notification)localObject2).flags & 0x80;
      if (i6 == 0) {
        break label722;
      }
      i6 = m;
    }
    for (;;)
    {
      localObject1 = ((Notification.Builder)localObject3).setFullScreenIntent((PendingIntent)localObject4, i6);
      localObject3 = paramc.h;
      localObject1 = ((Notification.Builder)localObject1).setLargeIcon((Bitmap)localObject3);
      i12 = paramc.j;
      localObject1 = ((Notification.Builder)localObject1).setNumber(i12);
      i12 = paramc.q;
      i14 = paramc.r;
      boolean bool9 = paramc.s;
      ((Notification.Builder)localObject1).setProgress(i12, i14, bool9);
      int i7 = Build.VERSION.SDK_INT;
      if (i7 < k)
      {
        localObject1 = this.a;
        localObject3 = ((Notification)localObject2).sound;
        i14 = ((Notification)localObject2).audioStreamType;
        ((Notification.Builder)localObject1).setSound((Uri)localObject3, i14);
      }
      i7 = Build.VERSION.SDK_INT;
      i12 = 16;
      if (i7 < i12) {
        break label932;
      }
      localObject1 = this.a;
      localObject3 = paramc.o;
      localObject1 = ((Notification.Builder)localObject1).setSubText((CharSequence)localObject3);
      boolean bool8 = paramc.m;
      localObject1 = ((Notification.Builder)localObject1).setUsesChronometer(bool8);
      int i13 = paramc.k;
      ((Notification.Builder)localObject1).setPriority(i13);
      localObject1 = paramc.b;
      localObject3 = ((ArrayList)localObject1).iterator();
      for (;;)
      {
        bool3 = ((Iterator)localObject3).hasNext();
        if (!bool3) {
          break;
        }
        localObject1 = (w.a)((Iterator)localObject3).next();
        a((w.a)localObject1);
      }
      localObject1 = new android/app/Notification$Builder;
      localObject2 = paramc.a;
      ((Notification.Builder)localObject1).<init>((Context)localObject2);
      this.a = ((Notification.Builder)localObject1);
      break;
      label695:
      boolean bool3 = false;
      localObject1 = null;
      break label258;
      label704:
      bool3 = false;
      localObject1 = null;
      break label286;
      label713:
      bool3 = false;
      localObject1 = null;
      break label314;
      label722:
      bool3 = false;
      localObject1 = null;
    }
    localObject1 = paramc.A;
    if (localObject1 != null)
    {
      localObject1 = this.f;
      localObject3 = paramc.A;
      ((Bundle)localObject1).putAll((Bundle)localObject3);
    }
    int i8 = Build.VERSION.SDK_INT;
    if (i8 < j)
    {
      boolean bool4 = paramc.w;
      if (bool4)
      {
        localObject1 = this.f;
        localObject3 = "android.support.localOnly";
        ((Bundle)localObject1).putBoolean((String)localObject3, m);
      }
      localObject1 = paramc.t;
      if (localObject1 != null)
      {
        localObject1 = this.f;
        localObject3 = "android.support.groupKey";
        localObject4 = paramc.t;
        ((Bundle)localObject1).putString((String)localObject3, (String)localObject4);
        bool4 = paramc.u;
        if (!bool4) {
          break label1309;
        }
        localObject1 = this.f;
        localObject3 = "android.support.isGroupSummary";
        ((Bundle)localObject1).putBoolean((String)localObject3, m);
      }
    }
    Object localObject5;
    for (;;)
    {
      localObject1 = paramc.v;
      if (localObject1 != null)
      {
        localObject1 = this.f;
        localObject5 = "android.support.sortKey";
        localObject3 = paramc.v;
        ((Bundle)localObject1).putString((String)localObject5, (String)localObject3);
      }
      localObject1 = paramc.E;
      this.c = ((RemoteViews)localObject1);
      localObject1 = paramc.F;
      this.d = ((RemoteViews)localObject1);
      label932:
      int i9 = Build.VERSION.SDK_INT;
      int n = 19;
      boolean bool1;
      if (i9 >= n)
      {
        localObject1 = this.a;
        bool1 = paramc.l;
        ((Notification.Builder)localObject1).setShowWhen(bool1);
        i9 = Build.VERSION.SDK_INT;
        if (i9 < k)
        {
          localObject1 = paramc.N;
          if (localObject1 != null)
          {
            localObject1 = paramc.N;
            boolean bool5 = ((ArrayList)localObject1).isEmpty();
            if (!bool5)
            {
              localObject5 = this.f;
              localObject3 = "android.people";
              localObject1 = paramc.N;
              i14 = paramc.N.size();
              localObject4 = new String[i14];
              localObject1 = (String[])((ArrayList)localObject1).toArray((Object[])localObject4);
              ((Bundle)localObject5).putStringArray((String)localObject3, (String[])localObject1);
            }
          }
        }
      }
      int i10 = Build.VERSION.SDK_INT;
      if (i10 >= j)
      {
        localObject1 = this.a;
        bool1 = paramc.w;
        localObject1 = ((Notification.Builder)localObject1).setLocalOnly(bool1);
        localObject5 = paramc.t;
        localObject1 = ((Notification.Builder)localObject1).setGroup((String)localObject5);
        bool1 = paramc.u;
        localObject1 = ((Notification.Builder)localObject1).setGroupSummary(bool1);
        localObject5 = paramc.v;
        ((Notification.Builder)localObject1).setSortKey((String)localObject5);
        i10 = paramc.L;
        this.g = i10;
      }
      i10 = Build.VERSION.SDK_INT;
      if (i10 < k) {
        break label1344;
      }
      localObject1 = this.a;
      localObject5 = paramc.z;
      localObject1 = ((Notification.Builder)localObject1).setCategory((String)localObject5);
      int i1 = paramc.B;
      localObject1 = ((Notification.Builder)localObject1).setColor(i1);
      i1 = paramc.C;
      localObject1 = ((Notification.Builder)localObject1).setVisibility(i1);
      localObject5 = paramc.D;
      localObject1 = ((Notification.Builder)localObject1).setPublicVersion((Notification)localObject5);
      localObject5 = ((Notification)localObject2).sound;
      localObject2 = ((Notification)localObject2).audioAttributes;
      ((Notification.Builder)localObject1).setSound((Uri)localObject5, (AudioAttributes)localObject2);
      localObject1 = paramc.N;
      localObject5 = ((ArrayList)localObject1).iterator();
      for (;;)
      {
        boolean bool6 = ((Iterator)localObject5).hasNext();
        if (!bool6) {
          break;
        }
        localObject1 = (String)((Iterator)localObject5).next();
        localObject2 = this.a;
        ((Notification.Builder)localObject2).addPerson((String)localObject1);
      }
      label1309:
      localObject1 = this.f;
      localObject3 = "android.support.useSideChannel";
      ((Bundle)localObject1).putBoolean((String)localObject3, i1);
    }
    localObject1 = paramc.G;
    this.h = ((RemoteViews)localObject1);
    label1344:
    int i11 = Build.VERSION.SDK_INT;
    int i2 = 24;
    if (i11 >= i2)
    {
      localObject1 = this.a;
      localObject5 = paramc.A;
      localObject1 = ((Notification.Builder)localObject1).setExtras((Bundle)localObject5);
      localObject5 = paramc.p;
      ((Notification.Builder)localObject1).setRemoteInputHistory((CharSequence[])localObject5);
      localObject1 = paramc.E;
      if (localObject1 != null)
      {
        localObject1 = this.a;
        localObject5 = paramc.E;
        ((Notification.Builder)localObject1).setCustomContentView((RemoteViews)localObject5);
      }
      localObject1 = paramc.F;
      if (localObject1 != null)
      {
        localObject1 = this.a;
        localObject5 = paramc.F;
        ((Notification.Builder)localObject1).setCustomBigContentView((RemoteViews)localObject5);
      }
      localObject1 = paramc.G;
      if (localObject1 != null)
      {
        localObject1 = this.a;
        localObject5 = paramc.G;
        ((Notification.Builder)localObject1).setCustomHeadsUpContentView((RemoteViews)localObject5);
      }
    }
    i11 = Build.VERSION.SDK_INT;
    if (i11 >= i)
    {
      localObject1 = this.a;
      i2 = paramc.I;
      localObject1 = ((Notification.Builder)localObject1).setBadgeIconType(i2);
      localObject5 = paramc.J;
      localObject1 = ((Notification.Builder)localObject1).setShortcutId((String)localObject5);
      l = paramc.K;
      localObject1 = ((Notification.Builder)localObject1).setTimeoutAfter(l);
      i2 = paramc.L;
      ((Notification.Builder)localObject1).setGroupAlertBehavior(i2);
      boolean bool7 = paramc.y;
      boolean bool2;
      if (bool7)
      {
        localObject1 = this.a;
        bool2 = paramc.x;
        ((Notification.Builder)localObject1).setColorized(bool2);
      }
      localObject1 = paramc.H;
      bool7 = TextUtils.isEmpty((CharSequence)localObject1);
      if (!bool7)
      {
        localObject1 = this.a.setSound(null).setDefaults(0).setLights(0, 0, 0);
        bool2 = false;
        localObject5 = null;
        ((Notification.Builder)localObject1).setVibrate(null);
      }
    }
  }
  
  private void a(Notification paramNotification)
  {
    paramNotification.sound = null;
    paramNotification.vibrate = null;
    int i = paramNotification.defaults & 0xFFFFFFFE;
    paramNotification.defaults = i;
    i = paramNotification.defaults & 0xFFFFFFFD;
    paramNotification.defaults = i;
  }
  
  private void a(w.a parama)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 20;
    Object localObject1;
    Object localObject3;
    if (i >= j)
    {
      localObject1 = new android/app/Notification$Action$Builder;
      i = parama.a();
      Object localObject2 = parama.b();
      PendingIntent localPendingIntent = parama.c();
      ((Notification.Action.Builder)localObject1).<init>(i, (CharSequence)localObject2, localPendingIntent);
      localObject3 = parama.f();
      if (localObject3 != null)
      {
        localObject2 = aa.a(parama.f());
        int k = localObject2.length;
        i = 0;
        localObject3 = null;
        while (i < k)
        {
          RemoteInput localRemoteInput = localObject2[i];
          ((Notification.Action.Builder)localObject1).addRemoteInput(localRemoteInput);
          i += 1;
        }
      }
      localObject3 = parama.d();
      if (localObject3 != null)
      {
        localObject3 = new android/os/Bundle;
        localObject2 = parama.d();
        ((Bundle)localObject3).<init>((Bundle)localObject2);
        localObject2 = "android.support.allowGeneratedReplies";
        boolean bool1 = parama.e();
        ((Bundle)localObject3).putBoolean((String)localObject2, bool1);
        int n = Build.VERSION.SDK_INT;
        int m = 24;
        if (n >= m)
        {
          boolean bool2 = parama.e();
          ((Notification.Action.Builder)localObject1).setAllowGeneratedReplies(bool2);
        }
        ((Notification.Action.Builder)localObject1).addExtras((Bundle)localObject3);
        localObject3 = this.a;
        localObject1 = ((Notification.Action.Builder)localObject1).build();
        ((Notification.Builder)localObject3).addAction((Notification.Action)localObject1);
      }
    }
    for (;;)
    {
      return;
      localObject3 = new android/os/Bundle;
      ((Bundle)localObject3).<init>();
      break;
      i = Build.VERSION.SDK_INT;
      j = 16;
      if (i >= j)
      {
        localObject3 = this.e;
        localObject1 = y.a(this.a, parama);
        ((List)localObject3).add(localObject1);
      }
    }
  }
  
  public Notification.Builder a()
  {
    return this.a;
  }
  
  public Notification b()
  {
    int i = 16;
    Object localObject = this.b;
    w.d locald = ((w.c)localObject).n;
    if (locald != null) {
      locald.a(this);
    }
    Notification localNotification;
    if (locald != null)
    {
      localObject = locald.b(this);
      localNotification = c();
      if (localObject == null) {
        break label162;
      }
      localNotification.contentView = ((RemoteViews)localObject);
    }
    for (;;)
    {
      int j = Build.VERSION.SDK_INT;
      if ((j >= i) && (locald != null))
      {
        localObject = locald.c(this);
        if (localObject != null) {
          localNotification.bigContentView = ((RemoteViews)localObject);
        }
      }
      j = Build.VERSION.SDK_INT;
      int k = 21;
      if ((j >= k) && (locald != null))
      {
        localObject = this.b.n.d(this);
        if (localObject != null) {
          localNotification.headsUpContentView = ((RemoteViews)localObject);
        }
      }
      j = Build.VERSION.SDK_INT;
      if ((j >= i) && (locald != null))
      {
        localObject = w.a(localNotification);
        if (localObject != null) {
          locald.a((Bundle)localObject);
        }
      }
      return localNotification;
      j = 0;
      localObject = null;
      break;
      label162:
      localObject = this.b.E;
      if (localObject != null)
      {
        localObject = this.b.E;
        localNotification.contentView = ((RemoteViews)localObject);
      }
    }
  }
  
  protected Notification c()
  {
    int i = 2;
    int j = 1;
    int k = Build.VERSION.SDK_INT;
    int m = 26;
    Object localObject1;
    if (k >= m) {
      localObject1 = this.a.build();
    }
    for (;;)
    {
      return (Notification)localObject1;
      k = Build.VERSION.SDK_INT;
      m = 24;
      Object localObject2;
      if (k >= m)
      {
        localObject1 = this.a.build();
        m = this.g;
        if (m != 0)
        {
          localObject2 = ((Notification)localObject1).getGroup();
          if (localObject2 != null)
          {
            m = ((Notification)localObject1).flags & 0x200;
            if (m != 0)
            {
              m = this.g;
              if (m == i) {
                a((Notification)localObject1);
              }
            }
          }
          localObject2 = ((Notification)localObject1).getGroup();
          if (localObject2 != null)
          {
            m = ((Notification)localObject1).flags & 0x200;
            if (m == 0)
            {
              m = this.g;
              if (m == j) {
                a((Notification)localObject1);
              }
            }
          }
        }
      }
      else
      {
        k = Build.VERSION.SDK_INT;
        m = 21;
        if (k >= m)
        {
          localObject1 = this.a;
          localObject2 = this.f;
          ((Notification.Builder)localObject1).setExtras((Bundle)localObject2);
          localObject1 = this.a.build();
          localObject2 = this.c;
          if (localObject2 != null)
          {
            localObject2 = this.c;
            ((Notification)localObject1).contentView = ((RemoteViews)localObject2);
          }
          localObject2 = this.d;
          if (localObject2 != null)
          {
            localObject2 = this.d;
            ((Notification)localObject1).bigContentView = ((RemoteViews)localObject2);
          }
          localObject2 = this.h;
          if (localObject2 != null)
          {
            localObject2 = this.h;
            ((Notification)localObject1).headsUpContentView = ((RemoteViews)localObject2);
          }
          m = this.g;
          if (m != 0)
          {
            localObject2 = ((Notification)localObject1).getGroup();
            if (localObject2 != null)
            {
              m = ((Notification)localObject1).flags & 0x200;
              if (m != 0)
              {
                m = this.g;
                if (m == i) {
                  a((Notification)localObject1);
                }
              }
            }
            localObject2 = ((Notification)localObject1).getGroup();
            if (localObject2 != null)
            {
              m = ((Notification)localObject1).flags & 0x200;
              if (m == 0)
              {
                m = this.g;
                if (m == j) {
                  a((Notification)localObject1);
                }
              }
            }
          }
        }
        else
        {
          k = Build.VERSION.SDK_INT;
          m = 20;
          if (k >= m)
          {
            localObject1 = this.a;
            localObject2 = this.f;
            ((Notification.Builder)localObject1).setExtras((Bundle)localObject2);
            localObject1 = this.a.build();
            localObject2 = this.c;
            if (localObject2 != null)
            {
              localObject2 = this.c;
              ((Notification)localObject1).contentView = ((RemoteViews)localObject2);
            }
            localObject2 = this.d;
            if (localObject2 != null)
            {
              localObject2 = this.d;
              ((Notification)localObject1).bigContentView = ((RemoteViews)localObject2);
            }
            m = this.g;
            if (m != 0)
            {
              localObject2 = ((Notification)localObject1).getGroup();
              if (localObject2 != null)
              {
                m = ((Notification)localObject1).flags & 0x200;
                if (m != 0)
                {
                  m = this.g;
                  if (m == i) {
                    a((Notification)localObject1);
                  }
                }
              }
              localObject2 = ((Notification)localObject1).getGroup();
              if (localObject2 != null)
              {
                m = ((Notification)localObject1).flags & 0x200;
                if (m == 0)
                {
                  m = this.g;
                  if (m == j) {
                    a((Notification)localObject1);
                  }
                }
              }
            }
          }
          else
          {
            k = Build.VERSION.SDK_INT;
            m = 19;
            Object localObject3;
            if (k >= m)
            {
              localObject1 = y.a(this.e);
              if (localObject1 != null)
              {
                localObject2 = this.f;
                localObject3 = "android.support.actionExtras";
                ((Bundle)localObject2).putSparseParcelableArray((String)localObject3, (SparseArray)localObject1);
              }
              localObject1 = this.a;
              localObject2 = this.f;
              ((Notification.Builder)localObject1).setExtras((Bundle)localObject2);
              localObject1 = this.a.build();
              localObject2 = this.c;
              if (localObject2 != null)
              {
                localObject2 = this.c;
                ((Notification)localObject1).contentView = ((RemoteViews)localObject2);
              }
              localObject2 = this.d;
              if (localObject2 != null)
              {
                localObject2 = this.d;
                ((Notification)localObject1).bigContentView = ((RemoteViews)localObject2);
              }
            }
            else
            {
              k = Build.VERSION.SDK_INT;
              m = 16;
              if (k >= m)
              {
                localObject2 = this.a.build();
                localObject3 = w.a((Notification)localObject2);
                Object localObject4 = new android/os/Bundle;
                localObject1 = this.f;
                ((Bundle)localObject4).<init>((Bundle)localObject1);
                localObject1 = this.f.keySet();
                Iterator localIterator = ((Set)localObject1).iterator();
                for (;;)
                {
                  boolean bool1 = localIterator.hasNext();
                  if (!bool1) {
                    break;
                  }
                  localObject1 = (String)localIterator.next();
                  boolean bool2 = ((Bundle)localObject3).containsKey((String)localObject1);
                  if (bool2) {
                    ((Bundle)localObject4).remove((String)localObject1);
                  }
                }
                ((Bundle)localObject3).putAll((Bundle)localObject4);
                localObject1 = y.a(this.e);
                if (localObject1 != null)
                {
                  localObject3 = w.a((Notification)localObject2);
                  localObject4 = "android.support.actionExtras";
                  ((Bundle)localObject3).putSparseParcelableArray((String)localObject4, (SparseArray)localObject1);
                }
                localObject1 = this.c;
                if (localObject1 != null)
                {
                  localObject1 = this.c;
                  ((Notification)localObject2).contentView = ((RemoteViews)localObject1);
                }
                localObject1 = this.d;
                if (localObject1 != null)
                {
                  localObject1 = this.d;
                  ((Notification)localObject2).bigContentView = ((RemoteViews)localObject1);
                }
                localObject1 = localObject2;
              }
              else
              {
                localObject1 = this.a.getNotification();
              }
            }
          }
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\app\x.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */