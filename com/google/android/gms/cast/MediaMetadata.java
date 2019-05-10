package com.google.android.gms.cast;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.internal.zzlp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class MediaMetadata
{
  public static final String KEY_ALBUM_ARTIST = "com.google.android.gms.cast.metadata.ALBUM_ARTIST";
  public static final String KEY_ALBUM_TITLE = "com.google.android.gms.cast.metadata.ALBUM_TITLE";
  public static final String KEY_ARTIST = "com.google.android.gms.cast.metadata.ARTIST";
  public static final String KEY_BROADCAST_DATE = "com.google.android.gms.cast.metadata.BROADCAST_DATE";
  public static final String KEY_COMPOSER = "com.google.android.gms.cast.metadata.COMPOSER";
  public static final String KEY_CREATION_DATE = "com.google.android.gms.cast.metadata.CREATION_DATE";
  public static final String KEY_DISC_NUMBER = "com.google.android.gms.cast.metadata.DISC_NUMBER";
  public static final String KEY_EPISODE_NUMBER = "com.google.android.gms.cast.metadata.EPISODE_NUMBER";
  public static final String KEY_HEIGHT = "com.google.android.gms.cast.metadata.HEIGHT";
  public static final String KEY_LOCATION_LATITUDE = "com.google.android.gms.cast.metadata.LOCATION_LATITUDE";
  public static final String KEY_LOCATION_LONGITUDE = "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE";
  public static final String KEY_LOCATION_NAME = "com.google.android.gms.cast.metadata.LOCATION_NAME";
  public static final String KEY_RELEASE_DATE = "com.google.android.gms.cast.metadata.RELEASE_DATE";
  public static final String KEY_SEASON_NUMBER = "com.google.android.gms.cast.metadata.SEASON_NUMBER";
  public static final String KEY_SERIES_TITLE = "com.google.android.gms.cast.metadata.SERIES_TITLE";
  public static final String KEY_STUDIO = "com.google.android.gms.cast.metadata.STUDIO";
  public static final String KEY_SUBTITLE = "com.google.android.gms.cast.metadata.SUBTITLE";
  public static final String KEY_TITLE = "com.google.android.gms.cast.metadata.TITLE";
  public static final String KEY_TRACK_NUMBER = "com.google.android.gms.cast.metadata.TRACK_NUMBER";
  public static final String KEY_WIDTH = "com.google.android.gms.cast.metadata.WIDTH";
  public static final int MEDIA_TYPE_GENERIC = 0;
  public static final int MEDIA_TYPE_MOVIE = 1;
  public static final int MEDIA_TYPE_MUSIC_TRACK = 3;
  public static final int MEDIA_TYPE_PHOTO = 4;
  public static final int MEDIA_TYPE_TV_SHOW = 2;
  public static final int MEDIA_TYPE_USER = 100;
  private static final String[] zzaaW;
  private static final MediaMetadata.zza zzaaX;
  private final Bundle zzaaY;
  private int zzaaZ;
  private final List zzxX;
  
  static
  {
    int i = 3;
    int j = 4;
    int k = 2;
    int m = 1;
    Object localObject = new String[5];
    localObject[0] = null;
    localObject[m] = "String";
    localObject[k] = "int";
    localObject[i] = "double";
    localObject[j] = "ISO-8601 date String";
    zzaaW = (String[])localObject;
    localObject = new com/google/android/gms/cast/MediaMetadata$zza;
    ((MediaMetadata.zza)localObject).<init>();
    zzaaX = ((MediaMetadata.zza)localObject).zzc("com.google.android.gms.cast.metadata.CREATION_DATE", "creationDateTime", j).zzc("com.google.android.gms.cast.metadata.RELEASE_DATE", "releaseDate", j).zzc("com.google.android.gms.cast.metadata.BROADCAST_DATE", "originalAirdate", j).zzc("com.google.android.gms.cast.metadata.TITLE", "title", m).zzc("com.google.android.gms.cast.metadata.SUBTITLE", "subtitle", m).zzc("com.google.android.gms.cast.metadata.ARTIST", "artist", m).zzc("com.google.android.gms.cast.metadata.ALBUM_ARTIST", "albumArtist", m).zzc("com.google.android.gms.cast.metadata.ALBUM_TITLE", "albumName", m).zzc("com.google.android.gms.cast.metadata.COMPOSER", "composer", m).zzc("com.google.android.gms.cast.metadata.DISC_NUMBER", "discNumber", k).zzc("com.google.android.gms.cast.metadata.TRACK_NUMBER", "trackNumber", k).zzc("com.google.android.gms.cast.metadata.SEASON_NUMBER", "season", k).zzc("com.google.android.gms.cast.metadata.EPISODE_NUMBER", "episode", k).zzc("com.google.android.gms.cast.metadata.SERIES_TITLE", "seriesTitle", m).zzc("com.google.android.gms.cast.metadata.STUDIO", "studio", m).zzc("com.google.android.gms.cast.metadata.WIDTH", "width", k).zzc("com.google.android.gms.cast.metadata.HEIGHT", "height", k).zzc("com.google.android.gms.cast.metadata.LOCATION_NAME", "location", m).zzc("com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "latitude", i).zzc("com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "longitude", i);
  }
  
  public MediaMetadata()
  {
    this(0);
  }
  
  public MediaMetadata(int paramInt)
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.zzxX = ((List)localObject);
    localObject = new android/os/Bundle;
    ((Bundle)localObject).<init>();
    this.zzaaY = ((Bundle)localObject);
    this.zzaaZ = paramInt;
  }
  
  private void zza(JSONObject paramJSONObject, String... paramVarArgs)
  {
    Object localObject3;
    for (;;)
    {
      try
      {
        int i = paramVarArgs.length;
        int j = 0;
        Object localObject1 = null;
        if (j >= i) {
          break;
        }
        localObject3 = paramVarArgs[j];
        localObject4 = this.zzaaY;
        boolean bool2 = ((Bundle)localObject4).containsKey((String)localObject3);
        if (!bool2)
        {
          j += 1;
          continue;
        }
        localObject4 = zzaaX;
        int k = ((MediaMetadata.zza)localObject4).zzcc((String)localObject3);
        switch (k)
        {
        default: 
          break;
        case 1: 
        case 4: 
          localObject4 = zzaaX;
          localObject4 = ((MediaMetadata.zza)localObject4).zzca((String)localObject3);
          localBundle = this.zzaaY;
          localObject3 = localBundle.getString((String)localObject3);
          paramJSONObject.put((String)localObject4, localObject3);
          continue;
          return;
        }
      }
      catch (JSONException localJSONException) {}
      Object localObject4 = zzaaX;
      localObject4 = ((MediaMetadata.zza)localObject4).zzca((String)localObject3);
      Bundle localBundle = this.zzaaY;
      int m = localBundle.getInt((String)localObject3);
      paramJSONObject.put((String)localObject4, m);
      continue;
      localObject4 = zzaaX;
      localObject4 = ((MediaMetadata.zza)localObject4).zzca((String)localObject3);
      localBundle = this.zzaaY;
      double d = localBundle.getDouble((String)localObject3);
      paramJSONObject.put((String)localObject4, d);
    }
    Object localObject2 = this.zzaaY;
    localObject2 = ((Bundle)localObject2).keySet();
    Iterator localIterator = ((Set)localObject2).iterator();
    for (;;)
    {
      boolean bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject2 = localIterator.next();
      localObject2 = (String)localObject2;
      localObject3 = "com.google.";
      boolean bool4 = ((String)localObject2).startsWith((String)localObject3);
      if (!bool4)
      {
        localObject3 = this.zzaaY;
        localObject3 = ((Bundle)localObject3).get((String)localObject2);
        boolean bool3 = localObject3 instanceof String;
        if (bool3)
        {
          paramJSONObject.put((String)localObject2, localObject3);
        }
        else
        {
          bool3 = localObject3 instanceof Integer;
          if (bool3)
          {
            paramJSONObject.put((String)localObject2, localObject3);
          }
          else
          {
            bool3 = localObject3 instanceof Double;
            if (bool3) {
              paramJSONObject.put((String)localObject2, localObject3);
            }
          }
        }
      }
    }
  }
  
  private void zzb(JSONObject paramJSONObject, String... paramVarArgs)
  {
    HashSet localHashSet = new java/util/HashSet;
    Object localObject1 = Arrays.asList(paramVarArgs);
    localHashSet.<init>((Collection)localObject1);
    for (;;)
    {
      Object localObject3;
      Object localObject4;
      double d;
      try
      {
        Iterator localIterator = paramJSONObject.keys();
        boolean bool1 = localIterator.hasNext();
        if (bool1)
        {
          localObject1 = localIterator.next();
          localObject1 = (String)localObject1;
          localObject3 = "metadataType";
          boolean bool2 = ((String)localObject3).equals(localObject1);
          if (bool2) {
            continue;
          }
          localObject3 = zzaaX;
          localObject4 = ((MediaMetadata.zza)localObject3).zzcb((String)localObject1);
          Object localObject2;
          if (localObject4 != null)
          {
            bool2 = localHashSet.contains(localObject4);
            if (!bool2) {
              continue;
            }
            try
            {
              localObject1 = paramJSONObject.get((String)localObject1);
              if (localObject1 == null) {
                continue;
              }
              localObject3 = zzaaX;
              int j = ((MediaMetadata.zza)localObject3).zzcc((String)localObject4);
              switch (j)
              {
              }
            }
            catch (JSONException localJSONException1) {}
            boolean bool3 = localObject1 instanceof String;
            if (!bool3) {
              continue;
            }
            localObject3 = this.zzaaY;
            localObject1 = (String)localObject1;
            ((Bundle)localObject3).putString((String)localObject4, (String)localObject1);
            continue;
            continue;
            bool3 = localJSONException1 instanceof String;
            if (!bool3) {
              continue;
            }
            Object localObject5 = localJSONException1;
            localObject5 = (String)localJSONException1;
            localObject3 = localObject5;
            localObject3 = zzlp.zzco((String)localObject5);
            if (localObject3 == null) {
              continue;
            }
            localObject3 = this.zzaaY;
            localObject2 = (String)localJSONException1;
            ((Bundle)localObject3).putString((String)localObject4, (String)localObject2);
            continue;
            bool3 = localObject2 instanceof Integer;
            if (!bool3) {
              continue;
            }
            localObject3 = this.zzaaY;
            localObject2 = (Integer)localObject2;
            int i = ((Integer)localObject2).intValue();
            ((Bundle)localObject3).putInt((String)localObject4, i);
            continue;
            bool3 = localObject2 instanceof Double;
            if (!bool3) {
              continue;
            }
            localObject3 = this.zzaaY;
            localObject2 = (Double)localObject2;
            d = ((Double)localObject2).doubleValue();
            ((Bundle)localObject3).putDouble((String)localObject4, d);
            continue;
          }
          localObject3 = paramJSONObject.get((String)localObject2);
          bool4 = localObject3 instanceof String;
          if (bool4)
          {
            localObject4 = this.zzaaY;
            localObject3 = (String)localObject3;
            ((Bundle)localObject4).putString((String)localObject2, (String)localObject3);
          }
        }
        else
        {
          return;
        }
      }
      catch (JSONException localJSONException2) {}
      boolean bool4 = localObject3 instanceof Integer;
      if (bool4)
      {
        localObject4 = this.zzaaY;
        localObject3 = (Integer)localObject3;
        int k = ((Integer)localObject3).intValue();
        ((Bundle)localObject4).putInt(localJSONException2, k);
      }
      else
      {
        bool4 = localObject3 instanceof Double;
        if (bool4)
        {
          localObject4 = this.zzaaY;
          localObject3 = (Double)localObject3;
          d = ((Double)localObject3).doubleValue();
          ((Bundle)localObject4).putDouble(localJSONException2, d);
        }
      }
    }
  }
  
  private boolean zzb(Bundle paramBundle1, Bundle paramBundle2)
  {
    int i = paramBundle1.size();
    int j = paramBundle2.size();
    Object localObject1;
    if (i != j)
    {
      i = 0;
      localObject1 = null;
    }
    for (;;)
    {
      return i;
      localObject1 = paramBundle1.keySet();
      Iterator localIterator = ((Set)localObject1).iterator();
      label169:
      label177:
      do
      {
        Object localObject2;
        Object localObject3;
        do
        {
          bool1 = localIterator.hasNext();
          if (!bool1) {
            break label197;
          }
          localObject1 = (String)localIterator.next();
          localObject2 = paramBundle1.get((String)localObject1);
          localObject3 = paramBundle2.get((String)localObject1);
          boolean bool2 = localObject2 instanceof Bundle;
          if (bool2)
          {
            bool2 = localObject3 instanceof Bundle;
            if (bool2)
            {
              Object localObject4 = localObject2;
              localObject4 = (Bundle)localObject2;
              Object localObject5 = localObject3;
              localObject5 = (Bundle)localObject3;
              bool2 = zzb((Bundle)localObject4, (Bundle)localObject5);
              if (!bool2)
              {
                bool1 = false;
                localObject1 = null;
                break;
              }
            }
          }
          if (localObject2 != null) {
            break label177;
          }
          if (localObject3 != null) {
            break label169;
          }
          bool1 = paramBundle2.containsKey((String)localObject1);
        } while (bool1);
        bool1 = false;
        localObject1 = null;
        break;
        bool1 = localObject2.equals(localObject3);
      } while (bool1);
      boolean bool1 = false;
      localObject1 = null;
      continue;
      label197:
      bool1 = true;
    }
  }
  
  private void zzf(String paramString, int paramInt)
  {
    boolean bool = TextUtils.isEmpty(paramString);
    if (bool)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("null and empty keys are not allowed");
      throw ((Throwable)localObject1);
    }
    Object localObject1 = zzaaX;
    int i = ((MediaMetadata.zza)localObject1).zzcc(paramString);
    if ((i != paramInt) && (i != 0))
    {
      localObject1 = new java/lang/IllegalArgumentException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Value for ").append(paramString).append(" must be a ");
      String str = zzaaW[paramInt];
      localObject2 = str;
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
  }
  
  public void addImage(WebImage paramWebImage)
  {
    this.zzxX.add(paramWebImage);
  }
  
  public void clear()
  {
    this.zzaaY.clear();
    this.zzxX.clear();
  }
  
  public void clearImages()
  {
    this.zzxX.clear();
  }
  
  public boolean containsKey(String paramString)
  {
    return this.zzaaY.containsKey(paramString);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof MediaMetadata;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (MediaMetadata)paramObject;
        Object localObject1 = this.zzaaY;
        Object localObject2 = ((MediaMetadata)paramObject).zzaaY;
        bool2 = zzb((Bundle)localObject1, (Bundle)localObject2);
        if (bool2)
        {
          localObject1 = this.zzxX;
          localObject2 = ((MediaMetadata)paramObject).zzxX;
          bool2 = ((List)localObject1).equals(localObject2);
          if (bool2) {}
        }
        else
        {
          bool1 = false;
        }
      }
    }
  }
  
  public Calendar getDate(String paramString)
  {
    int i = 4;
    zzf(paramString, i);
    Object localObject = this.zzaaY.getString(paramString);
    if (localObject != null) {}
    for (localObject = zzlp.zzco((String)localObject);; localObject = null)
    {
      return (Calendar)localObject;
      i = 0;
    }
  }
  
  public String getDateAsString(String paramString)
  {
    zzf(paramString, 4);
    return this.zzaaY.getString(paramString);
  }
  
  public double getDouble(String paramString)
  {
    zzf(paramString, 3);
    return this.zzaaY.getDouble(paramString);
  }
  
  public List getImages()
  {
    return this.zzxX;
  }
  
  public int getInt(String paramString)
  {
    zzf(paramString, 2);
    return this.zzaaY.getInt(paramString);
  }
  
  public int getMediaType()
  {
    return this.zzaaZ;
  }
  
  public String getString(String paramString)
  {
    zzf(paramString, 1);
    return this.zzaaY.getString(paramString);
  }
  
  public boolean hasImages()
  {
    List localList = this.zzxX;
    boolean bool;
    if (localList != null)
    {
      localList = this.zzxX;
      bool = localList.isEmpty();
      if (!bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localList = null;
    }
  }
  
  public int hashCode()
  {
    int i = 17;
    Set localSet = this.zzaaY.keySet();
    Iterator localIterator = localSet.iterator();
    for (int k = i;; k = j)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      Object localObject = (String)localIterator.next();
      k *= 31;
      Bundle localBundle = this.zzaaY;
      localObject = localBundle.get((String)localObject);
      j = localObject.hashCode() + k;
    }
    int j = k * 31;
    k = this.zzxX.hashCode();
    return j + k;
  }
  
  public Set keySet()
  {
    return this.zzaaY.keySet();
  }
  
  public void putDate(String paramString, Calendar paramCalendar)
  {
    zzf(paramString, 4);
    Bundle localBundle = this.zzaaY;
    String str = zzlp.zza(paramCalendar);
    localBundle.putString(paramString, str);
  }
  
  public void putDouble(String paramString, double paramDouble)
  {
    zzf(paramString, 3);
    this.zzaaY.putDouble(paramString, paramDouble);
  }
  
  public void putInt(String paramString, int paramInt)
  {
    zzf(paramString, 2);
    this.zzaaY.putInt(paramString, paramInt);
  }
  
  public void putString(String paramString1, String paramString2)
  {
    zzf(paramString1, 1);
    this.zzaaY.putString(paramString1, paramString2);
  }
  
  public JSONObject toJson()
  {
    int i = 4;
    int j = 3;
    int k = 2;
    int m = 1;
    String str1 = null;
    JSONObject localJSONObject = new org/json/JSONObject;
    localJSONObject.<init>();
    Object localObject = "metadataType";
    try
    {
      n = this.zzaaZ;
      localJSONObject.put((String)localObject, n);
    }
    catch (JSONException localJSONException)
    {
      int n;
      int i1;
      for (;;) {}
    }
    localObject = this.zzxX;
    zzlp.zza(localJSONObject, (List)localObject);
    i1 = this.zzaaZ;
    switch (i1)
    {
    default: 
      localObject = new String[0];
      zza(localJSONObject, (String[])localObject);
    }
    for (;;)
    {
      return localJSONObject;
      localObject = new String[i];
      localObject[0] = "com.google.android.gms.cast.metadata.TITLE";
      localObject[m] = "com.google.android.gms.cast.metadata.ARTIST";
      localObject[k] = "com.google.android.gms.cast.metadata.SUBTITLE";
      String str2 = "com.google.android.gms.cast.metadata.RELEASE_DATE";
      localObject[j] = str2;
      zza(localJSONObject, (String[])localObject);
      continue;
      localObject = new String[i];
      localObject[0] = "com.google.android.gms.cast.metadata.TITLE";
      localObject[m] = "com.google.android.gms.cast.metadata.STUDIO";
      localObject[k] = "com.google.android.gms.cast.metadata.SUBTITLE";
      str2 = "com.google.android.gms.cast.metadata.RELEASE_DATE";
      localObject[j] = str2;
      zza(localJSONObject, (String[])localObject);
      continue;
      i1 = 5;
      localObject = new String[i1];
      localObject[0] = "com.google.android.gms.cast.metadata.TITLE";
      localObject[m] = "com.google.android.gms.cast.metadata.SERIES_TITLE";
      localObject[k] = "com.google.android.gms.cast.metadata.SEASON_NUMBER";
      localObject[j] = "com.google.android.gms.cast.metadata.EPISODE_NUMBER";
      str2 = "com.google.android.gms.cast.metadata.BROADCAST_DATE";
      localObject[i] = str2;
      zza(localJSONObject, (String[])localObject);
      continue;
      i1 = 8;
      localObject = new String[i1];
      localObject[0] = "com.google.android.gms.cast.metadata.TITLE";
      localObject[m] = "com.google.android.gms.cast.metadata.ARTIST";
      localObject[k] = "com.google.android.gms.cast.metadata.ALBUM_TITLE";
      localObject[j] = "com.google.android.gms.cast.metadata.ALBUM_ARTIST";
      str2 = "com.google.android.gms.cast.metadata.COMPOSER";
      localObject[i] = str2;
      localObject[5] = "com.google.android.gms.cast.metadata.TRACK_NUMBER";
      localObject[6] = "com.google.android.gms.cast.metadata.DISC_NUMBER";
      n = 7;
      str1 = "com.google.android.gms.cast.metadata.RELEASE_DATE";
      localObject[n] = str1;
      zza(localJSONObject, (String[])localObject);
      continue;
      i1 = 8;
      localObject = new String[i1];
      localObject[0] = "com.google.android.gms.cast.metadata.TITLE";
      localObject[m] = "com.google.android.gms.cast.metadata.ARTIST";
      localObject[k] = "com.google.android.gms.cast.metadata.LOCATION_NAME";
      localObject[j] = "com.google.android.gms.cast.metadata.LOCATION_LATITUDE";
      str2 = "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE";
      localObject[i] = str2;
      localObject[5] = "com.google.android.gms.cast.metadata.WIDTH";
      localObject[6] = "com.google.android.gms.cast.metadata.HEIGHT";
      n = 7;
      str1 = "com.google.android.gms.cast.metadata.CREATION_DATE";
      localObject[n] = str1;
      zza(localJSONObject, (String[])localObject);
    }
  }
  
  public void zzg(JSONObject paramJSONObject)
  {
    int i = 4;
    int j = 3;
    int k = 2;
    int m = 1;
    String str1 = null;
    clear();
    this.zzaaZ = 0;
    Object localObject = "metadataType";
    try
    {
      n = paramJSONObject.getInt((String)localObject);
      this.zzaaZ = n;
    }
    catch (JSONException localJSONException)
    {
      int n;
      for (;;) {}
    }
    localObject = this.zzxX;
    zzlp.zza((List)localObject, paramJSONObject);
    n = this.zzaaZ;
    switch (n)
    {
    default: 
      localObject = new String[0];
      zzb(paramJSONObject, (String[])localObject);
    }
    for (;;)
    {
      return;
      localObject = new String[i];
      localObject[0] = "com.google.android.gms.cast.metadata.TITLE";
      localObject[m] = "com.google.android.gms.cast.metadata.ARTIST";
      localObject[k] = "com.google.android.gms.cast.metadata.SUBTITLE";
      String str2 = "com.google.android.gms.cast.metadata.RELEASE_DATE";
      localObject[j] = str2;
      zzb(paramJSONObject, (String[])localObject);
      continue;
      localObject = new String[i];
      localObject[0] = "com.google.android.gms.cast.metadata.TITLE";
      localObject[m] = "com.google.android.gms.cast.metadata.STUDIO";
      localObject[k] = "com.google.android.gms.cast.metadata.SUBTITLE";
      str2 = "com.google.android.gms.cast.metadata.RELEASE_DATE";
      localObject[j] = str2;
      zzb(paramJSONObject, (String[])localObject);
      continue;
      n = 5;
      localObject = new String[n];
      localObject[0] = "com.google.android.gms.cast.metadata.TITLE";
      localObject[m] = "com.google.android.gms.cast.metadata.SERIES_TITLE";
      localObject[k] = "com.google.android.gms.cast.metadata.SEASON_NUMBER";
      localObject[j] = "com.google.android.gms.cast.metadata.EPISODE_NUMBER";
      str2 = "com.google.android.gms.cast.metadata.BROADCAST_DATE";
      localObject[i] = str2;
      zzb(paramJSONObject, (String[])localObject);
      continue;
      n = 8;
      localObject = new String[n];
      localObject[0] = "com.google.android.gms.cast.metadata.TITLE";
      localObject[m] = "com.google.android.gms.cast.metadata.ALBUM_TITLE";
      localObject[k] = "com.google.android.gms.cast.metadata.ARTIST";
      localObject[j] = "com.google.android.gms.cast.metadata.ALBUM_ARTIST";
      str2 = "com.google.android.gms.cast.metadata.COMPOSER";
      localObject[i] = str2;
      localObject[5] = "com.google.android.gms.cast.metadata.TRACK_NUMBER";
      localObject[6] = "com.google.android.gms.cast.metadata.DISC_NUMBER";
      int i1 = 7;
      str1 = "com.google.android.gms.cast.metadata.RELEASE_DATE";
      localObject[i1] = str1;
      zzb(paramJSONObject, (String[])localObject);
      continue;
      n = 8;
      localObject = new String[n];
      localObject[0] = "com.google.android.gms.cast.metadata.TITLE";
      localObject[m] = "com.google.android.gms.cast.metadata.ARTIST";
      localObject[k] = "com.google.android.gms.cast.metadata.LOCATION_NAME";
      localObject[j] = "com.google.android.gms.cast.metadata.LOCATION_LATITUDE";
      str2 = "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE";
      localObject[i] = str2;
      localObject[5] = "com.google.android.gms.cast.metadata.WIDTH";
      localObject[6] = "com.google.android.gms.cast.metadata.HEIGHT";
      i1 = 7;
      str1 = "com.google.android.gms.cast.metadata.CREATION_DATE";
      localObject[i1] = str1;
      zzb(paramJSONObject, (String[])localObject);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\MediaMetadata.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */