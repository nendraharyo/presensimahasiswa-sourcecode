package android.support.v4.f;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import android.os.Handler;
import android.support.v4.b.h;
import android.support.v4.h.g;
import android.support.v4.h.m;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class b
{
  private static final g a;
  private static final c b;
  private static final Object c;
  private static final m d;
  private static final Comparator e;
  
  static
  {
    Object localObject = new android/support/v4/h/g;
    ((g)localObject).<init>(16);
    a = (g)localObject;
    localObject = new android/support/v4/f/c;
    ((c)localObject).<init>("fonts", 10, 10000);
    b = (c)localObject;
    localObject = new java/lang/Object;
    localObject.<init>();
    c = localObject;
    localObject = new android/support/v4/h/m;
    ((m)localObject).<init>();
    d = (m)localObject;
    localObject = new android/support/v4/f/b$4;
    ((b.4)localObject).<init>();
    e = (Comparator)localObject;
  }
  
  public static ProviderInfo a(PackageManager paramPackageManager, a parama, Resources paramResources)
  {
    int i = 0;
    Object localObject1 = null;
    Object localObject2 = parama.a();
    Object localObject3 = paramPackageManager.resolveContentProvider((String)localObject2, 0);
    if (localObject3 == null)
    {
      localObject1 = new android/content/pm/PackageManager$NameNotFoundException;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject2 = "No package found for authority: " + (String)localObject2;
      ((PackageManager.NameNotFoundException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    Object localObject4 = ((ProviderInfo)localObject3).packageName;
    Object localObject5 = parama.b();
    boolean bool2 = ((String)localObject4).equals(localObject5);
    if (!bool2)
    {
      localObject1 = new android/content/pm/PackageManager$NameNotFoundException;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject2 = ((StringBuilder)localObject3).append("Found content provider ").append((String)localObject2).append(", but package was not ");
      localObject3 = parama.b();
      localObject2 = (String)localObject3;
      ((PackageManager.NameNotFoundException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    localObject2 = ((ProviderInfo)localObject3).packageName;
    int k = 64;
    localObject4 = a(paramPackageManager.getPackageInfo((String)localObject2, k).signatures);
    localObject2 = e;
    Collections.sort((List)localObject4, (Comparator)localObject2);
    localObject5 = a(parama, paramResources);
    int m = 0;
    localObject2 = null;
    i = ((List)localObject5).size();
    if (m < i)
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localObject1 = (Collection)((List)localObject5).get(m);
      localArrayList.<init>((Collection)localObject1);
      localObject1 = e;
      Collections.sort(localArrayList, (Comparator)localObject1);
      boolean bool1 = a((List)localObject4, localArrayList);
      if (!bool1) {}
    }
    for (localObject1 = localObject3;; localObject1 = null)
    {
      return (ProviderInfo)localObject1;
      int j = m + 1;
      m = j;
      break;
      j = 0;
    }
  }
  
  public static Typeface a(Context paramContext, a parama, android.support.v4.a.a.b.a parama1, Handler paramHandler, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    Object localObject1 = null;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    Object localObject5 = parama.f();
    localObject2 = ((StringBuilder)localObject2).append((String)localObject5);
    localObject5 = "-";
    String str = (String)localObject5 + paramInt2;
    localObject2 = (Typeface)a.get(str);
    if (localObject2 != null)
    {
      if (parama1 != null) {
        parama1.onFontRetrieved((Typeface)localObject2);
      }
      localObject1 = localObject2;
    }
    for (;;)
    {
      return (Typeface)localObject1;
      int j;
      if (paramBoolean)
      {
        int i = -1;
        if (paramInt1 == i)
        {
          localObject2 = b(paramContext, parama, paramInt2);
          if (parama1 != null)
          {
            j = ((b.c)localObject2).b;
            if (j != 0) {
              break label148;
            }
            localObject5 = ((b.c)localObject2).a;
            parama1.callbackSuccessAsync((Typeface)localObject5, paramHandler);
          }
          for (;;)
          {
            localObject1 = ((b.c)localObject2).a;
            break;
            label148:
            j = ((b.c)localObject2).b;
            parama1.callbackFailAsync(j, paramHandler);
          }
        }
      }
      b.1 local1 = new android/support/v4/f/b$1;
      local1.<init>(paramContext, parama, paramInt2, str);
      if (paramBoolean) {}
      try
      {
        localObject2 = b;
        localObject2 = ((c)localObject2).a(local1, paramInt1);
        localObject2 = (b.c)localObject2;
        localObject1 = ((b.c)localObject2).a;
      }
      catch (InterruptedException localInterruptedException) {}
      if (parama1 == null) {
        j = 0;
      }
      for (localObject5 = null;; localObject5 = localObject4)
      {
        synchronized (c)
        {
          localObject2 = d;
          boolean bool = ((m)localObject2).containsKey(str);
          if (!bool) {
            break;
          }
          if (localObject5 != null)
          {
            localObject2 = d;
            localObject2 = ((m)localObject2).get(str);
            localObject2 = (ArrayList)localObject2;
            ((ArrayList)localObject2).add(localObject5);
          }
        }
        localObject4 = new android/support/v4/f/b$2;
        ((b.2)localObject4).<init>(parama1, paramHandler);
      }
      if (localObject5 != null)
      {
        localObject4 = new java/util/ArrayList;
        ((ArrayList)localObject4).<init>();
        ((ArrayList)localObject4).add(localObject5);
        localObject5 = d;
        ((m)localObject5).put(str, localObject4);
      }
      Object localObject4 = b;
      localObject5 = new android/support/v4/f/b$3;
      ((b.3)localObject5).<init>(str);
      ((c)localObject4).a(local1, (c.a)localObject5);
    }
  }
  
  public static b.a a(Context paramContext, CancellationSignal paramCancellationSignal, a parama)
  {
    Object localObject1 = paramContext.getPackageManager();
    Object localObject2 = paramContext.getResources();
    localObject1 = a((PackageManager)localObject1, parama, (Resources)localObject2);
    if (localObject1 == null)
    {
      localObject1 = new android/support/v4/f/b$a;
      int i = 1;
      ((b.a)localObject1).<init>(i, null);
    }
    for (;;)
    {
      return (b.a)localObject1;
      localObject1 = ((ProviderInfo)localObject1).authority;
      localObject2 = a(paramContext, parama, (String)localObject1, paramCancellationSignal);
      localObject1 = new android/support/v4/f/b$a;
      ((b.a)localObject1).<init>(0, (b.b[])localObject2);
    }
  }
  
  private static List a(a parama, Resources paramResources)
  {
    List localList = parama.d();
    if (localList != null) {}
    int i;
    for (localList = parama.d();; localList = android.support.v4.a.a.a.a(paramResources, i))
    {
      return localList;
      i = parama.e();
    }
  }
  
  private static List a(Signature[] paramArrayOfSignature)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    int i = 0;
    for (;;)
    {
      int j = paramArrayOfSignature.length;
      if (i >= j) {
        break;
      }
      byte[] arrayOfByte = paramArrayOfSignature[i].toByteArray();
      localArrayList.add(arrayOfByte);
      i += 1;
    }
    return localArrayList;
  }
  
  public static Map a(Context paramContext, b.b[] paramArrayOfb, CancellationSignal paramCancellationSignal)
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    int i = paramArrayOfb.length;
    int j = 0;
    if (j < i)
    {
      Object localObject = paramArrayOfb[j];
      int k = ((b.b)localObject).e();
      if (k != 0) {}
      for (;;)
      {
        j += 1;
        break;
        localObject = ((b.b)localObject).a();
        boolean bool = localHashMap.containsKey(localObject);
        if (!bool)
        {
          ByteBuffer localByteBuffer = h.a(paramContext, paramCancellationSignal, (Uri)localObject);
          localHashMap.put(localObject, localByteBuffer);
        }
      }
    }
    return Collections.unmodifiableMap(localHashMap);
  }
  
  private static boolean a(List paramList1, List paramList2)
  {
    boolean bool1 = false;
    int i = paramList1.size();
    int k = paramList2.size();
    if (i != k) {}
    for (;;)
    {
      return bool1;
      int j;
      for (int m = 0;; m = j)
      {
        i = paramList1.size();
        if (m >= i) {
          break label90;
        }
        byte[] arrayOfByte1 = (byte[])paramList1.get(m);
        byte[] arrayOfByte2 = (byte[])paramList2.get(m);
        boolean bool2 = Arrays.equals(arrayOfByte1, arrayOfByte2);
        if (!bool2) {
          break;
        }
        j = m + 1;
      }
      label90:
      bool1 = true;
    }
  }
  
  static b.b[] a(Context paramContext, a parama, String paramString, CancellationSignal paramCancellationSignal)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = new android/net/Uri$Builder;
    ((Uri.Builder)localObject1).<init>();
    localObject5 = ((Uri.Builder)localObject1).scheme("content").authority(paramString).build();
    localObject1 = new android/net/Uri$Builder;
    ((Uri.Builder)localObject1).<init>();
    localObject1 = ((Uri.Builder)localObject1).scheme("content").authority(paramString);
    Object localObject6 = "file";
    localObject1 = ((Uri.Builder)localObject1).appendPath((String)localObject6);
    Uri localUri = ((Uri.Builder)localObject1).build();
    int i = 0;
    for (;;)
    {
      try
      {
        int j = Build.VERSION.SDK_INT;
        int k = 16;
        if (j <= k) {
          continue;
        }
        localObject1 = paramContext.getContentResolver();
        k = 7;
        localObject6 = new String[k];
        n = 0;
        localObject7 = null;
        localObject8 = "_id";
        localObject6[0] = localObject8;
        n = 1;
        localObject8 = "file_id";
        localObject6[n] = localObject8;
        n = 2;
        localObject8 = "font_ttc_index";
        localObject6[n] = localObject8;
        n = 3;
        localObject8 = "font_variation_settings";
        localObject6[n] = localObject8;
        n = 4;
        localObject8 = "font_weight";
        localObject6[n] = localObject8;
        n = 5;
        localObject8 = "font_italic";
        localObject6[n] = localObject8;
        n = 6;
        localObject8 = "result_code";
        localObject6[n] = localObject8;
        localObject7 = "query = ?";
        i1 = 1;
        localObject8 = new String[i1];
        i2 = 0;
        localObject9 = parama.c();
        localObject8[0] = localObject9;
        i2 = 0;
        localObject9 = paramCancellationSignal;
        localCursor = ((ContentResolver)localObject1).query((Uri)localObject5, (String[])localObject6, (String)localObject7, (String[])localObject8, null, paramCancellationSignal);
        if (localCursor == null) {
          continue;
        }
        try
        {
          j = localCursor.getCount();
          if (j <= 0) {
            continue;
          }
          localObject1 = "result_code";
          int i3 = localCursor.getColumnIndex((String)localObject1);
          localObject1 = new java/util/ArrayList;
          ((ArrayList)localObject1).<init>();
          localObject6 = "_id";
          int i4 = localCursor.getColumnIndex((String)localObject6);
          localObject6 = "file_id";
          i5 = localCursor.getColumnIndex((String)localObject6);
          localObject6 = "font_ttc_index";
          int i6 = localCursor.getColumnIndex((String)localObject6);
          localObject6 = "font_weight";
          int i7 = localCursor.getColumnIndex((String)localObject6);
          localObject6 = "font_italic";
          int i8 = localCursor.getColumnIndex((String)localObject6);
          boolean bool = localCursor.moveToNext();
          if (!bool) {
            continue;
          }
          m = -1;
          if (i3 == m) {
            continue;
          }
          i = localCursor.getInt(i3);
          m = -1;
          if (i6 == m) {
            continue;
          }
          i1 = localCursor.getInt(i6);
          m = -1;
          if (i5 != m) {
            continue;
          }
          l = localCursor.getLong(i4);
          localObject7 = ContentUris.withAppendedId((Uri)localObject5, l);
          m = -1;
          if (i7 == m) {
            continue;
          }
          i2 = localCursor.getInt(i7);
          m = -1;
          if (i8 == m) {
            continue;
          }
          m = localCursor.getInt(i8);
          int i9 = 1;
          if (m != i9) {
            continue;
          }
          i9 = 1;
          localObject6 = new android/support/v4/f/b$b;
          ((b.b)localObject6).<init>((Uri)localObject7, i1, i2, i9, i);
          ((ArrayList)localObject1).add(localObject6);
          continue;
          if (localObject5 == null) {
            continue;
          }
        }
        finally
        {
          localObject5 = localCursor;
        }
      }
      finally
      {
        int n;
        Object localObject7;
        Object localObject8;
        int i1;
        int i2;
        Object localObject9;
        Cursor localCursor;
        int i5;
        int m;
        long l;
        Object localObject3;
        int i10;
        localObject5 = null;
        continue;
      }
      ((Cursor)localObject5).close();
      throw ((Throwable)localObject2);
      localObject3 = paramContext.getContentResolver();
      m = 7;
      localObject6 = new String[m];
      n = 0;
      localObject7 = null;
      localObject8 = "_id";
      localObject6[0] = localObject8;
      n = 1;
      localObject8 = "file_id";
      localObject6[n] = localObject8;
      n = 2;
      localObject8 = "font_ttc_index";
      localObject6[n] = localObject8;
      n = 3;
      localObject8 = "font_variation_settings";
      localObject6[n] = localObject8;
      n = 4;
      localObject8 = "font_weight";
      localObject6[n] = localObject8;
      n = 5;
      localObject8 = "font_italic";
      localObject6[n] = localObject8;
      n = 6;
      localObject8 = "result_code";
      localObject6[n] = localObject8;
      localObject7 = "query = ?";
      i1 = 1;
      localObject8 = new String[i1];
      i2 = 0;
      localObject9 = parama.c();
      localObject8[0] = localObject9;
      i2 = 0;
      localCursor = ((ContentResolver)localObject3).query((Uri)localObject5, (String[])localObject6, (String)localObject7, (String[])localObject8, null);
      continue;
      i = 0;
      continue;
      i1 = 0;
      localObject8 = null;
      continue;
      l = localCursor.getLong(i5);
      localObject7 = ContentUris.withAppendedId(localUri, l);
      continue;
      i2 = 400;
      continue;
      i10 = 0;
      localObject9 = null;
    }
    localObject3 = localArrayList;
    if (localCursor != null) {
      localCursor.close();
    }
    localObject5 = new b.b[0];
    return (b.b[])((ArrayList)localObject3).toArray((Object[])localObject5);
  }
  
  private static b.c b(Context paramContext, a parama, int paramInt)
  {
    i = -3;
    j = 0;
    localObject1 = null;
    try
    {
      localObject1 = a(paramContext, null, parama);
      k = ((b.a)localObject1).a();
      if (k != 0) {
        break label97;
      }
      localObject1 = ((b.a)localObject1).b();
      Typeface localTypeface = android.support.v4.b.c.a(paramContext, null, (b.b[])localObject1, paramInt);
      localObject1 = new android/support/v4/f/b$c;
      if (localTypeface != null)
      {
        i = 0;
        localObject2 = null;
      }
      ((b.c)localObject1).<init>(localTypeface, i);
      localObject2 = localObject1;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        Object localObject2;
        Object localObject3 = new android/support/v4/f/b$c;
        j = -1;
        ((b.c)localObject3).<init>(null, j);
        continue;
        j = ((b.a)localObject1).a();
        int k = 1;
        if (j == k) {
          i = -2;
        }
        localObject1 = new android/support/v4/f/b$c;
        ((b.c)localObject1).<init>(null, i);
        localObject3 = localObject1;
      }
    }
    return (b.c)localObject2;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\f\b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */