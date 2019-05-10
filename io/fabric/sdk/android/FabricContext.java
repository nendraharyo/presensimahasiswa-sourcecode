package io.fabric.sdk.android;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import java.io.File;

class FabricContext
  extends ContextWrapper
{
  private final String componentName;
  private final String componentPath;
  
  public FabricContext(Context paramContext, String paramString1, String paramString2)
  {
    super(paramContext);
    this.componentName = paramString1;
    this.componentPath = paramString2;
  }
  
  public File getCacheDir()
  {
    File localFile1 = new java/io/File;
    File localFile2 = super.getCacheDir();
    String str = this.componentPath;
    localFile1.<init>(localFile2, str);
    return localFile1;
  }
  
  public File getDatabasePath(String paramString)
  {
    File localFile1 = new java/io/File;
    File localFile2 = super.getDatabasePath(paramString).getParentFile();
    String str = this.componentPath;
    localFile1.<init>(localFile2, str);
    localFile1.mkdirs();
    localFile2 = new java/io/File;
    localFile2.<init>(localFile1, paramString);
    return localFile2;
  }
  
  public File getExternalCacheDir()
  {
    File localFile1 = new java/io/File;
    File localFile2 = super.getExternalCacheDir();
    String str = this.componentPath;
    localFile1.<init>(localFile2, str);
    return localFile1;
  }
  
  public File getExternalFilesDir(String paramString)
  {
    File localFile1 = new java/io/File;
    File localFile2 = super.getExternalFilesDir(paramString);
    String str = this.componentPath;
    localFile1.<init>(localFile2, str);
    return localFile1;
  }
  
  public File getFilesDir()
  {
    File localFile1 = new java/io/File;
    File localFile2 = super.getFilesDir();
    String str = this.componentPath;
    localFile1.<init>(localFile2, str);
    return localFile1;
  }
  
  public SharedPreferences getSharedPreferences(String paramString, int paramInt)
  {
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    String str = this.componentName;
    localObject = str + ":" + paramString;
    return super.getSharedPreferences((String)localObject, paramInt);
  }
  
  public SQLiteDatabase openOrCreateDatabase(String paramString, int paramInt, SQLiteDatabase.CursorFactory paramCursorFactory)
  {
    return SQLiteDatabase.openOrCreateDatabase(getDatabasePath(paramString), paramCursorFactory);
  }
  
  public SQLiteDatabase openOrCreateDatabase(String paramString, int paramInt, SQLiteDatabase.CursorFactory paramCursorFactory, DatabaseErrorHandler paramDatabaseErrorHandler)
  {
    return SQLiteDatabase.openOrCreateDatabase(getDatabasePath(paramString).getPath(), paramCursorFactory, paramDatabaseErrorHandler);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\FabricContext.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */