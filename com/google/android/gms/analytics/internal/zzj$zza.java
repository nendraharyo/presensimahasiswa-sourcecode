package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build.VERSION;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

class zzj$zza
  extends SQLiteOpenHelper
{
  zzj$zza(zzj paramzzj, Context paramContext, String paramString)
  {
    super(paramContext, paramString, null, 1);
  }
  
  private void zza(SQLiteDatabase paramSQLiteDatabase)
  {
    int i = 1;
    boolean bool1 = false;
    Object localObject1 = null;
    Set localSet = zzb(paramSQLiteDatabase, "hits2");
    String[] arrayOfString = new String[4];
    arrayOfString[0] = "hit_id";
    arrayOfString[i] = "hit_string";
    arrayOfString[2] = "hit_time";
    String str1 = "hit_url";
    arrayOfString[3] = str1;
    int j = arrayOfString.length;
    int k = 0;
    String str2 = null;
    Object localObject2;
    while (k < j)
    {
      String str3 = arrayOfString[k];
      boolean bool3 = localSet.remove(str3);
      if (!bool3)
      {
        localObject2 = new android/database/sqlite/SQLiteException;
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject1 = "Database hits2 is missing required column: " + str3;
        ((SQLiteException)localObject2).<init>((String)localObject1);
        throw ((Throwable)localObject2);
      }
      k += 1;
    }
    str2 = "hit_app_id";
    boolean bool2 = localSet.remove(str2);
    if (!bool2) {}
    for (;;)
    {
      bool1 = localSet.isEmpty();
      if (bool1) {
        break;
      }
      localObject2 = new android/database/sqlite/SQLiteException;
      ((SQLiteException)localObject2).<init>("Database hits2 has extra columns");
      throw ((Throwable)localObject2);
      i = 0;
      localObject2 = null;
    }
    if (i != 0)
    {
      localObject2 = "ALTER TABLE hits2 ADD COLUMN hit_app_id INTEGER";
      paramSQLiteDatabase.execSQL((String)localObject2);
    }
  }
  
  /* Error */
  private boolean zza(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: ldc 75
    //   4: astore 4
    //   6: iconst_1
    //   7: istore 5
    //   9: iload 5
    //   11: anewarray 22	java/lang/String
    //   14: astore 6
    //   16: iconst_0
    //   17: istore 5
    //   19: aconst_null
    //   20: astore 7
    //   22: ldc 77
    //   24: astore 8
    //   26: aload 6
    //   28: iconst_0
    //   29: aload 8
    //   31: aastore
    //   32: ldc 79
    //   34: astore 8
    //   36: iconst_1
    //   37: istore 5
    //   39: iload 5
    //   41: anewarray 22	java/lang/String
    //   44: astore 9
    //   46: iconst_0
    //   47: istore 5
    //   49: aconst_null
    //   50: astore 7
    //   52: aload 9
    //   54: iconst_0
    //   55: aload_2
    //   56: aastore
    //   57: aload_1
    //   58: astore 7
    //   60: aload_1
    //   61: aload 4
    //   63: aload 6
    //   65: aload 8
    //   67: aload 9
    //   69: aconst_null
    //   70: aconst_null
    //   71: aconst_null
    //   72: invokevirtual 83	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   75: astore 4
    //   77: aload 4
    //   79: invokeinterface 88 1 0
    //   84: istore 5
    //   86: aload 4
    //   88: ifnull +10 -> 98
    //   91: aload 4
    //   93: invokeinterface 91 1 0
    //   98: iload 5
    //   100: ireturn
    //   101: astore 7
    //   103: aconst_null
    //   104: astore 4
    //   106: aload_0
    //   107: getfield 8	com/google/android/gms/analytics/internal/zzj$zza:zzQW	Lcom/google/android/gms/analytics/internal/zzj;
    //   110: astore 6
    //   112: ldc 93
    //   114: astore 8
    //   116: aload 6
    //   118: aload 8
    //   120: aload_2
    //   121: aload 7
    //   123: invokevirtual 99	com/google/android/gms/analytics/internal/zzj:zzc	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   126: aload 4
    //   128: ifnull +10 -> 138
    //   131: aload 4
    //   133: invokeinterface 91 1 0
    //   138: iconst_0
    //   139: istore 5
    //   141: aconst_null
    //   142: astore 7
    //   144: goto -46 -> 98
    //   147: astore 7
    //   149: aload_3
    //   150: ifnull +9 -> 159
    //   153: aload_3
    //   154: invokeinterface 91 1 0
    //   159: aload 7
    //   161: athrow
    //   162: astore 7
    //   164: aload 4
    //   166: astore_3
    //   167: goto -18 -> 149
    //   170: astore 7
    //   172: goto -66 -> 106
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	175	0	this	zza
    //   0	175	1	paramSQLiteDatabase	SQLiteDatabase
    //   0	175	2	paramString	String
    //   1	166	3	localObject1	Object
    //   4	161	4	localObject2	Object
    //   7	133	5	bool	boolean
    //   14	103	6	localObject3	Object
    //   20	39	7	localSQLiteDatabase	SQLiteDatabase
    //   101	21	7	localSQLiteException1	SQLiteException
    //   142	1	7	localObject4	Object
    //   147	13	7	localObject5	Object
    //   162	1	7	localObject6	Object
    //   170	1	7	localSQLiteException2	SQLiteException
    //   24	95	8	str	String
    //   44	24	9	arrayOfString	String[]
    // Exception table:
    //   from	to	target	type
    //   9	14	101	android/database/sqlite/SQLiteException
    //   29	32	101	android/database/sqlite/SQLiteException
    //   39	44	101	android/database/sqlite/SQLiteException
    //   55	57	101	android/database/sqlite/SQLiteException
    //   71	75	101	android/database/sqlite/SQLiteException
    //   9	14	147	finally
    //   29	32	147	finally
    //   39	44	147	finally
    //   55	57	147	finally
    //   71	75	147	finally
    //   77	84	162	finally
    //   106	110	162	finally
    //   121	126	162	finally
    //   77	84	170	android/database/sqlite/SQLiteException
  }
  
  private Set zzb(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = "SELECT * FROM " + paramString + " LIMIT 0";
    Cursor localCursor = paramSQLiteDatabase.rawQuery((String)localObject1, null);
    try
    {
      String[] arrayOfString = localCursor.getColumnNames();
      int i = 0;
      localObject1 = null;
      for (;;)
      {
        int j = arrayOfString.length;
        if (i >= j) {
          break;
        }
        String str = arrayOfString[i];
        localHashSet.add(str);
        i += 1;
      }
      return localHashSet;
    }
    finally
    {
      localCursor.close();
    }
  }
  
  private void zzb(SQLiteDatabase paramSQLiteDatabase)
  {
    int i = 0;
    SQLiteException localSQLiteException = null;
    Object localObject = zzb(paramSQLiteDatabase, "properties");
    int j = 6;
    String[] arrayOfString = new String[j];
    String str1 = "app_uid";
    arrayOfString[0] = str1;
    arrayOfString[1] = "cid";
    arrayOfString[2] = "tid";
    arrayOfString[3] = "params";
    arrayOfString[4] = "adid";
    String str2 = "hits_count";
    arrayOfString[5] = str2;
    int k = arrayOfString.length;
    while (i < k)
    {
      str2 = arrayOfString[i];
      boolean bool2 = ((Set)localObject).remove(str2);
      if (!bool2)
      {
        localSQLiteException = new android/database/sqlite/SQLiteException;
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        localObject = "Database properties is missing required column: " + str2;
        localSQLiteException.<init>((String)localObject);
        throw localSQLiteException;
      }
      i += 1;
    }
    boolean bool1 = ((Set)localObject).isEmpty();
    if (!bool1)
    {
      localSQLiteException = new android/database/sqlite/SQLiteException;
      localSQLiteException.<init>("Database properties table has extra columns");
      throw localSQLiteException;
    }
  }
  
  public SQLiteDatabase getWritableDatabase()
  {
    Object localObject1 = zzj.zza(this.zzQW);
    long l = 3600000L;
    boolean bool = ((zzaj)localObject1).zzv(l);
    if (!bool)
    {
      localObject1 = new android/database/sqlite/SQLiteException;
      ((SQLiteException)localObject1).<init>("Database open failed");
      throw ((Throwable)localObject1);
    }
    try
    {
      localObject1 = super.getWritableDatabase();
    }
    catch (SQLiteException localSQLiteException1)
    {
      for (;;)
      {
        zzj.zza(this.zzQW).start();
        this.zzQW.zzbh("Opening the database failed, dropping the table and recreating it");
        Object localObject2 = zzj.zzb(this.zzQW);
        Object localObject3 = this.zzQW.getContext();
        localObject2 = ((Context)localObject3).getDatabasePath((String)localObject2);
        ((File)localObject2).delete();
        try
        {
          localObject2 = super.getWritableDatabase();
          localObject3 = this.zzQW;
          localObject3 = zzj.zza((zzj)localObject3);
          ((zzaj)localObject3).clear();
        }
        catch (SQLiteException localSQLiteException2)
        {
          this.zzQW.zze("Failed to open freshly created database", localSQLiteException2);
          throw localSQLiteException2;
        }
      }
    }
    return (SQLiteDatabase)localObject1;
  }
  
  public void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    zzx.zzbo(paramSQLiteDatabase.getPath());
  }
  
  public void onOpen(SQLiteDatabase paramSQLiteDatabase)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 15;
    Object localObject3;
    if (i < j)
    {
      j = 0;
      Object localObject1 = null;
      localObject3 = paramSQLiteDatabase.rawQuery("PRAGMA journal_mode=memory", null);
    }
    for (;;)
    {
      try
      {
        ((Cursor)localObject3).moveToFirst();
        ((Cursor)localObject3).close();
        localObject3 = "hits2";
        boolean bool = zza(paramSQLiteDatabase, (String)localObject3);
        if (!bool)
        {
          localObject3 = zzj.zzjR();
          paramSQLiteDatabase.execSQL((String)localObject3);
          localObject3 = "properties";
          bool = zza(paramSQLiteDatabase, (String)localObject3);
          if (bool) {
            break label115;
          }
          localObject3 = "CREATE TABLE IF NOT EXISTS properties ( app_uid INTEGER NOT NULL, cid TEXT NOT NULL, tid TEXT NOT NULL, params TEXT NOT NULL, adid INTEGER NOT NULL, hits_count INTEGER NOT NULL, PRIMARY KEY (app_uid, cid, tid)) ;";
          paramSQLiteDatabase.execSQL((String)localObject3);
          return;
        }
      }
      finally
      {
        ((Cursor)localObject3).close();
      }
      zza(paramSQLiteDatabase);
      continue;
      label115:
      zzb(paramSQLiteDatabase);
    }
  }
  
  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2) {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\internal\zzj$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */