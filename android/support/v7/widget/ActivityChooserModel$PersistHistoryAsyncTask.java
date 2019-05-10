package android.support.v7.widget;

import android.content.ComponentName;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.util.Xml;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import org.xmlpull.v1.XmlSerializer;

final class ActivityChooserModel$PersistHistoryAsyncTask
  extends AsyncTask
{
  ActivityChooserModel$PersistHistoryAsyncTask(ActivityChooserModel paramActivityChooserModel) {}
  
  public Void doInBackground(Object... paramVarArgs)
  {
    int i = 0;
    Object localObject1 = null;
    boolean bool1 = true;
    List localList = (List)paramVarArgs[0];
    Object localObject3 = (String)paramVarArgs[bool1];
    Object localObject4;
    for (;;)
    {
      try
      {
        localObject4 = this.this$0;
        localObject4 = ((ActivityChooserModel)localObject4).mContext;
        localObject5 = null;
        localObject4 = ((Context)localObject4).openFileOutput((String)localObject3, 0);
        localObject5 = Xml.newSerializer();
        int j = 0;
        float f = 0.0F;
        localObject3 = null;
        boolean bool2;
        Object localObject6;
        int k;
        String str1;
        String str2;
        Object localObject7;
        long l;
        localActivityChooserModel1 = null;
      }
      catch (FileNotFoundException localFileNotFoundException)
      {
        try
        {
          ((XmlSerializer)localObject5).setOutput((OutputStream)localObject4, null);
          localObject3 = "UTF-8";
          bool2 = true;
          localObject6 = Boolean.valueOf(bool2);
          ((XmlSerializer)localObject5).startDocument((String)localObject3, (Boolean)localObject6);
          j = 0;
          f = 0.0F;
          localObject3 = null;
          localObject6 = "historical-records";
          ((XmlSerializer)localObject5).startTag(null, (String)localObject6);
          k = localList.size();
          if (i >= k) {
            break label371;
          }
          j = 0;
          f = 0.0F;
          localObject3 = null;
          localObject3 = localList.remove(0);
          localObject3 = (ActivityChooserModel.HistoricalRecord)localObject3;
          str1 = null;
          str2 = "historical-record";
          ((XmlSerializer)localObject5).startTag(null, str2);
          str1 = null;
          str2 = "activity";
          localObject7 = ((ActivityChooserModel.HistoricalRecord)localObject3).activity;
          localObject7 = ((ComponentName)localObject7).flattenToString();
          ((XmlSerializer)localObject5).attribute(null, str2, (String)localObject7);
          str1 = null;
          str2 = "time";
          l = ((ActivityChooserModel.HistoricalRecord)localObject3).time;
          localObject7 = String.valueOf(l);
          ((XmlSerializer)localObject5).attribute(null, str2, (String)localObject7);
          str1 = null;
          str2 = "weight";
          f = ((ActivityChooserModel.HistoricalRecord)localObject3).weight;
          localObject3 = String.valueOf(f);
          ((XmlSerializer)localObject5).attribute(null, str2, (String)localObject3);
          j = 0;
          f = 0.0F;
          localObject3 = null;
          str1 = "historical-record";
          ((XmlSerializer)localObject5).endTag(null, str1);
          j = i + 1;
          i = j;
          continue;
          localFileNotFoundException = localFileNotFoundException;
          localObject1 = ActivityChooserModel.LOG_TAG;
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          localObject5 = "Error writing historical record file: ";
          localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
          localObject3 = (String)localObject3;
          Log.e((String)localObject1, (String)localObject3, localFileNotFoundException);
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          ActivityChooserModel localActivityChooserModel1;
          localObject3 = ActivityChooserModel.LOG_TAG;
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject5 = "Error writing historical record file: ";
          localObject1 = ((StringBuilder)localObject1).append((String)localObject5);
          localObject5 = this.this$0;
          localObject5 = ((ActivityChooserModel)localObject5).mHistoryFileName;
          localObject1 = ((StringBuilder)localObject1).append((String)localObject5);
          localObject1 = ((StringBuilder)localObject1).toString();
          Log.e((String)localObject3, (String)localObject1, localIllegalArgumentException);
          ActivityChooserModel localActivityChooserModel2 = this.this$0;
          localActivityChooserModel2.mCanReadHistoricalData = bool1;
          if (localObject4 == null) {
            continue;
          }
          try
          {
            ((FileOutputStream)localObject4).close();
          }
          catch (IOException localIOException2) {}
          continue;
        }
        catch (IllegalStateException localIllegalStateException)
        {
          localObject3 = ActivityChooserModel.LOG_TAG;
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject5 = "Error writing historical record file: ";
          localObject1 = ((StringBuilder)localObject1).append((String)localObject5);
          localObject5 = this.this$0;
          localObject5 = ((ActivityChooserModel)localObject5).mHistoryFileName;
          localObject1 = ((StringBuilder)localObject1).append((String)localObject5);
          localObject1 = ((StringBuilder)localObject1).toString();
          Log.e((String)localObject3, (String)localObject1, localIllegalStateException);
          ActivityChooserModel localActivityChooserModel3 = this.this$0;
          localActivityChooserModel3.mCanReadHistoricalData = bool1;
          if (localObject4 == null) {
            continue;
          }
          try
          {
            ((FileOutputStream)localObject4).close();
          }
          catch (IOException localIOException3) {}
          continue;
        }
        catch (IOException localIOException4)
        {
          localObject3 = ActivityChooserModel.LOG_TAG;
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          Object localObject5 = "Error writing historical record file: ";
          localObject1 = ((StringBuilder)localObject1).append((String)localObject5);
          localObject5 = this.this$0;
          localObject5 = ((ActivityChooserModel)localObject5).mHistoryFileName;
          localObject1 = ((StringBuilder)localObject1).append((String)localObject5);
          localObject1 = ((StringBuilder)localObject1).toString();
          Log.e((String)localObject3, (String)localObject1, localIOException4);
          ActivityChooserModel localActivityChooserModel4 = this.this$0;
          localActivityChooserModel4.mCanReadHistoricalData = bool1;
          if (localObject4 == null) {
            continue;
          }
          try
          {
            ((FileOutputStream)localObject4).close();
          }
          catch (IOException localIOException5) {}
          continue;
        }
        finally
        {
          localObject3 = this.this$0;
          ((ActivityChooserModel)localObject3).mCanReadHistoricalData = bool1;
          if (localObject4 == null) {
            break;
          }
        }
        return null;
      }
      label371:
      localObject3 = "historical-records";
      ((XmlSerializer)localObject5).endTag(null, (String)localObject3);
      ((XmlSerializer)localObject5).endDocument();
      localActivityChooserModel1 = this.this$0;
      localActivityChooserModel1.mCanReadHistoricalData = bool1;
      if (localObject4 != null) {
        try
        {
          ((FileOutputStream)localObject4).close();
        }
        catch (IOException localIOException1) {}
      }
    }
    try
    {
      ((FileOutputStream)localObject4).close();
      throw ((Throwable)localObject2);
    }
    catch (IOException localIOException6)
    {
      for (;;) {}
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\ActivityChooserModel$PersistHistoryAsyncTask.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */