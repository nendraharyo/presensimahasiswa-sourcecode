package com.loopj.android.http;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import b.a.a.a.b.h;
import b.a.a.a.f.b;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class PersistentCookieStore
  implements h
{
  private static final String COOKIE_NAME_PREFIX = "cookie_";
  private static final String COOKIE_NAME_STORE = "names";
  private static final String COOKIE_PREFS = "CookiePrefsFile";
  private static final String LOG_TAG = "PersistentCookieStore";
  private final SharedPreferences cookiePrefs;
  private final ConcurrentHashMap cookies;
  private boolean omitNonPersistentCookies = false;
  
  public PersistentCookieStore(Context paramContext)
  {
    Object localObject1 = paramContext.getSharedPreferences("CookiePrefsFile", 0);
    this.cookiePrefs = ((SharedPreferences)localObject1);
    localObject1 = new java/util/concurrent/ConcurrentHashMap;
    ((ConcurrentHashMap)localObject1).<init>();
    this.cookies = ((ConcurrentHashMap)localObject1);
    localObject1 = this.cookiePrefs;
    String str1 = "names";
    localObject1 = ((SharedPreferences)localObject1).getString(str1, null);
    if (localObject1 != null)
    {
      str1 = ",";
      localObject1 = TextUtils.split((String)localObject1, str1);
      int j = localObject1.length;
      while (i < j)
      {
        String str2 = localObject1[i];
        Object localObject2 = this.cookiePrefs;
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        String str3 = "cookie_";
        localObject3 = str3 + str2;
        localObject2 = ((SharedPreferences)localObject2).getString((String)localObject3, null);
        if (localObject2 != null)
        {
          localObject2 = decodeCookie((String)localObject2);
          if (localObject2 != null)
          {
            localObject3 = this.cookies;
            ((ConcurrentHashMap)localObject3).put(str2, localObject2);
          }
        }
        i += 1;
      }
      localDate = new java/util/Date;
      localDate.<init>();
      clearExpired(localDate);
    }
  }
  
  public void addCookie(b paramb)
  {
    boolean bool1 = this.omitNonPersistentCookies;
    if (bool1)
    {
      bool1 = paramb.e();
      if (!bool1) {
        return;
      }
    }
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    Object localObject2 = paramb.a();
    localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
    localObject2 = paramb.f();
    localObject1 = (String)localObject2;
    localObject2 = new java/util/Date;
    ((Date)localObject2).<init>();
    boolean bool2 = paramb.a((Date)localObject2);
    if (!bool2)
    {
      localObject2 = this.cookies;
      ((ConcurrentHashMap)localObject2).put(localObject1, paramb);
    }
    for (;;)
    {
      localObject2 = this.cookiePrefs.edit();
      Set localSet = this.cookies.keySet();
      String str = TextUtils.join(",", localSet);
      ((SharedPreferences.Editor)localObject2).putString("names", str);
      Object localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      str = "cookie_";
      localObject1 = str + (String)localObject1;
      localObject3 = new com/loopj/android/http/SerializableCookie;
      ((SerializableCookie)localObject3).<init>(paramb);
      localObject3 = encodeCookie((SerializableCookie)localObject3);
      ((SharedPreferences.Editor)localObject2).putString((String)localObject1, (String)localObject3);
      ((SharedPreferences.Editor)localObject2).commit();
      break;
      localObject2 = this.cookies;
      ((ConcurrentHashMap)localObject2).remove(localObject1);
    }
  }
  
  protected String byteArrayToHexString(byte[] paramArrayOfByte)
  {
    Object localObject = new java/lang/StringBuilder;
    int i = paramArrayOfByte.length * 2;
    ((StringBuilder)localObject).<init>(i);
    int j = paramArrayOfByte.length;
    i = 0;
    String str1 = null;
    while (i < j)
    {
      int k = paramArrayOfByte[i] & 0xFF;
      int m = 16;
      if (k < m)
      {
        m = 48;
        ((StringBuilder)localObject).append(m);
      }
      String str2 = Integer.toHexString(k);
      ((StringBuilder)localObject).append(str2);
      i += 1;
    }
    str1 = ((StringBuilder)localObject).toString();
    localObject = Locale.US;
    return str1.toUpperCase((Locale)localObject);
  }
  
  public void clear()
  {
    SharedPreferences.Editor localEditor = this.cookiePrefs.edit();
    Object localObject = this.cookies.keySet();
    Iterator localIterator = ((Set)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (String)localIterator.next();
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str = "cookie_";
      localStringBuilder = localStringBuilder.append(str);
      localObject = (String)localObject;
      localEditor.remove((String)localObject);
    }
    localEditor.remove("names");
    localEditor.commit();
    this.cookies.clear();
  }
  
  public boolean clearExpired(Date paramDate)
  {
    boolean bool1 = false;
    float f1 = 0.0F;
    Object localObject1 = null;
    SharedPreferences.Editor localEditor = this.cookiePrefs.edit();
    Object localObject2 = this.cookies.entrySet();
    Object localObject3 = ((Set)localObject2).iterator();
    boolean bool2 = false;
    String str = null;
    float f2 = 0.0F;
    bool1 = ((Iterator)localObject3).hasNext();
    if (bool1)
    {
      localObject1 = (Map.Entry)((Iterator)localObject3).next();
      localObject2 = (String)((Map.Entry)localObject1).getKey();
      localObject1 = (b)((Map.Entry)localObject1).getValue();
      bool1 = ((b)localObject1).a(paramDate);
      if (!bool1) {
        break label221;
      }
      this.cookies.remove(localObject2);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      str = "cookie_";
      localObject1 = str + (String)localObject2;
      localEditor.remove((String)localObject1);
      bool1 = true;
    }
    for (f1 = Float.MIN_VALUE;; f1 = f2)
    {
      bool2 = bool1;
      f2 = f1;
      break;
      if (bool2)
      {
        localObject1 = "names";
        localObject3 = this.cookies.keySet();
        localObject2 = TextUtils.join(",", (Iterable)localObject3);
        localEditor.putString((String)localObject1, (String)localObject2);
      }
      localEditor.commit();
      return bool2;
      label221:
      bool1 = bool2;
    }
  }
  
  protected b decodeCookie(String paramString)
  {
    Object localObject1 = hexStringToByteArray(paramString);
    localObject4 = new java/io/ByteArrayInputStream;
    ((ByteArrayInputStream)localObject4).<init>((byte[])localObject1);
    try
    {
      localObject1 = new java/io/ObjectInputStream;
      ((ObjectInputStream)localObject1).<init>((InputStream)localObject4);
      localObject1 = ((ObjectInputStream)localObject1).readObject();
      localObject1 = (SerializableCookie)localObject1;
      localObject1 = ((SerializableCookie)localObject1).getCookie();
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        localObject4 = AsyncHttpClient.log;
        str1 = "PersistentCookieStore";
        str2 = "IOException in decodeCookie";
        ((LogInterface)localObject4).d(str1, str2, localIOException);
        Object localObject2 = null;
      }
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      for (;;)
      {
        localObject4 = AsyncHttpClient.log;
        String str1 = "PersistentCookieStore";
        String str2 = "ClassNotFoundException in decodeCookie";
        ((LogInterface)localObject4).d(str1, str2, localClassNotFoundException);
        Object localObject3 = null;
      }
    }
    return (b)localObject1;
  }
  
  public void deleteCookie(b paramb)
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    Object localObject2 = paramb.a();
    localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
    localObject2 = paramb.f();
    localObject1 = (String)localObject2;
    this.cookies.remove(localObject1);
    localObject2 = this.cookiePrefs.edit();
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localObject1 = "cookie_" + (String)localObject1;
    ((SharedPreferences.Editor)localObject2).remove((String)localObject1);
    ((SharedPreferences.Editor)localObject2).commit();
  }
  
  protected String encodeCookie(SerializableCookie paramSerializableCookie)
  {
    Object localObject1 = null;
    if (paramSerializableCookie == null) {}
    for (;;)
    {
      return (String)localObject1;
      ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
      localByteArrayOutputStream.<init>();
      try
      {
        localObject2 = new java/io/ObjectOutputStream;
        ((ObjectOutputStream)localObject2).<init>(localByteArrayOutputStream);
        ((ObjectOutputStream)localObject2).writeObject(paramSerializableCookie);
        localObject1 = localByteArrayOutputStream.toByteArray();
        localObject1 = byteArrayToHexString((byte[])localObject1);
      }
      catch (IOException localIOException)
      {
        Object localObject2 = AsyncHttpClient.log;
        String str1 = "PersistentCookieStore";
        String str2 = "IOException in encodeCookie";
        ((LogInterface)localObject2).d(str1, str2, localIOException);
      }
    }
  }
  
  public List getCookies()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    Collection localCollection = this.cookies.values();
    localArrayList.<init>(localCollection);
    return localArrayList;
  }
  
  protected byte[] hexStringToByteArray(String paramString)
  {
    int i = 16;
    int j = paramString.length();
    byte[] arrayOfByte = new byte[j / 2];
    int k = 0;
    while (k < j)
    {
      int m = k / 2;
      int n = Character.digit(paramString.charAt(k), i) << 4;
      int i1 = k + 1;
      i1 = Character.digit(paramString.charAt(i1), i);
      n = (byte)(n + i1);
      arrayOfByte[m] = n;
      k += 2;
    }
    return arrayOfByte;
  }
  
  public void setOmitNonPersistentCookies(boolean paramBoolean)
  {
    this.omitNonPersistentCookies = paramBoolean;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\loopj\android\http\PersistentCookieStore.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */