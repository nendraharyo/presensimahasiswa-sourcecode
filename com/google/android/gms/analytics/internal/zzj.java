package com.google.android.gms.analytics.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzmq;
import com.google.android.gms.internal.zzmz;
import java.io.Closeable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class zzj
  extends zzd
  implements Closeable
{
  private static final String zzQR;
  private static final String zzQS;
  private final zzj.zza zzQT;
  private final zzaj zzQU;
  private final zzaj zzQV;
  
  static
  {
    int i = 2;
    int j = 1;
    Object[] arrayOfObject = new Object[6];
    arrayOfObject[0] = "hits2";
    arrayOfObject[j] = "hit_id";
    arrayOfObject[i] = "hit_time";
    arrayOfObject[3] = "hit_url";
    arrayOfObject[4] = "hit_string";
    arrayOfObject[5] = "hit_app_id";
    zzQR = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", arrayOfObject);
    arrayOfObject = new Object[i];
    arrayOfObject[0] = "hit_time";
    arrayOfObject[j] = "hits2";
    zzQS = String.format("SELECT MAX(%s) FROM %s WHERE 1;", arrayOfObject);
  }
  
  zzj(zzf paramzzf)
  {
    super(paramzzf);
    Object localObject1 = new com/google/android/gms/analytics/internal/zzaj;
    Object localObject2 = zzjl();
    ((zzaj)localObject1).<init>((zzmq)localObject2);
    this.zzQU = ((zzaj)localObject1);
    localObject1 = new com/google/android/gms/analytics/internal/zzaj;
    localObject2 = zzjl();
    ((zzaj)localObject1).<init>((zzmq)localObject2);
    this.zzQV = ((zzaj)localObject1);
    localObject1 = zzjQ();
    localObject2 = new com/google/android/gms/analytics/internal/zzj$zza;
    Context localContext = paramzzf.getContext();
    ((zzj.zza)localObject2).<init>(this, localContext, (String)localObject1);
    this.zzQT = ((zzj.zza)localObject2);
  }
  
  private static String zzI(Map paramMap)
  {
    zzx.zzz(paramMap);
    Uri.Builder localBuilder = new android/net/Uri$Builder;
    localBuilder.<init>();
    Object localObject = paramMap.entrySet();
    Iterator localIterator = ((Set)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (Map.Entry)localIterator.next();
      String str = (String)((Map.Entry)localObject).getKey();
      localObject = (String)((Map.Entry)localObject).getValue();
      localBuilder.appendQueryParameter(str, (String)localObject);
    }
    localObject = localBuilder.build().getEncodedQuery();
    if (localObject == null) {
      localObject = "";
    }
    return (String)localObject;
  }
  
  /* Error */
  private long zza(String paramString, String[] paramArrayOfString, long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 142	com/google/android/gms/analytics/internal/zzj:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   4: astore 5
    //   6: aconst_null
    //   7: astore 6
    //   9: aload 5
    //   11: aload_1
    //   12: aload_2
    //   13: invokevirtual 148	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   16: astore 6
    //   18: aload 6
    //   20: invokeinterface 153 1 0
    //   25: istore 7
    //   27: iload 7
    //   29: ifeq +32 -> 61
    //   32: iconst_0
    //   33: istore 7
    //   35: aconst_null
    //   36: astore 5
    //   38: aload 6
    //   40: iconst_0
    //   41: invokeinterface 157 2 0
    //   46: lstore_3
    //   47: aload 6
    //   49: ifnull +10 -> 59
    //   52: aload 6
    //   54: invokeinterface 160 1 0
    //   59: lload_3
    //   60: lreturn
    //   61: aload 6
    //   63: ifnull -4 -> 59
    //   66: aload 6
    //   68: invokeinterface 160 1 0
    //   73: goto -14 -> 59
    //   76: astore 5
    //   78: ldc -94
    //   80: astore 8
    //   82: aload_0
    //   83: aload 8
    //   85: aload_1
    //   86: aload 5
    //   88: invokevirtual 166	com/google/android/gms/analytics/internal/zzj:zzd	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   91: aload 5
    //   93: athrow
    //   94: astore 5
    //   96: aload 6
    //   98: ifnull +10 -> 108
    //   101: aload 6
    //   103: invokeinterface 160 1 0
    //   108: aload 5
    //   110: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	111	0	this	zzj
    //   0	111	1	paramString	String
    //   0	111	2	paramArrayOfString	String[]
    //   0	111	3	paramLong	long
    //   4	33	5	localSQLiteDatabase	SQLiteDatabase
    //   76	16	5	localSQLiteException	SQLiteException
    //   94	15	5	localObject	Object
    //   7	95	6	localCursor	Cursor
    //   25	9	7	bool	boolean
    //   80	4	8	str	String
    // Exception table:
    //   from	to	target	type
    //   12	16	76	android/database/sqlite/SQLiteException
    //   18	25	76	android/database/sqlite/SQLiteException
    //   40	46	76	android/database/sqlite/SQLiteException
    //   12	16	94	finally
    //   18	25	94	finally
    //   40	46	94	finally
    //   86	91	94	finally
    //   91	94	94	finally
  }
  
  private long zzb(String paramString, String[] paramArrayOfString)
  {
    Object localObject1 = getWritableDatabase();
    Cursor localCursor = null;
    try
    {
      localCursor = ((SQLiteDatabase)localObject1).rawQuery(paramString, paramArrayOfString);
      boolean bool = localCursor.moveToFirst();
      if (bool)
      {
        bool = false;
        localObject1 = null;
        long l = localCursor.getLong(0);
        return l;
      }
      localObject1 = new android/database/sqlite/SQLiteException;
      str = "Database returned empty set";
      ((SQLiteException)localObject1).<init>(str);
      throw ((Throwable)localObject1);
    }
    catch (SQLiteException localSQLiteException)
    {
      String str = "Database error";
      zzd(str, paramString, localSQLiteException);
      throw localSQLiteException;
    }
    finally
    {
      if (localCursor != null) {
        localCursor.close();
      }
    }
  }
  
  private String zzd(zzab paramzzab)
  {
    boolean bool = paramzzab.zzlt();
    if (bool) {}
    for (String str = zzjn().zzkF();; str = zzjn().zzkG()) {
      return str;
    }
  }
  
  private static String zze(zzab paramzzab)
  {
    zzx.zzz(paramzzab);
    Uri.Builder localBuilder = new android/net/Uri$Builder;
    localBuilder.<init>();
    Object localObject = paramzzab.zzn().entrySet();
    Iterator localIterator = ((Set)localObject).iterator();
    for (;;)
    {
      boolean bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject = (Map.Entry)localIterator.next();
      String str1 = (String)((Map.Entry)localObject).getKey();
      String str2 = "ht";
      boolean bool2 = str2.equals(str1);
      if (!bool2)
      {
        str2 = "qt";
        bool2 = str2.equals(str1);
        if (!bool2)
        {
          str2 = "AppUID";
          bool2 = str2.equals(str1);
          if (!bool2)
          {
            localObject = (String)((Map.Entry)localObject).getValue();
            localBuilder.appendQueryParameter(str1, (String)localObject);
          }
        }
      }
    }
    localObject = localBuilder.build().getEncodedQuery();
    if (localObject == null) {
      localObject = "";
    }
    return (String)localObject;
  }
  
  private void zzjP()
  {
    Object localObject = zzjn();
    int i = ((zzr)localObject).zzkP();
    long l1 = zzjG();
    long l2 = i + -1;
    boolean bool = l1 < l2;
    if (bool)
    {
      long l3 = i;
      l3 = l1 - l3;
      l1 = 1L;
      l3 += l1;
      localObject = zzo(l3);
      String str = "Store full, deleting hits to make room, count";
      int j = ((List)localObject).size();
      Integer localInteger = Integer.valueOf(j);
      zzd(str, localInteger);
      zzo((List)localObject);
    }
  }
  
  private String zzjQ()
  {
    Object localObject = zzjn();
    boolean bool = ((zzr)localObject).zzkr();
    if (!bool) {
      localObject = zzjn().zzkR();
    }
    for (;;)
    {
      return (String)localObject;
      localObject = zzjn();
      bool = ((zzr)localObject).zzks();
      if (bool) {
        localObject = zzjn().zzkR();
      } else {
        localObject = zzjn().zzkS();
      }
    }
  }
  
  public void beginTransaction()
  {
    zzjv();
    getWritableDatabase().beginTransaction();
  }
  
  public void close()
  {
    try
    {
      zzj.zza localzza = this.zzQT;
      localzza.close();
      return;
    }
    catch (SQLiteException localSQLiteException)
    {
      for (;;)
      {
        str = "Sql error closing database";
        zze(str, localSQLiteException);
      }
    }
    catch (IllegalStateException localIllegalStateException)
    {
      for (;;)
      {
        String str = "Error closing database";
        zze(str, localIllegalStateException);
      }
    }
  }
  
  public void endTransaction()
  {
    zzjv();
    getWritableDatabase().endTransaction();
  }
  
  SQLiteDatabase getWritableDatabase()
  {
    try
    {
      zzj.zza localzza = this.zzQT;
      return localzza.getWritableDatabase();
    }
    catch (SQLiteException localSQLiteException)
    {
      zzd("Error opening database", localSQLiteException);
      throw localSQLiteException;
    }
  }
  
  boolean isEmpty()
  {
    long l1 = zzjG();
    long l2 = 0L;
    boolean bool = l1 < l2;
    if (!bool) {}
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public void setTransactionSuccessful()
  {
    zzjv();
    getWritableDatabase().setTransactionSuccessful();
  }
  
  public long zza(long paramLong, String paramString1, String paramString2)
  {
    zzx.zzcM(paramString1);
    zzx.zzcM(paramString2);
    zzjv();
    zzjk();
    String[] arrayOfString = new String[3];
    String str = String.valueOf(paramLong);
    arrayOfString[0] = str;
    arrayOfString[1] = paramString1;
    arrayOfString[2] = paramString2;
    return zza("SELECT hits_count FROM properties WHERE app_uid=? AND cid=? AND tid=?", arrayOfString, 0L);
  }
  
  public void zza(long paramLong, String paramString)
  {
    zzx.zzcM(paramString);
    zzjv();
    zzjk();
    Object localObject = getWritableDatabase();
    String str1 = "properties";
    String str2 = "app_uid=? AND cid<>?";
    int i = 2;
    String[] arrayOfString = new String[i];
    String str3 = String.valueOf(paramLong);
    arrayOfString[0] = str3;
    int j = 1;
    arrayOfString[j] = paramString;
    int k = ((SQLiteDatabase)localObject).delete(str1, str2, arrayOfString);
    if (k > 0)
    {
      str1 = "Deleted property records";
      localObject = Integer.valueOf(k);
      zza(str1, localObject);
    }
  }
  
  public void zzb(zzh paramzzh)
  {
    zzx.zzz(paramzzh);
    zzjv();
    zzjk();
    localObject1 = getWritableDatabase();
    String str = zzI(paramzzh.zzn());
    ContentValues localContentValues = new android/content/ContentValues;
    localContentValues.<init>();
    long l1 = paramzzh.zzjD();
    Object localObject2 = Long.valueOf(l1);
    localContentValues.put("app_uid", (Long)localObject2);
    localObject2 = paramzzh.getClientId();
    localContentValues.put("cid", (String)localObject2);
    Object localObject3 = "tid";
    localObject2 = paramzzh.zzjE();
    localContentValues.put((String)localObject3, (String)localObject2);
    localObject2 = "adid";
    int i = paramzzh.zzjF();
    if (i != 0) {
      i = 1;
    }
    for (;;)
    {
      localObject3 = Integer.valueOf(i);
      localContentValues.put((String)localObject2, (Integer)localObject3);
      l1 = paramzzh.zzjG();
      localObject2 = Long.valueOf(l1);
      localContentValues.put("hits_count", (Long)localObject2);
      localContentValues.put("params", str);
      localObject3 = "properties";
      str = null;
      int j = 5;
      try
      {
        long l2 = ((SQLiteDatabase)localObject1).insertWithOnConflict((String)localObject3, null, localContentValues, j);
        long l3 = -1;
        bool = l2 < l3;
        if (!bool)
        {
          localObject3 = "Failed to insert/update a property (got -1)";
          zzbh((String)localObject3);
        }
        return;
      }
      catch (SQLiteException localSQLiteException)
      {
        for (;;)
        {
          boolean bool;
          localObject1 = "Error storing a property";
          zze((String)localObject1, localSQLiteException);
        }
      }
      bool = false;
      localObject3 = null;
    }
  }
  
  Map zzbi(String paramString)
  {
    boolean bool = TextUtils.isEmpty(paramString);
    Object localObject;
    if (bool)
    {
      localObject = new java/util/HashMap;
      ((HashMap)localObject).<init>(0);
    }
    for (;;)
    {
      return (Map)localObject;
      localObject = "?";
      try
      {
        bool = paramString.startsWith((String)localObject);
        if (bool) {}
        for (;;)
        {
          localObject = new java/net/URI;
          ((URI)localObject).<init>(paramString);
          str = "UTF-8";
          localObject = zzmz.zza((URI)localObject, str);
          break;
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>();
          str = "?";
          localObject = ((StringBuilder)localObject).append(str);
          localObject = ((StringBuilder)localObject).append(paramString);
          paramString = ((StringBuilder)localObject).toString();
        }
      }
      catch (URISyntaxException localURISyntaxException)
      {
        String str = "Error parsing hit parameters";
        zze(str, localURISyntaxException);
        HashMap localHashMap = new java/util/HashMap;
        localHashMap.<init>(0);
      }
    }
  }
  
  Map zzbj(String paramString)
  {
    boolean bool = TextUtils.isEmpty(paramString);
    Object localObject1;
    if (bool)
    {
      localObject1 = new java/util/HashMap;
      ((HashMap)localObject1).<init>(0);
    }
    for (;;)
    {
      return (Map)localObject1;
      try
      {
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject2 = "?";
        localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
        localObject1 = ((StringBuilder)localObject1).append(paramString);
        localObject1 = ((StringBuilder)localObject1).toString();
        localObject2 = new java/net/URI;
        ((URI)localObject2).<init>((String)localObject1);
        localObject1 = "UTF-8";
        localObject1 = zzmz.zza((URI)localObject2, (String)localObject1);
      }
      catch (URISyntaxException localURISyntaxException)
      {
        Object localObject2 = "Error parsing property parameters";
        zze((String)localObject2, localURISyntaxException);
        HashMap localHashMap = new java/util/HashMap;
        localHashMap.<init>(0);
      }
    }
  }
  
  public void zzc(zzab paramzzab)
  {
    zzx.zzz(paramzzab);
    zzjk();
    zzjv();
    Object localObject1 = zze(paramzzab);
    int i = ((String)localObject1).length();
    int j = 8192;
    Object localObject2;
    if (i > j)
    {
      localObject1 = zzjm();
      localObject2 = "Hit length exceeds the maximum allowed size";
      ((zzaf)localObject1).zza(paramzzab, (String)localObject2);
    }
    for (;;)
    {
      return;
      zzjP();
      localObject2 = getWritableDatabase();
      Object localObject3 = new android/content/ContentValues;
      ((ContentValues)localObject3).<init>();
      ((ContentValues)localObject3).put("hit_string", (String)localObject1);
      long l1 = paramzzab.zzlr();
      Object localObject4 = Long.valueOf(l1);
      ((ContentValues)localObject3).put("hit_time", (Long)localObject4);
      localObject4 = Integer.valueOf(paramzzab.zzlp());
      ((ContentValues)localObject3).put("hit_app_id", (Integer)localObject4);
      localObject4 = zzd(paramzzab);
      ((ContentValues)localObject3).put("hit_url", (String)localObject4);
      localObject1 = "hits2";
      localObject4 = null;
      long l2;
      try
      {
        l2 = ((SQLiteDatabase)localObject2).insert((String)localObject1, null, (ContentValues)localObject3);
        long l3 = -1;
        boolean bool = l2 < l3;
        if (bool) {
          break label197;
        }
        localObject1 = "Failed to insert a hit (got -1)";
        zzbh((String)localObject1);
      }
      catch (SQLiteException localSQLiteException)
      {
        localObject2 = "Error storing a hit";
        zze((String)localObject2, localSQLiteException);
      }
      continue;
      label197:
      localObject3 = "Hit saved to database. db-id, hit";
      Long localLong = Long.valueOf(l2);
      zzb((String)localObject3, localLong, paramzzab);
    }
  }
  
  protected void zziJ() {}
  
  public long zzjG()
  {
    zzjk();
    zzjv();
    return zzb("SELECT COUNT(*) FROM hits2", null);
  }
  
  public void zzjL()
  {
    zzjk();
    zzjv();
    getWritableDatabase().delete("hits2", null, null);
  }
  
  public void zzjM()
  {
    zzjk();
    zzjv();
    getWritableDatabase().delete("properties", null, null);
  }
  
  public int zzjN()
  {
    int i = 0;
    zzjk();
    zzjv();
    Object localObject1 = this.zzQU;
    long l1 = 86400000L;
    boolean bool = ((zzaj)localObject1).zzv(l1);
    if (!bool) {}
    for (;;)
    {
      return i;
      this.zzQU.start();
      zzbd("Deleting stale hits (if any)");
      localObject1 = getWritableDatabase();
      l1 = zzjl().currentTimeMillis();
      long l2 = 2592000000L;
      l1 -= l2;
      String str1 = "hits2";
      String str2 = "hit_time < ?";
      int j = 1;
      String[] arrayOfString = new String[j];
      Object localObject2 = Long.toString(l1);
      arrayOfString[0] = localObject2;
      i = ((SQLiteDatabase)localObject1).delete(str1, str2, arrayOfString);
      localObject1 = "Deleted stale hits, count";
      localObject2 = Integer.valueOf(i);
      zza((String)localObject1, localObject2);
    }
  }
  
  public long zzjO()
  {
    zzjk();
    zzjv();
    String str = zzQS;
    return zza(str, null, 0L);
  }
  
  /* Error */
  public List zzo(long paramLong)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aload_0
    //   3: invokevirtual 281	com/google/android/gms/analytics/internal/zzj:zzjk	()V
    //   6: aload_0
    //   7: invokevirtual 252	com/google/android/gms/analytics/internal/zzj:zzjv	()V
    //   10: lconst_0
    //   11: lstore 4
    //   13: lload_1
    //   14: lload 4
    //   16: lcmp
    //   17: istore 6
    //   19: iload 6
    //   21: ifgt +11 -> 32
    //   24: invokestatic 490	java/util/Collections:emptyList	()Ljava/util/List;
    //   27: astore 7
    //   29: aload 7
    //   31: areturn
    //   32: aload_0
    //   33: invokevirtual 142	com/google/android/gms/analytics/internal/zzj:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   36: astore 7
    //   38: new 492	java/util/ArrayList
    //   41: astore 8
    //   43: aload 8
    //   45: invokespecial 493	java/util/ArrayList:<init>	()V
    //   48: ldc 23
    //   50: astore 9
    //   52: iconst_1
    //   53: istore 10
    //   55: iload 10
    //   57: anewarray 38	java/lang/String
    //   60: astore 11
    //   62: ldc 25
    //   64: astore 12
    //   66: aload 11
    //   68: iconst_0
    //   69: aload 12
    //   71: aastore
    //   72: aconst_null
    //   73: astore 12
    //   75: ldc_w 495
    //   78: astore 13
    //   80: iconst_1
    //   81: istore 14
    //   83: iload 14
    //   85: anewarray 21	java/lang/Object
    //   88: astore 15
    //   90: ldc 25
    //   92: astore 16
    //   94: aload 15
    //   96: iconst_0
    //   97: aload 16
    //   99: aastore
    //   100: aload 13
    //   102: aload 15
    //   104: invokestatic 42	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   107: astore 13
    //   109: lload_1
    //   110: invokestatic 482	java/lang/Long:toString	(J)Ljava/lang/String;
    //   113: astore 15
    //   115: aload 7
    //   117: aload 9
    //   119: aload 11
    //   121: aconst_null
    //   122: aconst_null
    //   123: aconst_null
    //   124: aconst_null
    //   125: aload 13
    //   127: aload 15
    //   129: invokevirtual 499	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   132: astore 9
    //   134: aload 9
    //   136: invokeinterface 153 1 0
    //   141: istore 6
    //   143: iload 6
    //   145: ifeq +50 -> 195
    //   148: iconst_0
    //   149: istore 6
    //   151: aconst_null
    //   152: astore 7
    //   154: aload 9
    //   156: iconst_0
    //   157: invokeinterface 157 2 0
    //   162: lstore 17
    //   164: lload 17
    //   166: invokestatic 322	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   169: astore 7
    //   171: aload 8
    //   173: aload 7
    //   175: invokeinterface 502 2 0
    //   180: pop
    //   181: aload 9
    //   183: invokeinterface 505 1 0
    //   188: istore 6
    //   190: iload 6
    //   192: ifne -44 -> 148
    //   195: aload 9
    //   197: ifnull +10 -> 207
    //   200: aload 9
    //   202: invokeinterface 160 1 0
    //   207: aload 8
    //   209: astore 7
    //   211: goto -182 -> 29
    //   214: astore 7
    //   216: aconst_null
    //   217: astore 9
    //   219: ldc_w 507
    //   222: astore 11
    //   224: aload_0
    //   225: aload 11
    //   227: aload 7
    //   229: invokevirtual 234	com/google/android/gms/analytics/internal/zzj:zzd	(Ljava/lang/String;Ljava/lang/Object;)V
    //   232: aload 9
    //   234: ifnull -27 -> 207
    //   237: aload 9
    //   239: invokeinterface 160 1 0
    //   244: goto -37 -> 207
    //   247: astore 7
    //   249: aload_3
    //   250: ifnull +9 -> 259
    //   253: aload_3
    //   254: invokeinterface 160 1 0
    //   259: aload 7
    //   261: athrow
    //   262: astore 7
    //   264: aload 9
    //   266: astore_3
    //   267: goto -18 -> 249
    //   270: astore 7
    //   272: goto -53 -> 219
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	275	0	this	zzj
    //   0	275	1	paramLong	long
    //   1	266	3	localObject1	Object
    //   11	4	4	l1	long
    //   17	174	6	bool	boolean
    //   27	183	7	localObject2	Object
    //   214	14	7	localSQLiteException1	SQLiteException
    //   247	13	7	localObject3	Object
    //   262	1	7	localObject4	Object
    //   270	1	7	localSQLiteException2	SQLiteException
    //   41	167	8	localArrayList	ArrayList
    //   50	215	9	localObject5	Object
    //   53	3	10	i	int
    //   60	166	11	localObject6	Object
    //   64	10	12	str1	String
    //   78	48	13	str2	String
    //   81	3	14	j	int
    //   88	40	15	localObject7	Object
    //   92	6	16	str3	String
    //   162	3	17	l2	long
    // Exception table:
    //   from	to	target	type
    //   55	60	214	android/database/sqlite/SQLiteException
    //   69	72	214	android/database/sqlite/SQLiteException
    //   83	88	214	android/database/sqlite/SQLiteException
    //   97	100	214	android/database/sqlite/SQLiteException
    //   102	107	214	android/database/sqlite/SQLiteException
    //   109	113	214	android/database/sqlite/SQLiteException
    //   127	132	214	android/database/sqlite/SQLiteException
    //   55	60	247	finally
    //   69	72	247	finally
    //   83	88	247	finally
    //   97	100	247	finally
    //   102	107	247	finally
    //   109	113	247	finally
    //   127	132	247	finally
    //   134	141	262	finally
    //   156	162	262	finally
    //   164	169	262	finally
    //   173	181	262	finally
    //   181	188	262	finally
    //   227	232	262	finally
    //   134	141	270	android/database/sqlite/SQLiteException
    //   156	162	270	android/database/sqlite/SQLiteException
    //   164	169	270	android/database/sqlite/SQLiteException
    //   173	181	270	android/database/sqlite/SQLiteException
    //   181	188	270	android/database/sqlite/SQLiteException
  }
  
  public void zzo(List paramList)
  {
    zzx.zzz(paramList);
    zzjk();
    zzjv();
    boolean bool1 = paramList.isEmpty();
    if (bool1) {}
    for (;;)
    {
      return;
      Object localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>("hit_id");
      ((StringBuilder)localObject1).append(" in (");
      bool1 = false;
      Object localObject2 = null;
      int j = 0;
      Object localObject3 = null;
      Object localObject4;
      for (;;)
      {
        int i = paramList.size();
        if (j >= i) {
          break;
        }
        localObject2 = (Long)paramList.get(j);
        if (localObject2 != null)
        {
          long l1 = ((Long)localObject2).longValue();
          long l2 = 0L;
          boolean bool2 = l1 < l2;
          if (bool2) {}
        }
        else
        {
          localObject2 = new android/database/sqlite/SQLiteException;
          ((SQLiteException)localObject2).<init>("Invalid hit id");
          throw ((Throwable)localObject2);
        }
        if (j > 0)
        {
          localObject4 = ",";
          ((StringBuilder)localObject1).append((String)localObject4);
        }
        ((StringBuilder)localObject1).append(localObject2);
        i = j + 1;
        j = i;
      }
      ((StringBuilder)localObject1).append(")");
      localObject2 = ((StringBuilder)localObject1).toString();
      try
      {
        localObject3 = getWritableDatabase();
        localObject1 = "Deleting dispatched hits. count";
        int k = paramList.size();
        localObject4 = Integer.valueOf(k);
        zza((String)localObject1, localObject4);
        localObject1 = "hits2";
        k = 0;
        localObject4 = null;
        j = ((SQLiteDatabase)localObject3).delete((String)localObject1, (String)localObject2, null);
        int m = paramList.size();
        if (j == m) {
          continue;
        }
        localObject1 = "Deleted fewer hits then expected";
        k = paramList.size();
        localObject4 = Integer.valueOf(k);
        localObject3 = Integer.valueOf(j);
        zzb((String)localObject1, localObject4, localObject3, localObject2);
      }
      catch (SQLiteException localSQLiteException)
      {
        zze("Error deleting hits", localSQLiteException);
        throw localSQLiteException;
      }
    }
  }
  
  /* Error */
  public List zzp(long paramLong)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: iconst_0
    //   3: istore 4
    //   5: aconst_null
    //   6: astore 5
    //   8: aconst_null
    //   9: astore 6
    //   11: lconst_0
    //   12: lstore 7
    //   14: lload_1
    //   15: lload 7
    //   17: lcmp
    //   18: istore 9
    //   20: iload 9
    //   22: iflt +340 -> 362
    //   25: iload_3
    //   26: invokestatic 541	com/google/android/gms/common/internal/zzx:zzac	(Z)V
    //   29: aload_0
    //   30: invokevirtual 281	com/google/android/gms/analytics/internal/zzj:zzjk	()V
    //   33: aload_0
    //   34: invokevirtual 252	com/google/android/gms/analytics/internal/zzj:zzjv	()V
    //   37: aload_0
    //   38: invokevirtual 142	com/google/android/gms/analytics/internal/zzj:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   41: astore 10
    //   43: ldc 23
    //   45: astore 5
    //   47: iconst_5
    //   48: istore 9
    //   50: iload 9
    //   52: anewarray 38	java/lang/String
    //   55: astore 11
    //   57: iconst_0
    //   58: istore 12
    //   60: ldc 25
    //   62: astore 13
    //   64: aload 11
    //   66: iconst_0
    //   67: aload 13
    //   69: aastore
    //   70: iconst_1
    //   71: istore 12
    //   73: ldc 27
    //   75: astore 13
    //   77: aload 11
    //   79: iload 12
    //   81: aload 13
    //   83: aastore
    //   84: iconst_2
    //   85: istore 12
    //   87: ldc 33
    //   89: astore 13
    //   91: aload 11
    //   93: iload 12
    //   95: aload 13
    //   97: aastore
    //   98: iconst_3
    //   99: istore 12
    //   101: ldc 30
    //   103: astore 13
    //   105: aload 11
    //   107: iload 12
    //   109: aload 13
    //   111: aastore
    //   112: iconst_4
    //   113: istore 12
    //   115: ldc 36
    //   117: astore 13
    //   119: aload 11
    //   121: iload 12
    //   123: aload 13
    //   125: aastore
    //   126: iconst_0
    //   127: istore 12
    //   129: aconst_null
    //   130: astore 13
    //   132: iconst_0
    //   133: istore 14
    //   135: ldc_w 495
    //   138: astore 15
    //   140: iconst_1
    //   141: istore 16
    //   143: iload 16
    //   145: anewarray 21	java/lang/Object
    //   148: astore 17
    //   150: aconst_null
    //   151: astore 18
    //   153: ldc 25
    //   155: astore 19
    //   157: aload 17
    //   159: iconst_0
    //   160: aload 19
    //   162: aastore
    //   163: aload 15
    //   165: aload 17
    //   167: invokestatic 42	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   170: astore 15
    //   172: lload_1
    //   173: invokestatic 482	java/lang/Long:toString	(J)Ljava/lang/String;
    //   176: astore 17
    //   178: aload 10
    //   180: aload 5
    //   182: aload 11
    //   184: aconst_null
    //   185: aconst_null
    //   186: aconst_null
    //   187: aconst_null
    //   188: aload 15
    //   190: aload 17
    //   192: invokevirtual 499	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   195: astore 6
    //   197: new 492	java/util/ArrayList
    //   200: astore 18
    //   202: aload 18
    //   204: invokespecial 493	java/util/ArrayList:<init>	()V
    //   207: aload 6
    //   209: invokeinterface 153 1 0
    //   214: istore_3
    //   215: iload_3
    //   216: ifeq +131 -> 347
    //   219: iconst_0
    //   220: istore_3
    //   221: aconst_null
    //   222: astore 10
    //   224: aload 6
    //   226: iconst_0
    //   227: invokeinterface 157 2 0
    //   232: lstore 20
    //   234: iconst_1
    //   235: istore_3
    //   236: aload 6
    //   238: iload_3
    //   239: invokeinterface 157 2 0
    //   244: lstore 22
    //   246: iconst_2
    //   247: istore_3
    //   248: aload 6
    //   250: iload_3
    //   251: invokeinterface 545 2 0
    //   256: astore 10
    //   258: iconst_3
    //   259: istore 4
    //   261: aload 6
    //   263: iload 4
    //   265: invokeinterface 545 2 0
    //   270: astore 5
    //   272: iconst_4
    //   273: istore 9
    //   275: aload 6
    //   277: iload 9
    //   279: invokeinterface 549 2 0
    //   284: istore 16
    //   286: aload_0
    //   287: aload 10
    //   289: invokevirtual 553	com/google/android/gms/analytics/internal/zzj:zzbi	(Ljava/lang/String;)Ljava/util/Map;
    //   292: astore 11
    //   294: aload 5
    //   296: invokestatic 558	com/google/android/gms/analytics/internal/zzam:zzbx	(Ljava/lang/String;)Z
    //   299: istore 14
    //   301: new 175	com/google/android/gms/analytics/internal/zzab
    //   304: astore 10
    //   306: aload_0
    //   307: astore 5
    //   309: aload 10
    //   311: aload_0
    //   312: aload 11
    //   314: lload 22
    //   316: iload 14
    //   318: lload 20
    //   320: iload 16
    //   322: invokespecial 561	com/google/android/gms/analytics/internal/zzab:<init>	(Lcom/google/android/gms/analytics/internal/zzc;Ljava/util/Map;JZJI)V
    //   325: aload 18
    //   327: aload 10
    //   329: invokeinterface 502 2 0
    //   334: pop
    //   335: aload 6
    //   337: invokeinterface 505 1 0
    //   342: istore_3
    //   343: iload_3
    //   344: ifne -125 -> 219
    //   347: aload 6
    //   349: ifnull +10 -> 359
    //   352: aload 6
    //   354: invokeinterface 160 1 0
    //   359: aload 18
    //   361: areturn
    //   362: iconst_0
    //   363: istore_3
    //   364: aconst_null
    //   365: astore 10
    //   367: goto -342 -> 25
    //   370: astore 10
    //   372: iconst_0
    //   373: istore 4
    //   375: aconst_null
    //   376: astore 5
    //   378: ldc_w 563
    //   381: astore 11
    //   383: aload_0
    //   384: aload 11
    //   386: aload 10
    //   388: invokevirtual 261	com/google/android/gms/analytics/internal/zzj:zze	(Ljava/lang/String;Ljava/lang/Object;)V
    //   391: aload 10
    //   393: athrow
    //   394: astore 10
    //   396: aload 5
    //   398: astore 6
    //   400: aload 6
    //   402: ifnull +10 -> 412
    //   405: aload 6
    //   407: invokeinterface 160 1 0
    //   412: aload 10
    //   414: athrow
    //   415: astore 10
    //   417: goto -17 -> 400
    //   420: astore 10
    //   422: aload 6
    //   424: astore 5
    //   426: goto -48 -> 378
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	429	0	this	zzj
    //   0	429	1	paramLong	long
    //   1	238	3	i	int
    //   247	4	3	j	int
    //   342	22	3	bool1	boolean
    //   3	371	4	k	int
    //   6	419	5	localObject1	Object
    //   9	414	6	localObject2	Object
    //   12	4	7	l1	long
    //   18	3	9	bool2	boolean
    //   48	230	9	m	int
    //   41	325	10	localObject3	Object
    //   370	22	10	localSQLiteException1	SQLiteException
    //   394	19	10	localObject4	Object
    //   415	1	10	localObject5	Object
    //   420	1	10	localSQLiteException2	SQLiteException
    //   55	330	11	localObject6	Object
    //   58	70	12	n	int
    //   62	69	13	str1	String
    //   133	184	14	bool3	boolean
    //   138	51	15	str2	String
    //   141	180	16	i1	int
    //   148	43	17	localObject7	Object
    //   151	209	18	localArrayList	ArrayList
    //   155	6	19	str3	String
    //   232	87	20	l2	long
    //   244	71	22	l3	long
    // Exception table:
    //   from	to	target	type
    //   50	55	370	android/database/sqlite/SQLiteException
    //   67	70	370	android/database/sqlite/SQLiteException
    //   81	84	370	android/database/sqlite/SQLiteException
    //   95	98	370	android/database/sqlite/SQLiteException
    //   109	112	370	android/database/sqlite/SQLiteException
    //   123	126	370	android/database/sqlite/SQLiteException
    //   143	148	370	android/database/sqlite/SQLiteException
    //   160	163	370	android/database/sqlite/SQLiteException
    //   165	170	370	android/database/sqlite/SQLiteException
    //   172	176	370	android/database/sqlite/SQLiteException
    //   190	195	370	android/database/sqlite/SQLiteException
    //   386	391	394	finally
    //   391	394	394	finally
    //   50	55	415	finally
    //   67	70	415	finally
    //   81	84	415	finally
    //   95	98	415	finally
    //   109	112	415	finally
    //   123	126	415	finally
    //   143	148	415	finally
    //   160	163	415	finally
    //   165	170	415	finally
    //   172	176	415	finally
    //   190	195	415	finally
    //   197	200	415	finally
    //   202	207	415	finally
    //   207	214	415	finally
    //   226	232	415	finally
    //   238	244	415	finally
    //   250	256	415	finally
    //   263	270	415	finally
    //   277	284	415	finally
    //   287	292	415	finally
    //   294	299	415	finally
    //   301	304	415	finally
    //   320	325	415	finally
    //   327	335	415	finally
    //   335	342	415	finally
    //   197	200	420	android/database/sqlite/SQLiteException
    //   202	207	420	android/database/sqlite/SQLiteException
    //   207	214	420	android/database/sqlite/SQLiteException
    //   226	232	420	android/database/sqlite/SQLiteException
    //   238	244	420	android/database/sqlite/SQLiteException
    //   250	256	420	android/database/sqlite/SQLiteException
    //   263	270	420	android/database/sqlite/SQLiteException
    //   277	284	420	android/database/sqlite/SQLiteException
    //   287	292	420	android/database/sqlite/SQLiteException
    //   294	299	420	android/database/sqlite/SQLiteException
    //   301	304	420	android/database/sqlite/SQLiteException
    //   320	325	420	android/database/sqlite/SQLiteException
    //   327	335	420	android/database/sqlite/SQLiteException
    //   335	342	420	android/database/sqlite/SQLiteException
  }
  
  public void zzq(long paramLong)
  {
    zzjk();
    zzjv();
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>(1);
    Long localLong1 = Long.valueOf(paramLong);
    localArrayList.add(localLong1);
    Long localLong2 = Long.valueOf(paramLong);
    zza("Deleting hit, id", localLong2);
    zzo(localArrayList);
  }
  
  /* Error */
  public List zzr(long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 252	com/google/android/gms/analytics/internal/zzj:zzjv	()V
    //   4: aload_0
    //   5: invokevirtual 281	com/google/android/gms/analytics/internal/zzj:zzjk	()V
    //   8: aload_0
    //   9: invokevirtual 142	com/google/android/gms/analytics/internal/zzj:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   12: astore_3
    //   13: aconst_null
    //   14: astore 4
    //   16: iconst_5
    //   17: istore 5
    //   19: iload 5
    //   21: anewarray 38	java/lang/String
    //   24: astore 6
    //   26: iconst_0
    //   27: istore 5
    //   29: aconst_null
    //   30: astore 7
    //   32: ldc_w 328
    //   35: astore 8
    //   37: aload 6
    //   39: iconst_0
    //   40: aload 8
    //   42: aastore
    //   43: iconst_1
    //   44: istore 5
    //   46: ldc_w 336
    //   49: astore 8
    //   51: aload 6
    //   53: iload 5
    //   55: aload 8
    //   57: aastore
    //   58: iconst_2
    //   59: istore 5
    //   61: ldc_w 341
    //   64: astore 8
    //   66: aload 6
    //   68: iload 5
    //   70: aload 8
    //   72: aastore
    //   73: iconst_3
    //   74: istore 5
    //   76: ldc_w 349
    //   79: astore 8
    //   81: aload 6
    //   83: iload 5
    //   85: aload 8
    //   87: aastore
    //   88: iconst_4
    //   89: istore 5
    //   91: ldc_w 352
    //   94: astore 8
    //   96: aload 6
    //   98: iload 5
    //   100: aload 8
    //   102: aastore
    //   103: aload_0
    //   104: invokevirtual 182	com/google/android/gms/analytics/internal/zzj:zzjn	()Lcom/google/android/gms/analytics/internal/zzr;
    //   107: astore 7
    //   109: aload 7
    //   111: invokevirtual 569	com/google/android/gms/analytics/internal/zzr:zzkQ	()I
    //   114: istore 9
    //   116: iload 9
    //   118: invokestatic 571	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   121: astore 10
    //   123: ldc_w 573
    //   126: astore 8
    //   128: iconst_1
    //   129: istore 5
    //   131: iload 5
    //   133: anewarray 38	java/lang/String
    //   136: astore 11
    //   138: iconst_0
    //   139: istore 5
    //   141: aconst_null
    //   142: astore 7
    //   144: lload_1
    //   145: invokestatic 286	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   148: astore 12
    //   150: aload 11
    //   152: iconst_0
    //   153: aload 12
    //   155: aastore
    //   156: ldc_w 292
    //   159: astore 7
    //   161: iconst_0
    //   162: istore 13
    //   164: aconst_null
    //   165: astore 12
    //   167: aload_3
    //   168: aload 7
    //   170: aload 6
    //   172: aload 8
    //   174: aload 11
    //   176: aconst_null
    //   177: aconst_null
    //   178: aconst_null
    //   179: aload 10
    //   181: invokevirtual 499	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   184: astore 4
    //   186: new 492	java/util/ArrayList
    //   189: astore 14
    //   191: aload 14
    //   193: invokespecial 493	java/util/ArrayList:<init>	()V
    //   196: aload 4
    //   198: invokeinterface 153 1 0
    //   203: istore 15
    //   205: iload 15
    //   207: ifeq +140 -> 347
    //   210: iconst_0
    //   211: istore 15
    //   213: aconst_null
    //   214: astore_3
    //   215: aload 4
    //   217: iconst_0
    //   218: invokeinterface 545 2 0
    //   223: astore 8
    //   225: iconst_1
    //   226: istore 15
    //   228: aload 4
    //   230: iload 15
    //   232: invokeinterface 545 2 0
    //   237: astore 11
    //   239: iconst_2
    //   240: istore 15
    //   242: aload 4
    //   244: iload 15
    //   246: invokeinterface 549 2 0
    //   251: istore 15
    //   253: iload 15
    //   255: ifeq +132 -> 387
    //   258: iconst_1
    //   259: istore 13
    //   261: iconst_3
    //   262: istore 15
    //   264: aload 4
    //   266: iload 15
    //   268: invokeinterface 549 2 0
    //   273: i2l
    //   274: lstore 16
    //   276: iconst_4
    //   277: istore 15
    //   279: aload 4
    //   281: iload 15
    //   283: invokeinterface 545 2 0
    //   288: astore_3
    //   289: aload_0
    //   290: aload_3
    //   291: invokevirtual 576	com/google/android/gms/analytics/internal/zzj:zzbj	(Ljava/lang/String;)Ljava/util/Map;
    //   294: astore 10
    //   296: aload 8
    //   298: invokestatic 369	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   301: istore 15
    //   303: iload 15
    //   305: ifne +15 -> 320
    //   308: aload 11
    //   310: invokestatic 369	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   313: istore 15
    //   315: iload 15
    //   317: ifeq +79 -> 396
    //   320: ldc_w 578
    //   323: astore_3
    //   324: aload_0
    //   325: aload_3
    //   326: aload 8
    //   328: aload 11
    //   330: invokevirtual 581	com/google/android/gms/analytics/internal/zzj:zzc	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   333: aload 4
    //   335: invokeinterface 505 1 0
    //   340: istore 15
    //   342: iload 15
    //   344: ifne -134 -> 210
    //   347: aload 14
    //   349: invokeinterface 225 1 0
    //   354: istore 15
    //   356: iload 15
    //   358: iload 9
    //   360: if_icmplt +12 -> 372
    //   363: ldc_w 583
    //   366: astore_3
    //   367: aload_0
    //   368: aload_3
    //   369: invokevirtual 586	com/google/android/gms/analytics/internal/zzj:zzbg	(Ljava/lang/String;)V
    //   372: aload 4
    //   374: ifnull +10 -> 384
    //   377: aload 4
    //   379: invokeinterface 160 1 0
    //   384: aload 14
    //   386: areturn
    //   387: iconst_0
    //   388: istore 13
    //   390: aconst_null
    //   391: astore 12
    //   393: goto -132 -> 261
    //   396: new 304	com/google/android/gms/analytics/internal/zzh
    //   399: astore_3
    //   400: aload_3
    //   401: lload_1
    //   402: aload 8
    //   404: aload 11
    //   406: iload 13
    //   408: lload 16
    //   410: aload 10
    //   412: invokespecial 589	com/google/android/gms/analytics/internal/zzh:<init>	(JLjava/lang/String;Ljava/lang/String;ZJLjava/util/Map;)V
    //   415: aload 14
    //   417: aload_3
    //   418: invokeinterface 502 2 0
    //   423: pop
    //   424: goto -91 -> 333
    //   427: astore_3
    //   428: aload 4
    //   430: astore 7
    //   432: ldc_w 563
    //   435: astore 6
    //   437: aload_0
    //   438: aload 6
    //   440: aload_3
    //   441: invokevirtual 261	com/google/android/gms/analytics/internal/zzj:zze	(Ljava/lang/String;Ljava/lang/Object;)V
    //   444: aload_3
    //   445: athrow
    //   446: astore_3
    //   447: aload 7
    //   449: astore 4
    //   451: aload 4
    //   453: ifnull +10 -> 463
    //   456: aload 4
    //   458: invokeinterface 160 1 0
    //   463: aload_3
    //   464: athrow
    //   465: astore_3
    //   466: goto -15 -> 451
    //   469: astore_3
    //   470: iconst_0
    //   471: istore 5
    //   473: aconst_null
    //   474: astore 7
    //   476: goto -44 -> 432
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	479	0	this	zzj
    //   0	479	1	paramLong	long
    //   12	406	3	localObject1	Object
    //   427	18	3	localSQLiteException1	SQLiteException
    //   446	18	3	localObject2	Object
    //   465	1	3	localObject3	Object
    //   469	1	3	localSQLiteException2	SQLiteException
    //   14	443	4	localObject4	Object
    //   17	455	5	i	int
    //   24	415	6	localObject5	Object
    //   30	445	7	localObject6	Object
    //   35	368	8	str1	String
    //   114	247	9	j	int
    //   121	290	10	localObject7	Object
    //   136	269	11	localObject8	Object
    //   148	244	12	str2	String
    //   162	245	13	bool1	boolean
    //   189	227	14	localArrayList	ArrayList
    //   203	28	15	k	int
    //   240	42	15	m	int
    //   301	42	15	bool2	boolean
    //   354	7	15	n	int
    //   274	135	16	l	long
    // Exception table:
    //   from	to	target	type
    //   186	189	427	android/database/sqlite/SQLiteException
    //   191	196	427	android/database/sqlite/SQLiteException
    //   196	203	427	android/database/sqlite/SQLiteException
    //   217	223	427	android/database/sqlite/SQLiteException
    //   230	237	427	android/database/sqlite/SQLiteException
    //   244	251	427	android/database/sqlite/SQLiteException
    //   266	273	427	android/database/sqlite/SQLiteException
    //   281	288	427	android/database/sqlite/SQLiteException
    //   290	294	427	android/database/sqlite/SQLiteException
    //   296	301	427	android/database/sqlite/SQLiteException
    //   308	313	427	android/database/sqlite/SQLiteException
    //   328	333	427	android/database/sqlite/SQLiteException
    //   333	340	427	android/database/sqlite/SQLiteException
    //   347	354	427	android/database/sqlite/SQLiteException
    //   368	372	427	android/database/sqlite/SQLiteException
    //   396	399	427	android/database/sqlite/SQLiteException
    //   410	415	427	android/database/sqlite/SQLiteException
    //   417	424	427	android/database/sqlite/SQLiteException
    //   440	444	446	finally
    //   444	446	446	finally
    //   19	24	465	finally
    //   40	43	465	finally
    //   55	58	465	finally
    //   70	73	465	finally
    //   85	88	465	finally
    //   100	103	465	finally
    //   103	107	465	finally
    //   109	114	465	finally
    //   116	121	465	finally
    //   131	136	465	finally
    //   144	148	465	finally
    //   153	156	465	finally
    //   179	184	465	finally
    //   186	189	465	finally
    //   191	196	465	finally
    //   196	203	465	finally
    //   217	223	465	finally
    //   230	237	465	finally
    //   244	251	465	finally
    //   266	273	465	finally
    //   281	288	465	finally
    //   290	294	465	finally
    //   296	301	465	finally
    //   308	313	465	finally
    //   328	333	465	finally
    //   333	340	465	finally
    //   347	354	465	finally
    //   368	372	465	finally
    //   396	399	465	finally
    //   410	415	465	finally
    //   417	424	465	finally
    //   19	24	469	android/database/sqlite/SQLiteException
    //   40	43	469	android/database/sqlite/SQLiteException
    //   55	58	469	android/database/sqlite/SQLiteException
    //   70	73	469	android/database/sqlite/SQLiteException
    //   85	88	469	android/database/sqlite/SQLiteException
    //   100	103	469	android/database/sqlite/SQLiteException
    //   103	107	469	android/database/sqlite/SQLiteException
    //   109	114	469	android/database/sqlite/SQLiteException
    //   116	121	469	android/database/sqlite/SQLiteException
    //   131	136	469	android/database/sqlite/SQLiteException
    //   144	148	469	android/database/sqlite/SQLiteException
    //   153	156	469	android/database/sqlite/SQLiteException
    //   179	184	469	android/database/sqlite/SQLiteException
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\internal\zzj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */