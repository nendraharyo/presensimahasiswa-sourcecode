package com.crashlytics.android.core;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class BinaryImagesConverter
{
  private static final String DATA_DIR = "/data";
  private final Context context;
  private final BinaryImagesConverter.FileIdStrategy fileIdStrategy;
  
  BinaryImagesConverter(Context paramContext, BinaryImagesConverter.FileIdStrategy paramFileIdStrategy)
  {
    this.context = paramContext;
    this.fileIdStrategy = paramFileIdStrategy;
  }
  
  private File correctDataPath(File paramFile)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 9;
    if (i < j) {}
    for (;;)
    {
      return paramFile;
      Object localObject1 = paramFile.getAbsolutePath();
      Object localObject2 = "/data";
      boolean bool = ((String)localObject1).startsWith((String)localObject2);
      if (bool) {
        try
        {
          localObject1 = this.context;
          localObject1 = ((Context)localObject1).getPackageManager();
          localObject2 = this.context;
          localObject2 = ((Context)localObject2).getPackageName();
          str1 = null;
          localObject2 = ((PackageManager)localObject1).getApplicationInfo((String)localObject2, 0);
          localObject1 = new java/io/File;
          localObject2 = ((ApplicationInfo)localObject2).nativeLibraryDir;
          str1 = paramFile.getName();
          ((File)localObject1).<init>((String)localObject2, str1);
          paramFile = (File)localObject1;
        }
        catch (PackageManager.NameNotFoundException localNameNotFoundException)
        {
          localObject2 = Fabric.getLogger();
          String str1 = "CrashlyticsCore";
          String str2 = "Error getting ApplicationInfo";
          ((Logger)localObject2).e(str1, str2, localNameNotFoundException);
        }
      }
    }
  }
  
  private static JSONObject createBinaryImageJson(String paramString, ProcMapEntry paramProcMapEntry)
  {
    JSONObject localJSONObject = new org/json/JSONObject;
    localJSONObject.<init>();
    long l = paramProcMapEntry.address;
    localJSONObject.put("base_address", l);
    l = paramProcMapEntry.size;
    localJSONObject.put("size", l);
    String str = paramProcMapEntry.path;
    localJSONObject.put("name", str);
    localJSONObject.put("uuid", paramString);
    return localJSONObject;
  }
  
  private static byte[] generateBinaryImagesJsonString(JSONArray paramJSONArray)
  {
    Object localObject1 = new org/json/JSONObject;
    ((JSONObject)localObject1).<init>();
    localObject2 = "binary_images";
    try
    {
      ((JSONObject)localObject1).put((String)localObject2, paramJSONArray);
      localObject1 = ((JSONObject)localObject1).toString().getBytes();
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        localObject2 = Fabric.getLogger();
        String str1 = "CrashlyticsCore";
        String str2 = "Binary images string is null";
        ((Logger)localObject2).w(str1, str2, localJSONException);
        byte[] arrayOfByte = new byte[0];
      }
    }
    return (byte[])localObject1;
  }
  
  private File getLibraryFile(String paramString)
  {
    File localFile = new java/io/File;
    localFile.<init>(paramString);
    boolean bool = localFile.exists();
    if (!bool) {
      localFile = correctDataPath(localFile);
    }
    return localFile;
  }
  
  private static boolean isRelevant(ProcMapEntry paramProcMapEntry)
  {
    int i = -1;
    String str = paramProcMapEntry.perms;
    int j = 120;
    int k = str.indexOf(j);
    if (k != i)
    {
      str = paramProcMapEntry.path;
      j = 47;
      k = str.indexOf(j);
      if (k != i) {
        k = 1;
      }
    }
    for (;;)
    {
      return k;
      int m = 0;
      str = null;
    }
  }
  
  private static String joinMapsEntries(JSONArray paramJSONArray)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    int i = 0;
    for (;;)
    {
      int j = paramJSONArray.length();
      if (i >= j) {
        break;
      }
      String str = paramJSONArray.getString(i);
      localStringBuilder.append(str);
      i += 1;
    }
    return localStringBuilder.toString();
  }
  
  private JSONObject jsonFromMapEntryString(String paramString)
  {
    JSONObject localJSONObject = null;
    Object localObject1 = ProcMapEntryParser.parse(paramString);
    if (localObject1 != null)
    {
      boolean bool = isRelevant((ProcMapEntry)localObject1);
      if (bool) {
        break label24;
      }
    }
    for (;;)
    {
      return localJSONObject;
      label24:
      Object localObject2 = ((ProcMapEntry)localObject1).path;
      localObject2 = getLibraryFile((String)localObject2);
      try
      {
        localObject3 = this.fileIdStrategy;
        localObject2 = ((BinaryImagesConverter.FileIdStrategy)localObject3).createId((File)localObject2);
      }
      catch (IOException localIOException)
      {
        try
        {
          localJSONObject = createBinaryImageJson((String)localObject2, (ProcMapEntry)localObject1);
        }
        catch (JSONException localJSONException)
        {
          StringBuilder localStringBuilder;
          String str2;
          localObject1 = Fabric.getLogger();
          Object localObject3 = "CrashlyticsCore";
          String str1 = "Could not create a binary image json string";
          ((Logger)localObject1).d((String)localObject3, str1, localJSONException);
        }
        localIOException = localIOException;
        localObject3 = Fabric.getLogger();
        str1 = "CrashlyticsCore";
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        str2 = "Could not generate ID for file ";
        localStringBuilder = localStringBuilder.append(str2);
        localObject1 = ((ProcMapEntry)localObject1).path;
        localObject1 = (String)localObject1;
        ((Logger)localObject3).d(str1, (String)localObject1, localIOException);
      }
    }
  }
  
  private JSONArray parseProcMapsJsonFromStream(BufferedReader paramBufferedReader)
  {
    JSONArray localJSONArray = new org/json/JSONArray;
    localJSONArray.<init>();
    for (;;)
    {
      Object localObject = paramBufferedReader.readLine();
      if (localObject == null) {
        break;
      }
      localObject = jsonFromMapEntryString((String)localObject);
      if (localObject != null) {
        localJSONArray.put(localObject);
      }
    }
    return localJSONArray;
  }
  
  private JSONArray parseProcMapsJsonFromString(String paramString)
  {
    JSONArray localJSONArray1 = new org/json/JSONArray;
    localJSONArray1.<init>();
    JSONArray localJSONArray2;
    try
    {
      Object localObject1 = new org/json/JSONObject;
      ((JSONObject)localObject1).<init>(paramString);
      Object localObject2 = "maps";
      localObject1 = ((JSONObject)localObject1).getJSONArray((String)localObject2);
      localObject2 = joinMapsEntries((JSONArray)localObject1).split("\\|");
      int i = 0;
      localObject1 = null;
      Object localObject3;
      for (;;)
      {
        int j = localObject2.length;
        if (i >= j) {
          break;
        }
        localObject3 = localObject2[i];
        localObject3 = jsonFromMapEntryString((String)localObject3);
        if (localObject3 != null) {
          localJSONArray1.put(localObject3);
        }
        i += 1;
      }
      String str;
      return localJSONArray2;
    }
    catch (JSONException localJSONException)
    {
      localObject2 = Fabric.getLogger();
      localObject3 = "CrashlyticsCore";
      str = "Unable to parse proc maps string";
      ((Logger)localObject2).w((String)localObject3, str, localJSONException);
      localJSONArray2 = localJSONArray1;
    }
    for (;;)
    {
      localJSONArray2 = localJSONArray1;
    }
  }
  
  byte[] convert(BufferedReader paramBufferedReader)
  {
    return generateBinaryImagesJsonString(parseProcMapsJsonFromStream(paramBufferedReader));
  }
  
  byte[] convert(String paramString)
  {
    return generateBinaryImagesJsonString(parseProcMapsJsonFromString(paramString));
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\BinaryImagesConverter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */