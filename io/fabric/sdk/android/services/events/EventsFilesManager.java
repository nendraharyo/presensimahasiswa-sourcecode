package io.fabric.sdk.android.services.events;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.CurrentTimeProvider;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class EventsFilesManager
{
  public static final int MAX_BYTE_SIZE_PER_FILE = 8000;
  public static final int MAX_FILES_IN_BATCH = 1;
  public static final int MAX_FILES_TO_KEEP = 100;
  public static final String ROLL_OVER_FILE_NAME_SEPARATOR = "_";
  protected final Context context;
  protected final CurrentTimeProvider currentTimeProvider;
  private final int defaultMaxFilesToKeep;
  protected final EventsStorage eventStorage;
  protected volatile long lastRollOverTime;
  protected final List rollOverListeners;
  protected final EventTransform transform;
  
  public EventsFilesManager(Context paramContext, EventTransform paramEventTransform, CurrentTimeProvider paramCurrentTimeProvider, EventsStorage paramEventsStorage, int paramInt)
  {
    Object localObject = new java/util/concurrent/CopyOnWriteArrayList;
    ((CopyOnWriteArrayList)localObject).<init>();
    this.rollOverListeners = ((List)localObject);
    localObject = paramContext.getApplicationContext();
    this.context = ((Context)localObject);
    this.transform = paramEventTransform;
    this.eventStorage = paramEventsStorage;
    this.currentTimeProvider = paramCurrentTimeProvider;
    long l = this.currentTimeProvider.getCurrentTimeMillis();
    this.lastRollOverTime = l;
    this.defaultMaxFilesToKeep = paramInt;
  }
  
  private void rollFileOverIfNeeded(int paramInt)
  {
    Object localObject = this.eventStorage;
    int i = getMaxByteSizePerFile();
    boolean bool = ((EventsStorage)localObject).canWorkingFileStore(paramInt, i);
    if (!bool)
    {
      localObject = Locale.US;
      Object[] arrayOfObject = new Object[3];
      Integer localInteger = Integer.valueOf(this.eventStorage.getWorkingFileUsedSizeInBytes());
      arrayOfObject[0] = localInteger;
      localInteger = Integer.valueOf(paramInt);
      arrayOfObject[1] = localInteger;
      int j = 2;
      int k = getMaxByteSizePerFile();
      localInteger = Integer.valueOf(k);
      arrayOfObject[j] = localInteger;
      localObject = String.format((Locale)localObject, "session analytics events file is %d bytes, new event is %d bytes, this is over flush limit of %d, rolling it over", arrayOfObject);
      Context localContext = this.context;
      int m = 4;
      String str = "Fabric";
      CommonUtils.logControlled(localContext, m, str, (String)localObject);
      rollFileOver();
    }
  }
  
  private void triggerRollOverOnListeners(String paramString)
  {
    Object localObject = this.rollOverListeners;
    Iterator localIterator = ((List)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (EventsStorageListener)localIterator.next();
      try
      {
        ((EventsStorageListener)localObject).onRollOver(paramString);
      }
      catch (Exception localException)
      {
        Context localContext = this.context;
        String str = "One of the roll over listeners threw an exception";
        CommonUtils.logControlledError(localContext, str, localException);
      }
    }
  }
  
  public void deleteAllEventsFiles()
  {
    EventsStorage localEventsStorage = this.eventStorage;
    List localList = this.eventStorage.getAllFilesInRollOverDirectory();
    localEventsStorage.deleteFilesInRollOverDirectory(localList);
    this.eventStorage.deleteWorkingFile();
  }
  
  public void deleteOldestInRollOverIfOverMax()
  {
    Object localObject1 = this.eventStorage.getAllFilesInRollOverDirectory();
    int i = getMaxFilesToKeep();
    int j = ((List)localObject1).size();
    if (j <= i) {}
    for (;;)
    {
      return;
      j = ((List)localObject1).size() - i;
      Object localObject2 = this.context;
      Object localObject3 = Locale.US;
      String str = "Found %d files in  roll over directory, this is greater than %d, deleting %d oldest files";
      int k = 3;
      Object localObject4 = new Object[k];
      int m = ((List)localObject1).size();
      Integer localInteger1 = Integer.valueOf(m);
      localObject4[0] = localInteger1;
      int n = 1;
      Object localObject5 = Integer.valueOf(i);
      localObject4[n] = localObject5;
      i = 2;
      Integer localInteger2 = Integer.valueOf(j);
      localObject4[i] = localInteger2;
      localObject5 = String.format((Locale)localObject3, str, (Object[])localObject4);
      CommonUtils.logControlled((Context)localObject2, (String)localObject5);
      localObject5 = new java/util/TreeSet;
      localObject2 = new io/fabric/sdk/android/services/events/EventsFilesManager$1;
      ((EventsFilesManager.1)localObject2).<init>(this);
      ((TreeSet)localObject5).<init>((Comparator)localObject2);
      localObject2 = ((List)localObject1).iterator();
      boolean bool;
      for (;;)
      {
        bool = ((Iterator)localObject2).hasNext();
        if (!bool) {
          break;
        }
        localObject1 = (File)((Iterator)localObject2).next();
        localObject3 = ((File)localObject1).getName();
        long l = parseCreationTimestampFromFileName((String)localObject3);
        localObject4 = new io/fabric/sdk/android/services/events/EventsFilesManager$FileWithTimestamp;
        ((EventsFilesManager.FileWithTimestamp)localObject4).<init>((File)localObject1, l);
        ((TreeSet)localObject5).add(localObject4);
      }
      localObject2 = new java/util/ArrayList;
      ((ArrayList)localObject2).<init>();
      localObject5 = ((TreeSet)localObject5).iterator();
      int i1;
      do
      {
        bool = ((Iterator)localObject5).hasNext();
        if (!bool) {
          break;
        }
        localObject1 = ((EventsFilesManager.FileWithTimestamp)((Iterator)localObject5).next()).file;
        ((ArrayList)localObject2).add(localObject1);
        i1 = ((ArrayList)localObject2).size();
      } while (i1 != j);
      localObject1 = this.eventStorage;
      ((EventsStorage)localObject1).deleteFilesInRollOverDirectory((List)localObject2);
    }
  }
  
  public void deleteSentFiles(List paramList)
  {
    this.eventStorage.deleteFilesInRollOverDirectory(paramList);
  }
  
  protected abstract String generateUniqueRollOverFileName();
  
  public List getBatchOfFilesToSend()
  {
    return this.eventStorage.getBatchOfFilesToSend(1);
  }
  
  public long getLastRollOverTime()
  {
    return this.lastRollOverTime;
  }
  
  protected int getMaxByteSizePerFile()
  {
    return 8000;
  }
  
  protected int getMaxFilesToKeep()
  {
    return this.defaultMaxFilesToKeep;
  }
  
  public long parseCreationTimestampFromFileName(String paramString)
  {
    long l = 0L;
    Object localObject = paramString.split("_");
    int i = localObject.length;
    int j = 3;
    if (i != j) {}
    for (;;)
    {
      return l;
      i = 2;
      try
      {
        localObject = localObject[i];
        localObject = Long.valueOf((String)localObject);
        l = ((Long)localObject).longValue();
      }
      catch (NumberFormatException localNumberFormatException) {}
    }
  }
  
  public void registerRollOverListener(EventsStorageListener paramEventsStorageListener)
  {
    if (paramEventsStorageListener != null)
    {
      List localList = this.rollOverListeners;
      localList.add(paramEventsStorageListener);
    }
  }
  
  public boolean rollFileOver()
  {
    boolean bool1 = true;
    Object localObject1 = null;
    String str1 = null;
    Object localObject2 = this.eventStorage;
    boolean bool2 = ((EventsStorage)localObject2).isWorkingFileEmpty();
    if (!bool2)
    {
      str1 = generateUniqueRollOverFileName();
      this.eventStorage.rollOver(str1);
      localObject2 = this.context;
      int i = 4;
      String str2 = "Fabric";
      Locale localLocale = Locale.US;
      String str3 = "generated new file %s";
      Object[] arrayOfObject = new Object[bool1];
      arrayOfObject[0] = str1;
      localObject1 = String.format(localLocale, str3, arrayOfObject);
      CommonUtils.logControlled((Context)localObject2, i, str2, (String)localObject1);
      localObject1 = this.currentTimeProvider;
      long l = ((CurrentTimeProvider)localObject1).getCurrentTimeMillis();
      this.lastRollOverTime = l;
    }
    for (;;)
    {
      triggerRollOverOnListeners(str1);
      return bool1;
      bool1 = false;
    }
  }
  
  public void writeEvent(Object paramObject)
  {
    byte[] arrayOfByte = this.transform.toBytes(paramObject);
    int i = arrayOfByte.length;
    rollFileOverIfNeeded(i);
    this.eventStorage.add(arrayOfByte);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\events\EventsFilesManager.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */