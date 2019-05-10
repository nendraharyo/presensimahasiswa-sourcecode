package com.google.android.gms.ads.internal.purchase;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import com.google.android.gms.internal.zzin;
import java.util.Locale;

public class zzh
{
  private static final String zzFV;
  private static zzh zzFX;
  private static final Object zzpV;
  private final zzh.zza zzFW;
  
  static
  {
    Object localObject = Locale.US;
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = "InAppPurchase";
    arrayOfObject[1] = "purchase_id";
    arrayOfObject[2] = "product_id";
    arrayOfObject[3] = "developer_payload";
    arrayOfObject[4] = "record_time";
    zzFV = String.format((Locale)localObject, "CREATE TABLE IF NOT EXISTS %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, %s TEXT NOT NULL, %s TEXT NOT NULL, %s INTEGER)", arrayOfObject);
    localObject = new java/lang/Object;
    localObject.<init>();
    zzpV = localObject;
  }
  
  zzh(Context paramContext)
  {
    zzh.zza localzza = new com/google/android/gms/ads/internal/purchase/zzh$zza;
    localzza.<init>(this, paramContext, "google_inapp_purchase.db");
    this.zzFW = localzza;
  }
  
  public static zzh zzy(Context paramContext)
  {
    synchronized (zzpV)
    {
      zzh localzzh = zzFX;
      if (localzzh == null)
      {
        localzzh = new com/google/android/gms/ads/internal/purchase/zzh;
        localzzh.<init>(paramContext);
        zzFX = localzzh;
      }
      localzzh = zzFX;
      return localzzh;
    }
  }
  
  public int getRecordCount()
  {
    localCursor = null;
    int i = 0;
    Object localObject1 = null;
    for (;;)
    {
      SQLiteDatabase localSQLiteDatabase;
      Object localObject6;
      String str;
      synchronized (zzpV)
      {
        localSQLiteDatabase = getWritableDatabase();
        if (localSQLiteDatabase == null) {
          return i;
        }
        localObject6 = "select count(*) from InAppPurchase";
        str = null;
      }
      try
      {
        localCursor = localSQLiteDatabase.rawQuery((String)localObject6, null);
        boolean bool = localCursor.moveToFirst();
        if (bool)
        {
          bool = false;
          localSQLiteDatabase = null;
          i = localCursor.getInt(0);
          if (localCursor != null) {
            localCursor.close();
          }
          continue;
          localObject2 = finally;
          throw ((Throwable)localObject2);
        }
      }
      catch (SQLiteException localSQLiteException)
      {
        for (;;)
        {
          localObject6 = new java/lang/StringBuilder;
          ((StringBuilder)localObject6).<init>();
          str = "Error getting record count";
          localObject6 = ((StringBuilder)localObject6).append(str);
          Object localObject5 = localSQLiteException.getMessage();
          localObject5 = ((StringBuilder)localObject6).append((String)localObject5);
          localObject5 = ((StringBuilder)localObject5).toString();
          zzin.zzaK((String)localObject5);
          if (localCursor != null) {
            localCursor.close();
          }
        }
      }
      finally
      {
        if (localCursor == null) {
          break;
        }
        localCursor.close();
      }
    }
  }
  
  public SQLiteDatabase getWritableDatabase()
  {
    try
    {
      localObject1 = this.zzFW;
      localObject1 = ((zzh.zza)localObject1).getWritableDatabase();
    }
    catch (SQLiteException localSQLiteException)
    {
      for (;;)
      {
        Object localObject1;
        zzin.zzaK("Error opening writable conversion tracking database");
        Object localObject2 = null;
      }
    }
    return (SQLiteDatabase)localObject1;
  }
  
  public zzf zza(Cursor paramCursor)
  {
    zzf localzzf;
    if (paramCursor == null) {
      localzzf = null;
    }
    for (;;)
    {
      return localzzf;
      localzzf = new com/google/android/gms/ads/internal/purchase/zzf;
      long l = paramCursor.getLong(0);
      int i = 1;
      String str1 = paramCursor.getString(i);
      int j = 2;
      String str2 = paramCursor.getString(j);
      localzzf.<init>(l, str1, str2);
    }
  }
  
  public void zza(zzf paramzzf)
  {
    if (paramzzf == null) {}
    for (;;)
    {
      return;
      synchronized (zzpV)
      {
        SQLiteDatabase localSQLiteDatabase = getWritableDatabase();
        if (localSQLiteDatabase != null) {}
      }
      Object localObject3 = Locale.US;
      String str = "%s = %d";
      int i = 2;
      Object[] arrayOfObject = new Object[i];
      int j = 0;
      Object localObject4 = "purchase_id";
      arrayOfObject[0] = localObject4;
      j = 1;
      long l = paramzzf.zzFP;
      localObject4 = Long.valueOf(l);
      arrayOfObject[j] = localObject4;
      localObject3 = String.format((Locale)localObject3, str, arrayOfObject);
      str = "InAppPurchase";
      i = 0;
      arrayOfObject = null;
      ((SQLiteDatabase)localObject2).delete(str, (String)localObject3, null);
    }
  }
  
  public void zzb(zzf paramzzf)
  {
    if (paramzzf == null) {}
    for (;;)
    {
      return;
      synchronized (zzpV)
      {
        SQLiteDatabase localSQLiteDatabase = getWritableDatabase();
        if (localSQLiteDatabase != null) {}
      }
      ContentValues localContentValues = new android/content/ContentValues;
      localContentValues.<init>();
      String str = "product_id";
      Object localObject3 = paramzzf.zzFR;
      localContentValues.put(str, (String)localObject3);
      str = "developer_payload";
      localObject3 = paramzzf.zzFQ;
      localContentValues.put(str, (String)localObject3);
      str = "record_time";
      long l1 = SystemClock.elapsedRealtime();
      localObject3 = Long.valueOf(l1);
      localContentValues.put(str, (Long)localObject3);
      str = "InAppPurchase";
      localObject3 = null;
      long l2 = ((SQLiteDatabase)localObject2).insert(str, null, localContentValues);
      paramzzf.zzFP = l2;
      l2 = getRecordCount();
      l1 = 20000L;
      boolean bool = l2 < l1;
      if (bool) {
        zzfY();
      }
    }
  }
  
  /* Error */
  public void zzfY()
  {
    // Byte code:
    //   0: getstatic 49	com/google/android/gms/ads/internal/purchase/zzh:zzpV	Ljava/lang/Object;
    //   3: astore_1
    //   4: aload_1
    //   5: monitorenter
    //   6: aload_0
    //   7: invokevirtual 67	com/google/android/gms/ads/internal/purchase/zzh:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   10: astore_2
    //   11: aload_2
    //   12: ifnonnull +6 -> 18
    //   15: aload_1
    //   16: monitorexit
    //   17: return
    //   18: ldc -73
    //   20: astore_3
    //   21: ldc 23
    //   23: astore 4
    //   25: aconst_null
    //   26: astore 5
    //   28: aconst_null
    //   29: astore 6
    //   31: ldc -71
    //   33: astore 7
    //   35: aload_2
    //   36: aload 4
    //   38: aconst_null
    //   39: aconst_null
    //   40: aconst_null
    //   41: aconst_null
    //   42: aconst_null
    //   43: aload_3
    //   44: aload 7
    //   46: invokevirtual 189	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   49: astore 4
    //   51: aload 4
    //   53: ifnull +29 -> 82
    //   56: aload 4
    //   58: invokeinterface 81 1 0
    //   63: istore 8
    //   65: iload 8
    //   67: ifeq +15 -> 82
    //   70: aload_0
    //   71: aload 4
    //   73: invokevirtual 193	com/google/android/gms/ads/internal/purchase/zzh:zza	(Landroid/database/Cursor;)Lcom/google/android/gms/ads/internal/purchase/zzf;
    //   76: astore_2
    //   77: aload_0
    //   78: aload_2
    //   79: invokevirtual 196	com/google/android/gms/ads/internal/purchase/zzh:zza	(Lcom/google/android/gms/ads/internal/purchase/zzf;)V
    //   82: aload 4
    //   84: ifnull +10 -> 94
    //   87: aload 4
    //   89: invokeinterface 88 1 0
    //   94: aload_1
    //   95: monitorexit
    //   96: goto -79 -> 17
    //   99: astore_2
    //   100: aload_1
    //   101: monitorexit
    //   102: aload_2
    //   103: athrow
    //   104: astore_2
    //   105: aconst_null
    //   106: astore 4
    //   108: new 90	java/lang/StringBuilder
    //   111: astore 5
    //   113: aload 5
    //   115: invokespecial 91	java/lang/StringBuilder:<init>	()V
    //   118: ldc -58
    //   120: astore 6
    //   122: aload 5
    //   124: aload 6
    //   126: invokevirtual 97	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   129: astore 5
    //   131: aload_2
    //   132: invokevirtual 103	android/database/sqlite/SQLiteException:getMessage	()Ljava/lang/String;
    //   135: astore_2
    //   136: aload 5
    //   138: aload_2
    //   139: invokevirtual 97	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   142: astore_2
    //   143: aload_2
    //   144: invokevirtual 106	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   147: astore_2
    //   148: aload_2
    //   149: invokestatic 112	com/google/android/gms/internal/zzin:zzaK	(Ljava/lang/String;)V
    //   152: aload 4
    //   154: ifnull -60 -> 94
    //   157: aload 4
    //   159: invokeinterface 88 1 0
    //   164: goto -70 -> 94
    //   167: astore_2
    //   168: aconst_null
    //   169: astore 4
    //   171: aload 4
    //   173: ifnull +10 -> 183
    //   176: aload 4
    //   178: invokeinterface 88 1 0
    //   183: aload_2
    //   184: athrow
    //   185: astore_2
    //   186: goto -15 -> 171
    //   189: astore_2
    //   190: goto -82 -> 108
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	193	0	this	zzh
    //   3	98	1	localObject1	Object
    //   10	69	2	localObject2	Object
    //   99	4	2	localObject3	Object
    //   104	28	2	localSQLiteException1	SQLiteException
    //   135	14	2	localObject4	Object
    //   167	17	2	localObject5	Object
    //   185	1	2	localObject6	Object
    //   189	1	2	localSQLiteException2	SQLiteException
    //   20	24	3	str1	String
    //   23	154	4	localObject7	Object
    //   26	111	5	localStringBuilder	StringBuilder
    //   29	96	6	str2	String
    //   33	12	7	str3	String
    //   63	3	8	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   6	10	99	finally
    //   15	17	99	finally
    //   87	94	99	finally
    //   94	96	99	finally
    //   100	102	99	finally
    //   157	164	99	finally
    //   176	183	99	finally
    //   183	185	99	finally
    //   44	49	104	android/database/sqlite/SQLiteException
    //   44	49	167	finally
    //   56	63	185	finally
    //   71	76	185	finally
    //   78	82	185	finally
    //   108	111	185	finally
    //   113	118	185	finally
    //   124	129	185	finally
    //   131	135	185	finally
    //   138	142	185	finally
    //   143	147	185	finally
    //   148	152	185	finally
    //   56	63	189	android/database/sqlite/SQLiteException
    //   71	76	189	android/database/sqlite/SQLiteException
    //   78	82	189	android/database/sqlite/SQLiteException
  }
  
  /* Error */
  public java.util.List zzg(long paramLong)
  {
    // Byte code:
    //   0: getstatic 49	com/google/android/gms/ads/internal/purchase/zzh:zzpV	Ljava/lang/Object;
    //   3: astore_3
    //   4: aload_3
    //   5: monitorenter
    //   6: new 200	java/util/LinkedList
    //   9: astore 4
    //   11: aload 4
    //   13: invokespecial 201	java/util/LinkedList:<init>	()V
    //   16: lconst_0
    //   17: lstore 5
    //   19: lload_1
    //   20: lload 5
    //   22: lcmp
    //   23: istore 7
    //   25: iload 7
    //   27: ifgt +12 -> 39
    //   30: aload_3
    //   31: monitorexit
    //   32: aload 4
    //   34: astore 8
    //   36: aload 8
    //   38: areturn
    //   39: aload_0
    //   40: invokevirtual 67	com/google/android/gms/ads/internal/purchase/zzh:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   43: astore 8
    //   45: aload 8
    //   47: ifnonnull +12 -> 59
    //   50: aload_3
    //   51: monitorexit
    //   52: aload 4
    //   54: astore 8
    //   56: goto -20 -> 36
    //   59: ldc -73
    //   61: astore 9
    //   63: ldc 23
    //   65: astore 10
    //   67: aconst_null
    //   68: astore 11
    //   70: aconst_null
    //   71: astore 12
    //   73: lload_1
    //   74: invokestatic 204	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   77: astore 13
    //   79: aload 8
    //   81: aload 10
    //   83: aconst_null
    //   84: aconst_null
    //   85: aconst_null
    //   86: aconst_null
    //   87: aconst_null
    //   88: aload 9
    //   90: aload 13
    //   92: invokevirtual 189	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   95: astore 10
    //   97: aload 10
    //   99: invokeinterface 81 1 0
    //   104: istore 7
    //   106: iload 7
    //   108: ifeq +35 -> 143
    //   111: aload_0
    //   112: aload 10
    //   114: invokevirtual 193	com/google/android/gms/ads/internal/purchase/zzh:zza	(Landroid/database/Cursor;)Lcom/google/android/gms/ads/internal/purchase/zzf;
    //   117: astore 8
    //   119: aload 4
    //   121: aload 8
    //   123: invokeinterface 210 2 0
    //   128: pop
    //   129: aload 10
    //   131: invokeinterface 213 1 0
    //   136: istore 7
    //   138: iload 7
    //   140: ifne -29 -> 111
    //   143: aload 10
    //   145: ifnull +10 -> 155
    //   148: aload 10
    //   150: invokeinterface 88 1 0
    //   155: aload_3
    //   156: monitorexit
    //   157: aload 4
    //   159: astore 8
    //   161: goto -125 -> 36
    //   164: astore 8
    //   166: aconst_null
    //   167: astore 10
    //   169: new 90	java/lang/StringBuilder
    //   172: astore 11
    //   174: aload 11
    //   176: invokespecial 91	java/lang/StringBuilder:<init>	()V
    //   179: ldc -41
    //   181: astore 12
    //   183: aload 11
    //   185: aload 12
    //   187: invokevirtual 97	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   190: astore 11
    //   192: aload 8
    //   194: invokevirtual 103	android/database/sqlite/SQLiteException:getMessage	()Ljava/lang/String;
    //   197: astore 8
    //   199: aload 11
    //   201: aload 8
    //   203: invokevirtual 97	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   206: astore 8
    //   208: aload 8
    //   210: invokevirtual 106	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   213: astore 8
    //   215: aload 8
    //   217: invokestatic 112	com/google/android/gms/internal/zzin:zzaK	(Ljava/lang/String;)V
    //   220: aload 10
    //   222: ifnull -67 -> 155
    //   225: aload 10
    //   227: invokeinterface 88 1 0
    //   232: goto -77 -> 155
    //   235: astore 8
    //   237: aload_3
    //   238: monitorexit
    //   239: aload 8
    //   241: athrow
    //   242: astore 8
    //   244: aconst_null
    //   245: astore 10
    //   247: aload 10
    //   249: ifnull +10 -> 259
    //   252: aload 10
    //   254: invokeinterface 88 1 0
    //   259: aload 8
    //   261: athrow
    //   262: astore 8
    //   264: goto -17 -> 247
    //   267: astore 8
    //   269: goto -100 -> 169
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	272	0	this	zzh
    //   0	272	1	paramLong	long
    //   3	235	3	localObject1	Object
    //   9	149	4	localLinkedList	java.util.LinkedList
    //   17	4	5	l	long
    //   23	116	7	bool	boolean
    //   34	126	8	localObject2	Object
    //   164	29	8	localSQLiteException1	SQLiteException
    //   197	19	8	localObject3	Object
    //   235	5	8	localObject4	Object
    //   242	18	8	localObject5	Object
    //   262	1	8	localObject6	Object
    //   267	1	8	localSQLiteException2	SQLiteException
    //   61	28	9	str1	String
    //   65	188	10	localObject7	Object
    //   68	132	11	localStringBuilder	StringBuilder
    //   71	115	12	str2	String
    //   77	14	13	str3	String
    // Exception table:
    //   from	to	target	type
    //   73	77	164	android/database/sqlite/SQLiteException
    //   90	95	164	android/database/sqlite/SQLiteException
    //   6	9	235	finally
    //   11	16	235	finally
    //   30	32	235	finally
    //   39	43	235	finally
    //   50	52	235	finally
    //   148	155	235	finally
    //   155	157	235	finally
    //   225	232	235	finally
    //   237	239	235	finally
    //   252	259	235	finally
    //   259	262	235	finally
    //   73	77	242	finally
    //   90	95	242	finally
    //   97	104	262	finally
    //   112	117	262	finally
    //   121	129	262	finally
    //   129	136	262	finally
    //   169	172	262	finally
    //   174	179	262	finally
    //   185	190	262	finally
    //   192	197	262	finally
    //   201	206	262	finally
    //   208	213	262	finally
    //   215	220	262	finally
    //   97	104	267	android/database/sqlite/SQLiteException
    //   112	117	267	android/database/sqlite/SQLiteException
    //   121	129	267	android/database/sqlite/SQLiteException
    //   129	136	267	android/database/sqlite/SQLiteException
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\purchase\zzh.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */