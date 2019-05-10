package com.google.android.gms.games.appcontent;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzf;
import java.util.ArrayList;

public final class AppContentSectionBuffer
  extends zzf
{
  private final ArrayList zzaDN;
  
  public void release()
  {
    super.release();
    int i = 1;
    ArrayList localArrayList = this.zzaDN;
    int j = localArrayList.size();
    for (int k = i; k < j; k = i)
    {
      DataHolder localDataHolder = (DataHolder)this.zzaDN.get(k);
      if (localDataHolder != null) {
        localDataHolder.close();
      }
      i = k + 1;
    }
  }
  
  protected AppContentSection zzo(int paramInt1, int paramInt2)
  {
    AppContentSectionRef localAppContentSectionRef = new com/google/android/gms/games/appcontent/AppContentSectionRef;
    ArrayList localArrayList = this.zzaDN;
    localAppContentSectionRef.<init>(localArrayList, paramInt1, paramInt2);
    return localAppContentSectionRef;
  }
  
  protected String zzqg()
  {
    return "section_id";
  }
  
  protected String zzqi()
  {
    return "card_id";
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\appcontent\AppContentSectionBuffer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */