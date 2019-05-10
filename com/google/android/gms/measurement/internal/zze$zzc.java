package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build.VERSION;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class zze$zzc
  extends SQLiteOpenHelper
{
  zze$zzc(zze paramzze, Context paramContext, String paramString)
  {
    super(paramContext, paramString, null, 1);
  }
  
  private void zza(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2, String paramString3, Map paramMap)
  {
    boolean bool = zza(paramSQLiteDatabase, paramString1);
    if (!bool) {
      paramSQLiteDatabase.execSQL(paramString2);
    }
    try
    {
      zza(paramSQLiteDatabase, paramString1, paramString3, paramMap);
      return;
    }
    catch (SQLiteException localSQLiteException)
    {
      this.zzaVH.zzAo().zzCE().zzj("Failed to verify columns on table that was just created", paramString1);
      throw localSQLiteException;
    }
  }
  
  private void zza(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2, Map paramMap)
  {
    Object localObject1 = zzb(paramSQLiteDatabase, paramString1);
    Object localObject2 = paramString2.split(",");
    int i = localObject2.length;
    int j = 0;
    Object localObject3 = null;
    while (j < i)
    {
      Object localObject4 = localObject2[j];
      boolean bool3 = ((Set)localObject1).remove(localObject4);
      if (!bool3)
      {
        localObject3 = new android/database/sqlite/SQLiteException;
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject1 = "Table " + paramString1 + " is missing required column: " + (String)localObject4;
        ((SQLiteException)localObject3).<init>((String)localObject1);
        throw ((Throwable)localObject3);
      }
      j += 1;
    }
    if (paramMap != null)
    {
      localObject3 = paramMap.entrySet();
      localObject2 = ((Set)localObject3).iterator();
      for (;;)
      {
        bool2 = ((Iterator)localObject2).hasNext();
        if (!bool2) {
          break;
        }
        localObject3 = (Map.Entry)((Iterator)localObject2).next();
        Object localObject5 = ((Map.Entry)localObject3).getKey();
        boolean bool1 = ((Set)localObject1).remove(localObject5);
        if (!bool1)
        {
          localObject3 = (String)((Map.Entry)localObject3).getValue();
          paramSQLiteDatabase.execSQL((String)localObject3);
        }
      }
    }
    boolean bool2 = ((Set)localObject1).isEmpty();
    if (!bool2)
    {
      localObject3 = new android/database/sqlite/SQLiteException;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Table " + paramString1 + " table has extra columns";
      ((SQLiteException)localObject3).<init>((String)localObject1);
      throw ((Throwable)localObject3);
    }
  }
  
  /* Error */
  private boolean zza(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: ldc 120
    //   4: astore 4
    //   6: iconst_1
    //   7: istore 5
    //   9: iload 5
    //   11: anewarray 56	java/lang/String
    //   14: astore 6
    //   16: iconst_0
    //   17: istore 5
    //   19: aconst_null
    //   20: astore 7
    //   22: ldc 122
    //   24: astore 8
    //   26: aload 6
    //   28: iconst_0
    //   29: aload 8
    //   31: aastore
    //   32: ldc 124
    //   34: astore 8
    //   36: iconst_1
    //   37: istore 5
    //   39: iload 5
    //   41: anewarray 56	java/lang/String
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
    //   72: invokevirtual 128	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   75: astore 4
    //   77: aload 4
    //   79: invokeinterface 133 1 0
    //   84: istore 5
    //   86: aload 4
    //   88: ifnull +10 -> 98
    //   91: aload 4
    //   93: invokeinterface 136 1 0
    //   98: iload 5
    //   100: ireturn
    //   101: astore 7
    //   103: aconst_null
    //   104: astore 4
    //   106: aload_0
    //   107: getfield 8	com/google/android/gms/measurement/internal/zze$zzc:zzaVH	Lcom/google/android/gms/measurement/internal/zze;
    //   110: astore 6
    //   112: aload 6
    //   114: invokevirtual 32	com/google/android/gms/measurement/internal/zze:zzAo	()Lcom/google/android/gms/measurement/internal/zzp;
    //   117: astore 6
    //   119: aload 6
    //   121: invokevirtual 139	com/google/android/gms/measurement/internal/zzp:zzCF	()Lcom/google/android/gms/measurement/internal/zzp$zza;
    //   124: astore 6
    //   126: ldc -115
    //   128: astore 8
    //   130: aload 6
    //   132: aload 8
    //   134: aload_2
    //   135: aload 7
    //   137: invokevirtual 145	com/google/android/gms/measurement/internal/zzp$zza:zze	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   140: aload 4
    //   142: ifnull +10 -> 152
    //   145: aload 4
    //   147: invokeinterface 136 1 0
    //   152: iconst_0
    //   153: istore 5
    //   155: aconst_null
    //   156: astore 7
    //   158: goto -60 -> 98
    //   161: astore 7
    //   163: aload_3
    //   164: ifnull +9 -> 173
    //   167: aload_3
    //   168: invokeinterface 136 1 0
    //   173: aload 7
    //   175: athrow
    //   176: astore 7
    //   178: aload 4
    //   180: astore_3
    //   181: goto -18 -> 163
    //   184: astore 7
    //   186: goto -80 -> 106
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	189	0	this	zzc
    //   0	189	1	paramSQLiteDatabase	SQLiteDatabase
    //   0	189	2	paramString	String
    //   1	180	3	localObject1	Object
    //   4	175	4	localObject2	Object
    //   7	147	5	bool	boolean
    //   14	117	6	localObject3	Object
    //   20	39	7	localSQLiteDatabase	SQLiteDatabase
    //   101	35	7	localSQLiteException1	SQLiteException
    //   156	1	7	localObject4	Object
    //   161	13	7	localObject5	Object
    //   176	1	7	localObject6	Object
    //   184	1	7	localSQLiteException2	SQLiteException
    //   24	109	8	str	String
    //   44	24	9	arrayOfString	String[]
    // Exception table:
    //   from	to	target	type
    //   9	14	101	android/database/sqlite/SQLiteException
    //   29	32	101	android/database/sqlite/SQLiteException
    //   39	44	101	android/database/sqlite/SQLiteException
    //   55	57	101	android/database/sqlite/SQLiteException
    //   71	75	101	android/database/sqlite/SQLiteException
    //   9	14	161	finally
    //   29	32	161	finally
    //   39	44	161	finally
    //   55	57	161	finally
    //   71	75	161	finally
    //   77	84	176	finally
    //   106	110	176	finally
    //   112	117	176	finally
    //   119	124	176	finally
    //   135	140	176	finally
    //   77	84	184	android/database/sqlite/SQLiteException
  }
  
  private Set zzb(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = "SELECT * FROM " + paramString + " LIMIT 0";
    String[] arrayOfString = null;
    localObject2 = paramSQLiteDatabase.rawQuery((String)localObject2, null);
    try
    {
      arrayOfString = ((Cursor)localObject2).getColumnNames();
      Collections.addAll(localHashSet, arrayOfString);
      return localHashSet;
    }
    finally
    {
      ((Cursor)localObject2).close();
    }
  }
  
  public SQLiteDatabase getWritableDatabase()
  {
    Object localObject1 = zze.zza(this.zzaVH);
    localObject3 = this.zzaVH.zzCp();
    long l = ((zzd)localObject3).zzBN();
    boolean bool = ((zzaf)localObject1).zzv(l);
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
        zze.zza(this.zzaVH).start();
        this.zzaVH.zzAo().zzCE().zzfg("Opening the database failed, dropping and recreating it");
        Object localObject2 = zze.zzb(this.zzaVH);
        localObject3 = this.zzaVH.getContext();
        localObject2 = ((Context)localObject3).getDatabasePath((String)localObject2);
        ((File)localObject2).delete();
        try
        {
          localObject2 = super.getWritableDatabase();
          localObject3 = this.zzaVH;
          localObject3 = zze.zza((zze)localObject3);
          ((zzaf)localObject3).clear();
        }
        catch (SQLiteException localSQLiteException2)
        {
          this.zzaVH.zzAo().zzCE().zzj("Failed to open freshly created database", localSQLiteException2);
          throw localSQLiteException2;
        }
      }
    }
    return (SQLiteDatabase)localObject1;
  }
  
  public void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    boolean bool = true;
    int i = Build.VERSION.SDK_INT;
    int j = 9;
    if (i >= j)
    {
      File localFile = new java/io/File;
      String str = paramSQLiteDatabase.getPath();
      localFile.<init>(str);
      localFile.setReadable(false, false);
      localFile.setWritable(false, false);
      localFile.setReadable(bool, bool);
      localFile.setWritable(bool, bool);
    }
  }
  
  public void onOpen(SQLiteDatabase paramSQLiteDatabase)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 15;
    Object localObject1;
    if (i < j) {
      localObject1 = paramSQLiteDatabase.rawQuery("PRAGMA journal_mode=memory", null);
    }
    try
    {
      ((Cursor)localObject1).moveToFirst();
      ((Cursor)localObject1).close();
      localObject1 = this;
      SQLiteDatabase localSQLiteDatabase = paramSQLiteDatabase;
      zza(paramSQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", null);
      zza(paramSQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", null);
      Map localMap = zze.zzCx();
      zza(paramSQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", localMap);
      zza(paramSQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", null);
      zza(paramSQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
      zza(paramSQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", null);
      zza(paramSQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", null);
      zza(paramSQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", null);
      zza(paramSQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
      return;
    }
    finally
    {
      ((Cursor)localObject1).close();
    }
  }
  
  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2) {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\internal\zze$zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */