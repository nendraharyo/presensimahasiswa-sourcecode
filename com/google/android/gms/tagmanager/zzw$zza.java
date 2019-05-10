package com.google.android.gms.tagmanager;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build.VERSION;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

class zzw$zza
  extends SQLiteOpenHelper
{
  zzw$zza(zzw paramzzw, Context paramContext, String paramString)
  {
    super(paramContext, paramString, null, 1);
  }
  
  /* Error */
  private boolean zza(String paramString, SQLiteDatabase paramSQLiteDatabase)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: ldc 15
    //   4: astore 4
    //   6: iconst_1
    //   7: istore 5
    //   9: iload 5
    //   11: anewarray 17	java/lang/String
    //   14: astore 6
    //   16: iconst_0
    //   17: istore 5
    //   19: aconst_null
    //   20: astore 7
    //   22: ldc 19
    //   24: astore 8
    //   26: aload 6
    //   28: iconst_0
    //   29: aload 8
    //   31: aastore
    //   32: ldc 21
    //   34: astore 8
    //   36: iconst_1
    //   37: istore 5
    //   39: iload 5
    //   41: anewarray 17	java/lang/String
    //   44: astore 9
    //   46: iconst_0
    //   47: istore 5
    //   49: aconst_null
    //   50: astore 7
    //   52: aload 9
    //   54: iconst_0
    //   55: aload_1
    //   56: aastore
    //   57: aload_2
    //   58: astore 7
    //   60: aload_2
    //   61: aload 4
    //   63: aload 6
    //   65: aload 8
    //   67: aload 9
    //   69: aconst_null
    //   70: aconst_null
    //   71: aconst_null
    //   72: invokevirtual 27	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   75: astore 4
    //   77: aload 4
    //   79: invokeinterface 33 1 0
    //   84: istore 5
    //   86: aload 4
    //   88: ifnull +10 -> 98
    //   91: aload 4
    //   93: invokeinterface 37 1 0
    //   98: iload 5
    //   100: ireturn
    //   101: astore 7
    //   103: iconst_0
    //   104: istore 5
    //   106: aconst_null
    //   107: astore 7
    //   109: new 39	java/lang/StringBuilder
    //   112: astore 4
    //   114: aload 4
    //   116: invokespecial 41	java/lang/StringBuilder:<init>	()V
    //   119: ldc 43
    //   121: astore 6
    //   123: aload 4
    //   125: aload 6
    //   127: invokevirtual 47	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   130: astore 4
    //   132: aload 4
    //   134: aload_1
    //   135: invokevirtual 47	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   138: astore 4
    //   140: aload 4
    //   142: invokevirtual 51	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   145: astore 4
    //   147: aload 4
    //   149: invokestatic 57	com/google/android/gms/tagmanager/zzbg:zzaK	(Ljava/lang/String;)V
    //   152: aload 7
    //   154: ifnull +10 -> 164
    //   157: aload 7
    //   159: invokeinterface 37 1 0
    //   164: iconst_0
    //   165: istore 5
    //   167: aconst_null
    //   168: astore 7
    //   170: goto -72 -> 98
    //   173: astore 7
    //   175: aload_3
    //   176: ifnull +9 -> 185
    //   179: aload_3
    //   180: invokeinterface 37 1 0
    //   185: aload 7
    //   187: athrow
    //   188: astore 7
    //   190: aload 4
    //   192: astore_3
    //   193: goto -18 -> 175
    //   196: astore 4
    //   198: aload 7
    //   200: astore_3
    //   201: aload 4
    //   203: astore 7
    //   205: goto -30 -> 175
    //   208: astore 7
    //   210: aload 4
    //   212: astore 7
    //   214: goto -105 -> 109
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	217	0	this	zza
    //   0	217	1	paramString	String
    //   0	217	2	paramSQLiteDatabase	SQLiteDatabase
    //   1	200	3	localObject1	Object
    //   4	187	4	localObject2	Object
    //   196	15	4	localObject3	Object
    //   7	159	5	bool	boolean
    //   14	112	6	localObject4	Object
    //   20	39	7	localSQLiteDatabase	SQLiteDatabase
    //   101	1	7	localSQLiteException1	SQLiteException
    //   107	62	7	localObject5	Object
    //   173	13	7	localObject6	Object
    //   188	11	7	localObject7	Object
    //   203	1	7	localObject8	Object
    //   208	1	7	localSQLiteException2	SQLiteException
    //   212	1	7	localObject9	Object
    //   24	42	8	str	String
    //   44	24	9	arrayOfString	String[]
    // Exception table:
    //   from	to	target	type
    //   9	14	101	android/database/sqlite/SQLiteException
    //   29	32	101	android/database/sqlite/SQLiteException
    //   39	44	101	android/database/sqlite/SQLiteException
    //   55	57	101	android/database/sqlite/SQLiteException
    //   71	75	101	android/database/sqlite/SQLiteException
    //   9	14	173	finally
    //   29	32	173	finally
    //   39	44	173	finally
    //   55	57	173	finally
    //   71	75	173	finally
    //   77	84	188	finally
    //   109	112	196	finally
    //   114	119	196	finally
    //   125	130	196	finally
    //   134	138	196	finally
    //   140	145	196	finally
    //   147	152	196	finally
    //   77	84	208	android/database/sqlite/SQLiteException
  }
  
  private void zzc(SQLiteDatabase paramSQLiteDatabase)
  {
    Object localObject1 = "SELECT * FROM datalayer WHERE 0";
    Cursor localCursor = paramSQLiteDatabase.rawQuery((String)localObject1, null);
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
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
      localCursor.close();
      localObject1 = "key";
      bool = localHashSet.remove(localObject1);
      if (bool)
      {
        localObject1 = "value";
        bool = localHashSet.remove(localObject1);
        if (bool)
        {
          localObject1 = "ID";
          bool = localHashSet.remove(localObject1);
          if (bool)
          {
            localObject1 = "expires";
            bool = localHashSet.remove(localObject1);
            if (bool) {
              break label170;
            }
          }
        }
      }
      localObject1 = new android/database/sqlite/SQLiteException;
      ((SQLiteException)localObject1).<init>("Database column missing");
      throw ((Throwable)localObject1);
    }
    finally
    {
      localCursor.close();
    }
    label170:
    boolean bool = localHashSet.isEmpty();
    if (!bool)
    {
      SQLiteException localSQLiteException = new android/database/sqlite/SQLiteException;
      localSQLiteException.<init>("Database has extra columns");
      throw localSQLiteException;
    }
  }
  
  public SQLiteDatabase getWritableDatabase()
  {
    SQLiteDatabase localSQLiteDatabase = null;
    try
    {
      localSQLiteDatabase = super.getWritableDatabase();
    }
    catch (SQLiteException localSQLiteException)
    {
      for (;;)
      {
        Object localObject = zzw.zzb(this.zzbiH);
        String str = "google_tagmanager.db";
        localObject = ((Context)localObject).getDatabasePath(str);
        ((File)localObject).delete();
      }
    }
    if (localSQLiteDatabase == null) {
      localSQLiteDatabase = super.getWritableDatabase();
    }
    return localSQLiteDatabase;
  }
  
  public void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    zzal.zzbo(paramSQLiteDatabase.getPath());
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
        localObject3 = "datalayer";
        boolean bool = zza((String)localObject3, paramSQLiteDatabase);
        if (!bool)
        {
          localObject3 = zzw.zzGv();
          paramSQLiteDatabase.execSQL((String)localObject3);
          return;
        }
      }
      finally
      {
        ((Cursor)localObject3).close();
      }
      zzc(paramSQLiteDatabase);
    }
  }
  
  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2) {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzw$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */