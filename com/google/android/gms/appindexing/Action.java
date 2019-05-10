package com.google.android.gms.appindexing;

import android.net.Uri;
import android.os.Bundle;

public final class Action
  extends Thing
{
  public static final String STATUS_TYPE_ACTIVE = "http://schema.org/ActiveActionStatus";
  public static final String STATUS_TYPE_COMPLETED = "http://schema.org/CompletedActionStatus";
  public static final String STATUS_TYPE_FAILED = "http://schema.org/FailedActionStatus";
  public static final String TYPE_ACTIVATE = "http://schema.org/ActivateAction";
  public static final String TYPE_ADD = "http://schema.org/AddAction";
  public static final String TYPE_BOOKMARK = "http://schema.org/BookmarkAction";
  public static final String TYPE_COMMUNICATE = "http://schema.org/CommunicateAction";
  public static final String TYPE_FILM = "http://schema.org/FilmAction";
  public static final String TYPE_LIKE = "http://schema.org/LikeAction";
  public static final String TYPE_LISTEN = "http://schema.org/ListenAction";
  public static final String TYPE_PHOTOGRAPH = "http://schema.org/PhotographAction";
  public static final String TYPE_RESERVE = "http://schema.org/ReserveAction";
  public static final String TYPE_SEARCH = "http://schema.org/SearchAction";
  public static final String TYPE_VIEW = "http://schema.org/ViewAction";
  public static final String TYPE_WANT = "http://schema.org/WantAction";
  public static final String TYPE_WATCH = "http://schema.org/WatchAction";
  
  private Action(Bundle paramBundle)
  {
    super(paramBundle);
  }
  
  public static Action newAction(String paramString1, String paramString2, Uri paramUri)
  {
    return newAction(paramString1, paramString2, null, paramUri);
  }
  
  public static Action newAction(String paramString1, String paramString2, Uri paramUri1, Uri paramUri2)
  {
    Action.Builder localBuilder = new com/google/android/gms/appindexing/Action$Builder;
    localBuilder.<init>(paramString1);
    Object localObject = new com/google/android/gms/appindexing/Thing$Builder;
    ((Thing.Builder)localObject).<init>();
    Thing.Builder localBuilder1 = ((Thing.Builder)localObject).setName(paramString2);
    if (paramUri1 == null) {}
    for (localObject = null;; localObject = paramUri1.toString())
    {
      localObject = localBuilder1.setId((String)localObject).setUrl(paramUri2).build();
      return localBuilder.setObject((Thing)localObject).build();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\appindexing\Action.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */